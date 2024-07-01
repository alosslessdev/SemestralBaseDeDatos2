/*
 * Created by JFormDesigner on Thu Jun 20 10:46:54 EST 2024
 */

package Forma;

import DBConsultas.Consultas;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author JoseChiru
 */
public class InsertarMaterial extends JPanel {
    public InsertarMaterial() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        if (!jTextFecha.getText().equals("")) {
            Consultas objConsulta = new Consultas();
            objConsulta.setParametro1(jTextFecha.getText());
            tblResp.setModel(objConsulta.consultas());
        }else{
           impresionDialogo("El campo esta en blanco ","Sin Datos",1);
        }
    }

    private void impresionDialogo(String mensaje, String titulo, int icono) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, icono); // Mostrar un cuadro de diálogo
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdf ads
        panel1 = new JPanel();
        label1 = new JLabel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        textField2 = new JTextField();
        label4 = new JLabel();
        textField3 = new JTextField();
        button1 = new JButton();

        //======== panel1 ========
        {
            panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax
            . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing
            .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .
            Font ( "D\u0069alog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .red
            ) ,panel1. getBorder () ) ); panel1. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override
            public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062order" .equals ( e. getPropertyName (
            ) ) )throw new RuntimeException( ) ;} } );

            //---- label1 ----
            label1.setText("Tipo:");

            //---- radioButton1 ----
            radioButton1.setText("Entrada");

            //---- radioButton2 ----
            radioButton2.setText("Salida");

            //---- label2 ----
            label2.setText("Hora");

            //---- label3 ----
            label3.setText("Peso");

            //---- label4 ----
            label4.setText("Origen o destino");

            //---- button1 ----
            button1.setText("Insertar");
            button1.addActionListener(e -> button1(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(label1)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton1)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioButton2))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(label4)
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addGap(67, 67, 67)
                                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                    .addComponent(label2)
                                                    .addComponent(label3))))
                                        .addGap(18, 18, 18)
                                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                            .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                            .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(button1)))
                        .addContainerGap(56, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(radioButton1)
                            .addComponent(radioButton2))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button1)
                        .addContainerGap(37, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdf ads
    private JPanel panel1;
    private JLabel label1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JTextField textField2;
    private JLabel label4;
    private JTextField textField3;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
