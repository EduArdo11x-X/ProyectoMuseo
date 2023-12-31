/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import clases.Artista;
import clases.Pintura;
import com.db4o.*;
import com.db4o.query.Query;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class Pintura_Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Pintura_Interfaz
     */
    public Pintura_Interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
        jButton1 = new javax.swing.JButton();
        fechaN = new com.toedter.calendar.JDateChooser();
        btnvolver = new javax.swing.JButton();
        tipo_pint = new javax.swing.JComboBox<>();
        esti_pintura = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cod_artista = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Raanana", 1, 14)); // NOI18N
        jLabel1.setText("Ingreso Pintura");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Raanana", 1, 14)); // NOI18N
        jLabel2.setText("Codigo Pintura:");

        cod_pintura.setFont(new java.awt.Font("Raanana", 1, 14)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Raanana", 1, 14)); // NOI18N
        jLabel3.setText("Nombre Pintura:");

        nom_pintura.setFont(new java.awt.Font("Raanana", 1, 14)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Raanana", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de creacion:");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Raanana", 1, 14)); // NOI18N
        jLabel5.setText("Descripcion Pintura:");

        desc_pintura.setFont(new java.awt.Font("Raanana", 1, 14)); // NOI18N
        desc_pintura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desc_pinturaActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Raanana", 1, 14)); // NOI18N
        jLabel6.setText("Tipo Pintura:");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Raanana", 1, 14)); // NOI18N
        jLabel7.setText("Estilo Pintura");

        jButton1.setFont(new java.awt.Font("Raanana", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/disco-flexible_1.png"))); // NOI18N
        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnvolver.setFont(new java.awt.Font("Raanana", 1, 14)); // NOI18N
        btnvolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/1286923.png"))); // NOI18N
        btnvolver.setText("VOLVER");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });

        tipo_pint.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccion una opcion", "Realismo", "Hiperrealismo", "Surrealismo", "Impresionismo", "Expresionismo", "Arte abstracto", "Arte Pop" }));

        esti_pintura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "Pintura del Trecento ", "Arte Bizantino", "Pintura flamenca ", "Renacimiento", "Academicismo", "Prerrafaelismo", "Impresionismo", "Expresionismo", " ", "Pintura del Trecento (Il Giotto)", "Arte Bizantino (Mosaico y pintura antes de la crisis iconoclasta)", "Pintura flamenca (Jan van Eyck)", "Renacimiento", "Academicismo", "Prerrafaelismo", "Impresionismo", "Expresionismo", "Postimpresionismo", "Luminismo", "Fauvismo", "Realismo americano", "Cubismo", "Modernismo", "Surrealismo", "Abstracción lírica" }));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Raanana", 1, 14)); // NOI18N
        jLabel8.setText("Codigo Artista");

        cod_artista.setFont(new java.awt.Font("Raanana", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jLabel1))
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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fechaN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(cod_pintura, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nom_pintura, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(117, 117, 117)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(desc_pintura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(esti_pintura, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipo_pint, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cod_artista))))
                .addContainerGap(31, Short.MAX_VALUE))
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
                    .addComponent(tipo_pint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nom_pintura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(esti_pintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(cod_artista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(desc_pintura, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
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

    String cod_arte_pintura = "";
    String nombre_pintura = "";
    Date fecha_creacion_pintura;
    String descripcion_pintura = "";
    String tipos_pintura = "";
    String estilos_pintura = "";
    String id_artista = "";

    public void LimpiarCampos() {

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
        id_artista = cod_artista.getText();

    }

    public void crearUsuario(ObjectContainer BaseD) {
        asignarVariables(BaseD);
        if (validarCampos(BaseD)) {
            boolean error = false;
            if (verificar(BaseD, cod_arte_pintura)) {
                error = true;
                JOptionPane.showMessageDialog(null, "La Pintura ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                cod_pintura.setText("");
            }

            if (comprobarart(BaseD, id_artista) == 0) {
                error = true;
                JOptionPane.showMessageDialog(null, "No existe ningun Artista con este codigo");
            }

            if (!error) {
                clases.Pintura miUsuario = new clases.Pintura(estilos_pintura, tipos_pintura, id_artista, cod_arte_pintura, nombre_pintura, descripcion_pintura, fecha_creacion_pintura);

                BaseD.set(miUsuario);
                JOptionPane.showMessageDialog(null, "Pintura Creada");
                LimpiarCampos();

            }
        }
    }

    public static boolean verificar(ObjectContainer BaseD, String cod_arte_pintura) {
        Query query = BaseD.query();
        query.constrain(Pintura.class);
        query.descend("codigo").constrain(cod_arte_pintura).equal();
        ObjectSet result = query.execute();
        return !result.isEmpty();
    }

    public static int comprobarart(ObjectContainer basep, String Id_artista) {

        ObjectSet result = basep.get(new Artista(Id_artista, null, null));
        return result.size();
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
            JOptionPane.showMessageDialog(this, "Ingrese el nombre de la pintura por favor");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarNomApe(nombre_pintura)) {
                JOptionPane.showMessageDialog(this, "Nombre invalido");
                ban_confirmar = false;
            }
        }
        if (desc_pintura.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la descripcion de la pintura");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validardescripcion(descripcion_pintura)) {
                JOptionPane.showMessageDialog(this, "Descripcion invalido");
                ban_confirmar = false;
            }
        }
        return ban_confirmar;
    }

    public static void Cerrar_BD(ObjectContainer basep) {

        basep.close();
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MENU_ADM.direccionBD);
        crearUsuario(BaseD);

        Cerrar_BD(BaseD);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        this.dispose();
        MENU_ADM ventaina = new MENU_ADM();
        ventaina.setVisible(true);
    }//GEN-LAST:event_btnvolverActionPerformed

    /**
     * @param args the command line arguments
     */

    private void desc_pinturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desc_pinturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desc_pinturaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnvolver;
    private javax.swing.JTextField cod_artista;
    private javax.swing.JTextField cod_pintura;
    private javax.swing.JTextField desc_pintura;
    private javax.swing.JComboBox<String> esti_pintura;
    private com.toedter.calendar.JDateChooser fechaN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nom_pintura;
    private javax.swing.JComboBox<String> tipo_pint;
    // End of variables declaration//GEN-END:variables
}
