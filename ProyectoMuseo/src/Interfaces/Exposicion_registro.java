package Interfaces;

import clases.Exposicion;
import clases.ImageTableCellRenderer;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Exposicion_registro extends javax.swing.JFrame {

    String cod_exposicion = "";
    String nombre_exposicion = " ";
    String descripcion_exposicion = "";
    Date fecha_inicio;
    Date fecha_fin;
    byte[] foto;
    int longitudBytes;

    public Exposicion_registro() {
        initComponents();
        ;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        guardarbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        exposiciontbl = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripciontxt = new javax.swing.JTextArea();
        mostrarTabla = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        fotolbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.textHighlight);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel3.setText("Descripcion:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        nombretxt.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        nombretxt.setToolTipText("");
        nombretxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombretxtFocusLost(evt);
            }
        });
        nombretxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombretxtKeyTyped(evt);
            }
        });
        jPanel1.add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 174, -1));

        guardarbtn.setBackground(new java.awt.Color(204, 204, 0));
        guardarbtn.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        guardarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/actualizado 2.png"))); // NOI18N
        guardarbtn.setText("Guardar");
        guardarbtn.setBorder(null);
        guardarbtn.setContentAreaFilled(false);
        guardarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        guardarbtn.setOpaque(true);
        guardarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarbtnActionPerformed(evt);
            }
        });
        jPanel1.add(guardarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 140, 40));

        exposiciontbl.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        exposiciontbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(exposiciontbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 81, 590, 360));

        descripciontxt.setColumns(20);
        descripciontxt.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        descripciontxt.setRows(5);
        descripciontxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descripciontxtKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(descripciontxt);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        mostrarTabla.setBackground(new java.awt.Color(204, 204, 0));
        mostrarTabla.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        mostrarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/actualizar-pagina.png"))); // NOI18N
        mostrarTabla.setText("Mostrar Datos");
        mostrarTabla.setAutoscrolls(true);
        mostrarTabla.setBorder(null);
        mostrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarTablaActionPerformed(evt);
            }
        });
        jPanel1.add(mostrarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 200, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));

        jLabel7.setBackground(new java.awt.Color(255, 51, 51));
        jLabel7.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 11, 13));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Minilogo.png"))); // NOI18N
        jLabel7.setText(" Registrar Exposicion ");

        botonRegresar.setBackground(java.awt.SystemColor.textHighlight);
        botonRegresar.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        botonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/deshacer_1.png"))); // NOI18N
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
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 60));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 60, 1530, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 60, 11, 410));

        fotolbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotolbl.setText("FOTO");
        fotolbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fotolbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fotolblMouseClicked(evt);
            }
        });
        jPanel1.add(fotolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 210, 130));

        jButton1.setText("VER GALERIA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarbtnActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MENU_ADM.direccionBD);
        crearExposicion(BaseD);
        cerrarBD(BaseD);
    }//GEN-LAST:event_guardarbtnActionPerformed

    private void mostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarTablaActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MENU_ADM.direccionBD);
        cargarTabla(BaseD);
        cerrarBD(BaseD);
    }//GEN-LAST:event_mostrarTablaActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        this.setVisible(false);
        MENU_ADM miMenu = new MENU_ADM();
        miMenu.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarActionPerformed
