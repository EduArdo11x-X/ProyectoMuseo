/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import clases.Escultura;
import java.util.Date;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Escultura_Modificar1 extends javax.swing.JFrame {

    /**
     * Creates new form Escultura_Modificar1
     */
    public Escultura_Modificar1() {
        initComponents();
    }

    String material = "";
    double peso = 0;
    double altura = 0;
    String codigo = "";
    String nombre = "";
    String descripcion = "";
    Date fecha_creacion;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bttnregresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtpeso = new javax.swing.JTextField();
        txtaltura = new javax.swing.JTextField();
        calendario = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        cmbmaterial = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbescultura = new javax.swing.JTable();
        bttnmostrardatos = new javax.swing.JButton();
        bttonguardar = new javax.swing.JButton();
        bttnbuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 245, 202));

        jPanel2.setBackground(new java.awt.Color(248, 166, 54));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Minilogo.png"))); // NOI18N
        jLabel1.setText(" MODIFICAR ESCULTURAS");

        bttnregresar.setBackground(new java.awt.Color(255, 255, 255));
        bttnregresar.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        bttnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/deshacer_1.png"))); // NOI18N
        bttnregresar.setText("Regresar");
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
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttnregresar)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnregresar))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel4.setText("Descripcion");

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel5.setText("fecha de creacion");

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel6.setText("Peso");

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel7.setText("Altura");

        txtdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripcionActionPerformed(evt);
            }
        });
        txtdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdescripcionKeyTyped(evt);
            }
        });

        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        txtaltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalturaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel8.setText("Material");

        cmbmaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIEDRA", "MADERA", "METAL", "CERAMICA", "VIDRIO", " " }));

        tbescultura.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbescultura);

        bttnmostrardatos.setBackground(new java.awt.Color(255, 255, 255));
        bttnmostrardatos.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        bttnmostrardatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/actualizar-pagina.png"))); // NOI18N
        bttnmostrardatos.setText("Mostrar Datos");
        bttnmostrardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnmostrardatosActionPerformed(evt);
            }
        });

        bttonguardar.setBackground(new java.awt.Color(255, 255, 255));
        bttonguardar.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        bttonguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/salvar (1).png"))); // NOI18N
        bttonguardar.setText("Guardar");
        bttonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonguardarActionPerformed(evt);
            }
        });

        bttnbuscar.setBackground(new java.awt.Color(255, 255, 255));
        bttnbuscar.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        bttnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/lupa.png"))); // NOI18N
        bttnbuscar.setText("Buscar");
        bttnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(bttonguardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttnmostrardatos)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtaltura, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(txtpeso)
                            .addComponent(txtnombre)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtdescripcion))
                        .addGap(31, 31, 31)
                        .addComponent(bttnbuscar)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(bttnbuscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttonguardar)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bttnmostrardatos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void bttnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnregresarActionPerformed
        this.dispose();
        MENU_ADM ventaina = new MENU_ADM();
        ventaina.setVisible(true);
    }//GEN-LAST:event_bttnregresarActionPerformed

    private void txtalturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalturaActionPerformed

    private void bttonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttonguardarActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MENU_ADM.direccionBD);
        modificarEscultura(BaseD);
        cerrarBD(BaseD);

    }//GEN-LAST:event_bttonguardarActionPerformed

    private void bttnmostrardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnmostrardatosActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MENU_ADM.direccionBD);
        cargarTabla(BaseD);
        cerrarBD(BaseD);
    }//GEN-LAST:event_bttnmostrardatosActionPerformed

    private void bttnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnbuscarActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MENU_ADM.direccionBD);
        cargarDatos(BaseD);
        cerrarBD(BaseD);
    }//GEN-LAST:event_bttnbuscarActionPerformed

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
//        int aux = evt.getKeyChar();
//        boolean Letras = aux >= 65 && aux <= 90 || aux >= 48 && aux <= 57 || aux == 45;
//
//        if (!Letras) {
//            System.out.println("esta digitando " + evt.getKeyChar());
//            evt.consume();
//        }
    }//GEN-LAST:event_txtcodigoKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        int aux = evt.getKeyChar();
        boolean espacio = aux == 32;
        boolean Letras = aux >= 65 && aux <= 90 || aux >= 97 && aux <= 122 || espacio;

        if (!Letras) {
            System.out.println("esta digitando " + evt.getKeyChar());
            evt.consume();
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtdescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescripcionKeyTyped
        int aux = evt.getKeyChar();
        boolean espacio = aux == 32;
        boolean Letras = aux >= 65 && aux <= 90 || aux >= 97 && aux <= 122 || espacio;

        if (!Letras) {
            System.out.println("esta digitando " + evt.getKeyChar());
            evt.consume();
        }
    }//GEN-LAST:event_txtdescripcionKeyTyped

    private void txtdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescripcionActionPerformed

    public void cargarDatos(ObjectContainer BaseD) {
        bttonguardar.setEnabled(false);
        String CodigoEs;
        CodigoEs = txtcodigo.getText();
        if (txtcodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un codigo");
        } else {
            if (comprobarEscultura(BaseD, CodigoEs) == 0) {
                JOptionPane.showMessageDialog(null, "La Escultura no existe en la base de datos");

            } else {
                Escultura EscBuscar = new Escultura(null, 0, 0, codigo, null, null, null);
                ObjectSet result = BaseD.get(EscBuscar);
                for (int i = 0; i < result.size(); i++) {
                    Escultura Miescult = new Escultura();
                    Miescult = (Escultura) result.get(i);
                    
                    txtnombre.setText(Miescult.getNombre());
                    txtdescripcion.setText(Miescult.getDescripcion());
                    calendario.setDate(Miescult.getFecha_creacion());
                    cmbmaterial.setSelectedItem(Miescult.getMaterial().toString());
                    txtpeso.setText(String.valueOf(Miescult.getPeso())); // Convertir el valor numérico a cadena
                    txtaltura.setText(String.valueOf(Miescult.getAltura())); 
                   


//                    if(ValidarCampos(Base D)){
                    bttonguardar.setEnabled(true);
//                    
//                }
                    txtcodigo.setEnabled(false);

                }
            }
        }

    }

    public void modificarEscultura(ObjectContainer BaseD) {
        asignarVariables(BaseD);

        Escultura Esmodi = new Escultura(null, 0, 0, codigo, null, null, null);
        ObjectSet result = BaseD.get(Esmodi);
        Escultura Escmodificar = (Escultura) result.next();
        if (camposVacios() == true) {

            if (Escultura_Regist.comproparescultura(BaseD, codigo) != 0) {
                Escmodificar.setNombre(nombre);
                Escmodificar.setCodigo(codigo);
                Escmodificar.setDescripcion(descripcion);
                Escmodificar.setMaterial(material);
                Escmodificar.setAltura(altura);
                Escmodificar.setPeso(peso);
                Escmodificar.setFecha_creacion(fecha_creacion);
                Escmodificar.setFecha_creacion(calendario.getDate());
                Escmodificar.setMaterial(cmbmaterial.getSelectedItem().toString());

                BaseD.set(Escmodificar);
                JOptionPane.showMessageDialog(null, "La escultura fue modificado exitosamente");
                limpiarDatos();
                txtcodigo.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe una escultura registrada en el sistema");
            }
        }

    }

    public static int comprobarEscultura(ObjectContainer BaseD, String codigo) {
        Escultura Escbuscar = new Escultura(null, 0, 0, codigo, null, null, null);
        ObjectSet result = BaseD.get(Escbuscar);
        return result.size();

    }

    public static void cerrarBD(ObjectContainer BaseD) {
        BaseD.close();
    }

    public void asignarVariables(ObjectContainer BaseD) {
        material = cmbmaterial.getSelectedItem().toString();
        peso = Double.parseDouble(txtpeso.getText());
        altura = Double.parseDouble(txtaltura.getText());
        codigo = txtcodigo.getText();
        nombre = txtnombre.getText();
        descripcion = txtdescripcion.getText();
        fecha_creacion = calendario.getDate();
    }

    public void limpiarDatos() {
        cmbmaterial.setSelectedItem("");
        txtpeso.setText("");
        txtaltura.setText("");
        txtcodigo.setText("");
        txtnombre.setText("");
        txtdescripcion.setText(codigo);
        txtdescripcion.setText("");
    }

    //LO SIGUIENTE PARA CARGAR LOS DATOS REGISTRADOS EN LA TABLA
    public void cargarTabla(ObjectContainer BaseD) {

        Escultura Escbuscar = new Escultura(null, 0, 0, codigo, null, null, null);
        ObjectSet result = BaseD.get(Escbuscar);
        mostrarDatos(result);
    }

    public void mostrarDatos(ObjectSet result) {
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

    public boolean camposVacios() {

        boolean validado = false;
        boolean c, n, a;

        if (txtdescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese una descripcion");
            c = false;
        } else {
            c = true;
        }

        if (txtnombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre");
            n = false;
        } else {
            n = true;
        }

        if (txtcodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un Id de exposicion");
            a = false;
        } else {
            a = true;
        }
        if (txtpeso.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un peso de la escultura");
            n = false;
        } else {
            n = true;
        }

        if (txtaltura.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese la altura de la escultura");
            a = false;
        } else {
            a = true;
        }

        if (c == true && n == true && a == true) {
            validado = true;
        }

        return validado;

//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(Escultura_Modificar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Escultura_Modificar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Escultura_Modificar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Escultura_Modificar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Escultura_Modificar1().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnbuscar;
    private javax.swing.JButton bttnmostrardatos;
    private javax.swing.JButton bttnregresar;
    private javax.swing.JButton bttonguardar;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JComboBox<String> cmbmaterial;
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
    private javax.swing.JTable tbescultura;
    private javax.swing.JTextField txtaltura;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpeso;
    // End of variables declaration//GEN-END:variables
}
