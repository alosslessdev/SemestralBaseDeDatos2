/*
 * Created by JFormDesigner on Sat Jun 29 22:04:23 GMT-05:00 2024
 */

package Forma;

import DBConsultas.Consultas2;
import DBConsultas.Consultas4;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author pancho
 */
public class ConsultarMaterialSalida extends JPanel {
    public ConsultarMaterialSalida() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        if (!textField1.getText().equals("") || !textField2.getText().equals("")
                || !textField3.getText().equals("")
                || !textField4.getText().equals("")){
            Consultas4 objConsultas4 = new Consultas4();
            objConsultas4.setTitulo(new String[]{"1", "3"});
            objConsultas4.setParametroString(
                    "select CodigoMaquina, NombrePieza from Piezas where CodigoMaquina = ? " +
                            "and NombrePieza = ?");
            objConsultas4.setParametro1(textField1.getText());
            objConsultas4.setParametro2(textField2.getText());
            objConsultas4.setParametro3(textField3.getText());
            objConsultas4.setParametro4(textField4.getText());

            table1.setModel(objConsultas4.consultas());
        }else{
            //impresionDialogo("El campo esta en blanco", "Sin datos", 1);
        }

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdf ads
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border
        .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax. swing .border . TitledBorder. CENTER ,javax
        . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069al\u006fg", java .awt . Font. BOLD ,
        12 ) ,java . awt. Color .red ) , getBorder () ) );  addPropertyChangeListener( new java. beans
        .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062or\u0064er" .equals ( e.
        getPropertyName () ) )throw new RuntimeException( ) ;} } );

        //---- label1 ----
        label1.setText("text");

        //---- label2 ----
        label2.setText("text");

        //---- label3 ----
        label3.setText("text");

        //---- label4 ----
        label4.setText("text");

        //---- button1 ----
        button1.setText("Consultar");
        button1.addActionListener(e -> button1(e));

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label4)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label3)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textField3))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label2)
                                    .addGap(18, 18, 18)
                                    .addComponent(textField2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label1)
                                    .addGap(18, 18, 18)
                                    .addComponent(textField1))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(149, 149, 149)
                            .addComponent(button1)))
                    .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addComponent(button1)
                    .addGap(18, 18, 18)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(50, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdf ads
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
