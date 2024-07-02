package DBConsultas;

import DBConexion.ConexionSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Insertar4 {
    private String parametro1;
    private String parametro2;
    private String parametro3;
    private String parametro4;
    private String parametroString;


    //private AppLogs objLogs = new AppLogs(arametroString.class);

    public void setParametro1(String parametro1) {
        this.parametro1 = parametro1;
    }
    public void setParametro2(String parametro2) {
        this.parametro2 = parametro2;
    }
    public void setParametro3(String parametro3) {
        this.parametro3 = parametro3;
    }
    public void setParametro4(String parametro4) {
        this.parametro4 = parametro4;
    }
    public void setParametroString(String parametroString) {
        this.parametroString = parametroString;
    }


    public void insertar() {
        //String titulo []={"No Factura","Nombre Cliente", "Total"};
        //DefaultTableModel consulta = new DefaultTableModel(null,titulo);
        String sql=parametroString;
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
                pst.executeQuery();


            }catch (SQLException ex){
                throw new RuntimeException(ex);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
