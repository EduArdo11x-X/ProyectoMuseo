/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


import static Interfaces.Escultura_registro.direccionBD;
import clases.Escultura;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EDU
 */
public class Escultura_buscar_eliminar extends javax.swing.JFrame {

   
    public Escultura_buscar_eliminar() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbregistro = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cmbopciones = new javax.swing.JComboBox<>();
        bttnbuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        bttnregresar = new javax.swing.JButton();
        bttneliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbregistro.setFont(new java.awt.Font("Raanana", 2, 14)); // NOI18N
        tbregistro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbregistro);

        jLabel2.setFont(new java.awt.Font("Raanana", 2, 14)); // NOI18N
        jLabel2.setText("filtro");

        cmbopciones.setFont(new java.awt.Font("Raanana", 2, 14)); // NOI18N
        cmbopciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Ver todos", "Codigo escultura", "Nombre", "Fecha de creacion", "peso", "altura", " ", " ", " " }));
        cmbopciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbopcionesActionPerformed(evt);
            }
        });

        bttnbuscar.setFont(new java.awt.Font("Raanana", 2, 14)); // NOI18N
        bttnbuscar.setText("BUSCAR");
        bttnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnbuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Raanana", 2, 14)); // NOI18N
        jLabel3.setText("codigo");

        txtcodigo.setFont(new java.awt.Font("Raanana", 2, 14)); // NOI18N
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        bttnregresar.setFont(new java.awt.Font("Raanana", 2, 14)); // NOI18N
        bttnregresar.setText("REGRESAR");
        bttnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnregresarActionPerformed(evt);
            }
        });

        bttneliminar.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        bttneliminar.setText("ELIMINAR");
        bttneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttneliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Raanana", 2, 14)); // NOI18N
        jLabel1.setText("MODIFICAR Y ELIMINAR ESCULTURA");

        jLabel4.setFont(new java.awt.Font("Raanana", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("SELECCIONES UN CAMPO PARA BUSCAR ESCULTURA");

        jLabel5.setFont(new java.awt.Font("Raanana", 2, 14)); // NOI18N
        jLabel5.setText("ID DE ESCULTURA A ELIMINAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bttnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addGap(25, 25, 25)
                        .addComponent(cmbopciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(bttnbuscar)
                        .addGap(232, 232, 232)
                        .addComponent(jLabel3)
                        .addGap(46, 46, 46)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(bttneliminar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnregresar))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbopciones, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttnbuscar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bttneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(131, 131, 131)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnregresarActionPerformed
      
           this.dispose();
        Escultura_registro ventana = new  Escultura_registro();
        ventana.setVisible(true);
    }//GEN-LAST:event_bttnregresarActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void cmbopcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbopcionesActionPerformed

         if (cmbopciones.getSelectedIndex() == 0) {
            //deshabilitarParametros();
        } else {
            if (cmbopciones.getSelectedIndex() == 1) {
                // deshabilitarParametros();
            } else {
                if (cmbopciones.getSelectedIndex() == 2) {
                    // deshabilitarParametros();
                } else {
                    if (cmbopciones.getSelectedIndex() == 3) {
                        // habilitarParametros();
                    }
                }
            }
        }
            
    }//GEN-LAST:event_cmbopcionesActionPerformed

    private void bttneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttneliminarActionPerformed
        
         ObjectContainer BaseD = Db4o.openFile(direccionBD);
        Eliminar_Escultura(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_bttneliminarActionPerformed

    private void bttnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnbuscarActionPerformed
        ObjectContainer BaseD = Db4o.openFile(direccionBD);
        Buscar_esculturaID(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_bttnbuscarActionPerformed

     public void Buscar_esculturaID(ObjectContainer basep) {

        if (cmbopciones.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selección invalida");

        } else {
            if (cmbopciones.getSelectedIndex() == 1) {

                Escultura Ebuscar = new Escultura(null, 0, 0,null, null,null, null);

                ObjectSet result = basep.get(Ebuscar);
                MostrarDatos(result);
            } else {
                if (cmbopciones.getSelectedIndex() == 2) {

                    String IDAux = JOptionPane.showInputDialog("Ingrese el ID a consultar");

                    Escultura Ebuscar = new Escultura(IDAux, 0, 0,null, null,null, null);

                    ObjectSet result = basep.get(Ebuscar);
                    MostrarDatos(result);

                } else {
                    if (cmbopciones.getSelectedIndex() == 3) {
                        
                        String IDAux = JOptionPane.showInputDialog("Ingrese el ID a consultar");

                    Escultura Ebuscar = new Escultura( IDAux, 0, 0,null, null,null, null);

                    ObjectSet result = basep.get(Ebuscar);
                    MostrarDatos(result);
                      

                    }
                }
            }

        }
        //Borrar la eleccion y ponerla al inicio
        cmbopciones.setSelectedIndex(0);
    }

    public void MostrarDatos(ObjectSet result) {
        String matrizEscultura [][]= new String[result.size()][7];
        if(result.size()==0){
            JOptionPane.showMessageDialog(null, "ESCULTURA NO EXISTE");
        }
        for(int i = 0;i < result.size();i++){
            Escultura miescultura = new Escultura();
            miescultura = (Escultura) result.get(i);
            matrizEscultura[i][0] = miescultura.getCodigo();
             matrizEscultura[i][1] = miescultura.getNombre();
             matrizEscultura[i][2] = miescultura.getDescripcion();
             matrizEscultura[i][3] = miescultura.getMaterial();
             matrizEscultura[i][4] = String.valueOf(miescultura.getPeso());
             matrizEscultura[i][5] = String.valueOf(miescultura.getAltura());
             matrizEscultura[i][6] = String.valueOf(miescultura.getFecha_creacion());
            
             
             tbregistro.setModel(new javax.swing.table.DefaultTableModel(matrizEscultura, new String[]{"codigo","nombre","descrpcion","material","peso","fecha_creacion"}));        }
        
    }
    
    public void Eliminar_Escultura(ObjectContainer basep) {

        Escultura_registro Einterfaz = new Escultura_registro();

        if (txtcodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Codigo no valido");
        } else {

            String IDE = txtcodigo.getText();
            Escultura Eeliminar = new Escultura(IDE, 0, 0,null, null,null, null);
            ObjectSet result = basep.get(Eeliminar);

            if (Einterfaz.comproparescultura(basep, IDE) == 0) {

                JOptionPane.showMessageDialog(null, "El codigo no existe en la base de datos");

            } else {
                Escultura Esculturaoeliminar = (Escultura) result.next();

                basep.delete(Esculturaoeliminar);
                JOptionPane.showMessageDialog(null, "El codigo fue eliminado de la base de datos exitosamente");
            }

        }

        //Borrar el campo de texto
        txtcodigo.setText("");
    }
      public static int comproparescultura(ObjectContainer BaseD, String codigo) {

        Escultura EscBuscar = new Escultura(null, 0, 0,codigo, null,null, null);
   
        ObjectSet result =BaseD.get(EscBuscar);
        return result.size();
    }

    public void Cerrar_BD(ObjectContainer basep) {

        basep.close();

      }
    
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnbuscar;
    private javax.swing.JButton bttneliminar;
    private javax.swing.JButton bttnregresar;
    private javax.swing.JComboBox<String> cmbopciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbregistro;
    private javax.swing.JTextField txtcodigo;
    // End of variables declaration//GEN-END:variables
}
