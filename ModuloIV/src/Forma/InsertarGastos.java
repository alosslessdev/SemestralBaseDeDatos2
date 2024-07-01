/*
 * Created by JFormDesigner on Mon Jun 24 11:32:35 EST 2024
 */

package Forma;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Jose Chiru
 */
public class InsertarGastos extends JPanel {
    public InsertarGastos() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdf ads
        panel1 = new JPanel();
        label2 = new JLabel();
        label3 = new JLabel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        textField1 = new JTextField();
        button1 = new JButton();

        //======== panel1 ========
        {
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(
            new javax.swing.border.EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn"
            ,javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM
            ,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12)
            ,java.awt.Color.red),panel1. getBorder()));panel1. addPropertyChangeListener(
            new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
            ){if("\u0062ord\u0065r".equals(e.getPropertyName()))throw new RuntimeException()
            ;}});

            //---- label2 ----
            label2.setText("CodigoFactura");

            //---- label3 ----
            label3.setText("Tipo:");

            //---- radioButton1 ----
            radioButton1.setText("Entrada");

            //---- radioButton2 ----
            radioButton2.setText("Salida");

            //---- button1 ----
            button1.setText("Insertar");
            button1.addActionListener(e -> button1(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label2)
                                .addGap(18, 18, 18)
                                .addComponent(textField1))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label3)
                                .addGap(18, 18, 18)
                                .addComponent(radioButton1)
                                .addGap(6, 6, 6)
                                .addComponent(radioButton2)))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(101, Short.MAX_VALUE)
                        .addComponent(button1)
                        .addGap(96, 96, 96))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(label3))
                            .addComponent(radioButton1)
                            .addComponent(radioButton2))
                        .addGap(28, 28, 28)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(button1)
                        .addContainerGap(55, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdf ads
    private JPanel panel1;
    private JLabel label2;
    private JLabel label3;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JTextField textField1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
