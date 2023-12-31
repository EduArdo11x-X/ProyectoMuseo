/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import static Interfaces.Exposicion_registro.cerrarBD;
import static Interfaces.MENU_ADM.direccionBD;
import clases.Articulo;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;


import clases.Articulo;
import clases.Usuario;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;

/**
 *
 * @author EDU
 */
public class Articulo_registro extends javax.swing.JFrame {

    /**
     * Creates new form Articulo_registro
     */
      public Articulo_registro() {
        initComponents();
    }

    String cod_articulo = "";
    String nombre = "";
    String descripcion = "";
    int existencia = 0;
    int exis_max = 0;
    int exis_min = 0;
    double precio = 0;

//    public static String direccionBD = ("C:\\Users\\ASUS TUF\\OneDrive\\Escritorio\\Baseprueva\\guia.yapi");

    public void cargarDatos(ObjectContainer BaseD) {

        Articulo Exbuscar = new Articulo(null, null, null, 0, 0, 0, 0);
        ObjectSet result = BaseD.get(Exbuscar);
        mostrarDatos(result);
    }

    public void mostrarDatos(ObjectSet result) {
        String matrizArticulo[][] = new String[result.size()][7];
        if (result.size() == 0) {
            JOptionPane.showMessageDialog(null, "El articulo no existe");
        }

        for (int i = 0; i < result.size(); i++) {
            Articulo miArticulo = new Articulo();
            miArticulo = (Articulo) result.get(i);
            matrizArticulo[i][0] = miArticulo.getCod_articulo();
            matrizArticulo[i][1] = miArticulo.getNombre();
            matrizArticulo[i][2] = miArticulo.getDescripcion();
            matrizArticulo[i][3] = String.valueOf(miArticulo.getExistencia());
            matrizArticulo[i][4] = String.valueOf(miArticulo.getExis_max());
            matrizArticulo[i][5] = String.valueOf(miArticulo.getExis_min());
            matrizArticulo[i][6] = String.valueOf(miArticulo.getPrecio());

            tablaArticulos.setModel(new javax.swing.table.DefaultTableModel(matrizArticulo, new String[]{"CODIGO", "NOMBRE", "DESCRIPCION", "EXITENCIA", "EXISTENCIA MAXIMA", "EXITENCIA MINIMA", "PRECIO"}));

        }

    }

    public void asignarVariables(ObjectContainer BaseD) {
        nombre = txtNombre.getText();
        descripcion = txtDescripcion.getText();
        existencia = Integer.parseInt(txtExitencia.getValue().toString());
        exis_max = Integer.parseInt(txtExis_Max.getValue().toString());
        exis_min = Integer.parseInt(txtExi_min.getValue().toString());
        precio = Double.parseDouble(txtPrecio.getText());

    }

    public void limpiarDatos() {
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtExitencia.setValue(0);
        txtExis_Max.setValue(0);
        txtExi_min.setValue(0);
        txtPrecio.setText("");
    }

    public static int comprobarArticulo(ObjectContainer BaseD, String cod_articulo) {
        Articulo Exbuscar = new Articulo(cod_articulo, null, null, 0, 0, 0, 0);
        ObjectSet result = BaseD.get(Exbuscar);
        return result.size();

    }

      //ALGORITMO PARA CREAR CODIGOS AUTOMATICOS
   public void geneCodi(ObjectSet result) {
        for (int i = 0; i < result.size(); i++) {
            Articulo miArticulo = new Articulo();
            miArticulo = (Articulo) result.get(i);
            cod_articulo = nombreCodigo(i);

        }

    }

    public String nombreCodigo(int c) {
        String cod_articulo = "";
        int cantidad = txtNombre.getText().length();

        if (cantidad >= 0) {

            cod_articulo += "ART-000" + c;
        } else {
            cod_articulo += "ART-000" + c;
        }

        return cod_articulo;
    }

    public void crearArticulo(ObjectContainer BaseD) {
        Articulo Artbuscar = new Articulo(null, null, null,0,0,0,0);
        ObjectSet result = BaseD.get(Artbuscar);
        geneCodi(result);
        asignarVariables(BaseD);
        if (comprobarArticulo(BaseD, cod_articulo) == 0) {
            Articulo Exnuevo = new Articulo(cod_articulo, nombre, descripcion, existencia, exis_max, exis_min, precio);
            BaseD.set(Exnuevo);
            JOptionPane.showMessageDialog(null, "Registrado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Artticulo ya registrado");

      }
         }

