

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import static Interfaces.Pintura_buscar_modificar.Cerrar_BD;
import clases.Pintura;
import clases.Usuario;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EDU
 */
public class Usuario_buscar_eliminar extends javax.swing.JFrame {

    /**
     * Creates new form Usuario_buscar_eliminar
     */
    public Usuario_buscar_eliminar() {
        initComponents();
    }

    public void Filtro(ObjectContainer BaseD) {

        if (jComboBox1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una opcion");
        } else {

            if (jComboBox1.getSelectedIndex() == 1) {
                Usuario Abuscar = new Usuario(null, null, null, null, null, null, 0, '\u0000', null, null, null, null, null);
                ObjectSet result = BaseD.get(Abuscar);
                mostrarDatos(result);

            } else {
                if (jComboBox1.getSelectedIndex() == 2) {
                    String cedula = JOptionPane.showInputDialog("Ingrese el ID a consultar");
                    Usuario Abuscar = new Usuario(null, null, cedula, null, null, null, 0, '\u0000', null, null, null, null, null);
                    ObjectSet result = BaseD.get(Abuscar);
                    mostrarDatos(result);

                }
            }
        }

        //Borrar la eleccion y ponerla al inicio
        jComboBox1.setSelectedIndex(0);
    }

    public void mostrarDatos(ObjectSet result) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Limpiar la tabla

        if (result.size() == 0) {
            JOptionPane.showMessageDialog(null, "El usuario no existe");
        } else {
            while (result.hasNext()) {
                clases.Usuario miUsuario = (clases.Usuario) result.next();
                Object[] fila = {
                    miUsuario.getCedula(),
                    miUsuario.getNombre(),
                    miUsuario.getApellido(),
                    String.valueOf(miUsuario.getF_nacimiento()),
                    miUsuario.getNum_telefono(),
                    miUsuario.getGenero(),
                    miUsuario.getCorreo(),
                    miUsuario.getProvincia(),
                    miUsuario.getCiudad(),
                    miUsuario.getCalle(),
                    miUsuario.getNivel_conocimiento()
                };
                model.addRow(fila);
            }
        }
    }

    public void Eliminar_Usuario(ObjectContainer BaseD) {
        Usuario_registro Ainterfaz = new Usuario_registro();
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese una Cedula");
        } else {

            String IDA = jTextField1.getText();
            Usuario Abuscar = new Usuario(null, null, IDA, null, null, null, 0, '\u0000', null, null, null, null, null);
            ObjectSet result = BaseD.get(Abuscar);

            if (Ainterfaz.comprobarUsuario(BaseD, IDA) == 0) {
                JOptionPane.showMessageDialog(null, "El usuario no existe en la base de datos");

            } else {
                Usuario AsignaturaElim = (Usuario) result.next();
                BaseD.delete(AsignaturaElim);
                JOptionPane.showMessageDialog(null, "La Pintura fue anulada exitosamente");
            }

        }

        //Borrar el campo de texto
        jTextField1.setText("");
    }
    
     public static void Cerrar_BD(ObjectContainer BaseD) {

        BaseD.close();
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
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        botonBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        botonElimi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Consultar y Eliminar Usuario");

        jLabel2.setText("Seleccione un campo para buscar al Usuario");

        jLabel3.setText("Filtro:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingrese la cedula del usuario a eliminar");

        jLabel5.setText("Cedula:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        botonElimi.setText("Eliminar");
        botonElimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonElimiActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonBuscar))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonElimi)))
                        .addGap(74, 74, 74))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonElimi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
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

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        ObjectContainer BaseD = Db4o.openFile(Pintura_Interfaz.direccionBD);
        Filtro(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void botonElimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonElimiActionPerformed
        // TODO add your handling code here:
        ObjectContainer BaseD = Db4o.openFile(Pintura_Interfaz.direccionBD);
        Eliminar_Usuario(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_botonElimiActionPerformed

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonElimi;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
