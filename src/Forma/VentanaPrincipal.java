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



    private void AMenuGastos2(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame();
        frame.setContentPane(new UpdateGastos());
        frame.setVisible(true);
        frame.pack();
    }

    private void AMenuGanancias2(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame();
        frame.setContentPane(new UpdateGanancias());
        frame.setVisible(true);
        frame.pack();
    }

    private void AMenuPiezas2(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame();
        frame.setContentPane(new UpdatePiezas());
        frame.setVisible(true);
        frame.pack();
    }


    private void AMenuEmpleado2(ActionEvent e) {
        // TODO add your code here
        JFrame frame = new JFrame();
        frame.setContentPane(new UpdateEmpleado());
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
        menu2 = new JMenu();
        AMenuMaterialEntrada2 = new JMenuItem();
        AMenuMaterialSalida2 = new JMenuItem();
        AMenuGastos2 = new JMenuItem();
        AMenuGanancias2 = new JMenuItem();
        AMenuPiezas2 = new JMenuItem();
        AMenuMaquinas2 = new JMenuItem();
        AMenuMantenimiento2 = new JMenuItem();
        AMenuEmpleado2 = new JMenuItem();
        menu1 = new JMenu();
        cMenuGastos = new JMenuItem();
        cMenuGanancias = new JMenuItem();
        cMenuPiezas = new JMenuItem();
        cMenuMantenimiento = new JMenuItem();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder (
        0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder
        . BOTTOM, new java. awt .Font ( "D\u0069al\u006fg", java .awt . Font. BOLD ,12 ) ,java . awt. Color .
        red ) , getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java .
        beans. PropertyChangeEvent e) { if( "\u0062or\u0064er" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );

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

            //======== menu2 ========
            {
                menu2.setText("Actualizar");

                //---- AMenuMaterialEntrada2 ----
                AMenuMaterialEntrada2.setText("MaterialEntrada");
                AMenuMaterialEntrada2.addActionListener(e -> {
			IMenuMaterialEntrada(e);
		});
                menu2.add(AMenuMaterialEntrada2);

                //---- AMenuMaterialSalida2 ----
                AMenuMaterialSalida2.setText("MaterialSalida");
                AMenuMaterialSalida2.addActionListener(e -> {
			IMenuMaterialSalida(e);
		});
                menu2.add(AMenuMaterialSalida2);

                //---- AMenuGastos2 ----
                AMenuGastos2.setText("Gastos");
                AMenuGastos2.addActionListener(e -> {
			IMenuGastos(e);
			AMenuGastos2(e);
		});
                menu2.add(AMenuGastos2);

                //---- AMenuGanancias2 ----
                AMenuGanancias2.setText("Ganancias");
                AMenuGanancias2.addActionListener(e -> {
			iMenuGanancias(e);
			AMenuGanancias2(e);
		});
                menu2.add(AMenuGanancias2);

                //---- AMenuPiezas2 ----
                AMenuPiezas2.setText("Piezas");
                AMenuPiezas2.addActionListener(e -> {
			iMenuPiezas(e);
			AMenuPiezas2(e);
		});
                menu2.add(AMenuPiezas2);

                //---- AMenuMaquinas2 ----
                AMenuMaquinas2.setText("Maquinas");
                AMenuMaquinas2.addActionListener(e -> {
			iMenuMaquinas(e);
		});
                menu2.add(AMenuMaquinas2);

                //---- AMenuMantenimiento2 ----
                AMenuMantenimiento2.setText("Mantenimiento");
                AMenuMantenimiento2.addActionListener(e -> {
			iMenuMantenimiento(e);
		});
                menu2.add(AMenuMantenimiento2);

                //---- AMenuEmpleado2 ----
                AMenuEmpleado2.setText("Empleado");
                AMenuEmpleado2.addActionListener(e -> {
			iMenuEmpleado(e);
			AMenuEmpleado2(e);
		});
                menu2.add(AMenuEmpleado2);
            }
            menuBar1.add(menu2);

            //======== menu1 ========
            {
                menu1.setText("Consultar");

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

                //---- cMenuMantenimiento ----
                cMenuMantenimiento.setText("Mantenimiento");
                cMenuMantenimiento.addActionListener(e -> cMenuMantenimiento(e));
                menu1.add(cMenuMantenimiento);
            }
            menuBar1.add(menu1);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(17, Short.MAX_VALUE)
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
    private JMenu menu2;
    private JMenuItem AMenuMaterialEntrada2;
    private JMenuItem AMenuMaterialSalida2;
    private JMenuItem AMenuGastos2;
    private JMenuItem AMenuGanancias2;
    private JMenuItem AMenuPiezas2;
    private JMenuItem AMenuMaquinas2;
    private JMenuItem AMenuMantenimiento2;
    private JMenuItem AMenuEmpleado2;
    private JMenu menu1;
    private JMenuItem cMenuGastos;
    private JMenuItem cMenuGanancias;
    private JMenuItem cMenuPiezas;
    private JMenuItem cMenuMantenimiento;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
