package gui;

import java.awt.Color;
import javax.swing.JOptionPane;
import profesor.*;

public class register extends javax.swing.JDialog {

    public register(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        comeBack = new javax.swing.JPanel();
        lblComeBackB = new javax.swing.JLabel();
        lblComeBackW = new javax.swing.JLabel();
        tittle = new javax.swing.JLabel();
        log = new javax.swing.JLabel();
        lblNom = new javax.swing.JLabel();
        lblApe = new javax.swing.JLabel();
        lblEma = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblPassw = new javax.swing.JLabel();
        lblRPassW = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNomUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        txtRPass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        Register = new javax.swing.JPanel();
        lblRegister = new javax.swing.JLabel();
        Modify = new javax.swing.JPanel();
        lblModify = new javax.swing.JLabel();
        Eliminate = new javax.swing.JPanel();
        lblEliminate = new javax.swing.JLabel();
        fPRegister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comeBack.setBackground(new java.awt.Color(255, 255, 255));
        comeBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comeBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comeBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comeBackMouseExited(evt);
            }
        });

        lblComeBackB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comeBackBlack.png"))); // NOI18N

        lblComeBackW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comeBackWhite.png"))); // NOI18N

        javax.swing.GroupLayout comeBackLayout = new javax.swing.GroupLayout(comeBack);
        comeBack.setLayout(comeBackLayout);
        comeBackLayout.setHorizontalGroup(
            comeBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblComeBackB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(comeBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblComeBackW, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        comeBackLayout.setVerticalGroup(
            comeBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblComeBackB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(comeBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblComeBackW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(comeBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 32, 32));

        tittle.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tittle.setForeground(new java.awt.Color(102, 0, 102));
        tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle.setText("Registro de Usuario");
        background.add(tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 240, 40));

        log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo50x50.png"))); // NOI18N
        background.add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 50, -1));

        lblNom.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        lblNom.setForeground(new java.awt.Color(0, 0, 0));
        lblNom.setText("Nombres");
        background.add(lblNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 110, 30));

        lblApe.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        lblApe.setForeground(new java.awt.Color(0, 0, 0));
        lblApe.setText("Apellidos");
        background.add(lblApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 110, 30));

        lblEma.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        lblEma.setForeground(new java.awt.Color(0, 0, 0));
        lblEma.setText("Correo");
        background.add(lblEma, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 110, 30));

        lblUser.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        lblUser.setForeground(new java.awt.Color(0, 0, 0));
        lblUser.setText("Usuario");
        background.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 110, 30));

        lblPassw.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        lblPassw.setForeground(new java.awt.Color(0, 0, 0));
        lblPassw.setText("Contraseña");
        background.add(lblPassw, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 110, 30));

        lblRPassW.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        lblRPassW.setForeground(new java.awt.Color(0, 0, 0));
        lblRPassW.setText("Repetir Contraseña");
        background.add(lblRPassW, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 110, 30));

        txtNom.setBackground(new java.awt.Color(247, 247, 247));
        txtNom.setForeground(new java.awt.Color(144, 144, 144));
        txtNom.setBorder(null);
        background.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 210, 30));

        txtApe.setBackground(new java.awt.Color(247, 247, 247));
        txtApe.setForeground(new java.awt.Color(144, 144, 144));
        txtApe.setBorder(null);
        background.add(txtApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 210, 30));

        txtEmail.setBackground(new java.awt.Color(247, 247, 247));
        txtEmail.setForeground(new java.awt.Color(144, 144, 144));
        txtEmail.setBorder(null);
        background.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 210, 30));

        txtNomUser.setBackground(new java.awt.Color(247, 247, 247));
        txtNomUser.setForeground(new java.awt.Color(144, 144, 144));
        txtNomUser.setBorder(null);
        background.add(txtNomUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 210, 30));

        txtPass.setBackground(new java.awt.Color(247, 247, 247));
        txtPass.setBorder(null);
        background.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 210, 30));

        txtRPass.setBackground(new java.awt.Color(247, 247, 247));
        txtRPass.setBorder(null);
        background.add(txtRPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 210, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 330, 10));

        Register.setBackground(new java.awt.Color(160, 26, 181));
        Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegisterMouseExited(evt);
            }
        });

        lblRegister.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(255, 255, 255));
        lblRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegister.setText("Registrar");

        javax.swing.GroupLayout RegisterLayout = new javax.swing.GroupLayout(Register);
        Register.setLayout(RegisterLayout);
        RegisterLayout.setHorizontalGroup(
            RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RegisterLayout.setVerticalGroup(
            RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        background.add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 100, 30));

        Modify.setBackground(new java.awt.Color(160, 26, 181));
        Modify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModifyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ModifyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ModifyMouseExited(evt);
            }
        });

        lblModify.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblModify.setForeground(new java.awt.Color(255, 255, 255));
        lblModify.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModify.setText("Modificar");

        javax.swing.GroupLayout ModifyLayout = new javax.swing.GroupLayout(Modify);
        Modify.setLayout(ModifyLayout);
        ModifyLayout.setHorizontalGroup(
            ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ModifyLayout.setVerticalGroup(
            ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblModify, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        background.add(Modify, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 110, 30));

        Eliminate.setBackground(new java.awt.Color(160, 26, 181));
        Eliminate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eliminate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminateMouseExited(evt);
            }
        });

        lblEliminate.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblEliminate.setForeground(new java.awt.Color(255, 255, 255));
        lblEliminate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEliminate.setText("Eliminar");

        javax.swing.GroupLayout EliminateLayout = new javax.swing.GroupLayout(Eliminate);
        Eliminate.setLayout(EliminateLayout);
        EliminateLayout.setHorizontalGroup(
            EliminateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEliminate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EliminateLayout.setVerticalGroup(
            EliminateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEliminate, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        background.add(Eliminate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 100, 30));

        fPRegister.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        fPRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fbRegister.png"))); // NOI18N
        background.add(fPRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//========================================================="Botón" para Registrar===================================================================\\

    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked
        String [ ] botones = {"Seguir","Volver"};
        if (!txtNom.getText().isEmpty() &&
        !txtApe.getText().isEmpty() &&
        !txtEmail.getText().isEmpty() &&
        !txtNomUser.getText().isEmpty() &&
        !txtPass.getText().isEmpty() &&
        txtRPass.getText().equals(txtPass.getText())) {

        Usuario usuario = new Usuario(txtNomUser.getText(),
                                      txtPass.getText(),
                                      txtNom.getText(),
                                      txtApe.getText(),
                                      txtEmail.getText());
        
        if (UsuarioLogic.insertar(usuario)) {
            JOptionPane.showMessageDialog(this, "Usuario registrado"); 
            
            int i = JOptionPane.showOptionDialog(this, "Deseas registrar mas profesores?", "Registrar",
                                     JOptionPane.YES_NO_CANCEL_OPTION,
                                     JOptionPane.INFORMATION_MESSAGE,null,botones,botones[0]);
            if (i== 1){
                this.dispose();
            }

        } else {
            JOptionPane.showMessageDialog(this, "El usuario ya existe");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos y asegúrate de que las contraseñas coincidan.");
    }
    }//GEN-LAST:event_RegisterMouseClicked

    private void RegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseEntered
        Register.setBackground(new Color(203,33,230));
    }//GEN-LAST:event_RegisterMouseEntered

    private void RegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseExited
        Register.setBackground(new Color(160,26,181));
    }//GEN-LAST:event_RegisterMouseExited

