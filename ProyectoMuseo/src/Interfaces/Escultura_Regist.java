/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import clases.Escultura;
import clases.Evento;
import clases.Exposicion;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Escultura_Regist extends javax.swing.JFrame {

    /**
     * Creates new form Escultura_Regist
     */
    public Escultura_Regist() {
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
        botonRegresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        txtpeso = new javax.swing.JTextField();
        calendario = new com.toedter.calendar.JDateChooser();
        txtaltura = new javax.swing.JTextField();
        cmbmaterial = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblescultura = new javax.swing.JTable();
        mostrarTabla = new javax.swing.JButton();
        guardarbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        botonRegresar.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Registrar Exposicion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243)
                .addComponent(botonRegresar)
                .addContainerGap(296, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRegresar))
                .addGap(37, 37, 37))
        );

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel1.setText("codigo escultura");

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel3.setText("Descripcion");

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel4.setText("Fecha de creacion");

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel5.setText("Material");

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel6.setText("Peso");

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel7.setText("Altura");

        txtcodigo.setFont(new java.awt.Font("Raanana", 1, 14)); // NOI18N
        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

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

        txtpeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpesoKeyTyped(evt);
            }
        });

        txtaltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtalturaKeyTyped(evt);
            }
        });

        cmbmaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tblescultura.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblescultura);

        mostrarTabla.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        mostrarTabla.setText("Mostrar Datos");
        mostrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarTablaActionPerformed(evt);
            }
        });

        guardarbtn.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        guardarbtn.setText("GUARDAR");
        guardarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(100, 100, 100)
                        .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrarTabla)
                .addGap(343, 343, 343))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(guardarbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mostrarTabla))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(guardarbtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarTablaActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MENU_ADM.direccionBD);
        cargarTabla(BaseD);
        cerrarBD(BaseD);
    }//GEN-LAST:event_mostrarTablaActionPerformed

    private void guardarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarbtnActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MENU_ADM.direccionBD);
        crearEscultura(BaseD);
        cerrarBD(BaseD);
    }//GEN-LAST:event_guardarbtnActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        this.setVisible(false);
        MENU_ADM miMenu = new MENU_ADM();
        miMenu.setVisible(true);
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
       
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripcionActionPerformed
        
    }//GEN-LAST:event_txtdescripcionActionPerformed

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

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
        int aux = evt.getKeyChar();
        boolean espacio = aux == 32;
        boolean Letras = aux >= 65 && aux <= 90 || aux >= 97 && aux <= 122 || espacio;

        if (!Letras) {
            System.out.println("esta digitando " + evt.getKeyChar());
            evt.consume();
        }  
    }//GEN-LAST:event_txtcodigoKeyTyped

    private void txtpesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesoKeyTyped
        int aux = evt.getKeyChar();
        boolean espacio = aux == 32;
        boolean Letras = aux >= 65 && aux <= 90 || aux >= 97 && aux <= 122 || espacio;

        if (!Letras) {
            System.out.println("esta digitando " + evt.getKeyChar());
            evt.consume();
        }  
    }//GEN-LAST:event_txtpesoKeyTyped

    private void txtalturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtalturaKeyTyped
        int aux = evt.getKeyChar();
        boolean espacio = aux == 32;
        boolean Letras = aux >= 65 && aux <= 90 || aux >= 97 && aux <= 122 || espacio;

        if (!Letras) {
            System.out.println("esta digitando " + evt.getKeyChar());
            evt.consume();
        }  
    }//GEN-LAST:event_txtalturaKeyTyped

    public void asignarVariables(ObjectContainer BaseD) {
        material = cmbmaterial.getSelectedItem().toString();
        peso = Double.parseDouble(txtpeso.getText());
        altura = Double.parseDouble(txtaltura.getText());
        codigo = txtcodigo.getText();
        nombre = txtnombre.getText();
        descripcion = txtdescripcion.getText();
        fecha_creacion = calendario.getDate();
    }
//LIMPIAR LO0S CAMPOS DE TEXTO

    public void limpiarDatos() {
        cmbmaterial.setSelectedItem("");
        txtpeso.setText("");
        txtaltura.setText("");
        txtcodigo.setText("");
        txtnombre.setText("");
        txtdescripcion.setText(codigo);
        txtdescripcion.setText("");
    }

    public static int comproparescultura(ObjectContainer BaseD, String codigo) {
        Escultura EscBuscar = new Escultura(null, 0, 0, codigo, null, null, null);
        ObjectSet result = BaseD.get(EscBuscar);
        return result.size();
    }

   

    //ALGORITMO PARA CREAR CODIGOS AUTOMATICOS
    public void geneCodi(ObjectSet result) {
        for (int i = 0; i < result.size(); i++) {
            Escultura miEscultura = new Escultura();
            miEscultura = (Escultura) result.get(i);
            codigo = nombreCodigo(i);

        }

    }

    public String nombreCodigo(int c) {
        String id_evento = "";
        int cantidad = txtnombre.getText().length();

        if (cantidad > 0) {

            id_evento += "ESCUL-000" + c;
        } else {
            id_evento += "ESCUL-000" + c;
        }

        return id_evento;
    }

//METODO PARA CREAR EL EVENTO
    public void crearEscultura(ObjectContainer BaseD) {
        Escultura Esbuscar = new Escultura(codigo, 0, 0, null, null, null, null);;
        ObjectSet result = BaseD.get(Esbuscar);
        geneCodi(result);
        asignarVariables(BaseD);
        if (camposVacios() == true) {
            if (comproparescultura(BaseD, codigo) == 0) {
                if (Escultura_Regist.comproparescultura(BaseD, codigo) != 0) {
                    Escultura Esnuevo = new Escultura(material,  peso, altura,codigo, nombre, descripcion,  fecha_creacion);
                    BaseD.set(Esnuevo);
                    JOptionPane.showMessageDialog(null, "Registrado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Escultura no existe");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Escultura ya existe");

            }
        }
    }

    //CARGAR LA TABLA CON LOS DATOS QUE YA EXISTEN EN EL SISTEMA
    public void cargarTabla(ObjectContainer BaseD) {

        Evento Evbuscar = new Evento(null, null, null, null, null, null);
        ObjectSet result = BaseD.get(Evbuscar);
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

            tblescultura.setModel(new javax.swing.table.DefaultTableModel(matrizEscultura, new String[]{"codigo", "nombre", "descrpcion", "material", "peso", "fecha_creacion"}));
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
            JOptionPane.showMessageDialog(null, "Ingrese un codigo de la escultura");
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

    }

    public static void cerrarBD(ObjectContainer BaseD) {
        BaseD.close();
    }

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
//            java.util.logging.Logger.getLogger(Escultura_Regist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Escultura_Regist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Escultura_Regist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Escultura_Regist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Escultura_Regist().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JComboBox<String> cmbmaterial;
    private javax.swing.JButton guardarbtn;
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
    private javax.swing.JButton mostrarTabla;
    private javax.swing.JTable tblescultura;
    private javax.swing.JTextField txtaltura;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpeso;
    // End of variables declaration//GEN-END:variables
}
