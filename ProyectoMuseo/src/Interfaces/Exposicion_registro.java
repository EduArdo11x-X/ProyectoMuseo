package Interfaces;

import clases.Exposicion;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Date;
import javax.swing.JOptionPane;

public class Exposicion_registro extends javax.swing.JFrame {

    String cod_exposicion = "";
    String nombre_exposicion = " ";
    String descripcion_exposicion = "";
    Date fecha_inicio;
    Date fecha_fin;
    
     public static String direccionBD = ("\\Users\\EDU\\Documents\\GitHub\\ProyectoMuseo\\ProyectoMuseo\\guia");

    public Exposicion_registro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codigotxt = new javax.swing.JTextField();
        nombretxt = new javax.swing.JTextField();
        guardarbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        exposiciontbl = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripciontxt = new javax.swing.JTextArea();
        Mostrar = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jLabel1.setText("Codigo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jLabel3.setText("Descripcion:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        codigotxt.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jPanel1.add(codigotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 174, -1));

        nombretxt.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jPanel1.add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 174, -1));

        guardarbtn.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        guardarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/salvar (1) 2.png"))); // NOI18N
        guardarbtn.setText("Guardar");
        guardarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarbtnActionPerformed(evt);
            }
        });
        jPanel1.add(guardarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 380, 340));

        descripciontxt.setColumns(20);
        descripciontxt.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        descripciontxt.setRows(5);
        jScrollPane2.setViewportView(descripciontxt);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        Mostrar.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        Mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/actualizar-pagina.png"))); // NOI18N
        Mostrar.setText("Mostrar Datos");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        jPanel1.add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        btnvolver.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        btnvolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/deshacer_1.png"))); // NOI18N
        btnvolver.setText("Volver");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarbtnActionPerformed
ObjectContainer BaseD = Db4o.openFile(direccionBD);  
crearExposicion(BaseD);
cerrarBD(BaseD);

    }//GEN-LAST:event_guardarbtnActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
ObjectContainer BaseD = Db4o.openFile(direccionBD);  
cargarTabla(BaseD);
cerrarBD(BaseD);
        


    }//GEN-LAST:event_MostrarActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
  this.dispose();
  menuPrincipal ventana = new menuPrincipal();
  ventana.setVisible(true);
    }//GEN-LAST:event_btnvolverActionPerformed

    public void cargarTabla(ObjectContainer BaseD){
        
        Exposicion Exbuscar = new Exposicion(null, null, null);
        ObjectSet result = BaseD.get(Exbuscar);
        mostrarDatos(result);
    }
    public void mostrarDatos(ObjectSet result) {
        String matrizExposicion[][] = new String[result.size()][3];
        if(result.size() == 0){
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

    public void asignarVariables(ObjectContainer BaseD) {
        cod_exposicion = codigotxt.getText();
        nombre_exposicion = nombretxt.getText();
        descripcion_exposicion = descripciontxt.getText();
    }

    public void limpiarDatos() {
        codigotxt.setText("");
        nombretxt.setText("");
        descripciontxt.setText("");

    }

    public static int comprobarExposicion(ObjectContainer BaseD, String codigo) {
        Exposicion Exbuscar = new Exposicion(codigo, null, null);
        ObjectSet result = BaseD.get(Exbuscar);
        return result.size();

    }

    public void crearExposicion(ObjectContainer BaseD) {
asignarVariables(BaseD);
if(comprobarExposicion(BaseD , cod_exposicion) == 0){
    Exposicion Exnuevo = new Exposicion( cod_exposicion,  nombre_exposicion,  descripcion_exposicion ); 
   BaseD.set(Exnuevo);
   JOptionPane.showMessageDialog(null, "Registrado correctamente");
}else{
       JOptionPane.showMessageDialog(null, "Exposicion ya registrado");

}
    }

    public static void cerrarBD(ObjectContainer BaseD) {
BaseD.close();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Mostrar;
    private javax.swing.JButton btnvolver;
    private javax.swing.JTextField codigotxt;
    private javax.swing.JTextArea descripciontxt;
    private javax.swing.JTable exposiciontbl;
    private javax.swing.JButton guardarbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombretxt;
    // End of variables declaration//GEN-END:variables
}
