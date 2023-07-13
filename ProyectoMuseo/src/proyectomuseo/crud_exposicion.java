
package proyectomuseo;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class crud_exposicion extends javax.swing.JFrame {
static ArrayList<clases.Exposicion> listaExposicion = new ArrayList<clases.Exposicion>();
   
    public crud_exposicion() {
        initComponents();
        mostrarDatos();
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
        guardarbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        exposiciontbl = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripciontxt = new javax.swing.JTextArea();
        fechai = new com.toedter.calendar.JDateChooser();
        fechaf = new com.toedter.calendar.JDateChooser();

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
        jPanel1.add(fechai, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 230, -1));
        jPanel1.add(fechaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 230, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarbtnActionPerformed
clases.Exposicion miExposicion = new clases.Exposicion();

miExposicion.setCod_exposicion(codigotxt.getText());
miExposicion.setNombre_exposicion(nombretxt.getText());
miExposicion.setDescripcion_exposicion(descripciontxt.getText());
miExposicion.setFecha_inicio(finicio.getDate());
miExposicion.setFecha_fin(ffinal.getDate());

listaExposicion.add(miExposicion);

JOptionPane.showMessageDialog(null, "Exposicion registrado");

mostrarDatos();
limpiarDatos();



     
        
    }//GEN-LAST:event_guardarbtnActionPerformed

    public void mostrarDatos(){
        String matrizExposicion[][]=new String [listaExposicion.size()] [5];
        for(int i = 0 ; i< listaExposicion.size(); i ++){
            matrizExposicion[i][0] = listaExposicion.get(i).getCod_exposicion();
            matrizExposicion[i][1] = listaExposicion.get(i).getNombre_exposicion();
            matrizExposicion[i][2] = listaExposicion.get(i).getDescripcion_exposicion();
            matrizExposicion[i][3] = String.valueOf(listaExposicion.get(i).getFecha_inicio());
            matrizExposicion[i][4] = String.valueOf(listaExposicion.get(i).getFecha_fin());
            
            exposiciontbl.setModel(new javax.swing.table.DefaultTableModel(matrizExposicion, new String[]{"Codigo","Nombre","Descripcion","Fecha inicio","Fecha final"}));
            
            
            
        }
        
    }

    public void limpiarDatos(){
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigotxt;
    private javax.swing.JTextArea descripciontxt;
    private javax.swing.JTable exposiciontbl;
    private com.toedter.calendar.JDateChooser fechaf;
    private com.toedter.calendar.JDateChooser fechai;
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
