/*
 * Created by JFormDesigner on Sat Jun 29 18:35:33 GMT-05:00 2024
 */

package Forma;

import DBConsultas.Consultas2;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author pancho
 */
public class ConsultarMantenimiento extends JPanel {
    public ConsultarMantenimiento() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        if (!textField1.getText().equals("") || !textField2.getText().equals("")){
            Consultas2 objConsultas2 = new Consultas2();
            objConsultas2.setTitulo(new String[]{"1", "3"});
            objConsultas2.setParametroString(
                    "select CodigoMaquina, NombrePieza from Piezas where CodigoMaquina = ? " +
                            "and NombrePieza = ?");
            objConsultas2.setParametro1(textField1.getText());
            objConsultas2.setParametro2(textField2.getText());
            table1.setModel(objConsultas2.consultas());
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
        textField1 = new JTextField();
        textField2 = new JTextField();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing
        . border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax. swing .border . TitledBorder
        . CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069al\u006fg", java .
        awt . Font. BOLD ,12 ) ,java . awt. Color .red ) , getBorder () ) )
        ;  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
        ) { if( "\u0062or\u0064er" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } )
        ;

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

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(141, 141, 141)
                            .addComponent(button1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label2)
                                    .addGap(18, 18, 18)
                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label1)
                                    .addGap(18, 18, 18)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
                    .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(label1)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(label2)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                    .addComponent(button1)
                    .addGap(133, 133, 133)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30))
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
    private JTextField textField1;
    private JTextField textField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
