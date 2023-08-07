/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

import clases.Administrador;
import com.db4o.query.Query;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS TUF
 */
public class Admi_registroT extends javax.swing.JFrame {

    /**
     * Creates new form Registro_museo
     */
    public static String direccionBD = ("C:\\Users\\ASUS TUF\\OneDrive\\Escritorio\\Base_proyecto\\proyecto.yap");

    public Admi_registroT() {
        initComponents();

//        verificar(ObjectContainer BaseD);
    }

    String cedula_adm = "";
    String nombre_adm = "";
    String apellido_adm = "";
    String email_adm = "";
    char sexo_adm = ' ';
    Date fechaTexto_adm;
    String telefono_adm = "";
    String contra_adm = "";
    int experiencia_adm = 0;
    String titulo_adm = "";
    String provincia_adm = "";
    String ciudad_adm = "";
    String calle_adm = "";
    double sueldo_adm = 0;

    public void LimpiarCampos() {

        txtcedula.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtcell.setText("");
        txtcorreo.setText("");
        txt_contra.setText("");
        txt_experiencia.setText("");
        txt_titulo.setText("");
        txt_experiencia.setText("");
        txt_experiencia.setText("");
        combo_cuidad.setText("");
        combo_provincia.setSelectedItem("");
        txtcalle.setText("");
        txt_sueldo.setText("");

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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        tt = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtcell = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        combo_provincia = new javax.swing.JComboBox<>();
        txtcalle = new javax.swing.JTextField();
        txt_contra = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        fechaN = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableregistro_adm = new javax.swing.JTable();
        radio_M = new javax.swing.JRadioButton();
        radio_F = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        txt_sueldo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_experiencia = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        combo_cuidad = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tt.setBackground(new java.awt.Color(204, 204, 204));
        tt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("REGISTRO DE ADM");

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        tt.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, -1));
        tt.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 126, 37, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Ingreso de datos personales:");
        tt.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 370, -1));

        jLabel4.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        jLabel4.setText("Cedula:");
        tt.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 85, -1));

        jLabel5.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        jLabel5.setText("Nombre:");
        tt.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 100, -1));

        jLabel6.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        jLabel6.setText("Apellido:");
        tt.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 100, -1));

        jLabel7.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        jLabel7.setText("Fecha de nacimiento:");
        tt.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        jLabel8.setText("Telefono o Cell :");
        tt.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Provincia:");
        tt.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 110, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Ciudad:");
        tt.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 90, -1));

        jLabel12.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        jLabel12.setText("Sexo:");
        tt.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 68, -1));

        jLabel13.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        jLabel13.setText("Correo:");
        tt.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 70, -1));

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DIRECCION");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        tt.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 730, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 102));
        jLabel14.setText("Calle:");
        tt.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, -1, -1));

        txtcedula.setBackground(new java.awt.Color(153, 153, 153));
        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        tt.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 178, -1));

        txtnombre.setBackground(new java.awt.Color(153, 153, 153));
        tt.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 178, -1));

        txtapellido.setBackground(new java.awt.Color(153, 153, 153));
        tt.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 178, -1));

        txtcell.setBackground(new java.awt.Color(153, 153, 153));
        tt.add(txtcell, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 180, -1));

        txtcorreo.setBackground(new java.awt.Color(153, 153, 153));
        txtcorreo.setForeground(new java.awt.Color(255, 255, 255));
        tt.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 310, -1));

        jLabel15.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        jLabel15.setText("Contraseña:");
        tt.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 120, -1));

        combo_provincia.setBackground(new java.awt.Color(204, 255, 204));
        combo_provincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azuay", "Bolívar", "Cañar", "Carchi", "Chimborazo", "Cotopaxi", "El Oro", "Esmeraldas", "Galápagos", "Guayas", "Imbabura", "Loja", "Los Ríos", "Manabí", "Morona-Santiago", "Napo", "Orellana", "Pastaza", "Pichincha", "Santa Elena", "Santo Domingo de los Tsáchilas", "Sucumbíos", "Tungurahua", "Zamora-Chinchipe" }));
        tt.add(combo_provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 150, -1));

        txtcalle.setBackground(new java.awt.Color(153, 153, 153));
        txtcalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcalleActionPerformed(evt);
            }
        });
        tt.add(txtcalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 150, -1));

        txt_contra.setBackground(new java.awt.Color(153, 153, 153));
        tt.add(txt_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 310, -1));

        Registrar.setBackground(new java.awt.Color(0, 0, 102));
        Registrar.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setText("Registrarse");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        tt.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 140, 50));

        fechaN.setBackground(new java.awt.Color(153, 153, 153));
        tt.add(fechaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 180, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        tt.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 170, 50));

        jtableregistro_adm.setBackground(new java.awt.Color(102, 102, 102));
        jtableregistro_adm.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jtableregistro_adm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CEDULA", "NOMBRE", "APELLIDO", "NACIMIENTO", "TELEFONO", "SEXO", "PROVINCIA", "CIUDAD", "CALLE", "CORREO", "CONTRASEÑA", "SUELDO", "AÑOS EXPERIENCIA", "TITULO "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtableregistro_adm);
        if (jtableregistro_adm.getColumnModel().getColumnCount() > 0) {
            jtableregistro_adm.getColumnModel().getColumn(0).setResizable(false);
            jtableregistro_adm.getColumnModel().getColumn(1).setResizable(false);
            jtableregistro_adm.getColumnModel().getColumn(2).setResizable(false);
            jtableregistro_adm.getColumnModel().getColumn(3).setResizable(false);
        }

        tt.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 1200, 160));

        radio_M.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        radio_M.setForeground(new java.awt.Color(0, 0, 204));
        radio_M.setText("M");
        radio_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_MActionPerformed(evt);
            }
        });
        tt.add(radio_M, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));

        radio_F.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        radio_F.setForeground(new java.awt.Color(102, 0, 0));
        radio_F.setText("F");
        tt.add(radio_F, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 60, 30));

        jLabel16.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        jLabel16.setText("Sueldo:");
        tt.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        txt_sueldo.setBackground(new java.awt.Color(153, 153, 153));
        tt.add(txt_sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 140, -1));

        jLabel17.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        jLabel17.setText("Años experiencia:");
        tt.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));

        txt_experiencia.setBackground(new java.awt.Color(153, 153, 153));
        tt.add(txt_experiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 140, -1));

        jLabel18.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        jLabel18.setText("Titulo universitario:");
        tt.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        txt_titulo.setBackground(new java.awt.Color(153, 153, 153));
        tt.add(txt_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 500, -1));

        combo_cuidad.setBackground(new java.awt.Color(153, 153, 153));
        tt.add(combo_cuidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 150, -1));

        jButton3.setBackground(new java.awt.Color(102, 204, 0));
        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        tt.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, 140, 50));

        jButton4.setBackground(new java.awt.Color(0, 153, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("Cargar Datos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        tt.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, 160, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed

//        ObjectContainer Baseprincipal = Db4o.openFile("C:\\Users\\ASUS TUF\\OneDrive\\Imágenes\\Base_ProyectoMuseo\\base_MUSEO.yap");
        ObjectContainer BaseD = Db4o.openFile(MENU_ADM.direccionBD);
        crear_adm(BaseD);
        Cerrar_BD(BaseD);


    }//GEN-LAST:event_RegistrarActionPerformed

    private void radio_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_MActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_MActionPerformed

    private void txtcalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcalleActionPerformed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaActionPerformed
    private Administrador buscarAdministrador(ObjectContainer db, String cedula) {
        Query query = db.query();
        query.constrain(Administrador.class);
        query.descend("cedula").constrain(cedula).equal();
        List<Administrador> resultado = query.execute();
        return resultado.isEmpty() ? null : resultado.get(0);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String cedulaBuscar = JOptionPane.showInputDialog(this, "Ingrese la cédula del administrador a modificar:", "Buscar Administrador", JOptionPane.QUESTION_MESSAGE);

        if (cedulaBuscar == null || cedulaBuscar.isEmpty()) {
            // El usuario cerró la ventana o no ingresó cédula.
            return;
        }

        ObjectContainer BaseD = Db4o.openFile(MENU_ADM.direccionBD);
        Administrador adminBuscado = buscarAdministrador(BaseD, cedulaBuscar);

        if (adminBuscado == null) {
            BaseD.close();
            JOptionPane.showMessageDialog(this, "El administrador con cédula " + cedulaBuscar + " no existe.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Cargar los datos del administrador encontrado en los campos correspondientes
        txtcedula.setText(adminBuscado.getCedula());
        txtnombre.setText(adminBuscado.getNombre());
        txtapellido.setText(adminBuscado.getApellido());
        txtcorreo.setText(adminBuscado.getCorreo());
        fechaN.setDate(adminBuscado.getF_nacimiento());
        txtcell.setText(adminBuscado.getNum_telefono());
        txt_contra.setText(adminBuscado.getContraseña());
        txt_sueldo.setText(String.valueOf(adminBuscado.getSueldo()));
        txt_experiencia.setText(String.valueOf(adminBuscado.getAños_experiencia()));
        txt_titulo.setText(adminBuscado.getTitulo_universitario());
        combo_provincia.setSelectedItem(adminBuscado.getProvincia());
        combo_cuidad.setText(adminBuscado.getCiudad());
        txtcalle.setText(adminBuscado.getCalle());

        if (adminBuscado.getGenero() == 'F') {
            radio_F.setSelected(true);
        } else if (adminBuscado.getGenero() == 'M') {
            radio_M.setSelected(true);
        } else {
            // Si no se tiene un género válido, se deseleccionan ambos radios.
            radio_F.setSelected(false);
            radio_M.setSelected(false);
        }

        BaseD.close();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Abrir la base de datos
        String cedulaBuscar = txtcedula.getText(); // Suponiendo que cedulaBuscar es el identificador único del administrador.
        ObjectContainer BaseD = Db4o.openFile(MENU_ADM.direccionBD);
        Administrador adminBuscado = buscarAdministrador(BaseD, cedulaBuscar);

        if (adminBuscado == null) {
            BaseD.close();
            JOptionPane.showMessageDialog(this, "El administrador con cédula " + cedulaBuscar + " no existe.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Actualizar los datos del administrador encontrado con los valores de los campos de la interfaz gráfica
        adminBuscado.setNombre(txtnombre.getText());
        adminBuscado.setApellido(txtapellido.getText());
        adminBuscado.setCorreo(txtcorreo.getText());
        adminBuscado.setF_nacimiento(fechaN.getDate());
        adminBuscado.setNum_telefono(txtcell.getText());
        adminBuscado.setContraseña(txt_contra.getText());
        adminBuscado.setSueldo(Double.parseDouble(txt_sueldo.getText()));
        adminBuscado.setAños_experiencia(Integer.parseInt(txt_experiencia.getText()));
        adminBuscado.setTitulo_universitario(txt_titulo.getText());
        adminBuscado.setProvincia(combo_provincia.getSelectedItem().toString());
        adminBuscado.setCiudad(combo_cuidad.getText());
        adminBuscado.setCalle(txtcalle.getText());

        if (radio_F.isSelected()) {
            adminBuscado.setGenero('F');
        } else if (radio_M.isSelected()) {
            adminBuscado.setGenero('M');
        } else {

        }

        // Guardar los cambios y cerrar la base de datos
        BaseD.store(adminBuscado);
        BaseD.commit();
        BaseD.close();

        // Actualizar la tabla con los datos modificados
        ObjectContainer baseDatos = Db4o.openFile(direccionBD);
        mostrarDatos(baseDatos.queryByExample(Administrador.class));
        baseDatos.close();

        // Limpiar los campos 
        LimpiarCampos();

        JOptionPane.showMessageDialog(this, "Los cambios han sido guardados correctamente.", "Guardado Exitoso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         ObjectContainer baseDatos = null;
        baseDatos = Db4o.openFile(MENU_ADM.direccionBD);
        ObjectSet<Administrador> veterinarios = baseDatos.queryByExample(Administrador.class);
        mostrarDatos(veterinarios);
        baseDatos.close();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           this.dispose();
        MENU_ADM ventaina = new  MENU_ADM();
        ventaina.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    public void asignarVariables(ObjectContainer BaseD) {

        cedula_adm = txtcedula.getText();
        nombre_adm = txtnombre.getText();
        apellido_adm = txtapellido.getText();
        email_adm = txtcorreo.getText();
        fechaTexto_adm = fechaN.getDate();
        telefono_adm = txtcell.getText();
        contra_adm = txt_contra.getText();
        titulo_adm = txt_titulo.getText();
        provincia_adm = combo_provincia.getSelectedItem().toString();
        ciudad_adm = combo_cuidad.getText();
        calle_adm = txtcalle.getText();

        try {
            sueldo_adm = Double.parseDouble(txt_sueldo.getText());
        } catch (NumberFormatException e) {
            // Manejo de error en caso de que el usuario no haya ingresado un número válido.
            // Puedes mostrar un mensaje de error, asignar un valor por defecto, etc.
            sueldo_adm = 0.0; // Por ejemplo, asignamos 0.0 como valor por defecto en caso de error.
        }

        if (radio_F.isSelected()) {
            sexo_adm = 'F';
        } else if (radio_M.isSelected()) {
            sexo_adm = 'M';
        } else {
            // Si ninguno está seleccionado, puedes asignar un valor por defecto o manejar el caso según tu lógica.
            sexo_adm = ' ';
        }

    }

    public void crear_adm(ObjectContainer BaseD) {

        asignarVariables(BaseD);

        //aki solo ayuda a pasar el tipo texco con un numero
        try {
            experiencia_adm = Integer.parseInt(txt_experiencia.getText());
        } catch (NumberFormatException e) {
            experiencia_adm = 0; // Por ejemplo, asignamos 0 como valor por defecto en caso de error.
        }

        //Aki verifica que todos los campos esten llenados para que no se lleene un campo vacio
        if (cedula_adm.isEmpty() || nombre_adm.isEmpty() || apellido_adm.isEmpty() || email_adm.isEmpty()
                || fechaTexto_adm == null || telefono_adm.isEmpty() || contra_adm.isEmpty()
                || titulo_adm.isEmpty() || provincia_adm.isEmpty() || ciudad_adm.isEmpty() || calle_adm.isEmpty()) {

            JOptionPane.showMessageDialog(null, "** COMPLETE TODOS LOS CAMPOS **", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (verificar_adm(BaseD, cedula_adm) == 0) {
            clases.Administrador mipartista = new clases.Administrador(sueldo_adm, experiencia_adm, titulo_adm,
                    cedula_adm, nombre_adm, apellido_adm, fechaTexto_adm, telefono_adm, sexo_adm, provincia_adm,
                    ciudad_adm, calle_adm, email_adm, contra_adm);

            BaseD.set(mipartista);
            JOptionPane.showMessageDialog(null, "ADMINISTRADOR CREADO");
            ObjectSet result = BaseD.queryByExample(new clases.Administrador());
            mostrarDatos(result);
            LimpiarCampos();

        } else {
            JOptionPane.showMessageDialog(null, "** EL ADMINISTRADOR YA EXISTE **", "Error", JOptionPane.ERROR_MESSAGE);
            txtcedula.setText("");
        }

    }

    public static int verificar_adm(ObjectContainer BaseD, String cedula_adm) {
        // Suponiendo que cedula_adm es una variable de tipo String que ya ha sido definida previamente.
        clases.Administrador midueñobuscar = new clases.Administrador(0.0, 0, null, cedula_adm, null, null, null, null, '\u0000', null, null, null, null, null);

        ObjectSet resul = BaseD.queryByExample(midueñobuscar);
        return resul.size();

    }

    public void mostrarDatos(ObjectSet result) {
        DefaultTableModel model = (DefaultTableModel) jtableregistro_adm.getModel();
        model.setRowCount(0); // Limpiar la tabla

        if (result.size() == 0) {
            JOptionPane.showMessageDialog(null, "El usuario no existe");
        } else {
            while (result.hasNext()) {
                clases.Administrador mi_adm = (clases.Administrador) result.next();

                Object[] fila = {
                    mi_adm.getCedula(),
                    mi_adm.getNombre(),
                    mi_adm.getApellido(),
                    String.valueOf(mi_adm.getF_nacimiento()),
                    mi_adm.getNum_telefono(),
                    mi_adm.getGenero(),
                    mi_adm.getProvincia(),
                    mi_adm.getCiudad(),
                    mi_adm.getCalle(),
                    mi_adm.getCorreo(),
                    mi_adm.getContraseña(),
                    mi_adm.getSueldo(),
                    mi_adm.getAños_experiencia(),
                    mi_adm.getTitulo_universitario(),};
                model.addRow(fila);
            }
        }
    }

    public static void Cerrar_BD(ObjectContainer basep) {

        basep.close();
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
            java.util.logging.Logger.getLogger(Admi_registroT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admi_registroT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admi_registroT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admi_registroT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admi_registroT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JTextField combo_cuidad;
    private javax.swing.JComboBox<String> combo_provincia;
    private com.toedter.calendar.JDateChooser fechaN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableregistro_adm;
    private javax.swing.JRadioButton radio_F;
    private javax.swing.JRadioButton radio_M;
    private javax.swing.JPanel tt;
    private javax.swing.JTextField txt_contra;
    private javax.swing.JTextField txt_experiencia;
    private javax.swing.JTextField txt_sueldo;
    private javax.swing.JTextField txt_titulo;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcalle;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcell;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
