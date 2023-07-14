/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import clases.Usuario;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class Crud_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Crud_Usuario
     */
    public Crud_Usuario() {
        initComponents();
        
    }
    
    String idUsuario = "";
    String cedula = "";
    String nombre = "";
    String apellido = "";
    Date fechaNac;
    String telefono = "";
    String correo = "";
    String provincia = "";
    String cuidad = "";
    String calle = "";
    String nivel_conoci = "";
    char genero;
    
    public static String direccionBD = ("C:\\Users\\LENOVO\\OneDrive\\Escritorio\\BASEDATOSABRIL2023\\guia.yap");
    
    public void asignarVariables(ObjectContainer BaseD) {
        
        cedula = txtCedula.getText();
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        fechaNac = fechaN.getDate();
        telefono = txtTelefono.getText();
        correo = txtCorreo.getText();
        provincia = txtProvi.getText();
        cuidad = txtCiudad.getText();
        calle = txtxCalle.getText();
        nivel_conoci = txtNivel.getText();
        int numero = 0; // Valor por defecto

        if (!telefono.isEmpty()) {
            try {
                numero = Integer.parseInt(telefono);
            } catch (NumberFormatException e) {
                // Manejo de errores en caso de que el número de teléfono no sea un entero válido
                e.printStackTrace();
            }
        }
        
    }
    
    public void LimpiarCampos() {
        
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtProvi.setText("");
        txtCiudad.setText("");
        txtxCalle.setText("");
        txtNivel.setText("");
        
    }
    
    public void crearUsuario(ObjectContainer BaseD) {
        asignarVariables(BaseD);
        
        int numero = 0; // Valor por defecto

        if (!telefono.isEmpty()) {
            try {
                numero = Integer.parseInt(telefono);
            } catch (NumberFormatException e) {
                // Manejo de errores en caso de que el número de teléfono no sea un entero válido
                e.printStackTrace();
            }
        }
        
        if (rdhombre.isSelected()) {
            genero = 'H';
        } else {
            genero = 'M';
        }
        
        if (verificar(BaseD, cedula) == 0) {
            Usuario miUsuario = new Usuario(nivel_conoci, cedula, nombre, apellido, fechaNac, numero, provincia, cuidad, calle, correo, genero);
            
            BaseD.set(miUsuario);
            JOptionPane.showMessageDialog(null, "Usuario Creado");
            
            Usuario Abuscar = new Usuario(null, null, null, null, null, 0, null, null, null, null, '\u0000');
            ObjectSet result = BaseD.get(Abuscar);
            mostrarDatos(result);
            LimpiarCampos();
            
        } else {
            
            JOptionPane.showMessageDialog(null, "El usuario ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public static int verificar(ObjectContainer BaseD, String cedula) {
        Usuario buscarUsuario = new Usuario(null, cedula, null, null, null, 0, null, null, null, null, '\u0000');
        ObjectSet resul = BaseD.get(buscarUsuario);
        return resul.size();
        
    }
    
    public void mostrarDatos(ObjectSet result) {
        String matrizUsuario[][] = new String[result.size()][11];
        
        if (result.size() == 0) {
            JOptionPane.showMessageDialog(null, "El usuario no existe");
        } else {
            for (int i = 0; i < result.size(); i++) {
                Usuario miUsuario = new Usuario();
                
                miUsuario = (Usuario) result.get(i);
                matrizUsuario[i][0] = miUsuario.getCedula();
                matrizUsuario[i][1] = miUsuario.getNombre();
                matrizUsuario[i][2] = miUsuario.getApellido();
                matrizUsuario[i][3] = String.valueOf(miUsuario.getF_nacimiento());
                matrizUsuario[i][4] = String.valueOf(miUsuario.getNum_telefono());
                matrizUsuario[i][5] = String.valueOf(miUsuario.getGenero());
                matrizUsuario[i][6] = miUsuario.getCorreo();
                matrizUsuario[i][7] = miUsuario.getProvincia();
                matrizUsuario[i][8] = miUsuario.getCiudad();
                matrizUsuario[i][9] = miUsuario.getCalle();
                matrizUsuario[i][10] = miUsuario.getNivel_conoci();
                
                tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(matrizUsuario, new String[]{"Cedula", "Nombre", "Apellido", "Fecha Nacimiento", "Telefono", "Genero", "Correo", "Provincia", "Ciudad", "Calle", "Nivel Conocimiento"}));
                
            }
        }
        
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtProvi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtxCalle = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNivel = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        fechaN = new com.toedter.calendar.JDateChooser();
        Cargardatos = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaUsuario = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        rdhombre = new javax.swing.JRadioButton();
        rdmujer = new javax.swing.JRadioButton();
        modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registro Usuario");

        jLabel3.setText("Cedula:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Apellido:");

        jLabel6.setText("Fecha de nacimiento:");

        jLabel7.setText("Telefono:");

        jLabel8.setText("Correo:");

        jLabel9.setText("Direcion:");

        jLabel10.setText("Provincia:");

        jLabel11.setText("Cuidad:");

        jLabel12.setText("Calle:");

        jLabel13.setText("Nivel conocimiento:");

        txtNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNivelActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel14.setText("Genero:");

        Cargardatos.setText("Cargar Datos");
        Cargardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargardatosActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaUsuario);

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdhombre);
        rdhombre.setText("Hombre");

        buttonGroup1.add(rdmujer);
        rdmujer.setText("Mujer");

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(jLabel9))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(jLabel10)
                .addGap(6, 6, 6)
                .addComponent(txtProvi, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addComponent(fechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jLabel12)
                .addGap(49, 49, 49)
                .addComponent(txtxCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jLabel13)
                .addGap(6, 6, 6)
                .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel14)
                .addGap(12, 12, 12)
                .addComponent(rdhombre)
                .addGap(46, 46, 46)
                .addComponent(rdmujer))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Guardar)
                .addGap(21, 21, 21)
                .addComponent(Cargardatos)
                .addGap(21, 21, 21)
                .addComponent(eliminar))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8))
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtxCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel7))
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel13))
                    .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(rdhombre)
                    .addComponent(rdmujer))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Guardar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cargardatos)
                            .addComponent(eliminar))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificar))
                .addGap(10, 10, 10)
                .addComponent(jButton2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNivelActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        ObjectContainer BaseD = Db4o.openFile(direccionBD);
        crearUsuario(BaseD);
        
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_GuardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        ObjectContainer BaseD = Db4o.openFile(direccionBD);
        eliminar(BaseD);
        
        Cerrar_BD(BaseD);

    }//GEN-LAST:event_eliminarActionPerformed

    private void CargardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargardatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CargardatosActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed


    }//GEN-LAST:event_modificarActionPerformed
  
    
    public void modificar(ObjectContainer BaseD){
          Usuario Umodi = new Usuario(null, cedula, null, null, null, 0, null, null, null, null, '\u0000');
                ObjectSet result = BaseD.get(Umodi);
                Usuario Umodificar = (Usuario) result.next();
                Umodificar.setNombreEstudiante(jTFnombre.getText());
                Umodificar.setApellidoEstudiante(jTFapellido.getText());
                Umodificar.setCiudadEstudiante(jCBciudad.getSelectedItem().toString());
                Umodificar.setEdadEstudiante((Integer) jSedad.getValue());
                Umodificar.setGeneroEstudiante(GeneroEstudiante);
                basep.set(Emodificar);
        
    }
    public void CargarDatos(ObjectContainer BaseD){
       DefaultTableModel TablaModelo = (DefaultTableModel) tablaUsuario.getModel();
        
        int seleccion = tablaUsuario.getSelectedRow();
        String cedula = tablaUsuario.getValueAt(seleccion, 0).toString();
        Usuario Abuscar = new Usuario(null, cedula, null, null, null, 0, null, null, null, null, '\u0000');
        ObjectSet result = BaseD.get(Abuscar);
        for(int i = 0 ; i < result.size(); i++){
            Usuario miUsuario = new Usuario();
            miUsuario = (Usuario) result.get(i);
         txtCedula.setText(miUsuario.getNombre());
        txtNombre.setText(miUsuario.getCedula());
        txtApellido.setText(miUsuario.getApellido());
    fechaN.setDate(miUsuario.getF_nacimiento());
        txtTelefono.setText(String.valueOf(miUsuario.getNum_telefono()));
        txtCorreo.setText(miUsuario.getCorreo());
        txtProvi.setText(miUsuario.getProvincia());
        txtCiudad.setText(miUsuario.getCiudad());
       txtxCalle.setText(miUsuario.getCalle());
        txtNivel.setText(miUsuario.getNivel_conoci());
        
         if (miUsuario.getGenero()=='H') {
                        rdhombre.setSelected(true);
                        rdmujer.setSelected(false);
                    }
               if (miUsuario.getGenero()=='M') {
                        rdmujer.setSelected(true);
                        rdhombre.setSelected(false);
                    }
            
            
            
        }
        
        
  }

    public void eliminar(ObjectContainer BaseD) {
        DefaultTableModel TablaModelo = (DefaultTableModel) tablaUsuario.getModel();
        
        int seleccion = tablaUsuario.getSelectedRow();
        String cedula = tablaUsuario.getValueAt(seleccion, 0).toString();
        
        Usuario Abuscar = new Usuario(null, cedula, null, null, null, 0, null, null, null, null, '\u0000');
        ObjectSet result = BaseD.get(Abuscar);
        
        Usuario AsignaturaElim = (Usuario) result.next();
        BaseD.delete(AsignaturaElim);
        
        TablaModelo.removeRow(tablaUsuario.getSelectedRow());
        JOptionPane.showMessageDialog(null, "Eliminado exitosamente");
    }
    

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
            java.util.logging.Logger.getLogger(Crud_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargardatos;
    private javax.swing.JButton Guardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton eliminar;
    private com.toedter.calendar.JDateChooser fechaN;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modificar;
    private javax.swing.JRadioButton rdhombre;
    private javax.swing.JRadioButton rdmujer;
    private javax.swing.JTable tablaUsuario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNivel;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProvi;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtxCalle;
    // End of variables declaration//GEN-END:variables
}
