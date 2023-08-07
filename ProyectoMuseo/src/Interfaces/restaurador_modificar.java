/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import clases.Persona;
import clases.Restaurador;
import com.db4o.*;
import com.db4o.query.Query;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class restaurador_modificar extends javax.swing.JFrame {

    /**
     * Creates new form restaurador_modificar
     */
    public restaurador_modificar() {
        initComponents();
        botones.add(jRadioButton1);
        botones.add(jRadioButton2);
    }

    String Cedula_per_res = "";
    String id_restaurador = "";
    String nombre_adm = "";
    String apellido_adm = "";
    String email_adm = "";
    char sexo_adm = ' ';
    Date fechaTexto_adm;
    String telefono_adm = "";
    String provincia_adm = "";
    String ciudad_adm = "";
    String calle_adm = "";
    String Habilidades = "";

    public void LimpiarCampos() {

        Ced_Taquillero.setText("");
        nom_taquillero.setText("");
        ape_tequillero.setText("");
        cel_taquillero.setText("");
        Correo_taquillero.setText("");
        combo_cuidad.setText("");
        combo_provincia.setSelectedItem(0);
        txtcalle.setText("");

    }

    public void buscar(ObjectContainer basep) {//cargardatos

        Modificarjb.setEnabled(false);
        String IDAux;
        IDAux = txtid_guardia.getText();

        restaurador_ingresar EAux = new restaurador_ingresar();

        if (txtid_guardia.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Ingrese un ID");
        } else {

            if (!EAux.comprobarID(basep, IDAux)) {

                JOptionPane.showMessageDialog(null, "El Restaurador no existe en la base de datos");
                LimpiarCampos();

            } else {

                Restaurador Ebuscar = new Restaurador(null, null, null, null, null, null, null, '\u0000', null, null, null, null, null);

                ObjectSet result = basep.get(Ebuscar);
                for (int i = 0; i < result.size(); i++) {

                    Restaurador miE = new Restaurador();

                    miE = (Restaurador) result.get(i);

                    Ced_Taquillero.setText(miE.getCedula());
                    nom_taquillero.setText(miE.getNombre());
                    ape_tequillero.setText(miE.getApellido());
                    cel_taquillero.setText(miE.getNum_telefono());
                    fechaNa.setDate((miE.getF_nacimiento()));
                    if (miE.getGenero() == 'M') {
                        jRadioButton1.setSelected(true);
                    } else if (miE.getGenero() == 'F') {
                        jRadioButton2.setSelected(true);
                    }
                    Correo_taquillero.setText(miE.getCorreo());
                    combo_provincia.setSelectedItem(miE.getProvincia());
                    combo_cuidad.setText(miE.getCiudad());
                    txtid_guardia.setText(miE.getId_restaurador());
                    txtcalle.setText(miE.getCalle());
                    habilidades_restaurador.setText(miE.getHabilidades());

                    Modificarjb.setEnabled(true);
                    //Hacer editable los campos de texto

                    HabilitarCampos_deTexto();
                    txtid_guardia.setEditable(false);
                    Ced_Taquillero.setEditable(false);

                }

            }

        }
    }

    public void HabilitarCampos_deTexto() {
        nom_taquillero.setEditable(true);
        ape_tequillero.setEditable(true);
        cel_taquillero.setEditable(true);
        Correo_taquillero.setEditable(true);
    }

    public void asignarVariables(ObjectContainer BaseD) {
        Cedula_per_res = Ced_Taquillero.getText();
        nombre_adm = nom_taquillero.getText();
        apellido_adm = ape_tequillero.getText();

        if (jRadioButton1.isSelected()) {
            sexo_adm = 'M';
        } else if (jRadioButton2.isSelected()) {
            sexo_adm = 'F';
        } else {
            sexo_adm = ' '; // Otra opción aquí dependiendo de tu lógica
        }

        telefono_adm = cel_taquillero.getText();
        fechaTexto_adm = fechaNa.getDate();
        email_adm = Correo_taquillero.getText();
        id_restaurador = txtid_guardia.getText();
        Habilidades = habilidades_restaurador.getText();
        provincia_adm = combo_provincia.getSelectedItem().toString();
        ciudad_adm = combo_cuidad.getText();
        calle_adm = txtcalle.getText();
    }

    public void Modificar_artista(ObjectContainer basep) {

        asignarVariables(basep);
        if (validarCampos(basep)) {
            Restaurador Emodi = new Restaurador(txtid_guardia.getText(), null, null, null, null, null, null, '\u0000', null, null, null, null, null);
            ObjectSet result = basep.get(Emodi);
            Restaurador Emodificar = (Restaurador) result.next();
            if (validarCampos(basep)) {
                Emodificar.setNombre(nom_taquillero.getText());
                Emodificar.setApellido(ape_tequillero.getText());
                Emodificar.setNum_telefono(cel_taquillero.getText());
                Emodificar.setF_nacimiento(fechaNa.getDate());
                Emodificar.setCorreo(Correo_taquillero.getText());
                Emodificar.setProvincia((String) combo_provincia.getSelectedItem());
                Emodificar.setCiudad(combo_cuidad.getText());
                Emodificar.setCalle(txtcalle.getText());
                Emodificar.setHabilidades(habilidades_restaurador.getText());

                if (jRadioButton1.isSelected()) {
                    Emodificar.setGenero('M');
                } else if (jRadioButton2.isSelected()) {
                    Emodificar.setGenero('F');
                }
                //Emodificar.setGenero((String) Genero_combobox.getSelectedItem());

                ;
                basep.set(Emodificar);
                JOptionPane.showMessageDialog(null, "El Artista fue modificado exitosamente");

                LimpiarCampos();
            }
        }
    }

    public boolean validarCampos(ObjectContainer basep) {
        Validaciones miValidaciones = new Validaciones();
        asignarVariables(basep);
        boolean ban_confirmar = true;

        if (Ced_Taquillero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "INGRESE SU CEDULA POR FAVOR");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarCedulaEcuatoriana(Cedula_per_res)) {
                JOptionPane.showMessageDialog(this, "CEDULA INVALIDA");
                ban_confirmar = false;
            }
        }

        if (txtid_guardia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarid(id_restaurador)) {
                JOptionPane.showMessageDialog(this, "ID invalido");
                ban_confirmar = false;
            }
        }

        if (nom_taquillero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese su nombre por favor");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarNomApe(nombre_adm)) {
                JOptionPane.showMessageDialog(this, "Nombre invalido");
                ban_confirmar = false;
            }
        }
        if (ape_tequillero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese su apellido por favor");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarNomApe(apellido_adm)) {
                JOptionPane.showMessageDialog(this, "Apellido invalido");
                ban_confirmar = false;
            }
        }

        if (Correo_taquillero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese su correo por favor");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarCorreo(email_adm)) {
                JOptionPane.showMessageDialog(this, "Correo invalido");
                ban_confirmar = false;
            }
        }

        if (txtcalle.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese su direccion por favor");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validardireccion(calle_adm)) {
                JOptionPane.showMessageDialog(this, "Direccion invalido");
                ban_confirmar = false;
            }
        }

        if (cel_taquillero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "INGRESE SU TELEFONO POR FAVOR");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarCedula(telefono_adm)) {
                JOptionPane.showMessageDialog(this, "TELEFONO INVALIDO");
                ban_confirmar = false;
            }
        }

        if (combo_cuidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese su ciudad por favor");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarNomApe(ciudad_adm)) {
                JOptionPane.showMessageDialog(this, "Ciudad Invalida");
                ban_confirmar = false;
            }
        }

        if (habilidades_restaurador.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese sus habilidad por favor");
            ban_confirmar = false;
        } else {
            if (!miValidaciones.validarNomApe(Habilidades)) {
                JOptionPane.showMessageDialog(this, "Habilidad Invalida");
                ban_confirmar = false;
            }
        }

        return ban_confirmar;
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

        botones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Ced_Taquillero = new javax.swing.JTextField();
        nom_taquillero = new javax.swing.JTextField();
        ape_tequillero = new javax.swing.JTextField();
        cel_taquillero = new javax.swing.JTextField();
        Correo_taquillero = new javax.swing.JTextField();
        fechaNa = new com.toedter.calendar.JDateChooser();
        txtid_guardia = new javax.swing.JTextField();
        habilidades_restaurador = new javax.swing.JTextField();
        Regresar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        combo_provincia = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        combo_cuidad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtcalle = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        Modificarjb = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setForeground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Restaurador");

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cedula:");

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre;");

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellidos:");

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Genero:");

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Celular:");

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Fecha Nacimiento:");

        jLabel9.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Correo:");

        jLabel12.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("ID Restaurador:");

        jLabel13.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Habilidades");

        Regresar.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/1286923.png"))); // NOI18N
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Provincia:");

        combo_provincia.setBackground(new java.awt.Color(255, 255, 255));
        combo_provincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "Azuay", "Bolívar", "Cañar", "Carchi", "Chimborazo", "Cotopaxi", "El Oro", "Esmeraldas", "Galápagos", "Guayas", "Imbabura", "Loja", "Los Ríos", "Manabí", "Morona-Santiago", "Napo", "Orellana", "Pastaza", "Pichincha", "Santa Elena", "Santo Domingo de los Tsáchilas", "Sucumbíos", "Tungurahua", "Zamora-Chinchipe" }));

        jLabel11.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Ciudad:");

        combo_cuidad.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Direccion:");

        txtcalle.setBackground(new java.awt.Color(255, 255, 255));
        txtcalle.setForeground(new java.awt.Color(0, 0, 0));
        txtcalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcalleActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Hombre");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Mujer");

        Modificarjb.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        Modificarjb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/disco-flexible_1.png"))); // NOI18N
        Modificarjb.setText("Guardar");
        Modificarjb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarjbActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/buscar.png"))); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(Modificarjb, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Regresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))
                                        .addGap(87, 87, 87)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fechaNa, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ape_tequillero, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nom_taquillero, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Ced_Taquillero, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Correo_taquillero, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combo_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combo_cuidad, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtcalle, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(cel_taquillero, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(48, 48, 48)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(habilidades_restaurador, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtid_guardia, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtid_guardia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(habilidades_restaurador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(102, 102, 102))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Ced_Taquillero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nom_taquillero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ape_tequillero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(fechaNa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cel_taquillero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(Correo_taquillero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(combo_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(combo_cuidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtcalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modificarjb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        this.dispose();
        MENU_ADM mostrar = new MENU_ADM();
        mostrar.setVisible(true);
    }//GEN-LAST:event_RegresarActionPerformed

    private void txtcalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcalleActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void ModificarjbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarjbActionPerformed
        ObjectContainer BaseD = Db4o.openFile(PaginaPrincipal.direccionBD);
        Modificar_artista(BaseD);
        Cerrar_BD(BaseD);
        txtid_guardia.setEditable(true);
    }//GEN-LAST:event_ModificarjbActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ObjectContainer BaseD = Db4o.openFile(PaginaPrincipal.direccionBD);
        buscar(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(restaurador_modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(restaurador_modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(restaurador_modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(restaurador_modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new restaurador_modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ced_Taquillero;
    private javax.swing.JTextField Correo_taquillero;
    private javax.swing.JButton Modificarjb;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField ape_tequillero;
    private javax.swing.ButtonGroup botones;
    private javax.swing.JTextField cel_taquillero;
    private javax.swing.JTextField combo_cuidad;
    private javax.swing.JComboBox<String> combo_provincia;
    private com.toedter.calendar.JDateChooser fechaNa;
    private javax.swing.JTextField habilidades_restaurador;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField nom_taquillero;
    private javax.swing.JTextField txtcalle;
    private javax.swing.JTextField txtid_guardia;
    // End of variables declaration//GEN-END:variables
}
