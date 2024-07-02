/*
 * Created by JFormDesigner on Fri Jun 28 20:36:21 GMT-05:00 2024
 */

package Forma;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author pancho
 */
public class InsertarMantenimiento extends JPanel {
    public InsertarMantenimiento() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdf ads
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();
        label4 = new JLabel();
        label5 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        button1 = new JButton();
        label6 = new JLabel();
        textField3 = new JTextField();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
        border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER
        , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font
        .BOLD ,12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (
        new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order"
        .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

        //---- label1 ----
        label1.setText("Chequeo");

        //---- label2 ----
        label2.setText("Reemplazos");

        //---- label3 ----
        label3.setText("Limpieza");

        //---- checkBox1 ----
        checkBox1.setText("Se Hizo");

        //---- checkBox2 ----
        checkBox2.setText("text");

        //---- checkBox3 ----
        checkBox3.setText("text");

        //---- label4 ----
        label4.setText("CodigoMaquina");

        //---- label5 ----
        label5.setText("CodigoPieza");

        //---- button1 ----
        button1.setText("Insertar");
        button1.addActionListener(e -> button1(e));

        //---- label6 ----
        label6.setText("ResultadoChequeo");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(65, 65, 65)
                                    .addComponent(label3)
                                    .addGap(18, 18, 18)
                                    .addComponent(checkBox3))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(130, 130, 130)
                                    .addComponent(button1)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 109, GroupLayout.PREFERRED_SIZE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label4)
                                .addComponent(label5))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(textField2)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label6)
                                .addComponent(label2)
                                .addComponent(label1))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(checkBox2)
                                .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkBox1))))
                    .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(checkBox1)
                        .addComponent(label1))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label6)
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(checkBox2)
                        .addComponent(label2))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(checkBox3)
                        .addComponent(label3))
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label5))
                    .addGap(18, 18, 18)
                    .addComponent(button1)
                    .addGap(44, 44, 44))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdf ads
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JLabel label4;
    private JLabel label5;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JLabel label6;
    private JTextField textField3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
