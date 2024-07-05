/*
 * Created by JFormDesigner on Fri Jun 28 20:36:21 GMT-05:00 2024
 */

package Forma;

import DBConsultas.Consultas2;
import DBConsultas.ConsultasParameterLess;
import DBConsultas.InsertarUpdate2BooleanA;
import DBConsultas.InsertarUpdate2NoBoolean;

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

    private void checkBox1ItemStateChanged(ItemEvent e) {
        // TODO add your code here
        textField1.setEnabled(true);
        label6.setEnabled(true);
        if (e.getStateChange() == ItemEvent.DESELECTED) {
            textField1.setEnabled(false);
            label6.setEnabled(false);
        }
    }

    private void checkBox2ItemStateChanged(ItemEvent e) {
        // TODO add your code here
        textField2a.setEnabled(true);
        label5.setEnabled(true);
        if (e.getStateChange() == ItemEvent.DESELECTED) {
            textField2a.setEnabled(false);
            label5.setEnabled(false);
        }
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        if (!textField1.getText().equals("") && !textField2a.getText().equals("") && !textField3a.getText().equals("")) {
            InsertarUpdate2BooleanA objInsertarUpdate2BooleanA = new InsertarUpdate2BooleanA();
            objInsertarUpdate2BooleanA.setParametroString(
                    "insert into MantenimientoMaquina (SeHizoLimpieza, CodigoMaquina, Fecha) " +
                            "values (?, ?, GETDATE()) ");
            objInsertarUpdate2BooleanA.setParametro1(checkBox3.isSelected());
            objInsertarUpdate2BooleanA.setParametro2(textField3a.getText());
            objInsertarUpdate2BooleanA.insertar();

            if (checkBox1.isSelected()) {
                ConsultasParameterLess objConsultasParameterLess = new ConsultasParameterLess();
                objConsultasParameterLess.setDatos(new String[]{
                        "NumeroMantenimiento"});
                objConsultasParameterLess.setParametroString("select NumeroMantenimiento from (select NumeroMantenimiento, " +
                        "ROW_NUMBER() OVER (order by NumeroMantenimiento Desc) as rn from MantenimientoMaquina) as " +
                        "subquery where rn=1 ");
                objConsultasParameterLess.consultas();
                table1.setModel(objConsultasParameterLess.consultas());
                int temp = (int) table1.getValueAt(0, 0);

                objInsertarUpdate2BooleanA.setParametroString(
                        "insert into Chequeo (ResultadoChequeo, NumeroMantenimiento) " +
                                "values (?, ?) ");
                objInsertarUpdate2BooleanA.setParametro1(checkBox1.isSelected());
                objInsertarUpdate2BooleanA.setParametro2(String.valueOf(temp));
                objInsertarUpdate2BooleanA.insertar();
            }

            if (checkBox2.isSelected()) {
                InsertarUpdate2NoBoolean objInsertarUpdate2NoBoolean = new InsertarUpdate2NoBoolean();

                objInsertarUpdate2BooleanA.setParametroString(
                    "insert into Cambios (CodigoMaquina, CodigoPieza) " +
                            "values (?, ?) ");
                objInsertarUpdate2NoBoolean.setParametro1(textField3a.getText());
                objInsertarUpdate2NoBoolean.setParametro2(textField2a.getText());
                objInsertarUpdate2NoBoolean.insertar();
            }

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
        textField3a = new JTextField();
        button1 = new JButton();
        label6 = new JLabel();
        textField2a = new JTextField();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
        . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder
        . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .
        awt .Font .BOLD ,12 ), java. awt. Color. red) , getBorder( )) )
        ;  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
        ) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
        ;

        //---- label1 ----
        label1.setText("Chequeo");

        //---- label2 ----
        label2.setText("Reemplazos");

        //---- label3 ----
        label3.setText("Limpieza");

        //---- checkBox1 ----
        checkBox1.setText("Se Hizo");
        checkBox1.addItemListener(e -> checkBox1ItemStateChanged(e));

        //---- checkBox2 ----
        checkBox2.setText("text");
        checkBox2.addItemListener(e -> checkBox2ItemStateChanged(e));

        //---- checkBox3 ----
        checkBox3.setText("text");

        //---- label4 ----
        label4.setText("CodigoMaquina");

        //---- label5 ----
        label5.setText("CodigoPieza");
        label5.setEnabled(false);

        //---- textField1 ----
        textField1.setEnabled(false);

        //---- button1 ----
        button1.setText("Insertar");
        button1.addActionListener(e -> button1(e));

        //---- label6 ----
        label6.setText("ResultadoChequeo");
        label6.setEnabled(false);

        //---- textField2a ----
        textField2a.setEnabled(false);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(42, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(label1, GroupLayout.Alignment.TRAILING)
                        .addComponent(label6, GroupLayout.Alignment.TRAILING))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkBox1))
                    .addContainerGap(34, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(button1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(label3)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(checkBox3)
                    .addContainerGap(201, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(label4)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textField3a, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label5)
                                .addComponent(label2))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(checkBox2)
                                .addComponent(textField2a, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(checkBox1)
                            .addGap(18, 18, 18)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(label1)
                            .addGap(18, 18, 18)
                            .addComponent(label6)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(checkBox2)
                        .addComponent(label2))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(label5)
                        .addComponent(textField2a, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(checkBox3))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(textField3a, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(button1))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
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
    private JTextField textField3a;
    private JButton button1;
    private JLabel label6;
    private JTextField textField2a;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
