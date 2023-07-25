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

    String material = "";
    double peso = 0;
    double altura = 0;
    String codigo = "";
    String nombre = "";
    String descripcion = "";
    Date fecha_creacion;

     public static String direccionBD = ("C:\\Users\\LENOVO\\OneDrive\\Escritorio\\Avance del proyecto\\guia.yap");
    
    public Escultura_registro() {
        initComponents();
    }

    
    public void creaescultura(ObjectContainer BaseD) {
        asignarVariables(BaseD);
        if(comproparescultura(BaseD,codigo)==0){
              Escultura EscNuevo = new Escultura( material, peso, altura,  codigo,  nombre,  descripcion,  fecha_creacion);
              BaseD.set(EscNuevo);
             JOptionPane .showMessageDialog(null, "REGISTRADO CORRECTAMENTE");
        }else{
             JOptionPane .showMessageDialog(null, "ESCULTURA NO REGISTRADA");
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
    public void cargar_Datos(ObjectContainer BaseD){
         Escultura EscBuscar = new Escultura(null, 0, 0,null, null,null, null);
   
        ObjectSet result =BaseD.get(EscBuscar);
        mostrar_Datos(result);
        
    }
    public void mostrar_Datos(ObjectSet result){
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
            
             
             tbescultura.setModel(new javax.swing.table.DefaultTableModel(matrizEscultura, new String[]{"codigo","nombre","descrpcion","material","peso","fecha_creacion"}));        }
        
    }

    public void limpiarDatos() {

        CmbBxmaterial.setSelectedItem("");
        txtpeso.setText("");
       txtaltura.setText("");
        txtcodigo.setText("");
        txtnombre.setText("");
        txtarea.setText("");

    }

    public static int comproparescultura(ObjectContainer BaseD, String codigo) {

        Escultura EscBuscar = new Escultura(null, 0, 0,codigo, null,null, null);
   
        ObjectSet result =BaseD.get(EscBuscar);
        return result.size();
    }

    public void cerrarBD(ObjectContainer BaseD){
        BaseD.close();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        CmbBxmaterial = new javax.swing.JComboBox<>();
        txtpeso = new javax.swing.JTextField();
        txtaltura = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbescultura = new javax.swing.JTable();
        bttnguardar = new javax.swing.JButton();
        bttnmostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("REGISTRO DE ESCULTURA");

        jLabel2.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jLabel2.setText("CODIGO ARTE");

        jLabel3.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRE");

        jLabel4.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jLabel4.setText("DESCRIPCION");

        jLabel5.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jLabel5.setText("FECHA DE CREACION");

        jLabel6.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jLabel6.setText("MATERIAL");

        jLabel7.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jLabel7.setText("PESO");

        jLabel8.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jLabel8.setText("ALTURA");

        txtcodigo.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N

        txtnombre.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        txtarea.setColumns(20);
        txtarea.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        CmbBxmaterial.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        CmbBxmaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIEDRA", "MADERA", "METAL", "CERAMICA", "VIDRIO", " " }));

        txtpeso.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N

        txtaltura.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N

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

        bttnguardar.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        bttnguardar.setText("GUARDAR");
        bttnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnguardarActionPerformed(evt);
            }
        });

        bttnmostrar.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        bttnmostrar.setText("MOSTRAR DATOS");
        bttnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnmostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtpeso)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CmbBxmaterial, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(bttnguardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttnmostrar)
                .addGap(92, 92, 92))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CmbBxmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(305, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttnmostrar)
                            .addComponent(bttnguardar))
                        .addGap(206, 206, 206))))
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

    private void bttnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnmostrarActionPerformed
          ObjectContainer BaseD = Db4o.openFile(direccionBD);
        cargar_Datos(BaseD);
        cerrarBD(BaseD);
    }//GEN-LAST:event_bttnmostrarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void bttnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnguardarActionPerformed
        ObjectContainer BaseD = Db4o.openFile(direccionBD);
        creaescultura(BaseD);
        cerrarBD(BaseD);
    }//GEN-LAST:event_bttnguardarActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbBxmaterial;
    private javax.swing.JButton bttnguardar;
    private javax.swing.JButton bttnmostrar;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbescultura;
    private javax.swing.JTextField txtaltura;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpeso;
    // End of variables declaration//GEN-END:variables
}
