package Forma;/*
 * Created by JFormDesigner on Fri Jun 28 20:36:21 GMT-05:00 2024
 */

import DBConsultas.InsertarUpdate6;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author pancho
 */
public class UpdateMantenimiento extends JPanel {
    public UpdateMantenimiento() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        if (!textField1.getText().equals("") && !textField2.getText().equals("") && !textField3.getText().equals("")) {
            InsertarUpdate6 objInsertarUpdate6 = new InsertarUpdate6();
            objInsertarUpdate6.setParametroString(
                    "insert into MaterialEntrada (EntradaTipo, EntradaPeso, EntradaOrigen, HorarioEntrada, Fecha) " +
                            "values (?, ?, ?, ?, ?, ? ");
            objInsertarUpdate6.setParametro1(textField1.getText());
            objInsertarUpdate6.setParametro2(textField2.getText());
            objInsertarUpdate6.setParametro3(textField3.getText());
            objInsertarUpdate6.setParametro4(checkBox1.isSelected());
            objInsertarUpdate6.setParametro5(checkBox2.isSelected());
            objInsertarUpdate6.setParametro6(checkBox3.isSelected());
            objInsertarUpdate6.insertar();
            JOptionPane.showMessageDialog(null, "Operacion completada con exito", "Mensaje", 1);

        }else{
            JOptionPane.showMessageDialog(null, "Uno o mas campos estan en blanco ","Error",1);
        }
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
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder ( 0
        , 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM
        , new java. awt .Font ( "D\u0069al\u006fg", java .awt . Font. BOLD ,12 ) ,java . awt. Color .red ) ,
         getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
        ) { if( "\u0062or\u0064er" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );

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
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(14, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(label1, GroupLayout.Alignment.TRAILING)
                                .addComponent(label6, GroupLayout.Alignment.TRAILING)
                                .addComponent(label2, GroupLayout.Alignment.TRAILING)
                                .addComponent(label3, GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(checkBox2)
                                .addComponent(checkBox1)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkBox3)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(158, 158, 158)
                            .addComponent(button1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label4)
                                .addComponent(label5))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(49, Short.MAX_VALUE))
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
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label6))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(checkBox2)
                        .addComponent(label2))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(checkBox3))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label4))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(label5)
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(button1)
                    .addGap(32, 32, 32))
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
