/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomuseo;

import clases.Artista;
import clases.Usuario;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import static proyectomuseo.Registro_artista.Cerrar_BD;
import static proyectomuseo.Registro_artista.direccionBD;

/**
 *
 * @author usuario
 */
public class Crud_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Crud_Usuario
     */
    public static ArrayList<Usuario> listaUsurios = new ArrayList<>();

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

    public static String direccionBD = ("C:\\Users\\ASUS TUF\\OneDrive\\Imágenes\\Base_ProyectoMuseo\\base_MUSEO.yap");

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
            LimpiarCampos();

        } else {

            JOptionPane.showMessageDialog(null, "El usuario ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static int verificar(ObjectContainer BaseD, String cedula) {
        Usuario buscarUsuario = new Usuario(null, cedula, null, null, null, 0, null, null, null, null,'\u0000' );
        ObjectSet resul = BaseD.get(buscarUsuario);
        return resul.size();

    }

    public void mostrarDatos(ObjectSet result) {
        String matrizUsuario[][] = new String[result.size()][3];

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
        jButton3 = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaUsuario = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        rdhombre = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Registro Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 6, -1, -1));

        jLabel3.setText("Cedula:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 145, -1));

        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 124, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 116, 138, -1));

        jLabel5.setText("Apellido:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 162, -1, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 158, 136, -1));

        jLabel6.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 204, -1, -1));

        jLabel7.setText("Telefono:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 255, -1, -1));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 247, 188, -1));

        jLabel8.setText("Correo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 44, -1, -1));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 110, -1));

        jLabel9.setText("Direcion:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 86, -1, -1));

        jLabel10.setText("Provincia:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 124, -1, -1));
        jPanel1.add(txtProvi, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 116, 95, -1));

        jLabel11.setText("Cuidad:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 162, -1, -1));
        jPanel1.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 158, 108, -1));

        jLabel12.setText("Calle:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 204, -1, -1));
        jPanel1.add(txtxCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 200, 78, -1));

        jLabel13.setText("Nivel conocimiento:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 251, -1, -1));

        txtNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNivelActionPerformed(evt);
            }
        });
        jPanel1.add(txtNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 247, 80, -1));

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 326, -1, -1));

        jLabel14.setText("Genero:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));
        jPanel1.add(fechaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 200, -1, -1));

        jButton3.setText("Modificar");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, 140));

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        buttonGroup1.add(rdhombre);
        rdhombre.setText("Hombre");
        jPanel1.add(rdhombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Mujer");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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


    }//GEN-LAST:event_eliminarActionPerformed

    public void eliminar(ObjectContainer BaseD) {
        DefaultTableModel TablaModelo = (DefaultTableModel) tablaUsuario.getModel();

        int seleccion = tablaUsuario.getSelectedRow();
        String cedula = tablaUsuario.getValueAt(seleccion, 0).toString();

        Usuario Abuscar = new Usuario(null, cedula, null, null, null, 0, null, null, null, null,'\u0000' );
        ObjectSet result = BaseD.get(Abuscar);

        Usuario AsignaturaElim = (Usuario) result.next();
        BaseD.delete(AsignaturaElim);

        TablaModelo.removeRow(tablaUsuario.getSelectedRow());
        JOptionPane.showMessageDialog(null, "Eliminado exitosamente");
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Crud_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Crud_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Crud_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Crud_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Crud_Usuario().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton eliminar;
    private com.toedter.calendar.JDateChooser fechaN;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdhombre;
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
