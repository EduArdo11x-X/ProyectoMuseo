package Interfaces;

import com.db4o.ObjectContainer;
import java.awt.Color;
import javax.swing.JOptionPane;

public class loggin extends javax.swing.JFrame {

    int xMouse, yMouse;
   
    public loggin() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        log = new javax.swing.JLabel();
        nombreempresa = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        iniciarsesion = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        usuariotxt = new javax.swing.JTextField();
        txtcontrasena = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        passtxt = new javax.swing.JPasswordField();
        entrarbtn = new javax.swing.JPanel();
        entrartxt = new javax.swing.JLabel();
        cabecera = new javax.swing.JPanel();
        exitbtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        log.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Logotipo.png"))); // NOI18N
        log.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg.add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 250, 230));

        nombreempresa.setBackground(new java.awt.Color(0, 0, 0));
        nombreempresa.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        nombreempresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreempresa.setText("MUSEO MODERNO DE CUENCA");
        bg.add(nombreempresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 280, -1));

        city.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/ImagenMuseo.jpeg"))); // NOI18N
        bg.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 290, 500));

        iniciarsesion.setFont(new java.awt.Font("Copperplate", 1, 24)); // NOI18N
        iniciarsesion.setText("INICIAR SESION");
        bg.add(iniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        usuario.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        usuario.setText("USUARIO");
        bg.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        separador.setForeground(new java.awt.Color(187, 187, 187));
        bg.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 360, 10));

        usuariotxt.setBackground(new java.awt.Color(51, 51, 51));
        usuariotxt.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
        usuariotxt.setForeground(new java.awt.Color(255, 255, 255));
        usuariotxt.setText("Ingrese su nombre de usuario");
        usuariotxt.setBorder(null);
        usuariotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuariotxtMousePressed(evt);
            }
        });
        usuariotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariotxtActionPerformed(evt);
            }
        });
        bg.add(usuariotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 360, 30));

        txtcontrasena.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        txtcontrasena.setText("CONTRASEÑA");
        bg.add(txtcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        separador2.setForeground(new java.awt.Color(187, 187, 187));
        bg.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 360, 10));

        passtxt.setBackground(new java.awt.Color(51, 51, 51));
        passtxt.setForeground(new java.awt.Color(255, 255, 255));
        passtxt.setText("********");
        passtxt.setBorder(null);
        passtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passtxtMousePressed(evt);
            }
        });
        bg.add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 360, 30));

        entrarbtn.setBackground(new java.awt.Color(51, 51, 51));
        entrarbtn.setForeground(new java.awt.Color(255, 255, 255));
        entrarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarbtnMouseExited(evt);
            }
        });

        entrartxt.setBackground(new java.awt.Color(0, 0, 0));
        entrartxt.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        entrartxt.setForeground(new java.awt.Color(255, 255, 255));
        entrartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrartxt.setText("ENTRAR");
        entrartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrartxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrartxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrartxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout entrarbtnLayout = new javax.swing.GroupLayout(entrarbtn);
        entrarbtn.setLayout(entrarbtnLayout);
        entrarbtnLayout.setHorizontalGroup(
            entrarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        entrarbtnLayout.setVerticalGroup(
            entrarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(entrarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 130, 50));

        cabecera.setBackground(new java.awt.Color(0, 0, 0));
        cabecera.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cabeceraMouseDragged(evt);
            }
        });
        cabecera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cabeceraMousePressed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(0, 0, 0));

        exitTxt.setBackground(new java.awt.Color(0, 0, 0));
        exitTxt.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitbtnLayout = new javax.swing.GroupLayout(exitbtn);
        exitbtn.setLayout(exitbtnLayout);
        exitbtnLayout.setHorizontalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitbtnLayout.createSequentialGroup()
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        exitbtnLayout.setVerticalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cabeceraLayout = new javax.swing.GroupLayout(cabecera);
        cabecera.setLayout(cabeceraLayout);
        cabeceraLayout.setHorizontalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabeceraLayout.createSequentialGroup()
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 768, Short.MAX_VALUE))
        );
        cabeceraLayout.setVerticalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        jLabel1.setFont(new java.awt.Font("Courier", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("EduardoM2A");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Courier", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("pooM2A");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 804, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuariotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuariotxtActionPerformed

    private void cabeceraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabeceraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();// TODO add your handling code here:
    }//GEN-LAST:event_cabeceraMousePressed

    private void cabeceraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabeceraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_cabeceraMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitbtn.setBackground(Color.red);
        exitTxt.setBackground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitbtn.setBackground(Color.white);
        exitTxt.setBackground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void entrartxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrartxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_entrartxtMouseExited

    private void entrartxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrartxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_entrartxtMouseEntered

    private void entrarbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarbtnMouseClicked
   
    }//GEN-LAST:event_entrarbtnMouseClicked

    private void entrarbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarbtnMouseEntered

        entrarbtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_entrarbtnMouseEntered

    private void entrarbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarbtnMouseExited
        entrarbtn.setBackground(new Color(0, 134, 190));          // TODO add your handling code here:
    }//GEN-LAST:event_entrarbtnMouseExited

    private void usuariotxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariotxtMousePressed
        if(usuariotxt.getText().equals("Ingrese su nombre de usuario")){
            
        
                usuariotxt.setText("");
        usuariotxt.setForeground(Color.black);
        }
        if(String.valueOf(passtxt.getPassword()).isEmpty()){
        passtxt.setText("********");
        passtxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_usuariotxtMousePressed

    private void passtxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passtxtMousePressed
        if(String.valueOf(passtxt.getPassword()).equals("********")){
           passtxt.setText("");
        passtxt.setForeground(Color.black);
        }
        if(usuariotxt.getText().isEmpty()){
             usuariotxt.setText("Ingrese su nombre de usuario");
        
        usuariotxt.setForeground(Color.gray);
        
        
        }


    }//GEN-LAST:event_passtxtMousePressed

    private void entrartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrartxtMouseClicked
 String usuarioIng= "EduardoM2A";
    String contra = "pooM2A";
    if(usuariotxt.getText().equals(usuarioIng)&& passtxt.getText().equals(contra)){
this.setVisible(false);
menuPrincipal miMenu= new menuPrincipal();
miMenu.setVisible(true);
}else{
    JOptionPane.showMessageDialog(this, "Datos incorrectos");
}
    }//GEN-LAST:event_entrartxtMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loggin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel cabecera;
    private javax.swing.JLabel city;
    private javax.swing.JPanel entrarbtn;
    private javax.swing.JLabel entrartxt;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JLabel iniciarsesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel log;
    private javax.swing.JLabel nombreempresa;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JSeparator separador;
    private javax.swing.JSeparator separador2;
    private javax.swing.JLabel txtcontrasena;
    private javax.swing.JLabel usuario;
    private javax.swing.JTextField usuariotxt;
    // End of variables declaration//GEN-END:variables
}
