/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import clases.Evento;
import clases.Exposicion;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author EDU
 */
public class Evento_registro extends javax.swing.JFrame {

    /**
     * Creates new form Evento_registro
     */
    public Evento_registro() {
        initComponents();
    }

    
     String id_evento = "";
     String nombre_evento = "";
     String descripcion = "";
     Date fecha_inicio;
     Date fecha_final;
     String id_exposicion = "";

          public static String direccionBD = ("\\Users\\EDU\\Documents\\GitHub\\ProyectoMuseo\\ProyectoMuseo\\guia");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombretxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fechai = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fechaf = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        codigotxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaevento = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        idextxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripciontxt = new javax.swing.JTextArea();
        btnguardar = new javax.swing.JButton();
        btncargar = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombretxt.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jLabel1.setText("Codigo Evento:");

        jLabel2.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jLabel2.setText("Nombre del evento:");

        jLabel3.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jLabel3.setText("Descripcion del evento:");

        jLabel4.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jLabel4.setText("Fecha inicio:");

        jLabel5.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jLabel5.setText("Fecha final:");

        codigotxt.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N

        tablaevento.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        tablaevento.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaevento);

        jLabel6.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jLabel6.setText("Id exposicion:");

        idextxt.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N

        descripciontxt.setColumns(20);
        descripciontxt.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        descripciontxt.setRows(5);
        jScrollPane2.setViewportView(descripciontxt);

        btnguardar.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/salvar (1) 2.png"))); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btncargar.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        btncargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/actualizar-pagina.png"))); // NOI18N
        btncargar.setText("MOSTRAR DATOS");
        btncargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargarActionPerformed(evt);
            }
        });

        btnvolver.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        btnvolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/deshacer_1.png"))); // NOI18N
        btnvolver.setText("VOLVER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idextxt, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnguardar)
                        .addGap(29, 29, 29)
                        .addComponent(btncargar)
                        .addGap(45, 45, 45)
                        .addComponent(btnvolver))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fechaf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fechai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(idextxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3)
                        .addGap(83, 83, 83)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(fechai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnguardar)
                            .addComponent(btncargar)
                            .addComponent(btnvolver))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(fechaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
ObjectContainer BaseD = Db4o.openFile(direccionBD);

        crearEvento(BaseD);
        cerrarBD(BaseD);




    }//GEN-LAST:event_btnguardarActionPerformed

    private void btncargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargarActionPerformed
ObjectContainer BaseD = Db4o.openFile(direccionBD);

        cargarTabla(BaseD);
        cerrarBD(BaseD);

        // TODO add your handling code here:
    }//GEN-LAST:event_btncargarActionPerformed

   public void asignarVariables(ObjectContainer BaseD) {
          id_evento = codigotxt.getText();
      nombre_evento = nombretxt.getText();
      
      descripcion = descripciontxt.getText();
      
      fecha_inicio = fechai.getDate();
      
      fecha_final = fechaf.getDate();
      
      id_exposicion = idextxt.getText();
    }

    public void limpiarDatos() {
        codigotxt.setText("");
        nombretxt.setText("");
        descripciontxt.setText("");
idextxt.setText("");
    }

    public static int comprobarEvento(ObjectContainer BaseD, String codigo) {
        Evento Evbuscar = new Evento(codigo, null, null, null, null, null);
        ObjectSet result = BaseD.get(Evbuscar);
        return result.size();

    }

    public void crearEvento(ObjectContainer BaseD) {
asignarVariables(BaseD);
if(comprobarEvento(BaseD , id_evento) == 0){
    if(Exposicion_registro.comprobarExposicion(BaseD, id_exposicion) == 0){
    Evento Evnuevo = new Evento( id_evento,  nombre_evento,  descripcion , fecha_inicio, fecha_final, id_exposicion ); 
   BaseD.set(Evnuevo);
   JOptionPane.showMessageDialog(null, "Registrado correctamente");
    }else{
        JOptionPane.showMessageDialog(null, "Exposicion no existe");
    }
}else{
       JOptionPane.showMessageDialog(null, "Evento ya existe");

}
    }
    
      public void cargarTabla(ObjectContainer BaseD){
        
        Evento Evbuscar = new Evento(null, null, null, null, null, null);
        ObjectSet result = BaseD.get(Evbuscar);
        mostrarDatos(result);
    }
    public void mostrarDatos(ObjectSet result) {
        String matrizEvento[][] = new String[result.size()][6];
        if(result.size() == 0){
            JOptionPane.showMessageDialog(null, "La exposicion no existe");
        }
        
        for (int i = 0; i < result.size(); i++) {
            Evento miEvento = new Evento();
            miEvento = (Evento) result.get(i);
            matrizEvento[i][0] = miEvento.getId_evento();
            matrizEvento[i][1] = miEvento.getId_evento();
            matrizEvento[i][2] = miEvento.getNombre_evento();
            matrizEvento[i][3] = miEvento.getDescripcion();
            matrizEvento[i][4] = String.valueOf(miEvento.getFecha_inicio());
            matrizEvento[i][5] = String.valueOf(miEvento.getFecha_final());

            tablaevento.setModel(new javax.swing.table.DefaultTableModel(matrizEvento, new String[]{"Codigo","Id Exposicion", "Nombre", "Descripcion","Fehca inicio", "Fecha Final"}));

        }

    }

    public static void cerrarBD(ObjectContainer BaseD) {
BaseD.close();
    }

   
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncargar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnvolver;
    private javax.swing.JTextField codigotxt;
    private javax.swing.JTextArea descripciontxt;
    private com.toedter.calendar.JDateChooser fechaf;
    private com.toedter.calendar.JDateChooser fechai;
    private javax.swing.JTextField idextxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JTable tablaevento;
    // End of variables declaration//GEN-END:variables
}
