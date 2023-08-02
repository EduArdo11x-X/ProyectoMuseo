/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import static Interfaces.Articulo_modificar.Cerrar_BD;
import static Interfaces.Pintura_modificar.Cerrar_BD;
import clases.Escultura;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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

            if (EAux.comproparescultura(BaseD, CODIGOAux) == 0) {

                JOptionPane.showMessageDialog(null, "La escultura no existe en la base de datos");
                limpiarDatos();

            } else {

                Escultura Ebuscar = new Escultura(null, 0, 0, CODIGOAux, null, null, null);

                ObjectSet result = BaseD.get(Ebuscar);
                for (int i = 0; i < result.size(); i++) {

                    Escultura miE = new Escultura();

                    miE = (Escultura) result.get(i);

                    txtcodigo.setText(miE.getCodigo());
                    txtnombre.setText(miE.getNombre());
                    txtarea.setText(miE.getDescripcion());
                    calendario.setDate(miE.getFecha_creacion());
                    txtpeso.setText(String.valueOf(miE.getPeso()));
                    txtaltura.setText(String.valueOf(miE.getAltura()));

                    for (int j = 0; j < CmbBxmaterial.getItemCount(); j++) {
                        if (miE.getMaterial().equalsIgnoreCase(CmbBxmaterial.getItemAt(j))) {
                            CmbBxmaterial.setSelectedIndex(j);
                            j = CmbBxmaterial.getItemCount();
                        }
                    }

                    if (validarCampos(BaseD)) {
                        bttnmodificar.setEnabled(true);
                    }
                    mostrarDatos(result);
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

    public void cargarDatos(ObjectContainer BaseD) {

        Escultura EscBuscar = new Escultura(null, 0, 0, codigo, null, null, null);

        ObjectSet result = BaseD.get(EscBuscar);
        mostrarDatos(result);
    }

    public void Modificar_Escultura(ObjectContainer BaseD) {

       // JOptionPane.showMessageDialog(null, "Existen campos vacios");
        //LimpiarCamposdeTexto();
        Escultura Emodi = new Escultura(null, 0, 0, null, null, null, null);
        ObjectSet result = BaseD.get(Emodi);
        Escultura Emodificar = (Escultura) result.next();
        Emodificar.setCodigo(txtcodigo.getText());
        Emodificar.setNombre(txtnombre.getText());
        Emodificar.setDescripcion(txtarea.getText());
        Emodificar.setFecha_creacion(calendario.getDate());
        Emodificar.setMaterial(CmbBxmaterial.getSelectedItem().toString());

        BaseD.set(Emodificar);
        JOptionPane.showMessageDialog(null, "Escultura modificada exitosamente");
        mostrarDatos(result);
        limpiarDatos();

    }

    public static void Cerrar_BD(ObjectContainer BaseD) {
        BaseD.close();
    }

    public void mostrarDatos(ObjectSet result) {
        DefaultTableModel model = (DefaultTableModel) tblmodescult.getModel();
        model.setRowCount(0); // Limpiar la tabla

        if (result.size() == 0) {
            JOptionPane.showMessageDialog(null, "La escultura no existe");
        } else {
            while (result.hasNext()) {
                clases.Escultura miEscultura = (clases.Escultura) result.next();
                Object[] fila = {
                    miEscultura.getCodigo(),
                    miEscultura.getNombre(),
                    miEscultura.getDescripcion(),
                    miEscultura.getFecha_creacion(),
                    miEscultura.getAltura(),
                    miEscultura.getPeso(),
                };
                model.addRow(fila);
            }
        }
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
        bttnbuscar = new javax.swing.JButton();
        bttncargar_datos = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bttnregresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 11, 13));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(200, 150));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CODIGO ARTE");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DESCRIPCION");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FECHA DE CREACION");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MATERIAL");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PESO");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ALTURA");

        txtcodigo.setBackground(new java.awt.Color(134, 153, 167));
        txtcodigo.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        txtnombre.setBackground(new java.awt.Color(134, 153, 167));
        txtnombre.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        txtarea.setBackground(new java.awt.Color(134, 153, 167));
        txtarea.setColumns(20);
        txtarea.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        txtpeso.setBackground(new java.awt.Color(134, 153, 167));
        txtpeso.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        txtpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesoActionPerformed(evt);
            }
        });

        txtaltura.setBackground(new java.awt.Color(134, 153, 167));
        txtaltura.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N

        CmbBxmaterial.setBackground(new java.awt.Color(134, 153, 167));
        CmbBxmaterial.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        CmbBxmaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIEDRA", "MADERA", "METAL", "CERAMICA", "VIDRIO", " " }));
        CmbBxmaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbBxmaterialActionPerformed(evt);
            }
        });

        tblmodescult.setBackground(new java.awt.Color(134, 153, 167));
        tblmodescult.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
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

        bttnmodificar.setBackground(new java.awt.Color(0, 0, 0));
        bttnmodificar.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        bttnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/editar (3).png"))); // NOI18N
        bttnmodificar.setText("MODIFICAR");
        bttnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnmodificarActionPerformed(evt);
            }
        });

        bttnbuscar.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        bttnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/lupa.png"))); // NOI18N
        bttnbuscar.setText("BUSCAR");
        bttnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnbuscarActionPerformed(evt);
            }
        });

        bttncargar_datos.setText("CARGAR DATOS");
        bttncargar_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttncargar_datosActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bttnbuscar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtpeso, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CmbBxmaterial, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calendario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(bttnmodificar)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(bttncargar_datos)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
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
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtaltura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(bttnmodificar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(bttncargar_datos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(134, 153, 167));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Minilogo.png"))); // NOI18N
        jLabel1.setText("MODIFICAR  ESCULTURA");

        bttnregresar.setBackground(new java.awt.Color(0, 0, 0));
        bttnregresar.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        bttnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/deshacer_1 2.png"))); // NOI18N
        bttnregresar.setText("REGRESAR");
        bttnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnregresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttnregresar)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnregresar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnregresarActionPerformed
        this.dispose();
        menuPrincipal ventana = new menuPrincipal();
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

        ObjectContainer BaseD = Db4o.openFile(Escultura_registro.direccionBD);
        Modificar_Escultura(BaseD);
        Cerrar_BD(BaseD);
        txtcodigo.setEditable(true);
    }//GEN-LAST:event_bttnmodificarActionPerformed

    private void bttnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnbuscarActionPerformed
        ObjectContainer BaseD = Db4o.openFile(menuPrincipal.direccionBD);
        buscar(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_bttnbuscarActionPerformed

    private void bttncargar_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttncargar_datosActionPerformed

        ObjectContainer BaseD = Db4o.openFile(menuPrincipal.direccionBD);
        cargarDatos(BaseD);
        Cerrar_BD(BaseD);

    }//GEN-LAST:event_bttncargar_datosActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbBxmaterial;
    private javax.swing.JButton bttnbuscar;
    private javax.swing.JButton bttncargar_datos;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblmodescult;
    private javax.swing.JTextField txtaltura;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpeso;
    // End of variables declaration//GEN-END:variables
}
