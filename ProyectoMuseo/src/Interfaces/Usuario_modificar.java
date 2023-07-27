/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import clases.Pintura;
import clases.Usuario;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author EDU
 */
public class Usuario_modificar extends javax.swing.JFrame {

    /**
     * Creates new form Usuario_modificar
     */
    public Usuario_modificar() {
        initComponents();
    }
    
    String idUsuario = "";
    String cedula = "";
    String nombre = "";
    String apellido = "";
    Date fechaNac;
    String telefono ;
    String correo = "";
    String provincia = "";
    String cuidad = "";
    String calle = "";
    String nivel_conoci = "";
    char genero;
    String direccion = "";
    
     public  void buscar(ObjectContainer BaseD) {//cargardatos

        botonBuscar.setEnabled(false);
        String auxced;
        auxced = txtCedula.getText();

        Usuario_registro EAux = new Usuario_registro();

        if (txtCedula.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Ingrese la cedula: ");
        } else {

            if (comprobarUsuario(BaseD ,auxced) == 0) {

                JOptionPane.showMessageDialog(null, "El usuario existe en la base de datos");
                limpiarDatos();

            } else {

                Usuario Ebuscar = new Usuario(null, null,auxced, null, null, null, null, '\u0000', null, null, null, null, null);

                ObjectSet result = BaseD.get(Ebuscar);
                for (int i = 0; i < result.size(); i++) {

                    Usuario miE = new Usuario();

                    miE = (Usuario) result.get(i);

                    txtCedula.setText(miE.getCedula());
                    txtNombre.setText(miE.getNombre());
                    txtApellido.setText(miE.getApellido());
                    txtTelefono.setText(String.valueOf(miE.getNum_telefono()));
                    txtCorreo.setText(miE.getCorreo());
                    txtProvi.setText(miE.getProvincia());
                    txtCiudad.setText(miE.getCiudad());
                    txtNivel.setText(miE.getNivel_conocimiento());
                    fechaN.setDate((miE.getF_nacimiento()));

                    bttnmodifi.setEnabled(true);
                    
                    //Hacer editable los campos de texto
                    mostrarDatos(result);
                    HabilitarCampos();
                    txtCedula.setEnabled(false);
                    
                }

            }

        }
    }
     
     private void HabilitarCampos() {

         txtCedula.setEditable(true);
         txtNombre.setEditable(true);
         txtApellido.setEditable(true);
         txtTelefono.setEditable(true);
         txtCorreo.setEditable(true);
         txtProvi.setEditable(true);
         txtCiudad.setEditable(true);
         txtNivel.setEditable(true);
         //fechaN;
       

    }
     
