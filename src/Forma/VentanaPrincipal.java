/*
 * Created by JFormDesigner on Sun Jun 16 14:42:02 EST 2024
 */

package Forma;

import DBConexion.ConexionSQL;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

public class VentanaPrincipal extends JPanel {
    public VentanaPrincipal() {
        initComponents();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Forma");
        frame.setContentPane(new VentanaPrincipal());
        frame.pack();
        frame.setVisible(true);
    }
    
    private void iMenuGanancias(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame();
        frame.setContentPane(new InsertarGanancias());
        frame.setVisible(true);
        frame.pack();
    }

    private void iMenuPiezas(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame();
        frame.setContentPane(new InsertarPiezas());
        frame.setVisible(true);
        frame.pack();
    }

    private void iMenuMaquinas(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame();
        frame.setContentPane(new InsertarMaquinas());
        frame.setVisible(true);
        frame.pack();
    }

    private void iMenuMantenimiento(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame();
        frame.setContentPane(new InsertarMantenimiento());
        frame.setVisible(true);
        frame.pack();
    }

    private void iMenuEmpleado(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame();
        frame.setContentPane(new InsertarEmpleado());
        frame.setVisible(true);
        frame.pack();
    }

    private void cMenuMaterial(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame();
        frame.setContentPane(new ConsultarMaterialEntrada());
        frame.setVisible(true);
        frame.pack();
    }

    private void cMenuMaterialSalida(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame();
        frame.setContentPane(new ConsultarMaterialSalida());
        frame.setVisible(true);
        frame.pack();    }


    private void cMenuGastos(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame();
        frame.setContentPane(new ConsultarGastos());
        frame.setVisible(true);
        frame.pack();
    }

    private void cMenuGanancias(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame();
        frame.setContentPane(new ConsultarGanancias());
        frame.setVisible(true);
        frame.pack();
    }

    private void cMenuPiezas(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame();
        frame.setContentPane(new ConsultarPiezas());
        frame.setVisible(true);
        frame.pack();
    }

    private void cMenuMaquinas(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame();
        frame.setContentPane(new ConsultarMaquinas());
        frame.setVisible(true);
        frame.pack();
    }

    private void cMenuMantenimiento(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame();
        frame.setContentPane(new ConsultarMantenimiento());
        frame.setVisible(true);
        frame.pack();
    }

    private void cMenuEmpleado(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame();
        frame.setContentPane(new ConsultarEmpleado());
        frame.setVisible(true);
        frame.pack();
    }

    private void IMenuMaterialEntrada(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame();
        frame.setContentPane(new InsertarMaterialEntrada());
        frame.setVisible(true);
        frame.pack();
    }

    private void IMenuMaterialSalida(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame();
        frame.setContentPane(new InsertarMaterialSalida());
        frame.setVisible(true);
        frame.pack();
    }

