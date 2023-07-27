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
        mostrarTabla = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 11, 13));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripcion:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        codigotxt.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jPanel1.add(codigotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 174, -1));

        nombretxt.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        jPanel1.add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 174, -1));

        guardarbtn.setBackground(new java.awt.Color(0, 11, 13));
        guardarbtn.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        guardarbtn.setForeground(new java.awt.Color(255, 255, 255));
        guardarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/actualizado 2.png"))); // NOI18N
        guardarbtn.setText("Guardar");
        guardarbtn.setBorder(null);
        guardarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarbtnActionPerformed(evt);
            }
        });
        jPanel1.add(guardarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 380, 240));

        descripciontxt.setColumns(20);
        descripciontxt.setFont(new java.awt.Font("Raanana", 0, 14)); // NOI18N
        descripciontxt.setRows(5);
        jScrollPane2.setViewportView(descripciontxt);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        mostrarTabla.setBackground(new java.awt.Color(0, 11, 13));
        mostrarTabla.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        mostrarTabla.setForeground(new java.awt.Color(255, 255, 255));
        mostrarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/actualizar-pagina.png"))); // NOI18N
        mostrarTabla.setText("Mostrar Datos");
        mostrarTabla.setBorder(null);
        mostrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarTablaActionPerformed(evt);
            }
        });
        jPanel1.add(mostrarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 90, -1, -1));

        jPanel2.setBackground(new java.awt.Color(134, 153, 167));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 11, 13));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Minilogo.png"))); // NOI18N
        jLabel7.setText(" Modificar Exposicion ");

        botonRegresar.setBackground(new java.awt.Color(0, 11, 13));
        botonRegresar.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        botonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/deshacer_1.png"))); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.setBorder(null);
        botonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 427, Short.MAX_VALUE)
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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 60));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1120, 10));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 50, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarbtnActionPerformed
        ObjectContainer BaseD = Db4o.openFile(direccionBD);
        crearExposicion(BaseD);
        cerrarBD(BaseD);
    }//GEN-LAST:event_guardarbtnActionPerformed

    private void mostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarTablaActionPerformed
        ObjectContainer BaseD = Db4o.openFile(direccionBD);
        cargarTabla(BaseD);
        cerrarBD(BaseD);
    }//GEN-LAST:event_mostrarTablaActionPerformed

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
    private javax.swing.JButton botonRegresar;
    private javax.swing.JTextField codigotxt;
    private javax.swing.JTextArea descripciontxt;
    private javax.swing.JTable exposiciontbl;
    private javax.swing.JButton guardarbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton mostrarTabla;
    private javax.swing.JTextField nombretxt;
    // End of variables declaration//GEN-END:variables
}
