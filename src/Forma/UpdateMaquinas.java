package Forma;/*
 * Created by JFormDesigner on Fri Jun 28 20:35:34 GMT-05:00 2024
 */

import DBConsultas.InsertarUpdate3;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author pancho
 */
public class UpdateMaquinas extends JPanel {
    public UpdateMaquinas() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        if (!textField1.getText().equals("")) {
            InsertarUpdate3 objInsertarUpdate3 = new InsertarUpdate3();
            objInsertarUpdate3.setParametroString(
                    "insert into MaterialEntrada (EntradaTipo, EntradaPeso, EntradaOrigen, HorarioEntrada, Fecha) " +
                            "values (?) ");
            objInsertarUpdate3.setParametro1(textField1.getText());
            objInsertarUpdate3.insertar();
            JOptionPane.showMessageDialog(null, "Operacion completada con exito", "Mensaje", 1);

        }else{
            JOptionPane.showMessageDialog(null, "Uno o mas campos estan en blanco ","Error",1);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - sdf ads
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder( 0
        , 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
        , new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,
         getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
        ) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

        //---- label1 ----
        label1.setText("NombreMaquina");

        //---- button1 ----
        button1.setText("Insertar");
        button1.addActionListener(e -> button1(e));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(label1)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(button1)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(57, 57, 57)
                    .addComponent(button1)
                    .addContainerGap(137, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - sdf ads
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