//========================================================="Botón" para Modificar===================================================================\\

    private void ModifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifyMouseClicked
        if(!txtNom.getText().isEmpty()&&
                !txtApe.getText().isEmpty()&&
                !txtEmail.getText().isEmpty()&&
                !txtNomUser.getText().isEmpty()&&
                !txtPass.getText().isEmpty()&&
                !txtRPass.getText().equals(txtPass.getText())){
            
            Usuario Usuario = new Usuario(txtNomUser.getText(),
            txtPass.getText(), txtNom.getText(), txtApe.getText(), txtEmail.getText());
            if(UsuarioLogic.modificar(Usuario)){
                JOptionPane.showMessageDialog(this,"usuario modificado"); 
            }else{
                JOptionPane.showMessageDialog(this,"usuario no  existente");
            }
        }
    }//GEN-LAST:event_ModifyMouseClicked

    private void ModifyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifyMouseEntered
        Modify.setBackground(new Color(203,33,230));
    }//GEN-LAST:event_ModifyMouseEntered

    private void ModifyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifyMouseExited
        Modify.setBackground(new Color(160,26,181));
    }//GEN-LAST:event_ModifyMouseExited

//========================================================="Botón" para Eliminar====================================================================\\

    private void EliminateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminateMouseClicked
        if( !txtNomUser.getText().isEmpty()){          
            if(UsuarioLogic.eliminar(txtNomUser.getText())){
                JOptionPane.showMessageDialog(this,"usuario eliminado"); 
            }else{
                JOptionPane.showMessageDialog(this,"usuario no encontrado");
            }
        }
    }//GEN-LAST:event_EliminateMouseClicked

    private void EliminateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminateMouseEntered
        Eliminate.setBackground(new Color(203,33,230));
    }//GEN-LAST:event_EliminateMouseEntered

    private void EliminateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminateMouseExited
        Eliminate.setBackground(new Color(160,26,181));
    }//GEN-LAST:event_EliminateMouseExited

//=================================================================================================================================================\\

    private void comeBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comeBackMouseClicked
        int i = JOptionPane.showConfirmDialog(this, "Estas seguro de regresar?","Alerta",JOptionPane.YES_NO_OPTION);
        if(i==0){
            this.dispose();
        }
    }//GEN-LAST:event_comeBackMouseClicked

    private void comeBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comeBackMouseEntered
        comeBack.setBackground(new Color(168,168,168));
        lblComeBackB.setVisible(false);
        lblComeBackW.setVisible(true);
    }//GEN-LAST:event_comeBackMouseEntered

    private void comeBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comeBackMouseExited
        comeBack.setBackground(new Color(255,255,255));
        lblComeBackB.setVisible(true);
        lblComeBackW.setVisible(false);
    }//GEN-LAST:event_comeBackMouseExited

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                register dialog = new register(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Eliminate;
    private javax.swing.JPanel Modify;
    private javax.swing.JPanel Register;
    private javax.swing.JPanel background;
    private javax.swing.JPanel comeBack;
    private javax.swing.JLabel fPRegister;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApe;
    private javax.swing.JLabel lblComeBackB;
    private javax.swing.JLabel lblComeBackW;
    private javax.swing.JLabel lblEliminate;
    private javax.swing.JLabel lblEma;
    private javax.swing.JLabel lblModify;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblPassw;
    private javax.swing.JLabel lblRPassW;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel log;
    private javax.swing.JLabel tittle;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNomUser;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtRPass;
    // End of variables declaration//GEN-END:variables
}
