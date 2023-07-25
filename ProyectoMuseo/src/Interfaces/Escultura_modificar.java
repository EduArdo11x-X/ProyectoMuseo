/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import static Interfaces.Pintura_modificar.Cerrar_BD;
import clases.Escultura;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author EDU
 */
public class Escultura_modificar extends javax.swing.JFrame {

    String material = "";
    double peso = 0;
    double altura = 0;
    String codigo = "";
    String nombre = "";
    String descripcion = "";
    Date fecha_creacion;

    public static String direccionBD = ("C:\\Users\\LENOVO\\OneDrive\\Escritorio\\Avance del proyecto\\guia.yap");

    public Escultura_modificar() {
        initComponents();
         bttnmodificar.setEnabled(false);
    }

    private void buscar(ObjectContainer BaseD) {
        bttnmodificar.setEnabled(false);
        String CODIGOAux;
        CODIGOAux = txtcodigo.getText();

        Escultura_registro EAux = new Escultura_registro();

        if (txtcodigo.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Ingrese un codigo");
        } else {

            if (EAux.comproparescultura(BaseD, codigo) == 0) {

                JOptionPane.showMessageDialog(null, "La escultura no existe en la base de datos");
                limpiarDatos();

            } else {

                Escultura Ebuscar = new Escultura(null, 0, 0, codigo, null, null, null);

                ObjectSet result = BaseD.get(Ebuscar);
                for (int i = 0; i < result.size(); i++) {

                    Escultura miE = new Escultura();

                    miE = (Escultura) result.get(i);
                    
                    txtcodigo.setText(miE.getCodigo());
                    txtnombre.setText(miE.getNombre());
                    txtarea.setText(miE.getDescripcion());
                    calendario.setDate(miE.getFecha_creacion());
                    txtpeso.setText(miE.getPeso());
                    txtaltura.setText(miE.getAltura());

                    for (int j = 0; j < CmbBxmaterial.getItemCount(); j++) {
                        if (miE.getMaterial().equalsIgnoreCase(CmbBxmaterial.getItemAt(j))) {
                            CmbBxmaterial.setSelectedIndex(j);
                            j = CmbBxmaterial.getItemCount();
                        }
                    }
                    
                if (validarCampos(BaseD)) {
                    bttnmodificar.setEnabled(true);
                }
                    HabilitarCampos();
                    txtcodigo.setEditable(false);
                }

            }
        }

    }
    
      public void asignarVariables(ObjectContainer BaseD) {

        material = CmbBxmaterial.getSelectedItem().toString();
        peso = Double.parseDouble(txtpeso.getText());
        altura = Double.parseDouble(txtaltura.getText());
        codigo = txtcodigo.getText();
        nombre = txtnombre.getText();
        descripcion = txtarea.getText();
        fecha_creacion = calendario.getDate();

    }
    
    
     public boolean validarCampos(ObjectContainer basep) {
        Validaciones miValidaciones = new Validaciones();
        asignarVariables(basep);
        boolean ban_confirmar = true;

        if (txtcodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "INGRESE UN CODIGO");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarid(codigo)) {
                JOptionPane.showMessageDialog(this, "CODIGO INVALIDO");
                ban_confirmar = false;
            }
        }

        if (txtnombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre de la escultura");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarNomApe(nombre)) {
                JOptionPane.showMessageDialog(this, "nombre invalido");
                ban_confirmar = false;
            }
        }

        return ban_confirmar;
    }

    public static int comproparobra(ObjectContainer BaseD, String codigo) {

        Escultura EscBuscar = new Escultura(null, 0, 0, codigo, null, null, null);

        ObjectSet result = BaseD.get(EscBuscar);
        return result.size();
    }

    public static void Modificar_Escultura(ObjectContainer BaseD) {

        JOptionPane.showMessageDialog(null, "Existen campos vacios");
        //LimpiarCamposdeTexto();
        Escultura Emodi = new Escultura(txtcodigo.getText(), 0,0,  null, null, null,null);
        ObjectSet result = BaseD.get(Emodi);
        Escultura Emodificar = (Escultura) result.next();
        Emodificar.setCodigo(txtcodigo.getText());
        Emodificar.setNombre(txtnombre.getText());
        Emodificar.setDescripcion(txtarea.getText());
        Emodificar.setFecha_creacion(calendario.getDate());
        Emodificar.setMaterial(CmbBxmaterial.getSelectedItem().toString());
        
     
        BaseD.set(Emodificar);
        JOptionPane.showMessageDialog(null, "El Usuario modificado exitosamente");
        limpiarDatos();

    }

    private void Cerrar_BD(ObjectContainer BaseD) {
        BaseD.close();
    }