     public void cargarDatos(ObjectContainer BaseD) {

        Usuario Exbuscar = new Usuario(null, null, null, null, null, null, null, '\u0000', null, null, null, null, null);
        ObjectSet result = BaseD.get(Exbuscar);
        mostrarDatos(result);
    }
     
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
    }

    public void limpiarDatos() {
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

    public static int comprobarUsuario(ObjectContainer BaseD, String cedula) {
        Usuario Exbuscar = new Usuario(null, null, cedula, null, null, null, null, '\u0000', null, null, null, null, null);
        ObjectSet result = BaseD.get(Exbuscar);
        return result.size();

    }

      public void mostrarDatos(ObjectSet result) {
        String matrizUsuario[][] = new String[result.size()][11];
        if (result.size() == 0) {
            JOptionPane.showMessageDialog(null, "El usuario no existe");
        }

        for (int i = 0; i < result.size(); i++) {
            Usuario miUsuario = new Usuario();
            miUsuario = (Usuario) result.get(i);
            matrizUsuario[i][0] = miUsuario.getCedula();
            matrizUsuario[i][1] = miUsuario.getNombre();
            matrizUsuario[i][2] = miUsuario.getApellido();
            matrizUsuario[i][3] = String.valueOf(miUsuario.getNum_telefono());
            //matrizUsuario[i][4] = String.valueOf(miExposicion.getFecha_fin());
            matrizUsuario[i][5] = miUsuario.getCorreo();
            matrizUsuario[i][6] = miUsuario.getProvincia();
            matrizUsuario[i][7] = miUsuario.getCiudad();
            matrizUsuario[i][8] = miUsuario.getCalle();
            matrizUsuario[i][9] = miUsuario.getNivel_conocimiento();

            tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(matrizUsuario, new String[]{"Cedula", "Nombre", "Apellido", "Telefono", "Genero", "Correo Electronico", "Provincia", "Ciudad", "Calle", "Nivel de conocimiento"}));

        }

    }
      
      public boolean validarCampos(ObjectContainer basep) {
        Validaciones miValidaciones = new Validaciones();
        asignarVariables(basep);
        boolean ban_confirmar = true;

        if (txtCedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "INGRESE su cedula");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarid(cedula)) {
                JOptionPane.showMessageDialog(this, "CEDULA INVALIDO");
                ban_confirmar = false;
            }
        }

        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre ");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarNomApe(nombre)) {
                JOptionPane.showMessageDialog(this, "nombre invalido");
                ban_confirmar = false;
            }
        }
        

        if (txtCorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el correo ");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarCorreo(correo)) {
                JOptionPane.showMessageDialog(this, "correo invalido");
                ban_confirmar = false;
            }
        }
        
       

        return ban_confirmar;
    }
      public static void Cerrarv_BD(ObjectContainer BaseD) {

        BaseD.close();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        fechaN = new com.toedter.calendar.JDateChooser();
        Cargardatos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaUsuario = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        rdhombre = new javax.swing.JRadioButton();
        txtCedula = new javax.swing.JTextField();
        rdmujer = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        txtdireccion = new javax.swing.JTextField();
        bttnmodifi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 11, 13));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Modificar Usuario");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Correo:");

        txtCorreo.setBackground(new java.awt.Color(134, 153, 167));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Direcion:");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Provincia:");

        txtProvi.setBackground(new java.awt.Color(134, 153, 167));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cuidad:");

        txtCiudad.setBackground(new java.awt.Color(134, 153, 167));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Calle:");

        txtxCalle.setBackground(new java.awt.Color(134, 153, 167));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nivel conocimiento:");

        txtNivel.setBackground(new java.awt.Color(134, 153, 167));
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

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cedula:");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Genero:");

        Cargardatos.setText("Cargar Datos");
        Cargardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargardatosActionPerformed(evt);
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

        jButton2.setBackground(new java.awt.Color(0, 11, 13));
        jButton2.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.setMaximumSize(new java.awt.Dimension(121, 33));
        jButton2.setMinimumSize(new java.awt.Dimension(129, 31));
        jButton2.setPreferredSize(new java.awt.Dimension(129, 31));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        rdhombre.setText("Hombre");

        txtCedula.setBackground(new java.awt.Color(134, 153, 167));

        rdmujer.setText("Mujer");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");

        txtNombre.setBackground(new java.awt.Color(134, 153, 167));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido:");

        txtApellido.setBackground(new java.awt.Color(134, 153, 167));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de nacimiento:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono:");

        txtTelefono.setBackground(new java.awt.Color(134, 153, 167));

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        txtdireccion.setText("jTextField1");

        bttnmodifi.setText("Modificar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(Guardar)
                        .addGap(55, 55, 55)
                        .addComponent(Cargardatos)
                        .addGap(47, 47, 47)
                        .addComponent(bttnmodifi))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonBuscar)
                            .addComponent(jLabel1))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(6, 6, 6)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(99, 99, 99)
                            .addComponent(jLabel13)
                            .addGap(6, 6, 6)
                            .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(346, 346, 346)
                                    .addComponent(jLabel11)
                                    .addGap(6, 6, 6))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtxCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(157, 157, 157)
                            .addComponent(jLabel10)
                            .addGap(6, 6, 6)
                            .addComponent(txtProvi, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(12, 12, 12)
                                    .addComponent(rdhombre)
                                    .addGap(48, 48, 48)
                                    .addComponent(rdmujer))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(13, 13, 13)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(156, 156, 156)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(6, 6, 6)
                                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addContainerGap(79, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonBuscar)
                .addGap(7, 7, 7)
                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Cargardatos)
                    .addComponent(bttnmodifi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel3))
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel8))
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel9)
                    .addGap(4, 4, 4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtProvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel10))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel11)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(fechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(4, 4, 4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtxCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(17, 17, 17)
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
                    .addContainerGap(316, Short.MAX_VALUE)))
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

    private void txtNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNivelActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
//        ObjectContainer BaseD = Db4o.openFile(direccionBD);
//        crearUsuario(BaseD);
//        Cerrarv_BD(BaseD);
    }//GEN-LAST:event_GuardarActionPerformed

    private void CargardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargardatosActionPerformed
        // TODO add your handling code here:
//        ObjectContainer BaseD = Db4o.openFile(direccionBD);
//        cargarDatos(BaseD);
//        Cerrarv_BD(BaseD);
    }//GEN-LAST:event_CargardatosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
      
    }//GEN-LAST:event_botonBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargardatos;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton bttnmodifi;
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
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtxCalle;
    // End of variables declaration//GEN-END:variables
}
