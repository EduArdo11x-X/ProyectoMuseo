/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import static Interfaces.Exposicion_registro.cerrarBD;
import static Interfaces.Exposicion_registro.direccionBD;
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
public class Evento_modificar extends javax.swing.JFrame {

    /**
     * Creates new form Evento_modificar
     */
    public Evento_modificar() {
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
        btnmostrar = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();
        btncargar = new javax.swing.JButton();

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

        btnmostrar.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        btnmostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/actualizar-pagina.png"))); // NOI18N
        btnmostrar.setText("MOSTRAR DATOS");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        btnvolver.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        btnvolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/deshacer_1.png"))); // NOI18N
        btnvolver.setText("VOLVER");

        btncargar.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        btncargar.setText("CARGAR DATOS");

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
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombretxt, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(codigotxt))
                        .addGap(18, 18, 18)
                        .addComponent(btncargar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(fechaf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fechai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idextxt)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnguardar)
                        .addGap(29, 29, 29)
                        .addComponent(btnmostrar)
                        .addGap(45, 45, 45)
                        .addComponent(btnvolver)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncargar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(77, 77, 77))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idextxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
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
                            .addComponent(btnmostrar)
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
modificarEvento(BaseD);
cerrarBD(BaseD);
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
 ObjectContainer BaseD = Db4o.openFile(direccionBD);  
cargarTabla(BaseD);
cerrarBD(BaseD);
    }//GEN-LAST:event_btnmostrarActionPerformed

    
    //PARA CARGAR LOS DATOS DE LA BASE DE DATOS, ESTO TIENE QUE IR EN EL BOTON DE BUSCAR EXPOSICION.
    public void cargarDatos(ObjectContainer BaseD) {
        btnguardar.setEnabled(false);
        String CodigoEv;
        CodigoEv = codigotxt.getText();
        if (codigotxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un codigo");
        } else {
            if (comprobarEvento(BaseD, CodigoEv) == 0) {
                JOptionPane.showMessageDialog(null, "El evento no existe en la base de datos");

            } else {
                Evento Evbuscar = new Evento(CodigoEv, null, null , null, null, null);
                ObjectSet result = BaseD.get(Evbuscar);
                for (int i = 0; i < result.size(); i++) {
                    Evento Mievento = new Evento();
                    Mievento = (Evento) result.get(i);

                    nombretxt.setText(Mievento.getNombre_evento());
                    descripciontxt.setText(Mievento.getDescripcion());
                    idextxt.setText(Mievento.getId_exposicion());
                    fechai.setDate(Mievento.getFecha_inicio());
                    fechaf.setDate(Mievento.getFecha_final());

//                    if(ValidarCampos(Base D)){
                 btnguardar.setEnabled(true);
//                    
//                }
                    codigotxt.setEnabled(false);

                }
            }
        }

    }

    public void modificarEvento(ObjectContainer BaseD) {
        asignarVariables(BaseD);
        Evento Evmodi = new Evento(id_evento, null, null , null, null, null);
        ObjectSet result = BaseD.get(Evmodi);
        Evento Evmodificar = (Evento) result.next();

        Evmodificar.setNombre_evento(nombre_evento);
        Evmodificar.setDescripcion(descripcion);
        Evmodificar.setId_exposicion(id_exposicion);
        Evmodificar.setFecha_inicio(fecha_inicio);
        Evmodificar.setFecha_final(fecha_final);

        BaseD.set(Evmodificar);
        JOptionPane.showMessageDialog(null, "El evento fue modificado exitosamente");
        limpiarDatos();
    }

   public static int comprobarEvento(ObjectContainer BaseD, String codigo) {
        Evento Evbuscar = new Evento(codigo, null, null, null, null, null);
        ObjectSet result = BaseD.get(Evbuscar);
        return result.size();

    }

    public static void cerrarBD(ObjectContainer BaseD) {
        BaseD.close();
    }

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
    
    //LO SIGUIENTE PARA CARGAR LOS DATOS REGISTRADOS EN LA TABLA
    
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

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncargar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmostrar;
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
