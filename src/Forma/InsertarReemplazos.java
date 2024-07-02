/*
 * Created by JFormDesigner on Fri Jun 28 20:35:20 GMT-05:00 2024
 */

package Forma;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author pancho
 */
public class InsertarReemplazos extends JPanel {
    public InsertarReemplazos() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        if (!textField1.getText().equals("")  && !textField2.getText().equals("")){

        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdf ads
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        button1 = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
        EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER, javax. swing
        . border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ),
        java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( )
        { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () ))
        throw new RuntimeException( ); }} );

        //---- label1 ----
        label1.setText("Pieza");

        //---- label2 ----
        label2.setText("CodigoMaquina");

        //---- button1 ----
        button1.setText("Insertar3");
        button1.addActionListener(e -> button1(e));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(label2))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label1)))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(button1)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                    .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addComponent(button1)
                    .addContainerGap(124, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdf ads
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
