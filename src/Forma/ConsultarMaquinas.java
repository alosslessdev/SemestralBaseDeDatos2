/*
 * Created by JFormDesigner on Sat Jun 29 18:35:47 GMT-05:00 2024
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
public class ConsultarMaquinas extends JPanel {
    public ConsultarMaquinas() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        if (!textField1.getText().equals("") || !textField2.getText().equals("")
                || !textField3.getText().equals("")
                || !textField4.getText().equals("")){
            Consultas4 objConsultas4 = new Consultas4();
            objConsultas4.setTitulo(new String[]{"1", "3", "2", "4"});
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
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder(
        0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder
        . BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color.
        red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .
        beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

        //---- button1 ----
        button1.setText("Consultar");
        button1.addActionListener(e -> button1(e));

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        //---- label1 ----
        label1.setText("text");

        //---- label2 ----
        label2.setText("text");

        //---- label3 ----
        label3.setText("text");

        //---- label4 ----
        label4.setText("text");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(button1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label4)
                                .addComponent(label3)
                                .addComponent(label2)
                                .addComponent(label1))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3))
                    .addGap(35, 35, 35)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label4))
                    .addGap(16, 16, 16)
                    .addComponent(button1)
                    .addGap(18, 18, 18)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdf ads
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
