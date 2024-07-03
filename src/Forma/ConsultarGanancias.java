/*
 * Created by JFormDesigner on Sat Jun 29 18:36:11 GMT-05:00 2024
 */

package Forma;

import DBConsultas.Consultas3;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author pancho
 */
public class ConsultarGanancias extends JPanel {
    public ConsultarGanancias() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        if (!textField1.getText().equals("") || !textField2.getText().equals("")
                || !textField3.getText().equals("")){
            Consultas3 objConsultas3 = new Consultas3();
            objConsultas3.setTitulo(new String[]{"1", "3", "2"});
            objConsultas3.setParametroString(
                    "select CodigoMaquina, NombrePieza from Piezas where CodigoMaquina = ? " +
                            "and NombrePieza = ?");
            objConsultas3.setParametro1(textField1.getText());
            objConsultas3.setParametro2(textField2.getText());
            objConsultas3.setParametro2(textField3.getText());
            table1.setModel(objConsultas3.consultas());
        }else{
            //impresionDialogo("El campo esta en blanco", "Sin datos", 1);
        }

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdf ads
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label2 = new JLabel();
        label3 = new JLabel();
        textField2 = new JTextField();
        textField3 = new JTextField();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder(
        0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder
        . BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt. Color.
        red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .
        beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

        //---- label1 ----
        label1.setText("SalidaTipo");

        //---- button1 ----
        button1.setText("Consultar");
        button1.addActionListener(e -> button1(e));

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        //---- label2 ----
        label2.setText("Mes");

        //---- label3 ----
        label3.setText("Cantidad");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label3)
                                .addComponent(label2)
                                .addComponent(label1))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))))
                    .addContainerGap(21, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 166, Short.MAX_VALUE)
                    .addComponent(button1)
                    .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(label2)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(label3)
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                    .addComponent(button1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdf ads
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField2;
    private JTextField textField3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