    public static void Cerrar_BD(ObjectContainer BaseD) {

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
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        botonGuar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaArticulos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        txtExi_min = new javax.swing.JSpinner();
        txtExitencia = new javax.swing.JSpinner();
        txtExis_Max = new javax.swing.JSpinner();
        botonMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 11, 13));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        txtNombre.setBackground(new java.awt.Color(134, 153, 167));
        txtNombre.setFont(new java.awt.Font("Courier New", 1, 13)); // NOI18N
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripcion:");

        txtDescripcion.setBackground(new java.awt.Color(134, 153, 167));
        txtDescripcion.setFont(new java.awt.Font("Courier New", 1, 13)); // NOI18N
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Existencia:");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Existencia Maxima:");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Existencia Minima:");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio:");

        txtPrecio.setBackground(new java.awt.Color(134, 153, 167));
        txtPrecio.setFont(new java.awt.Font("Courier New", 1, 13)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 11, 13));
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        botonGuar.setBackground(new java.awt.Color(0, 11, 13));
        botonGuar.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        botonGuar.setForeground(new java.awt.Color(255, 255, 255));
        botonGuar.setText("Guardar");
        botonGuar.setBorder(null);
        botonGuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuarActionPerformed(evt);
            }
        });

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

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(134, 153, 167));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 11, 13));
        jLabel1.setText("REGISTRO ARTICULOS ");

        botonRegresar.setBackground(new java.awt.Color(0, 11, 13));
        botonRegresar.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        botonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresar.setText("Regresar");
        botonRegresar.setBorder(null);
        botonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 563, Short.MAX_VALUE)
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

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtExi_min.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), new java.awt.Color(51, 255, 255), new java.awt.Color(153, 0, 0), new java.awt.Color(102, 0, 102)));

        txtExitencia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), new java.awt.Color(51, 255, 255), new java.awt.Color(153, 0, 0), new java.awt.Color(102, 0, 102)));

        txtExis_Max.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), new java.awt.Color(51, 255, 255), new java.awt.Color(153, 0, 0), new java.awt.Color(102, 0, 102)));

        botonMostrar.setBackground(new java.awt.Color(0, 11, 13));
        botonMostrar.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        botonMostrar.setForeground(new java.awt.Color(255, 255, 255));
        botonMostrar.setText("Cargar Datos");
        botonMostrar.setBorder(null);
        botonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(txtExitencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(txtExi_min, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(txtExis_Max, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(540, 540, 540)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(550, 550, 550)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1010, 1010, 1010)
                .addComponent(botonMostrar))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(botonGuar))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel5)
                        .addGap(127, 127, 127)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(txtExitencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(txtExi_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(txtExis_Max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(botonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(475, 475, 475)
                        .addComponent(botonGuar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        
    }//GEN-LAST:event_txtNombreMouseClicked

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void botonGuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuarActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MENU_ADM.direccionBD);
        crearArticulo(BaseD);
        Cerrar_BD(BaseD);
        
    }//GEN-LAST:event_botonGuarActionPerformed

    private void botonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarActionPerformed
        // TODO add your handling code here:
        ObjectContainer BaseD = Db4o.openFile(MENU_ADM.direccionBD);
        cargarDatos(BaseD);
        cerrarBD(BaseD);
    }//GEN-LAST:event_botonMostrarActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
   this.dispose();
        MENU_ADM ventaina = new  MENU_ADM();
        ventaina.setVisible(true);     // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        int aux = evt.getKeyChar();
        boolean espacio = aux == 32;
        boolean Letras = aux >= 65 && aux <= 90 || aux >= 97 && aux <= 122 || espacio;

        if (!Letras) {
            System.out.println("esta digitando " + evt.getKeyChar());
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        int aux = evt.getKeyChar();
        boolean espacio = aux == 32;
        boolean Letras = aux >= 65 && aux <= 90 || aux >= 97 && aux <= 122 || espacio;

        if (!Letras) {
            System.out.println("esta digitando " + evt.getKeyChar());
            evt.consume();
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
int aux = evt.getKeyChar();
        boolean decimal = aux >= 48 && aux <= 57|| aux >= 46 && aux <= 54||aux == 44;
        if (!decimal) {
            System.out.println("esta digitando " + evt.getKeyChar());
        evt.consume();           
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuar;
    private javax.swing.JButton botonMostrar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable tablaArticulos;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JSpinner txtExi_min;
    private javax.swing.JSpinner txtExis_Max;
    private javax.swing.JSpinner txtExitencia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
