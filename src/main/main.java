package main;

import gui.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import profesor.UsuarioLogic;
import javax.swing.ImageIcon;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/logoConFondo.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        log = new javax.swing.JLabel();
        Ingresa = new javax.swing.JLabel();
        logUser = new javax.swing.JLabel();
        logPass = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Contrasenia = new javax.swing.JLabel();
        pnlSee = new javax.swing.JPanel();
        seent = new javax.swing.JLabel();
        see = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        Registrar = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JLabel();
        enter = new javax.swing.JPanel();
        btnEnter = new javax.swing.JLabel();
        fondoLaptop = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asistente Educativo");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo100x100.png"))); // NOI18N
        jPanel2.add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 90, 100));

        Ingresa.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Ingresa.setForeground(new java.awt.Color(0, 0, 0));
        Ingresa.setText("INICIAR SESIÓN");
        jPanel2.add(Ingresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        logUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/block.png"))); // NOI18N
        jPanel2.add(logUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 30, 30));

        logPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        jPanel2.add(logPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 30, 30));

        User.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        User.setForeground(new java.awt.Color(0, 0, 0));
        User.setText("USUARIO");
        jPanel2.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 100, -1));

        txtUser.setBackground(new java.awt.Color(244, 244, 244));
        txtUser.setForeground(new java.awt.Color(144, 144, 144));
        txtUser.setText("Ingrese su nombre de usuario");
        txtUser.setBorder(null);
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserMousePressed(evt);
            }
        });
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 180, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 180, 20));

        Contrasenia.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Contrasenia.setForeground(new java.awt.Color(0, 0, 0));
        Contrasenia.setText("CONTRASEÑA");
        jPanel2.add(Contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 100, -1));

        pnlSee.setBackground(new java.awt.Color(244, 244, 244));
        pnlSee.setForeground(new java.awt.Color(204, 204, 204));
        pnlSee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlSeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlSeeMouseExited(evt);
            }
        });

        seent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/see.png"))); // NOI18N
        seent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seentMouseClicked(evt);
            }
        });

        see.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seent.png"))); // NOI18N
        see.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlSeeLayout = new javax.swing.GroupLayout(pnlSee);
        pnlSee.setLayout(pnlSeeLayout);
        pnlSeeLayout.setHorizontalGroup(
            pnlSeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeeLayout.createSequentialGroup()
                .addComponent(seent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(pnlSeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSeeLayout.createSequentialGroup()
                    .addComponent(see, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlSeeLayout.setVerticalGroup(
            pnlSeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeeLayout.createSequentialGroup()
                .addComponent(seent)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(pnlSeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSeeLayout.createSequentialGroup()
                    .addComponent(see, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel2.add(pnlSee, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 30, 30));

        txtContra.setBackground(new java.awt.Color(244, 244, 244));
        txtContra.setForeground(new java.awt.Color(144, 144, 144));
        txtContra.setText("**********");
        txtContra.setBorder(null);
        txtContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraMousePressed(evt);
            }
        });
        jPanel2.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 150, 30));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 180, 20));

        Registrar.setBackground(new java.awt.Color(244, 244, 244));
        Registrar.setForeground(new java.awt.Color(244, 244, 244));
        Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistrarMouseExited(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(204, 204, 204));
        btnRegistrar.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(227, 227, 227));
        btnRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setText("CREAR CUENTA");

        javax.swing.GroupLayout RegistrarLayout = new javax.swing.GroupLayout(Registrar);
        Registrar.setLayout(RegistrarLayout);
        RegistrarLayout.setHorizontalGroup(
            RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RegistrarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        RegistrarLayout.setVerticalGroup(
            RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RegistrarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        enter.setBackground(new java.awt.Color(250, 204, 7));

        btnEnter.setBackground(new java.awt.Color(255, 255, 255));
        btnEnter.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(255, 255, 255));
        btnEnter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEnter.setText("INGRESAR");
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnterMouseExited(evt);
            }
        });

        javax.swing.GroupLayout enterLayout = new javax.swing.GroupLayout(enter);
        enter.setLayout(enterLayout);
        enterLayout.setHorizontalGroup(
            enterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEnter, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        );
        enterLayout.setVerticalGroup(
            enterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEnter, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 195, 30));

        fondoLaptop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondotranslate.png"))); // NOI18N
        jPanel2.add(fondoLaptop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlBackground.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 570, 380));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Víctorvila1.png"))); // NOI18N
        pnlBackground.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraMousePressed
        if(String.valueOf(txtContra.getPassword()).equals("**********")){
            txtContra.setText("");
            txtContra.setForeground(Color.black);
        }
        if(txtUser.getText().isEmpty()){
            txtUser.setText("Ingrese su nombre de usuario");
            txtUser.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtContraMousePressed

    private void btnEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnterMouseClicked
        
        if(!txtUser.getText().isEmpty()&&
            !txtContra.getText().isEmpty()){
            
            if(UsuarioLogic.autentificar(txtUser.getText(), txtContra.getText())){
                JOptionPane.showMessageDialog(this, "Bienvenido");
                this.dispose();
                interfaz Principal = new interfaz (UsuarioLogic.obtener(txtUser.getText()));
                Principal.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "ERROR");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Campos Vacios");
        }
    }//GEN-LAST:event_btnEnterMouseClicked

    private void btnEnterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnterMouseEntered
        btnEnter.setBackground(new Color(217,177,6));
        enter.setBackground(new Color(217,177,6));
    }//GEN-LAST:event_btnEnterMouseEntered

    private void btnEnterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnterMouseExited
        btnEnter.setBackground(new Color(250,204,7));
        enter.setBackground(new Color(250,204,7));
    }//GEN-LAST:event_btnEnterMouseExited

    private void RegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseEntered
        Registrar.setBackground(new Color(222,217,217));
        btnRegistrar.setForeground(Color.white);
    }//GEN-LAST:event_RegistrarMouseEntered

    private void RegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseExited
        Registrar.setBackground(new Color(244,244,244));
        btnRegistrar.setForeground(new Color(227,227,227));
    }//GEN-LAST:event_RegistrarMouseExited

    private void RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseClicked
        register dlgRegister = new register(this,true);
        dlgRegister.setVisible(true);
    }//GEN-LAST:event_RegistrarMouseClicked

    private void seentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seentMouseClicked
        seent.setVisible(false);
        see.setVisible(true);
        txtContra.setEchoChar((char)0);
    }//GEN-LAST:event_seentMouseClicked

    private void seeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seeMouseClicked
        see.setVisible(false);
        seent.setVisible(true);
        
        txtContra.setEchoChar('*');
    }//GEN-LAST:event_seeMouseClicked

    private void txtUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMousePressed
        if(txtUser.getText().equals("Ingrese su nombre de usuario")){
            txtUser.setText("");
            txtUser.setForeground(Color.black);
        }
        if(String.valueOf(txtContra.getPassword()).isEmpty()){
            txtContra.setText("**********");
            txtContra.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUserMousePressed

    private void pnlSeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSeeMouseEntered
        pnlSee.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_pnlSeeMouseEntered

    private void pnlSeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSeeMouseExited
        pnlSee.setBackground(new Color(244,244,244));
    }//GEN-LAST:event_pnlSeeMouseExited

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contrasenia;
    private javax.swing.JLabel Ingresa;
    private javax.swing.JPanel Registrar;
    private javax.swing.JLabel User;
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnEnter;
    private javax.swing.JLabel btnRegistrar;
    private javax.swing.JPanel enter;
    private javax.swing.JLabel fondoLaptop;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel log;
    private javax.swing.JLabel logPass;
    private javax.swing.JLabel logUser;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlSee;
    private javax.swing.JLabel see;
    private javax.swing.JLabel seent;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
