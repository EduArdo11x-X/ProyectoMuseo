/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomuseo;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Crud_Obra_Arte extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<ObrArte> listaObra = new ArrayList<>();
    String nombre = " ";
    int codigo = 0;
    String descripcion = " ";
    Date fecha_creacion;

    public Crud_Obra_Arte() {
        initComponents();
        LlenarTabla();
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
        Lblnombre = new javax.swing.JLabel();
        Lblcodigo = new javax.swing.JLabel();
        Lbldescripcion = new javax.swing.JLabel();
        Lblfecha = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        calendario = new com.toedter.calendar.JCalendar();
        bttnregistrar = new javax.swing.JButton();
        bttnregresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbobrasarte = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("OBRAS DE ARTE");

        Lblnombre.setText("NOMBRE");

        Lblcodigo.setText("CODIGO DE ARTE");

        Lbldescripcion.setText("DESCRIPCION");

        Lblfecha.setText("FECHA DE CREACION");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });

        txtdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdescripcionKeyTyped(evt);
            }
        });

        bttnregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registro/iconos/disco-flexible.png"))); // NOI18N
        bttnregistrar.setText("REGISTRAR");
        bttnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnregistrarActionPerformed(evt);
            }
        });

        bttnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registro/iconos/deshacer.png"))); // NOI18N
        bttnregresar.setText("REGRESAR");
        bttnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnregresarActionPerformed(evt);
            }
        });

        tbobrasarte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOMBRE", "CODIGO", "DESCRIPCION", "FECHA CREACION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbobrasarte);
        if (tbobrasarte.getColumnModel().getColumnCount() > 0) {
            tbobrasarte.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(bttnregistrar)
                        .addGap(173, 173, 173)
                        .addComponent(bttnregresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lbldescripcion)
                                    .addComponent(Lblcodigo)
                                    .addComponent(Lblfecha)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(Lblnombre)))
                        .addGap(211, 211, 211)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lblnombre)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lblcodigo)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbldescripcion)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Lblfecha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnregistrar)
                    .addComponent(bttnregresar))
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char letra = evt.getKeyChar();
        if (!Character.isLetter(letra)) {
            evt.consume();
        }

        if (txtnombre.getText().length() > 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
        char letra = evt.getKeyChar();
        if (!Character.isDigit(letra)) {
            evt.consume();
        }

        if (txtcodigo.getText().length() > 3) {
            evt.consume();

        }


    }//GEN-LAST:event_txtcodigoKeyTyped

    private void txtdescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescripcionKeyTyped
        char letra = evt.getKeyChar();
        if (!Character.isLetter(letra)) {
            evt.consume();
        }

        if (txtdescripcion.getText().length() > 120) {
            evt.consume();
        }
    }//GEN-LAST:event_txtdescripcionKeyTyped

    private void bttnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnregistrarActionPerformed
        int filas = tbobrasarte.getRowCount();
        for (int j = filas - 1; j >= 0; j--) { // Vaciar la tabla
            modelo.removeRow(j);
        }
        //asignacionVariables();
        crearPersona();
        LlenarTabla();
    }//GEN-LAST:event_bttnregistrarActionPerformed

    private void bttnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnregresarActionPerformed
        this.dispose();
        Menu i = new Menu();
        i.setVisible(true);
    }//GEN-LAST:event_bttnregresarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lblcodigo;
    private javax.swing.JLabel Lbldescripcion;
    private javax.swing.JLabel Lblfecha;
    private javax.swing.JLabel Lblnombre;
    private javax.swing.JButton bttnregistrar;
    private javax.swing.JButton bttnregresar;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbobrasarte;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables

    private void crearPersona() {
        boolean error = false;

        for (int i = 0; i < listaObra.size(); i++) {
            if (listaObra.get(i).getNombre().equals(nombre)) {

                JOptionPane.showMessageDialog(null, "LA OBRA YA EXISTE");
                txtnombre.setText("");
                error = true;
            }
        }

        ObrArte miobra = new ObrArte(
                txtnombre.getText(),
                codigo = Integer.parseInt(txtcodigo.toString()),
                txtdescripcion.getText(),
                fecha_creacion = calendario.getDate()
        );

        listaObra.add(miobra);
        JOptionPane.showMessageDialog(null, " PERSONA CREADO");
        LimpiarCampos();
    }

    private void LlenarTabla() {

        modelo.setColumnIdentifiers(new String[]{"NOMBRE", "cODIGO", "DESCRIPCION", "FECHA DE CREACION"});

        for (int i = 0; i < listaObra.size(); i++) {
            Object[] datos = new Object[12];
            datos[0] = listaObra.get(i).getNombre();
            datos[1] = listaObra.get(i).getNombre();
            datos[2] = listaObra.get(i).getCodigo();
            datos[3] = listaObra.get(i).getDescripcion();
            datos[11] = listaObra.get(i).getFecha_creacion();

            modelo.addRow(datos);
        }

        tbobrasarte.setModel(modelo);

    }

    public void ModificarPersona() {
        int filaSeleccionada = tbobrasarte.getSelectedRow();
        if (filaSeleccionada >= 0) {
            txtnombre.setText(tbobrasarte.getValueAt(filaSeleccionada, 0).toString());
            txtcodigo.setText(tbobrasarte.getValueAt(filaSeleccionada, 1).toString());
            txtdescripcion.setText(tbobrasarte.getValueAt(filaSeleccionada, 2).toString());

            //botones.setSelected(tablacrud.getValueAt(filaSeleccionada, 6).toString());
            //txtemail.setText(tablacrud.getValueAt(filaSeleccionada, 4).toString());
        } else {
            JOptionPane.showMessageDialog(null, "NO HAS SELECCIONADO NINGUNA ");
        }

    }

    public void EliminarPersona(String Cedula) {

        for (int i = 0; i < listaObra.size(); i++) {
            if (listaObra.get(i).getNombre().equals(nombre)) {
                listaObra.remove(i);
                JOptionPane.showMessageDialog(null, "ELIMINADO CORRECTAMENTE");

            } else {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRADO");
            }
        }
    }

    private void LimpiarCampos() {

        txtnombre.setText("");
        txtdescripcion.setText("");
        txtcodigo.setText("");
        calendario.setDate(fecha_creacion);

    }

    public void asignacionVariables() {

        nombre = txtnombre.getText();

        descripcion = txtdescripcion.getText();

    }

}
