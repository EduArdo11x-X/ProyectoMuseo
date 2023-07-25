/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import static Interfaces.Pintura_modificar.Cerrar_BD;
import clases.Articulo;
import clases.Pintura;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EDU
 */
public class Articulo_modificar extends javax.swing.JFrame {

    /**
     * Creates new form Articulo_modificar
     */
    public Articulo_modificar() {
        initComponents();
    }
    
        public void buscar(ObjectContainer basep) {//cargardatos

        botonGuar.setEnabled(false);
        String IDAux;
        IDAux = txtCodigo.getText();

        Pintura_Interfaz EAux = new Pintura_Interfaz();

        if (txtCodigo.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Ingrese un codigo");
        } else {

            if (EAux.verificar(basep, IDAux) == 0) {

                JOptionPane.showMessageDialog(null, "El articulo no existe en la base de datos");
                LimpiarCamposdeTexto();

            } else {

                Articulo Abuscar = new Articulo(IDAux, null, null, 0, 0, 0,0);

                ObjectSet result = basep.get(Abuscar);
                for (int i = 0; i < result.size(); i++) {

                    Articulo miA = new Articulo();

                    miA = (Articulo) result.get(i);

                    txtCodigo.setText(miA.getCod_articulo());
                    txtNombre.setText(miA.getNombre());
                    txtDescripcion.setText(miA.getDescripcion());
                    txtExitencia.setText(String.valueOf(miA.getExistencia()));
                    txtExis_Max.setText(String.valueOf(miA.getExis_max()));
                    txtExi_min.setText(String.valueOf(miA.getExis_min()));
                    txtPrecio.setText(String.valueOf(miA.getPrecio()));

                    botonGuar.setEnabled(true);
                    //Hacer editable los campos de texto
                    mostrarDatos(result);
                    HabilitarCampos_deTexto();
                    txtCodigo.setEditable(false);
                }

            }

        }
    }

    public void LimpiarCamposdeTexto() {

        txtCodigo.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtExis_Max.setText("");
        txtExitencia.setText("");
        txtExi_min.setText("");
        txtPrecio.setText("");

    }

    public void HabilitarCampos_deTexto() {
        txtCodigo.setEditable(true);
        txtNombre.setEditable(true);
        txtDescripcion.setEditable(true);
         txtExis_Max.setEditable(true);
          txtExitencia.setEditable(true);
           txtExi_min.setEditable(true);
            txtPrecio.setEditable(true);

    }

    public void Modificar_Articulo(ObjectContainer basep) {

        Articulo Amodi = new Articulo(txtCodigo.getText(),null, null, 0, 0, 0, 0);
        ObjectSet result = basep.get(Amodi);
        Articulo Amodificar = (Articulo) result.next();
        Amodificar.setNombre(txtNombre.getText());
        Amodificar.setDescripcion(txtDescripcion.getText());
        Amodificar.setExistencia(Integer.parseInt(txtExitencia.getText()));
        Amodificar.setExis_max(Integer.parseInt(txtExis_Max.getText()));
        Amodificar.setExis_min(Integer.parseInt(txtExi_min.getText()));
        Amodificar.setPrecio(Double.parseDouble(txtPrecio.getText()));
        
        basep.set(Amodificar);
        JOptionPane.showMessageDialog(null, "El articulo fue modificado exitosamente");

        mostrarDatos(result);
        LimpiarCamposdeTexto();
    }

    public static void Cerrar_BD(ObjectContainer basep) {

        basep.close();
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
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtExitencia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtExis_Max = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtExi_min = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        botonGuar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaArticulos = new javax.swing.JTable();
        botonRegresar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        jLabel1.setText("REGISTRO ARTICULOS ");

        jLabel2.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        jLabel2.setText("Codigo:");

        txtCodigo.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        jLabel4.setText("Descripcion:");

        txtDescripcion.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        jLabel5.setText("Existencia:");

        txtExitencia.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        jLabel6.setText("Existencia Maxima:");

        txtExis_Max.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        jLabel7.setText("Existencia Minima:");

        txtExi_min.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        jLabel8.setText("Precio:");

        txtPrecio.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N

        botonGuar.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        botonGuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/actualizado.png"))); // NOI18N
        botonGuar.setText("Guardar");
        botonGuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuarActionPerformed(evt);
            }
        });

        tablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaArticulos);

        botonRegresar.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/deshacer_1.png"))); // NOI18N
        botonRegresar.setText("Regresar");

        jButton1.setFont(new java.awt.Font("Raanana", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/lupa.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExi_min))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExis_Max))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExitencia))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigo))
                            .addComponent(jLabel4)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonGuar)
                        .addGap(18, 18, 18)
                        .addComponent(botonRegresar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtExitencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(txtExis_Max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtExi_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonGuar)
                            .addComponent(botonRegresar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
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

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void botonGuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuarActionPerformed
        ObjectContainer BaseD = Db4o.openFile(Evento_registro.direccionBD);
        Modificar_Articulo(BaseD);
        Cerrar_BD(BaseD);
        txtCodigo.setEditable(true);
    }//GEN-LAST:event_botonGuarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         ObjectContainer BaseD = Db4o.openFile(Evento_registro.direccionBD);
        buscar(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuar;
    private javax.swing.JButton botonRegresar;
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
    private javax.swing.JTable tablaArticulos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtExi_min;
    private javax.swing.JTextField txtExis_Max;
    private javax.swing.JTextField txtExitencia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
