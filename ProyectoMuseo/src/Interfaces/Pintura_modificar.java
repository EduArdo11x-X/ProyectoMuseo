/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import clases.Pintura;
import com.db4o.*;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EDU
 */
public class Pintura_modificar extends javax.swing.JFrame {

    String cod_arte_pintura = "";
    String nombre_pintura = "";
    Date fecha_creacion_pintura;
    String descripcion_pintura = "";
    String tipos_pintura = "";
    String estilos_pintura = "";

    /**
     * Creates new form Exposicion_modificar
     */
    public Pintura_modificar() {
        initComponents();
    }

    public void buscar(ObjectContainer basep) {//cargardatos

        Modificarjb.setEnabled(false);
        String IDAux;
        IDAux = cod_pintura.getText();

        Pintura_Interfaz EAux = new Pintura_Interfaz();

        if (cod_pintura.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Ingrese un ID");
        } else {

            if (EAux.verificar(basep, IDAux) == 0) {

                JOptionPane.showMessageDialog(null, "La pintura no existe en la base de datos");
                LimpiarCamposdeTexto();

            } else {

                Pintura Ebuscar = new Pintura(null, null, IDAux, null, null, null);

                ObjectSet result = basep.get(Ebuscar);
                for (int i = 0; i < result.size(); i++) {

                    Pintura miE = new Pintura();

                    miE = (Pintura) result.get(i);

                    cod_pintura.setText(miE.getCodigo());
                    tipo_pint.setSelectedItem(miE.getTipo());
                    nom_pintura.setText(miE.getNombre());
                    esti_pintura.setSelectedItem(miE.getEstilo());
                    desc_pintura.setText(miE.getDescripcion());
                    fechaN.setDate((miE.getFecha_creacion()));

                    Modificarjb.setEnabled(true);
                    //Hacer editable los campos de texto

                    HabilitarCampos_deTexto();
                    cod_pintura.setEditable(false);
                }

            }

        }
    }

    public void LimpiarCamposdeTexto() {

        cod_pintura.setText("");
        nom_pintura.setText("");
        tipo_pint.setSelectedItem(0);
        esti_pintura.setSelectedItem(0);
        desc_pintura.setText("");

    }

    public void asignarVariables(ObjectContainer BaseD) {

        cod_arte_pintura = cod_pintura.getText();
        nombre_pintura = nom_pintura.getText();
        fecha_creacion_pintura = fechaN.getDate();
        descripcion_pintura = desc_pintura.getText();
        tipos_pintura = (String) tipo_pint.getSelectedItem();
        estilos_pintura = (String) esti_pintura.getSelectedItem();

    }

    public void HabilitarCampos_deTexto() {
        tipo_pint.setEditable(true);
        esti_pintura.setEditable(true);
        desc_pintura.setEditable(true);

    }

    public void Modificar_pintura(ObjectContainer basep) {
        asignarVariables(basep);
        if (validarCampos(basep)) {
            Pintura Emodi = new Pintura(null, null, cod_pintura.getText(), null, null, null);
            ObjectSet result = basep.get(Emodi);
            Pintura Emodificar = (Pintura) result.next();
            if (validarCampos(basep)) {
                Emodificar.setNombre(nom_pintura.getText());
                Emodificar.setTipo((String) tipo_pint.getSelectedItem());
                Emodificar.setEstilo((String) esti_pintura.getSelectedItem());
                Emodificar.setDescripcion(desc_pintura.getText());
                ;
                basep.set(Emodificar);
                JOptionPane.showMessageDialog(null, "La pintura fue modificado exitosamente");

                LimpiarCamposdeTexto();
            }
        }
    }

    public boolean validarCampos(ObjectContainer basep) {
        Validaciones miValidaciones = new Validaciones();
        asignarVariables(basep);
        boolean ban_confirmar = true;

        if (cod_pintura.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarid(cod_arte_pintura)) {
                JOptionPane.showMessageDialog(this, "ID invalido");
                ban_confirmar = false;
            }
        }