    private void IMenuGastos(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame();
        frame.setContentPane(new InsertarGastos());
        frame.setVisible(true);
        frame.pack();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdf ads
        menuBar1 = new JMenuBar();
        menu3 = new JMenu();
        IMenuMaterialEntrada = new JMenuItem();
        IMenuMaterialSalida = new JMenuItem();
        IMenuGastos = new JMenuItem();
        iMenuGanancias = new JMenuItem();
        iMenuPiezas = new JMenuItem();
        iMenuMaquinas = new JMenuItem();
        iMenuMantenimiento = new JMenuItem();
        iMenuEmpleado = new JMenuItem();
        menu1 = new JMenu();
        cMenuMaterialEntrada = new JMenuItem();
        cMenuMaterialSalida = new JMenuItem();
        cMenuGastos = new JMenuItem();
        cMenuGanancias = new JMenuItem();
        cMenuPiezas = new JMenuItem();
        cMenuMaquinas = new JMenuItem();
        cMenuMantenimiento = new JMenuItem();
        cMenuEmpleado = new JMenuItem();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0
        ,0,0,0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM
        ,new java.awt.Font("D\u0069al\u006fg",java.awt.Font.BOLD,12),java.awt.Color.red),
         getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
        ){if("\u0062or\u0064er".equals(e.getPropertyName()))throw new RuntimeException();}});

        //======== menuBar1 ========
        {

            //======== menu3 ========
            {
                menu3.setText("Insertar");

                //---- IMenuMaterialEntrada ----
                IMenuMaterialEntrada.setText("MaterialEntrada");
                IMenuMaterialEntrada.addActionListener(e -> IMenuMaterialEntrada(e));
                menu3.add(IMenuMaterialEntrada);

                //---- IMenuMaterialSalida ----
                IMenuMaterialSalida.setText("MaterialSalida");
                IMenuMaterialSalida.addActionListener(e -> IMenuMaterialSalida(e));
                menu3.add(IMenuMaterialSalida);

                //---- IMenuGastos ----
                IMenuGastos.setText("Gastos");
                IMenuGastos.addActionListener(e -> IMenuGastos(e));
                menu3.add(IMenuGastos);

                //---- iMenuGanancias ----
                iMenuGanancias.setText("Ganancias");
                iMenuGanancias.addActionListener(e -> iMenuGanancias(e));
                menu3.add(iMenuGanancias);

                //---- iMenuPiezas ----
                iMenuPiezas.setText("Piezas");
                iMenuPiezas.addActionListener(e -> iMenuPiezas(e));
                menu3.add(iMenuPiezas);

                //---- iMenuMaquinas ----
                iMenuMaquinas.setText("Maquinas");
                iMenuMaquinas.addActionListener(e -> iMenuMaquinas(e));
                menu3.add(iMenuMaquinas);

                //---- iMenuMantenimiento ----
                iMenuMantenimiento.setText("Mantenimiento");
                iMenuMantenimiento.addActionListener(e -> iMenuMantenimiento(e));
                menu3.add(iMenuMantenimiento);

                //---- iMenuEmpleado ----
                iMenuEmpleado.setText("Empleado");
                iMenuEmpleado.addActionListener(e -> iMenuEmpleado(e));
                menu3.add(iMenuEmpleado);
            }
            menuBar1.add(menu3);

            //======== menu1 ========
            {
                menu1.setText("Consultar");

                //---- cMenuMaterialEntrada ----
                cMenuMaterialEntrada.setText("MaterialEntrada");
                cMenuMaterialEntrada.addActionListener(e -> cMenuMaterial(e));
                menu1.add(cMenuMaterialEntrada);

                //---- cMenuMaterialSalida ----
                cMenuMaterialSalida.setText("MaterialSalida");
                cMenuMaterialSalida.addActionListener(e -> cMenuMaterialSalida(e));
                menu1.add(cMenuMaterialSalida);

                //---- cMenuGastos ----
                cMenuGastos.setText("Gastos");
                cMenuGastos.addActionListener(e -> cMenuGastos(e));
                menu1.add(cMenuGastos);

                //---- cMenuGanancias ----
                cMenuGanancias.setText("Ganancias");
                cMenuGanancias.addActionListener(e -> cMenuGanancias(e));
                menu1.add(cMenuGanancias);

                //---- cMenuPiezas ----
                cMenuPiezas.setText("Piezas");
                cMenuPiezas.addActionListener(e -> cMenuPiezas(e));
                menu1.add(cMenuPiezas);

                //---- cMenuMaquinas ----
                cMenuMaquinas.setText("Maquinas");
                cMenuMaquinas.addActionListener(e -> cMenuMaquinas(e));
                menu1.add(cMenuMaquinas);

                //---- cMenuMantenimiento ----
                cMenuMantenimiento.setText("Mantenimiento");
                cMenuMantenimiento.addActionListener(e -> cMenuMantenimiento(e));
                menu1.add(cMenuMantenimiento);

                //---- cMenuEmpleado ----
                cMenuEmpleado.setText("Empleado");
                cMenuEmpleado.addActionListener(e -> cMenuEmpleado(e));
                menu1.add(cMenuEmpleado);
            }
            menuBar1.add(menu1);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(90, Short.MAX_VALUE)
                    .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(98, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdf ads
    private JMenuBar menuBar1;
    private JMenu menu3;
    private JMenuItem IMenuMaterialEntrada;
    private JMenuItem IMenuMaterialSalida;
    private JMenuItem IMenuGastos;
    private JMenuItem iMenuGanancias;
    private JMenuItem iMenuPiezas;
    private JMenuItem iMenuMaquinas;
    private JMenuItem iMenuMantenimiento;
    private JMenuItem iMenuEmpleado;
    private JMenu menu1;
    private JMenuItem cMenuMaterialEntrada;
    private JMenuItem cMenuMaterialSalida;
    private JMenuItem cMenuGastos;
    private JMenuItem cMenuGanancias;
    private JMenuItem cMenuPiezas;
    private JMenuItem cMenuMaquinas;
    private JMenuItem cMenuMantenimiento;
    private JMenuItem cMenuEmpleado;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
