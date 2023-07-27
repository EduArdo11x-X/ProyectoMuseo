/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import static Interfaces.Exposicion_registro.cerrarBD;

import clases.Exposicion;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;

/**
 *
 * @author EDU
 */
public class Exposicion_buscar_eliminar extends javax.swing.JFrame {

    public Exposicion_buscar_eliminar() {
        initComponents();
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        codigotxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        exposiciontbl = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        Buscarbtn = new javax.swing.JButton();
        filtrocmb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        codigotxt1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        eliminarbtn = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 11, 13));

        codigotxt.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N

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

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        Buscarbtn.setBackground(new java.awt.Color(0, 11, 13));
        Buscarbtn.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        Buscarbtn.setForeground(new java.awt.Color(255, 255, 255));
        Buscarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/lupa.png"))); // NOI18N
        Buscarbtn.setText("Buscar");
        Buscarbtn.setBorder(null);
        Buscarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarbtnActionPerformed(evt);
            }
        });

        filtrocmb.setBackground(new java.awt.Color(134, 153, 167));
        filtrocmb.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        filtrocmb.setForeground(new java.awt.Color(0, 0, 0));
        filtrocmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "Ver todos", "Codigo", "Nombre", " " }));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Courier New", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filtro:");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Courier New", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione un campo para buscar el Evento:");

        jPanel2.setBackground(new java.awt.Color(134, 153, 167));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 11, 13));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Minilogo.png"))); // NOI18N
        jLabel7.setText(" BUSCAR Y ELIMINAR EVENTOS ");

        botonRegresar.setBackground(new java.awt.Color(0, 11, 13));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
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
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Courier New", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese el codigo del Evento a eliminar:");

        codigotxt1.setBackground(new java.awt.Color(134, 153, 167));
        codigotxt1.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        codigotxt1.setForeground(new java.awt.Color(0, 0, 0));
        codigotxt1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        codigotxt1.setText("Ingrese el codigo del ");
        codigotxt1.setToolTipText("");
        codigotxt1.setBorder(null);
        codigotxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigotxt1ActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Courier New", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Codigo:");
        jLabel5.setToolTipText("ID asignatura");

        eliminarbtn.setBackground(new java.awt.Color(0, 11, 13));
        eliminarbtn.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        eliminarbtn.setForeground(new java.awt.Color(255, 255, 255));
        eliminarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/eliminar.png"))); // NOI18N
        eliminarbtn.setText("Eliminar");
        eliminarbtn.setBorder(null);
        eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarbtnActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(filtrocmb, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Buscarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(501, 501, 501)
                .addComponent(codigotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(830, 830, 830)
                .addComponent(eliminarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(codigotxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(jLabel5))
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(filtrocmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(Buscarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(codigotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(eliminarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(codigotxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void BuscarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarbtnActionPerformed

        ObjectContainer BaseD = Db4o.openFile(menuPrincipal.direccionBD);
        filtro(BaseD);
        cerrarBD(BaseD);
    }//GEN-LAST:event_BuscarbtnActionPerformed

    private void codigotxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigotxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigotxt1ActionPerformed

    private void eliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarbtnActionPerformed
        ObjectContainer BaseD = Db4o.openFile(menuPrincipal.direccionBD);
        eliminarExposicion(BaseD);
        cerrarBD(BaseD);        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarbtnActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
this.setVisible(false);
menuPrincipal miMenu= new menuPrincipal();
miMenu.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarActionPerformed

    public void filtro(ObjectContainer BaseD) {
        if (filtrocmb.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selección invalida");
        } else {
            if (filtrocmb.getSelectedIndex() == 1) {
                Exposicion Exbuscar = new Exposicion(null, null, null );
                ObjectSet result = BaseD.get(Exbuscar);
                mostrarDatos(result);

            } else {
                if (filtrocmb.getSelectedIndex() == 2) {
                    String codigoEx = JOptionPane.showInputDialog("Ingrese el Codigo a consultar");
                    Exposicion Exbuscar = new Exposicion(codigoEx, null, null );
                    ObjectSet result = BaseD.get(Exbuscar);
                    mostrarDatos(result);

                } else {
                    if (filtrocmb.getSelectedIndex() == 3) {
                        String nombreEx = JOptionPane.showInputDialog("Ingrese el nombre a consultar");
                        Exposicion Exbuscar = new Exposicion(null, nombreEx, null );
                        ObjectSet result = BaseD.get(Exbuscar);
                        mostrarDatos(result);
                    }

                }

            }

        }
    }

    public void mostrarDatos(ObjectSet result) {
        String matrizExposicion[][] = new String[result.size()][5];
        if (result.size() == 0) {
            JOptionPane.showMessageDialog(null, "La exposicion no existe");
        }

        for (int i = 0; i < result.size(); i++) {
            Exposicion miExposicion = new Exposicion();
            miExposicion = (Exposicion) result.get(i);
            matrizExposicion[i][0] = miExposicion.getCod_exposicion();
            matrizExposicion[i][1] = miExposicion.getNombre_exposicion();
            matrizExposicion[i][2] = miExposicion.getDescripcion_exposicion();

            exposiciontbl.setModel(new javax.swing.table.DefaultTableModel(matrizExposicion, new String[]{"Codigo", "Nombre", "Descripcion"}));

        }

    }

    public void eliminarExposicion(ObjectContainer BaseD) {

        if (codigotxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un Codigo");
        } else {
            String codigo = codigotxt.getText();
            Exposicion ExEliminar = new Exposicion(codigo, null, null );
            ObjectSet result = BaseD.get(ExEliminar);

            if (comprobarExposicion(BaseD, codigo) == 0) {
                JOptionPane.showMessageDialog(null, "La exposicion no existe en la base de datos");

            } else {
                Exposicion EliminarEx = (Exposicion) result.next();
                BaseD.delete(EliminarEx);
                JOptionPane.showMessageDialog(null, "La exposicion fue eliminada exitosamente");
            }

        }

        //Borrar el campo de texto
        codigotxt.setText("");

    }

    public static int comprobarExposicion(ObjectContainer BaseD, String codigo) {
        Exposicion Exbuscar = new Exposicion(codigo, null, null);
        ObjectSet result = BaseD.get(Exbuscar);
        return result.size();

    }

    public static void cerrarBD(ObjectContainer BaseD) {
        BaseD.close();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscarbtn;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel codigotxt;
    private javax.swing.JTextField codigotxt1;
    private javax.swing.JButton eliminarbtn;
    private javax.swing.JTable exposiciontbl;
    private javax.swing.JComboBox<String> filtrocmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
