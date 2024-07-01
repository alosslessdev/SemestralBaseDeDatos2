package DBConsultas;

import DBConexion.ConexionSQL;
import LogsApp.AppLogs;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Insertar {
    private String parametro1;
    private String parametro2;
    private String parametro3;
    private String parametro4;
    private String parametro5;


    private AppLogs objLogs = new AppLogs(Consultas.class);

    public void setParametro1(String parametro1) {
        this.parametro1 = parametro1;
    }
    public void setParametro2(String parametro2) {
        this.parametro2 = parametro2;
    }
    public void setParametro3(String parametro3) {
        this.parametro3 = parametro3;
    }
    public void setParametro4(String parametro3) {
        this.parametro4 = parametro3;
    }
    public void setParametro5(String parametro3) {
        this.parametro5 = parametro3;
    }


    public DefaultTableModel consultas() {
        String titulo []={"No Factura","Nombre Cliente", "Total"};
        DefaultTableModel consulta = new DefaultTableModel(null,titulo);
        String sql="SELECT a.num_factura, b.nombre,SUM(c.cantidad * c.precio) AS total ";
        sql+="FROM facturas AS a ";
        sql+="INNER JOIN clientes b ON a.id_cliente = b.id_cliente ";
        sql+="INNER JOIN detalle_facturas c ON a.num_factura = c.num_factura ";
        sql+="WHERE a.fecha = ? ";
        sql+="GROUP BY a.num_factura, b.nombre ";
        try(ConexionSQL conexion= new ConexionSQL()){
            conexion.conectarDb();
            //TYPE_SCROLL_INSENSITIVE moverse hacia adelante y atraz
            //CONCUR_READ_ONLY
            try(Connection conectar = conexion.getConexion()){
                PreparedStatement pst = conectar.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
                pst.setString(1, parametro1);
                pst.setString(2, parametro2);
                pst.setString(3, parametro3);
                pst.setString(4, parametro4);
                pst.setString(5, parametro5);
                try(ResultSet resultado = pst.executeQuery()){
                    resultado.last();
                    int filas = resultado.getRow();
                    if (filas > 0) {
                        resultado.beforeFirst();
                        while(resultado.next()){
                            String datos []={
                                    resultado.getString("num_factura"),
                                    resultado.getString("nombre"),
                                    resultado.getString("total"),
                            };
                            consulta.addRow(datos);
                        }
                    }else{
                        impresionDialogo("No hay datos para la fecha ","Info",1);
                    }
                }
            }catch (Exception e){
                objLogs.errorLogs(e);
            }
        }catch (SQLException ex){
            objLogs.errorLogs(ex);
        }
        return consulta;
    }

    private void impresionDialogo(String mensaje, String titulo, int icono) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, icono); // Mostrar un cuadro de diálogo
    }
}
