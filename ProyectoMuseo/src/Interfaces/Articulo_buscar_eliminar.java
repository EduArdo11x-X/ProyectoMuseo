/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import clases.Articulo;
import clases.Pintura;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EDU
 */
public class Articulo_buscar_eliminar extends javax.swing.JFrame {

    /**
     * Creates new form Articulo_buscar_eliminar
     */
    public Articulo_buscar_eliminar() {
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
        buscarbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaArticulos = new javax.swing.JTable();
        jCBfiltro = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        eliminarbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jTFid = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 11, 13));
        jPanel1.setForeground(new java.awt.Color(153, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Courier New", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione un campo para buscar el Articulo:");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Courier New", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filtro:");

        buscarbtn.setBackground(new java.awt.Color(0, 11, 13));
        buscarbtn.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        buscarbtn.setForeground(new java.awt.Color(255, 255, 255));
        buscarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/lupa.png"))); // NOI18N
        buscarbtn.setText("Buscar");
        buscarbtn.setBorder(null);
        buscarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarbtnMouseExited(evt);
            }
        });
        buscarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarbtnActionPerformed(evt);
            }
        });

        tablaArticulos.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        tablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaArticulos);

        jCBfiltro.setBackground(new java.awt.Color(134, 153, 167));
        jCBfiltro.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jCBfiltro.setForeground(new java.awt.Color(0, 0, 0));
        jCBfiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Ver todos", "ID Pintura", " ", " " }));
        jCBfiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBfiltroActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Courier New", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese el codigo del articulo a eliminar:");

        jLabel5.setFont(new java.awt.Font("Courier New", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Codigo:");
        jLabel5.setToolTipText("ID asignatura");

        eliminarbtn.setBackground(new java.awt.Color(0, 11, 13));
        eliminarbtn.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        eliminarbtn.setForeground(new java.awt.Color(255, 255, 255));
        eliminarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/eliminar.png"))); // NOI18N
        eliminarbtn.setText("Eliminar");
        eliminarbtn.setBorder(null);
        eliminarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarbtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(134, 153, 167));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 11, 13));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Minilogo.png"))); // NOI18N
        jLabel7.setText(" BUSCAR Y ELIMINAR ARTICULOS ");

        botonRegresar.setBackground(new java.awt.Color(0, 11, 13));
        botonRegresar.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        botonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/deshacer_1.png"))); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.setBorder(null);
        botonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botonRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));

        jTFid.setBackground(new java.awt.Color(134, 153, 167));
        jTFid.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jTFid.setForeground(new java.awt.Color(0, 0, 0));
        jTFid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFid.setText("Ingrese el codigo del articulo");
        jTFid.setToolTipText("");
        jTFid.setBorder(null);
        jTFid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFidActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(jCBfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(buscarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(jTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(eliminarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel2))
                                    .addComponent(jCBfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buscarbtn)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel5))
                                    .addComponent(jTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eliminarbtn))
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarbtnActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MENU_ADM.direccionBD);
        Filtro(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_buscarbtnActionPerformed

    private void jCBfiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBfiltroActionPerformed

    }//GEN-LAST:event_jCBfiltroActionPerformed

    private void eliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarbtnActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MENU_ADM.direccionBD);
        Eliminar_Articulo(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_eliminarbtnActionPerformed

    private void buscarbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarbtnMouseEntered
       
        buscarbtn.setBackground(Color.black);
        
    }//GEN-LAST:event_buscarbtnMouseEntered

    private void buscarbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarbtnMouseExited
      buscarbtn.setBackground(new Color(255,204,153)); 
    }//GEN-LAST:event_buscarbtnMouseExited

    private void jTFidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFidActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
   this.dispose();
        MENU_ADM ventaina = new  MENU_ADM();
        ventaina.setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarActionPerformed

    
    public void Filtro(ObjectContainer basep) {

        if (jCBfiltro.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una opcion");
        } else {

            if (jCBfiltro.getSelectedIndex() == 1) {
                Articulo Abuscar = new Articulo(null, null, null, 0, 0, 0,0);
                ObjectSet result = basep.get(Abuscar);
                mostrarDatos(result);

            } else {
                if (jCBfiltro.getSelectedIndex() == 2) {
                    String codigoAriculo = JOptionPane.showInputDialog("Ingrese el ID a consultar");
                    Articulo Abuscar = new Articulo(codigoAriculo,null, null, 0, 0, 0, 0);
                    ObjectSet result = basep.get(Abuscar);
                    mostrarDatos(result);

                }
            }
        }

        //Borrar la eleccion y ponerla al inicio
        jCBfiltro.setSelectedIndex(0);
    }

      public void mostrarDatos(ObjectSet result) {
        DefaultTableModel model = (DefaultTableModel) tablaArticulos.getModel();
        model.setRowCount(0); // Limpiar la tabla

        if (result.size() == 0) {
            JOptionPane.showMessageDialog(null, "El articulo no existe");
        } else {
            while (result.hasNext()) {
                clases.Articulo miArticulo = (clases.Articulo) result.next();
                Object[] fila = {
                    miArticulo.getCod_articulo(),
                    miArticulo.getNombre(),
                    miArticulo.getDescripcion(),
                    String.valueOf(miArticulo.getExistencia()),
                    String.valueOf(miArticulo.getExis_max()),
                    String.valueOf(miArticulo.getExis_min()),
                    String.valueOf(miArticulo.getPrecio()),
                   
                };
                model.addRow(fila);
            }
        }
    }
     public void Eliminar_Articulo(ObjectContainer basep) {
        Articulo_registro Ainterfaz = new Articulo_registro();
        if (jTFid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un codigo");
        } else {

            String codigoA = jTFid.getText();
            Articulo Abuscar = new Articulo(codigoA, null, null, 0, 0, 0,0);
            ObjectSet result = basep.get(Abuscar);

            if (Articulo_registro.comprobarArticulo(basep, codigoA) == 0) {
                JOptionPane.showMessageDialog(null, "El Articulo no existe en la base de datos");

            } else {
                Articulo ArticuloElim = (Articulo) result.next();
                basep.delete(ArticuloElim);
                JOptionPane.showMessageDialog(null, "El articulo fue anulada exitosamente");
            }

        }

        //Borrar el campo de texto
        jTFid.setText("");
    }
     
      public static void Cerrar_BD(ObjectContainer basep) {

        basep.close();
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton buscarbtn;
    private javax.swing.JButton eliminarbtn;
    private javax.swing.JComboBox<String> jCBfiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTFid;
    private javax.swing.JTable tablaArticulos;
    // End of variables declaration//GEN-END:variables
}
