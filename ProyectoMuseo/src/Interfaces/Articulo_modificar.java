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
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
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
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 11, 13));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo.setBackground(new java.awt.Color(134, 153, 167));
        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodigo.setText("Ingrese el codigo del articulo");
        txtCodigo.setToolTipText("");
        txtCodigo.setBorder(null);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 230, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 101, -1, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txtNombre.setBackground(new java.awt.Color(134, 153, 167));
        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNombre.setText("Ingrese el nombre del articulo");
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 250, 30));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripcion:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        txtDescripcion.setBackground(new java.awt.Color(134, 153, 167));
        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtDescripcion.setText("Ingrese una descripcion del articulo");
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 300, 111));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Existencia:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        txtExitencia.setBackground(new java.awt.Color(134, 153, 167));
        txtExitencia.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtExitencia.setText("Ingrese la cantidad existente");
        jPanel1.add(txtExitencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 250, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Existencia Maxima:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        txtExis_Max.setBackground(new java.awt.Color(134, 153, 167));
        txtExis_Max.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtExis_Max.setText("Cantidad maxima");
        jPanel1.add(txtExis_Max, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 130, 30));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Existencia Minima:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        txtExi_min.setBackground(new java.awt.Color(134, 153, 167));
        txtExi_min.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtExi_min.setText("Cantidad minima");
        jPanel1.add(txtExi_min, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 130, 30));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        txtPrecio.setBackground(new java.awt.Color(134, 153, 167));
        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 11, 13));
        txtPrecio.setText("Ingrese el precio");
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 110, 30));

        botonGuar.setBackground(new java.awt.Color(134, 153, 167));
        botonGuar.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        botonGuar.setForeground(new java.awt.Color(0, 11, 13));
        botonGuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/actualizado.png"))); // NOI18N
        botonGuar.setText("Guardar");
        botonGuar.setBorder(null);
        botonGuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuarActionPerformed(evt);
            }
        });
        jPanel1.add(botonGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 550, 120, 40));

        tablaArticulos.setBackground(new java.awt.Color(134, 153, 167));
        tablaArticulos.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, 100));

        jButton1.setBackground(new java.awt.Color(134, 153, 167));
        jButton1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 11, 13));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/lupa.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 110, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, 1030, -1));

        jPanel2.setBackground(new java.awt.Color(134, 153, 167));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 11, 13));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Minilogo.png"))); // NOI18N
        jLabel1.setText("REGISTRO ARTICULOS ");

        botonRegresar.setBackground(new java.awt.Color(134, 153, 167));
        botonRegresar.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        botonRegresar.setForeground(new java.awt.Color(0, 11, 13));
        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/deshacer_1.png"))); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.setBorder(null);
        botonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 69));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 110, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, 540));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 230, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 250, 10));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 300, 10));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 250, -1));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 130, 10));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 130, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
if(txtCodigo.getText().equals("Ingrese el codigo del articulo")){
txtCodigo.setText("");
}// TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMouseClicked

    
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
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
