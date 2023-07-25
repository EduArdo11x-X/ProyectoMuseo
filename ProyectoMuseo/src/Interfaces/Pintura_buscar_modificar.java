/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import clases.Pintura;
import com.db4o.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EDU
 */
public class Pintura_buscar_modificar extends javax.swing.JFrame {

    /**
     * Creates new form Pintura_buscar_modificar
     */
    public Pintura_buscar_modificar() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buscar_button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableregistro = new javax.swing.JTable();
        jCBfiltro = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFid = new javax.swing.JTextField();
        eliminar_button = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Raanana", 1, 18)); // NOI18N
        jLabel1.setText("Seleccione un campo para buscar la Pintura");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Raanana", 1, 18)); // NOI18N
        jLabel2.setText("Filtro");

        buscar_button.setFont(new java.awt.Font("Raanana", 1, 18)); // NOI18N
        buscar_button.setText("BUSCAR");
        buscar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_buttonActionPerformed(evt);
            }
        });

        jtableregistro.setFont(new java.awt.Font("Raanana", 1, 18)); // NOI18N
        jtableregistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Fecha", "Descripcion", "Tipo", "Estilo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtableregistro);

        jCBfiltro.setFont(new java.awt.Font("Raanana", 1, 18)); // NOI18N
        jCBfiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Ver todos", "ID Pintura", " ", " " }));
        jCBfiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBfiltroActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Raanana", 1, 18)); // NOI18N
        jLabel3.setText("Consultar y Eliminar Pintura");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Raanana", 1, 18)); // NOI18N
        jLabel4.setText("Ingrese el ID de la asignatura a eliminar");

        jLabel5.setFont(new java.awt.Font("Raanana", 1, 18)); // NOI18N
        jLabel5.setText("ID:");
        jLabel5.setToolTipText("ID asignatura");

        jTFid.setFont(new java.awt.Font("Raanana", 1, 18)); // NOI18N
        jTFid.setToolTipText("Ingresar el ID  de la asignatura a eliminar");

        eliminar_button.setFont(new java.awt.Font("Raanana", 1, 18)); // NOI18N
        eliminar_button.setText("ELIMINAR");
        eliminar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_buttonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Raanana", 1, 18)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Minilogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(eliminar_button)))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_button)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminar_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        ObjectContainer BaseD = Db4o.openFile(Pintura_Interfaz.direccionBD);
        Filtro(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_buscar_buttonActionPerformed

    private void jCBfiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBfiltroActionPerformed

    }//GEN-LAST:event_jCBfiltroActionPerformed

    private void eliminar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_buttonActionPerformed
        ObjectContainer BaseD = Db4o.openFile(Pintura_Interfaz.direccionBD);
        Eliminar_pintura(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_eliminar_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        menuPrincipal ventaina = new  menuPrincipal();
        ventaina.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void Filtro(ObjectContainer basep) {

        if (jCBfiltro.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una opcion");
        } else {

            if (jCBfiltro.getSelectedIndex() == 1) {
                Pintura Abuscar = new Pintura(null, null, null, null, null, null);
                ObjectSet result = basep.get(Abuscar);
                mostrarDatos(result);

            } else {
                if (jCBfiltro.getSelectedIndex() == 2) {
                    String cod_arte_pintura = JOptionPane.showInputDialog("Ingrese el ID a consultar");
                    Pintura Abuscar = new Pintura(null, null, cod_arte_pintura, null, null, null);
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
                clases.Pintura mipintura = (clases.Pintura) result.next();
                Object[] fila = {
                    mipintura.getCodigo(),
                    mipintura.getNombre(),
                    String.valueOf(mipintura.getFecha_creacion()),
                    mipintura.getDescripcion(),
                    mipintura.getTipo(),
                    mipintura.getEstilo()
                };
                model.addRow(fila);
            }
        }
    }
     
     public void Eliminar_pintura(ObjectContainer basep) {
        Pintura_Interfaz Ainterfaz = new Pintura_Interfaz();
        if (jTFid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID");
        } else {

            String IDA = jTFid.getText();
            Pintura Abuscar = new Pintura(null, null, IDA, null, null, null);
            ObjectSet result = basep.get(Abuscar);

            if (Ainterfaz.verificar(basep, IDA) == 0) {
                JOptionPane.showMessageDialog(null, "La Pintura no existe en la base de datos");

            } else {
                Pintura AsignaturaElim = (Pintura) result.next();
                basep.delete(AsignaturaElim);
                JOptionPane.showMessageDialog(null, "La Pintura fue anulada exitosamente");
            }

        }

        //Borrar el campo de texto
        jTFid.setText("");
    }
     
      public static void Cerrar_BD(ObjectContainer basep) {

        basep.close();
    }

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar_button;
    private javax.swing.JButton eliminar_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBfiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFid;
    private javax.swing.JTable jtableregistro;
    // End of variables declaration//GEN-END:variables
}
