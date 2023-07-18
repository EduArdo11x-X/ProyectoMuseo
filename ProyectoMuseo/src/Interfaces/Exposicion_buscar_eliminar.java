/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import static Interfaces.Exposicion_registro.cerrarBD;
import static Interfaces.Exposicion_registro.direccionBD;
import clases.Exposicion;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;

/**
 *
 * @author EDU
 */
public class Exposicion_buscar_eliminar extends javax.swing.JFrame {

  
    public Exposicion_buscar_eliminar() {
        initComponents();
    }
    
     public static String direccionBD = ("\\Users\\EDU\\Documents\\GitHub\\ProyectoMuseo\\ProyectoMuseo\\guia");

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codigotxt = new javax.swing.JLabel();
        eliminarbtn = new javax.swing.JButton();
        filtrocmb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        exposiciontbl = new javax.swing.JTable();
        Buscarbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Filtro:");

        jLabel2.setText("ID:");

        eliminarbtn.setText("Eliminar");
        eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarbtnActionPerformed(evt);
            }
        });

        filtrocmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "Ver todos", "Codigo", "Nombre", " " }));

        exposiciontbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(exposiciontbl);

        Buscarbtn.setText("Buscar");
        Buscarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filtrocmb, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Buscarbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codigotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarbtn)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eliminarbtn)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(codigotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(filtrocmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Buscarbtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarbtnActionPerformed
ObjectContainer BaseD = Db4o.openFile(direccionBD);  
eliminarExposicion(BaseD);
cerrarBD(BaseD);        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarbtnActionPerformed

    private void BuscarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarbtnActionPerformed

ObjectContainer BaseD = Db4o.openFile(direccionBD);  
filtro(BaseD);
cerrarBD(BaseD);   
    }//GEN-LAST:event_BuscarbtnActionPerformed

    public void filtro(ObjectContainer BaseD) {
        if (filtrocmb.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selección invalida");
        } else {
            if (filtrocmb.getSelectedIndex() == 1) {
                Exposicion Exbuscar = new Exposicion(null, null, null, null, null);
                ObjectSet result = BaseD.get(Exbuscar);
                mostrarDatos(result);

            } else {
                if (filtrocmb.getSelectedIndex() == 2) {
                    String codigoEx = JOptionPane.showInputDialog("Ingrese el Codigo a consultar");
                    Exposicion Exbuscar = new Exposicion(codigoEx, null, null, null, null);
                    ObjectSet result = BaseD.get(Exbuscar);
                    mostrarDatos(result);

                } else {
                    if (filtrocmb.getSelectedIndex() == 3) {
                        String nombreEx = JOptionPane.showInputDialog("Ingrese el nombre a consultar");
                        Exposicion Exbuscar = new Exposicion(null, nombreEx, null, null, null);
                        ObjectSet result = BaseD.get(Exbuscar);
                        mostrarDatos(result);
                    }

                }

            }

        }
    }

    public void mostrarDatos(ObjectSet result) {
        String matrizExposicion[][] = new String[result.size()][5];
        if (result.size() == 0) {
            JOptionPane.showMessageDialog(null, "La exposicion no existe");
        }

        for (int i = 0; i < result.size(); i++) {
            Exposicion miExposicion = new Exposicion();
            miExposicion = (Exposicion) result.get(i);
            matrizExposicion[i][0] = miExposicion.getCod_exposicion();
            matrizExposicion[i][1] = miExposicion.getNombre_exposicion();
            matrizExposicion[i][2] = miExposicion.getDescripcion_exposicion();
            matrizExposicion[i][3] = String.valueOf(miExposicion.getFecha_inicio());
            matrizExposicion[i][4] = String.valueOf(miExposicion.getFecha_fin());

            exposiciontbl.setModel(new javax.swing.table.DefaultTableModel(matrizExposicion, new String[]{"Codigo", "Nombre", "Descripcion", "Fecha inicio", "Fecha final"}));

        }

    }

    public void eliminarExposicion(ObjectContainer BaseD) {

        if (codigotxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un Codigo");
        } else {
            String codigo = codigotxt.getText();
            Exposicion ExEliminar = new Exposicion(codigo, null, null, null, null);
            ObjectSet result = BaseD.get(ExEliminar);

            if (comprobarExposicion(BaseD, codigo) == 0) {
                JOptionPane.showMessageDialog(null, "La exposicion no existe en la base de datos");

            } else {
                Exposicion EliminarEx = (Exposicion) result.next();
                BaseD.delete(EliminarEx);
                JOptionPane.showMessageDialog(null, "El aula fue eliminada exitosamente");
            }

        }

        //Borrar el campo de texto
        codigotxt.setText("");

    }

    public static int comprobarExposicion(ObjectContainer BaseD, String codigo) {
        Exposicion Exbuscar = new Exposicion(codigo, null, null, null, null);
        ObjectSet result = BaseD.get(Exbuscar);
        return result.size();

    }

    public static void cerrarBD(ObjectContainer BaseD) {
        BaseD.close();
    }

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
            java.util.logging.Logger.getLogger(Exposicion_buscar_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exposicion_buscar_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exposicion_buscar_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exposicion_buscar_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exposicion_buscar_eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscarbtn;
    private javax.swing.JLabel codigotxt;
    private javax.swing.JButton eliminarbtn;
    private javax.swing.JTable exposiciontbl;
    private javax.swing.JComboBox<String> filtrocmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