        if (nom_pintura.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre de la Sala");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarNomApe(nombre_pintura)) {
                JOptionPane.showMessageDialog(this, "Nombre invalido");
                ban_confirmar = false;
            }
        }
        if (desc_pintura.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la tematica de la Sala");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validardescripcion(descripcion_pintura)) {
                JOptionPane.showMessageDialog(this, "Tematica invalido");
                ban_confirmar = false;
            }
        }
        return ban_confirmar;
    }

    public static void Cerrar_BD(ObjectContainer basep) {

        basep.close();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cod_pintura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nom_pintura = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        desc_pintura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        fechaN = new com.toedter.calendar.JDateChooser();
        Modificarjb = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        tipo_pint = new javax.swing.JComboBox<>();
        esti_pintura = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Raanana", 1, 16)); // NOI18N
        jLabel1.setText("Modificar Pintura");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Raanana", 1, 16)); // NOI18N
        jLabel2.setText("Codigo Pintura:");

        cod_pintura.setFont(new java.awt.Font("Raanana", 1, 16)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Raanana", 1, 16)); // NOI18N
        jLabel3.setText("Nombre Pintura:");

        nom_pintura.setFont(new java.awt.Font("Raanana", 1, 16)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Raanana", 1, 16)); // NOI18N
        jLabel4.setText("Fecha de creacion:");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Raanana", 1, 16)); // NOI18N
        jLabel5.setText("Descripcion Pintura:");

        desc_pintura.setFont(new java.awt.Font("Raanana", 1, 16)); // NOI18N
        desc_pintura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desc_pinturaActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Raanana", 1, 16)); // NOI18N
        jLabel6.setText("Tipo Pintura:");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Raanana", 1, 16)); // NOI18N
        jLabel7.setText("Estilo Pintura");

        jButton2.setFont(new java.awt.Font("Raanana", 1, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/buscar.png"))); // NOI18N
        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Modificarjb.setFont(new java.awt.Font("Raanana", 1, 16)); // NOI18N
        Modificarjb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/disco-flexible_1.png"))); // NOI18N
        Modificarjb.setText("Guardar");
        Modificarjb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarjbActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Raanana", 1, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/1286923.png"))); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tipo_pint.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccion una opcion", "Realismo", "Hiperrealismo", "Surrealismo", "Impresionismo", "Expresionismo", "Arte abstracto", "Arte Pop" }));

        esti_pintura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "Pintura del Trecento ", "Arte Bizantino", "Pintura flamenca ", "Renacimiento", "Academicismo", "Prerrafaelismo", "Impresionismo", "Expresionismo", " ", "Pintura del Trecento (Il Giotto)", "Arte Bizantino (Mosaico y pintura antes de la crisis iconoclasta)", "Pintura flamenca (Jan van Eyck)", "Renacimiento", "Academicismo", "Prerrafaelismo", "Impresionismo", "Expresionismo", "Postimpresionismo", "Luminismo", "Fauvismo", "Realismo americano", "Cubismo", "Modernismo", "Surrealismo", "Abstracción lírica" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(fechaN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                        .addComponent(nom_pintura, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cod_pintura, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2)))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipo_pint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(esti_pintura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(desc_pintura, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(381, 381, 381)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(314, 314, 314)
                                .addComponent(Modificarjb, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cod_pintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo_pint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nom_pintura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(esti_pintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(desc_pintura, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(fechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(123, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(Modificarjb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void desc_pinturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desc_pinturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desc_pinturaActionPerformed

    private void ModificarjbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarjbActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MENU_ADM.direccionBD);
        Modificar_pintura(BaseD);
        Cerrar_BD(BaseD);
        cod_pintura.setEditable(true);
    }//GEN-LAST:event_ModificarjbActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MENU_ADM.direccionBD);
        buscar(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        MENU_ADM ventaina = new MENU_ADM();
        ventaina.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificarjb;
    private javax.swing.JTextField cod_pintura;
    private javax.swing.JTextField desc_pintura;
    private javax.swing.JComboBox<String> esti_pintura;
    private com.toedter.calendar.JDateChooser fechaN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nom_pintura;
    private javax.swing.JComboBox<String> tipo_pint;
    // End of variables declaration//GEN-END:variables
}
