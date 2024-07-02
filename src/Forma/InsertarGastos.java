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
        label4 = new JLabel();
        label5 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        button1 = new JButton();
        label6 = new JLabel();
        textField3 = new JTextField();
        label7 = new JLabel();
        textField4 = new JTextField();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder
        ( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing. border
        . TitledBorder. BOTTOM, new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ), java. awt
        . Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void
        propertyChange (java .beans .PropertyChangeEvent e) {if ("borde\u0072" .equals (e .getPropertyName () )) throw new RuntimeException( )
        ; }} );

        //---- label4 ----
        label4.setText("IDGerente");

        //---- label5 ----
        label5.setText("Mes");

        //---- button1 ----
        button1.setText("Insertar");
        button1.addActionListener(e -> button1(e));

        //---- label6 ----
        label6.setText("Energia el\u00e9ctrica");

        //---- label7 ----
        label7.setText("Mantenimiento");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(label4)
                                        .addComponent(label5))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textField2)
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(label6)
                                    .addGap(18, 18, 18)
                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(156, 156, 156)
                            .addComponent(button1))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label7)
                            .addGap(18, 18, 18)
                            .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label6)
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label7))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label5))
                    .addGap(18, 18, 18)
                    .addComponent(button1)
                    .addGap(38, 38, 38))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdf ads
    private JLabel label4;
    private JLabel label5;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JLabel label6;
    private JTextField textField3;
    private JLabel label7;
    private JTextField textField4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
