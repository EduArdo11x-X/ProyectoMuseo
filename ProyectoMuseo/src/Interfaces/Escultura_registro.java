/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

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
public class Escultura_registro extends javax.swing.JFrame {

    public Escultura_registro() {
        initComponents();
    }
    String material = "";
    double peso = 0;
    double altura = 0;
    String codigo = "";
    String nombre = "";
    String descripcion = "";
    Date fecha_creacion;
    public static String direccionBD = ("C:\\Users\\LENOVO\\OneDrive\\Escritorio\\Avance del proyecto\\guia.yap");

    public void creaescultura(ObjectContainer BaseD) {
        asignarVariables(BaseD);
        if (comproparescultura(BaseD, codigo) == 0) {
            Escultura EscNuevo = new Escultura(material, peso, altura, codigo, nombre, descripcion, fecha_creacion);
            BaseD.set(EscNuevo);
            JOptionPane.showMessageDialog(null, "REGISTRADO CORRECTAMENTE");

        } else {
            JOptionPane.showMessageDialog(null, "ESCULTURA NO REGISTRADA");
        }

    }

    public void asignarVariables(ObjectContainer BaseD) {

        material = CmbBxmaterial.getSelectedItem().toString();
        peso = Double.parseDouble(txtpeso.getText());
        altura = Double.parseDouble(txtaltura.getText());
        codigo = txtcodigo.getText();
        nombre = txtnombre.getText();
        descripcion = txtdescripcion.getText();
        fecha_creacion = calendario.getDate();

    }

    public void cargar_Datos(ObjectContainer BaseD) {
        Escultura EscBuscar = new Escultura(null, 0, 0, null, null, null, null);

        ObjectSet result = BaseD.get(EscBuscar);
        mostrar_Datos(result);

    }

    public void mostrar_Datos(ObjectSet result) {
        String matrizEscultura[][] = new String[result.size()][7];
        if (result.size() == 0) {
            JOptionPane.showMessageDialog(null, "ESCULTURA NO EXISTE");
        }
        for (int i = 0; i < result.size(); i++) {
            Escultura miescultura = new Escultura();
            miescultura = (Escultura) result.get(i);
            matrizEscultura[i][0] = miescultura.getCodigo();
            matrizEscultura[i][1] = miescultura.getNombre();
            matrizEscultura[i][2] = miescultura.getDescripcion();
            matrizEscultura[i][3] = miescultura.getMaterial();
            matrizEscultura[i][4] = String.valueOf(miescultura.getPeso());
            matrizEscultura[i][5] = String.valueOf(miescultura.getAltura());
            matrizEscultura[i][6] = String.valueOf(miescultura.getFecha_creacion());

            tbescultura.setModel(new javax.swing.table.DefaultTableModel(matrizEscultura, new String[]{"codigo", "nombre", "descrpcion", "material", "peso", "fecha_creacion"}));
        }

    }

    public void limpiarDatos() {

        CmbBxmaterial.setSelectedItem("");
        txtpeso.setText("");
        txtaltura.setText("");
        txtcodigo.setText("");
        txtnombre.setText("");
        txtdescripcion.setText("");

    }

    public static int comproparescultura(ObjectContainer BaseD, String codigo) {

        Escultura EscBuscar = new Escultura(null, 0, 0, codigo, null, null, null);

        ObjectSet result = BaseD.get(EscBuscar);
        return result.size();
    }

    public void cerrarBD(ObjectContainer BaseD) {
        BaseD.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
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
        calendario = new com.toedter.calendar.JDateChooser();
        CmbBxmaterial = new javax.swing.JComboBox<>();
        txtpeso = new javax.swing.JTextField();
        txtaltura = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbescultura = new javax.swing.JTable();
        bttnguardar = new javax.swing.JButton();
        bttnmostrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        txtdescripcion = new javax.swing.JTextField();

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setMaximumSize(new java.awt.Dimension(32766, 32767));
        jPanel1.setPreferredSize(new java.awt.Dimension(1199, 635));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CODIGO ARTE");
        jLabel2.setToolTipText("");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE");
        jLabel3.setToolTipText("");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DESCRIPCION");
        jLabel4.setToolTipText("");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FECHA DE CREACION");
        jLabel5.setToolTipText("");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MATERIAL");
        jLabel6.setToolTipText("");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PESO");
        jLabel7.setToolTipText("");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ALTURA");
        jLabel8.setToolTipText("");

        txtcodigo.setBackground(new java.awt.Color(134, 153, 167));
        txtcodigo.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N

        txtnombre.setBackground(new java.awt.Color(134, 153, 167));
        txtnombre.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        CmbBxmaterial.setBackground(new java.awt.Color(134, 153, 167));
        CmbBxmaterial.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        CmbBxmaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIEDRA", "MADERA", "METAL", "CERAMICA", "VIDRIO", " " }));

        txtpeso.setBackground(new java.awt.Color(134, 153, 167));
        txtpeso.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N

        txtaltura.setBackground(new java.awt.Color(134, 153, 167));
        txtaltura.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N

        tbescultura.setBackground(new java.awt.Color(134, 153, 167));
        tbescultura.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        tbescultura.setModel(new javax.swing.table.DefaultTableModel(
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
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbescultura);

        bttnguardar.setBackground(new java.awt.Color(0, 0, 0));
        bttnguardar.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        bttnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/salvar (1) 2.png"))); // NOI18N
        bttnguardar.setText("GUARDAR");
        bttnguardar.setToolTipText("");
        bttnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnguardarActionPerformed(evt);
            }
        });

        bttnmostrar.setBackground(new java.awt.Color(0, 0, 0));
        bttnmostrar.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        bttnmostrar.setText("MOSTRAR DATOS");
        bttnmostrar.setToolTipText("");
        bttnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnmostrarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(134, 153, 167));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 11, 13));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Minilogo.png"))); // NOI18N
        jLabel1.setText("REGISTRO DE ESCULTURA");
        jLabel1.setToolTipText("");

        jButton1.setFont(new java.awt.Font("Raanana", 1, 16)); // NOI18N
        jButton1.setText("Volver");
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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        txtdescripcion.setBackground(new java.awt.Color(134, 153, 167));
        txtdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)))
                                    .addComponent(jLabel7))
                                .addGap(85, 85, 85)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                    .addComponent(CmbBxmaterial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtpeso)
                                    .addComponent(txtaltura)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtdescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                            .addComponent(txtcodigo)
                                            .addComponent(txtnombre)))))
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(bttnguardar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttnmostrar)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CmbBxmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bttnmostrar))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bttnguardar)))
                        .addContainerGap(26, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnmostrarActionPerformed
        ObjectContainer BaseD = Db4o.openFile(direccionBD);
        cargar_Datos(BaseD);
        cerrarBD(BaseD);
    }//GEN-LAST:event_bttnmostrarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void bttnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnguardarActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MENU_ADM.direccionBD);
        creaescultura(BaseD);
        cerrarBD(BaseD);
    }//GEN-LAST:event_bttnguardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        MENU_ADM miMenu = new MENU_ADM();
        miMenu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescripcionActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbBxmaterial;
    private javax.swing.JButton bttnguardar;
    private javax.swing.JButton bttnmostrar;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tbescultura;
    private javax.swing.JTextField txtaltura;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpeso;
    // End of variables declaration//GEN-END:variables
}
