/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import clases.Restaurador;
import com.db4o.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class restaurador_buscar_eliminar extends javax.swing.JFrame {

    /**
     * Creates new form restaurador_buscar_eliminar
     */
    public restaurador_buscar_eliminar() {
        initComponents();
    }
    
    public void Filtro(ObjectContainer basep) {

        if (jCBfiltro.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una opcion");
        } else {

            if (jCBfiltro.getSelectedIndex() == 1) {
                Restaurador Abuscar = new Restaurador(null, null,null, null, null, null, null, '\u0000', null, null, null, null, null);
                ObjectSet result = basep.get(Abuscar);
                mostrarDatos(result);

            } else {
                if (jCBfiltro.getSelectedIndex() == 2) {
                    String jTFid = JOptionPane.showInputDialog("Ingrese el ID a consultar");
                    Restaurador Abuscar = new Restaurador(jTFid, null,null, null, null, null, null, '\u0000', null, null, null, null, null);
                    ObjectSet result = basep.get(Abuscar);
                    mostrarDatos(result);

                }
            }
        }

        //Borrar la eleccion y ponerla al inicio
        jCBfiltro.setSelectedIndex(0);
    }

    public void mostrarDatos(ObjectSet result) {
        DefaultTableModel model = (DefaultTableModel) jtableregistro.getModel();
        model.setRowCount(0); // Limpiar la tabla

        if (result.size() == 0) {
            JOptionPane.showMessageDialog(null, "El usuario no existe");
        } else {
            while (result.hasNext()) {
                Restaurador mitaquillero = (Restaurador) result.next();
                Object[] fila = {
                    mitaquillero.getId_restaurador(),
                    mitaquillero.getCedula(),
                    mitaquillero.getNombre(),
                    mitaquillero.getApellido(),
                    mitaquillero.getGenero(),
                    mitaquillero.getNum_telefono(),
                    String.valueOf(mitaquillero.getF_nacimiento()),
                    mitaquillero.getCorreo(),
                    mitaquillero.getHabilidades(),                    
                    mitaquillero.getProvincia(),
                    mitaquillero.getCiudad(),
                    mitaquillero.getCalle(),};
                model.addRow(fila);
            }
        }
    }

     public void Eliminar_restaurador(ObjectContainer basep) {
         restaurador_ingresar Ainterfaz = new restaurador_ingresar();
        if (jTFid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID");
        } else {

            String IDA = jTFid.getText();
            Restaurador Abuscar = new Restaurador(IDA, null,null, null, null, null, null, '\u0000', null, null, null, null, null);
            ObjectSet result = basep.get(Abuscar);

            if (!Ainterfaz.comprobarID(basep, IDA)) {
                JOptionPane.showMessageDialog(null, "El restaurador no existe en la base de datos");

            } else {
                Restaurador AsignaturaElim = (Restaurador) result.next();
                basep.delete(AsignaturaElim);
                JOptionPane.showMessageDialog(null, "El restaurador fue anulada exitosamente");
            }

        }

        //Borrar el campo de texto
        jTFid.setText("");
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
        buscar_button = new javax.swing.JButton();
        jCBfiltro = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFid = new javax.swing.JTextField();
        eliminar_button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableregistro = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione un campo para buscar al Restaurador");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setText("Filtro");

        buscar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/buscar.png"))); // NOI18N
        buscar_button.setText("BUSCAR");
        buscar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_buttonActionPerformed(evt);
            }
        });

        jCBfiltro.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jCBfiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Ver todos", "ID Restaurador", " ", " " }));
        jCBfiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBfiltroActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel3.setText("Consultar y Eliminar Restaurador");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setText("Ingrese el ID del Restaurador a eliminar");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("ID:");
        jLabel5.setToolTipText("ID asignatura");

        jTFid.setToolTipText("Ingresar el ID  de la asignatura a eliminar");
        jTFid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFidActionPerformed(evt);
            }
        });

        eliminar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/eliminar.png"))); // NOI18N
        eliminar_button.setText("ELIMINAR");
        eliminar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_buttonActionPerformed(evt);
            }
        });

        jtableregistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Guardia", "Cedula", "Nombre", "Apellido", "Genero", "Numero Telefono", "Fecha Nacimiento", "Correo", "Habilidades", "Provincia", "Ciudad", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableregistroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtableregistro);

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar_button)
                        .addGap(194, 194, 194)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminar_button))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCBfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5)
                        .addComponent(jTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eliminar_button))
                    .addComponent(buscar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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

    private void buscar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_buttonActionPerformed
        ObjectContainer BaseD = Db4o.openFile(PaginaPrincipal.direccionBD);
        Filtro(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_buscar_buttonActionPerformed

    private void jCBfiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBfiltroActionPerformed

    }//GEN-LAST:event_jCBfiltroActionPerformed

    private void jTFidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFidActionPerformed

    private void eliminar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_buttonActionPerformed
        /*String id_guardia = jTFid.getText();

        // Abre la base de datos
        ObjectContainer baseDeDatos = Db4o.openFile(jose.INICIO.direccionBD);

        try {
            // Verifica si existen control de guardia asociado a este guardia
            Control_guardia cass1 = new Control_guardia(null, null, null, id_guardia, null);
            ObjectSet result1 = baseDeDatos.get(cass1);
            if (result1.size() > 0) {
                JOptionPane.showMessageDialog(this, "No se puede eliminar el guardia ya que esta asociado a un control de guardia", "ERROR", 0);
                return;
            }

            //verifica si existen Especialidades asociadas a este guardia
            //verifica si existen areas asociados a este guardia
            Area cass3 = new Area(null, null, null, 0, false, null, id_guardia, null);
            ObjectSet result3 = baseDeDatos.get(cass3);
            if (result3.size() > 0) {
                JOptionPane.showMessageDialog(this, "No se puede eliminar el guardia ya que tiene relacion con Areas", "ERROR", 0);
                return;
            }

            // Busca  guardia a eliminar
            Guardia revisar = new Guardia(id_guardia, 0, false, null, null, null, null, 0, null, null, null, null, null, null);
            ObjectSet cassResult = baseDeDatos.get(revisar);

            if (cassResult.size() == 0) {
                JOptionPane.showMessageDialog(null, "El guardia no existe");
            } else {
                // Elimina Habilidad encontrado
                baseDeDatos.delete(cassResult.get(0));
                JOptionPane.showMessageDialog(null, "Guardia eliminado correctamente");

                // Actualiza la tabla después de eliminar el Juego
                Filtro(baseDeDatos);
            }
        } finally {
            // Cierra la base de datos

            baseDeDatos.close();
        }*/

        ObjectContainer BaseD = Db4o.openFile(PaginaPrincipal.direccionBD);
        Eliminar_restaurador(BaseD);
        Cerrar_BD(BaseD);

    }//GEN-LAST:event_eliminar_buttonActionPerformed

    private void jtableregistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableregistroMouseClicked
        int i = jtableregistro.getSelectedRow();
        jTFid.setText(jtableregistro.getValueAt(i, 0).toString());
    }//GEN-LAST:event_jtableregistroMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        MENU_ADM mostrar = new MENU_ADM();
        mostrar.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(restaurador_buscar_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(restaurador_buscar_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(restaurador_buscar_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(restaurador_buscar_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new restaurador_buscar_eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar_button;
    private javax.swing.JButton eliminar_button;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCBfiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFid;
    private javax.swing.JTable jtableregistro;
    // End of variables declaration//GEN-END:variables
}