public void limpiarDatos() {

        CmbBxmaterial.setSelectedItem("");
        txtpeso.setText("");
       txtaltura.setText("");
        txtcodigo.setText("");
        txtnombre.setText("");
        txtarea.setText("");
    }

    private void HabilitarCampos() {

        CmbBxmaterial.setEditable(true);
        txtpeso.setEditable(true);
        txtaltura.setEditable(true);
        txtcodigo.setEditable(true);
        txtnombre.setEditable(true);
        txtarea.setEditable(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        calendario = new com.toedter.calendar.JDateChooser();
        txtpeso = new javax.swing.JTextField();
        txtaltura = new javax.swing.JTextField();
        CmbBxmaterial = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblmodescult = new javax.swing.JTable();
        bttnmodificar = new javax.swing.JButton();
        bttnregresar = new javax.swing.JButton();
        bttnbuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MODIFICAR  ESCULTURA");

        jLabel2.setText("CODIGO ARTE");

        jLabel3.setText("NOMBRE");

        jLabel4.setText("DESCRIPCION");

        jLabel5.setText("FECHA DE CREACION");

        jLabel6.setText("MATERIAL");

        jLabel7.setText("PESO");

        jLabel8.setText("ALTURA");

        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        txtpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesoActionPerformed(evt);
            }
        });

        CmbBxmaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIEDRA", "MADERA", "METAL", "CERAMICA", "VIDRIO", " " }));
        CmbBxmaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbBxmaterialActionPerformed(evt);
            }
        });

        tblmodescult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "DESCRIPCION", "FECHA DE CREACION", "MATERIAL", "PESO", "ALTURA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblmodescult);

        bttnmodificar.setText("MODIFICAR");
        bttnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnmodificarActionPerformed(evt);
            }
        });

        bttnregresar.setText("REGRESAR");
        bttnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnregresarActionPerformed(evt);
            }
        });

        bttnbuscar.setText("BUSCAR");
        bttnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtaltura, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpeso, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CmbBxmaterial, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calendario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(64, 64, 64)
                                .addComponent(bttnbuscar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(bttnregresar)
                        .addGap(234, 234, 234)
                        .addComponent(bttnmodificar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnbuscar))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CmbBxmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnmodificar)
                    .addComponent(bttnregresar))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnregresarActionPerformed
        this.dispose();
        Exposicion_registro ventana = new Exposicion_registro();
        ventana.setVisible(true);
    }//GEN-LAST:event_bttnregresarActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void CmbBxmaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbBxmaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbBxmaterialActionPerformed

    private void txtpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpesoActionPerformed

    private void bttnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnmodificarActionPerformed

        ObjectContainer BaseD = Db4o.openFile(Pintura_Interfaz.direccionBD);
        Modificar_Escultura(BaseD);
        Cerrar_BD(BaseD);
        txtcodigo.setEditable(true);
    }//GEN-LAST:event_bttnmodificarActionPerformed

    private void bttnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnbuscarActionPerformed
        ObjectContainer BaseD = Db4o.openFile(Pintura_Interfaz.direccionBD);
        buscar(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_bttnbuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Escultura_modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escultura_modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escultura_modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escultura_modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escultura_modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbBxmaterial;
    private javax.swing.JButton bttnbuscar;
    private javax.swing.JButton bttnmodificar;
    private javax.swing.JButton bttnregresar;
    private com.toedter.calendar.JDateChooser calendario;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblmodescult;
    private javax.swing.JTextField txtaltura;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpeso;
    // End of variables declaration//GEN-END:variables
}