//VALIDACIONES
    private void descripciontxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripciontxtKeyTyped
        int aux = evt.getKeyChar();
        boolean espacio = aux == 32;
        boolean Letras = aux >= 65 && aux <= 90 || aux >= 97 && aux <= 122 || espacio;

        if (!Letras) {
            System.out.println("esta digitando " + evt.getKeyChar());
            evt.consume();
        }
    }//GEN-LAST:event_descripciontxtKeyTyped

    private void nombretxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombretxtKeyTyped
        int aux = evt.getKeyChar();
        boolean espacio = aux == 32;
        boolean Letras = aux >= 65 && aux <= 90 || aux >= 97 && aux <= 122 || espacio;

        if (!Letras) {
            System.out.println("esta digitando " + evt.getKeyChar());
            evt.consume();
        }
    }//GEN-LAST:event_nombretxtKeyTyped

    private void nombretxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombretxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxtFocusLost

    private void fotolblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotolblMouseClicked
         JFileChooser se = new JFileChooser();
    se.setFileSelectionMode(JFileChooser.FILES_ONLY);
    int estado = se.showOpenDialog(null);
    if (estado == JFileChooser.APPROVE_OPTION) {
        try {
            File archivo = se.getSelectedFile();
            this.longitudBytes = (int) archivo.length();

            // Leer la imagen seleccionada como bytes
            byte[] buffer = new byte[this.longitudBytes];
            try (FileInputStream fis = new FileInputStream(archivo)) {
                fis.read(buffer);
            }

            // Mostrar la imagen en el JLabel
            Image icono = ImageIO.read(archivo).getScaledInstance(fotolbl.getWidth(), fotolbl.getHeight(), Image.SCALE_DEFAULT);
            fotolbl.setIcon(new ImageIcon(icono));
            fotolbl.updateUI();

            // Asignar los bytes de la imagen a la variable "foto"
            foto = buffer;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    }//GEN-LAST:event_fotolblMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
ObjectContainer BaseD = Db4o.openFile(MENU_ADM.direccionBD);
        cargargaleria(BaseD);
        cerrarBD(BaseD);

    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    public void cargargaleria(ObjectContainer BaseD) {

        Exposicion Exbuscar = new Exposicion(null, null, null, null);
        ObjectSet result = BaseD.get(Exbuscar);
        galeriamostrar(result);
    }

    public void galeriamostrar(ObjectSet result) {
    // Tu código existente para llenar la tabla

    // Crear una lista para almacenar todas las exposiciones
    List<Exposicion> exposiciones = new ArrayList<>();

    for (int i = 0; i < result.size(); i++) {
        Exposicion miExposicion = (Exposicion) result.get(i);
        exposiciones.add(miExposicion);
    }

    // Mostrar la nueva ventana con todas las imágenes
    GaleriaExposiciones ventanaImagenes = new GaleriaExposiciones(exposiciones);
    ventanaImagenes.setVisible(true);
}

    private byte[] obtenerBytesImagen() {
    JFileChooser se = new JFileChooser();
    se.setFileSelectionMode(JFileChooser.FILES_ONLY);
    int estado = se.showOpenDialog(null);
    if (estado == JFileChooser.APPROVE_OPTION) {
        try {
            File archivo = se.getSelectedFile();
            this.longitudBytes = (int) archivo.length();

            // Leer la imagen seleccionada como bytes
            byte[] buffer = new byte[this.longitudBytes];
            try (FileInputStream fis = new FileInputStream(archivo)) {
                fis.read(buffer);
            }

            // Mostrar la imagen en un JLabel (opcional, solo para visualización)
            Image icono = ImageIO.read(archivo).getScaledInstance(fotolbl.getWidth(), fotolbl.getHeight(), Image.SCALE_DEFAULT);
            fotolbl.setIcon(new ImageIcon(icono));
            fotolbl.updateUI();

            return buffer;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    return null;
}

// Método que invoca obtenerBytesImagen() y asigna el arreglo de bytes a la variable "foto"
public void seleccionarImagen() {
    foto = obtenerBytesImagen();
}

    

    public void cargarTabla(ObjectContainer BaseD) {

        Exposicion Exbuscar = new Exposicion(null, null, null, null);
        ObjectSet result = BaseD.get(Exbuscar);
        mostrarDatos(result);
    }

    
public void mostrarDatos(ObjectSet result) {
    Object[][] matrizExposicion = new Object[result.size()][4];
    if (result.size() == 0) {
        JOptionPane.showMessageDialog(null, "La exposicion no existe");
    } else {
        for (int i = 0; i < result.size(); i++) {
            Exposicion miExposicion = (Exposicion) result.get(i);
            matrizExposicion[i][0] = miExposicion.getCod_exposicion();
            matrizExposicion[i][1] = miExposicion.getNombre_exposicion();
            matrizExposicion[i][2] = miExposicion.getDescripcion_exposicion();

            // Convertir el arreglo de bytes (foto) a un ImageIcon
            byte[] fotoBytes = miExposicion.getFoto();
            if (fotoBytes != null) {
                ImageIcon icono = new ImageIcon(fotoBytes);
                matrizExposicion[i][3] = icono;
            } else {
                matrizExposicion[i][3] = null;
            }
        }

        // Configurar el modelo de la tabla con los datos y títulos de columna
        exposiciontbl.setModel(new javax.swing.table.DefaultTableModel(
            matrizExposicion,
            new String[]{"Codigo", "Nombre", "Descripcion", "Foto"}
        ));

        // Asignar el renderer personalizado a la columna de la foto (columna 3)
        exposiciontbl.getColumnModel().getColumn(3).setCellRenderer(new ImageTableCellRenderer());
    }
}


    public void asignarVariables(ObjectContainer BaseD) {
seleccionarImagen();
        nombre_exposicion = nombretxt.getText();
        descripcion_exposicion = descripciontxt.getText();
    }

    public void limpiarDatos() {
        nombretxt.setText("");
        descripciontxt.setText("");

    }

    public static int comprobarExposicion(ObjectContainer BaseD, String codigo) {

        Exposicion Exbuscar = new Exposicion(codigo, null, null, null);
        ObjectSet result = BaseD.get(Exbuscar);
        return result.size();

    }

    //ALGORITMO PARA CREAR CODIGOS AUTOMATICOS
    public void geneCodi(ObjectSet result) {
        for (int i = 0; i < result.size(); i++) {
            Exposicion miExposicion = new Exposicion();
            miExposicion = (Exposicion) result.get(i);
            cod_exposicion = nombreCodigo(i);

        }

    }

    public String nombreCodigo(int c) {
        String cod_exposicion = "";
        int cantidad = nombretxt.getText().length();

        if (cantidad > 0) {

            cod_exposicion += "EXPOSICION-000" + c;
        } else {
            cod_exposicion += "EXPOSICION-000" + c;
        }

        return cod_exposicion;
    }

    public void crearExposicion(ObjectContainer BaseD) {
        Exposicion Exbuscar = new Exposicion(null, null, null, null);
        ObjectSet result = BaseD.get(Exbuscar);
        geneCodi(result);
        asignarVariables(BaseD);

        if (camposVacios() == true) {
            habilitarBoton();
            if (comprobarExposicion(BaseD, cod_exposicion) == 0) {
                Exposicion Exnuevo = new Exposicion(cod_exposicion, nombre_exposicion, descripcion_exposicion, foto);
                BaseD.set(Exnuevo);
                JOptionPane.showMessageDialog(null, "Registrado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Exposicion ya registrado");

            }
        }
    }

    public void habilitarBoton() {
        guardarbtn.setEnabled(true);
    }

    public boolean camposVacios() {

        boolean validado = false;
        boolean c, n;

        if (descripciontxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese una descripcion");
            c = false;
        } else {
            c = true;
        }

        if (nombretxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre");
            n = false;
        } else {
            n = true;
        }
        if (c == true && n == true) {
            validado = true;
        }

        return validado;

    }

    public static void cerrarBD(ObjectContainer BaseD) {
        BaseD.close();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JTextArea descripciontxt;
    private javax.swing.JTable exposiciontbl;
    private javax.swing.JLabel fotolbl;
    private javax.swing.JButton guardarbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton mostrarTabla;
    private javax.swing.JTextField nombretxt;
    // End of variables declaration//GEN-END:variables
}
