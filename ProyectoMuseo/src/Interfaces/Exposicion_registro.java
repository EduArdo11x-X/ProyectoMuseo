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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        codigotxt = new javax.swing.JTextField();
        nombretxt = new javax.swing.JTextField();
        finicio = new com.toedter.calendar.JDateChooser();
        ffinal = new com.toedter.calendar.JDateChooser();
        guardarbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        exposiciontbl = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripciontxt = new javax.swing.JTextArea();
        Mostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 74, -1, -1));

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 122, -1, -1));

        jLabel3.setText("Descripcion:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 175, -1, -1));

        jLabel4.setText("Fecha inicio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel5.setText("Fecha final:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));
        jPanel1.add(codigotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 174, -1));
        jPanel1.add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 118, 174, -1));
        jPanel1.add(finicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 216, -1));
        jPanel1.add(ffinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 217, -1));

        guardarbtn.setText("Guardar");
        guardarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarbtnActionPerformed(evt);
            }
        });
        jPanel1.add(guardarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

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
        descripciontxt.setRows(5);
        jScrollPane2.setViewportView(descripciontxt);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        Mostrar.setText("Mostrar Datos");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        jPanel1.add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

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
cargarDatos(BaseD);
cerrarBD(BaseD);
        


    }//GEN-LAST:event_MostrarActionPerformed

    public void cargarDatos(ObjectContainer BaseD){
        
        Exposicion Exbuscar = new Exposicion(null, null, null, null, null);
        ObjectSet result = BaseD.get(Exbuscar);
        mostrarDatos(result);
    }
    public void mostrarDatos(ObjectSet result) {
        String matrizExposicion[][] = new String[result.size()][5];
        if(result.size() == 0){
            JOptionPane.showMessageDialog(null, "La exposicion no existe");
        }
        
        for (int i = 0; i < result.size(); i++) {
            Exposicion miExposicion = new Exposicion();
            miExposicion = (Exposicion) result.get(i);
            matrizExposicion[i][0] = miExposicion.getCod_exposicion();
            matrizExposicion[i][1] = miExposicion.getNombre_exposicion();
            matrizExposicion[i][2] = miExposicion.getDescripcion_exposicion();
            matrizExposicion[i][3] = String.valueOf(miExposicion.getFecha_inicio());
            matrizExposicion[i][4] = String.valueOf(miExposicion.getFecha_fin());
            

            exposiciontbl.setModel(new javax.swing.table.DefaultTableModel(matrizExposicion, new String[]{"Codigo", "Nombre", "Descripcion", "Fecha inicio", "Fecha final"}));

        }

    }

    public void asignarVariables(ObjectContainer BaseD) {
        cod_exposicion = codigotxt.getText();
        nombre_exposicion = nombretxt.getText();
        descripcion_exposicion = descripciontxt.getText();
        fecha_inicio = finicio.getDate();
        fecha_fin = ffinal.getDate();
    }

    public void limpiarDatos() {
        codigotxt.setText("");
        nombretxt.setText("");
        descripciontxt.setText("");

    }

    public static int comprobarExposicion(ObjectContainer BaseD, String codigo) {
        Exposicion Exbuscar = new Exposicion(codigo, null, null, null, null);
        ObjectSet result = BaseD.get(Exbuscar);
        return result.size();

    }

    public void crearExposicion(ObjectContainer BaseD) {
asignarVariables(BaseD);
if(comprobarExposicion(BaseD , cod_exposicion) == 0){
    Exposicion Exnuevo = new Exposicion( cod_exposicion,  nombre_exposicion,  descripcion_exposicion,  fecha_inicio,  fecha_fin); 
   BaseD.set(Exnuevo);
   JOptionPane.showMessageDialog(null, "Registrado correctamente");
}else{
       JOptionPane.showMessageDialog(null, "Exposicion ya registrado");

}
    }

    public static void cerrarBD(ObjectContainer BaseD) {
BaseD.close();
    }

      public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Crud_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exposicion_registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Mostrar;
    private javax.swing.JTextField codigotxt;
    private javax.swing.JTextArea descripciontxt;
    private javax.swing.JTable exposiciontbl;
    private com.toedter.calendar.JDateChooser ffinal;
    private com.toedter.calendar.JDateChooser finicio;
    private javax.swing.JButton guardarbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombretxt;
    // End of variables declaration//GEN-END:variables
}
