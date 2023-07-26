package gui;

public class ingDatos extends javax.swing.JPanel {

    public ingDatos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bakground = new javax.swing.JPanel();
        ingMate = new javax.swing.JPanel();
        mate = new javax.swing.JLabel();
        ingPara = new javax.swing.JPanel();
        paralelos = new javax.swing.JLabel();
        ingTem = new javax.swing.JPanel();
        temas = new javax.swing.JLabel();
        ingCla = new javax.swing.JPanel();
        clases = new javax.swing.JLabel();
        ingHor = new javax.swing.JPanel();
        horario = new javax.swing.JLabel();
        ingAct = new javax.swing.JPanel();
        actividad = new javax.swing.JLabel();

        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(930, 525));

        bakground.setBackground(new java.awt.Color(255, 255, 255));
        bakground.setPreferredSize(new java.awt.Dimension(930, 525));

        ingMate.setBackground(new java.awt.Color(18, 90, 173));
        ingMate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ingMate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingMate.setPreferredSize(new java.awt.Dimension(220, 50));
        ingMate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingMateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingMateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingMateMouseExited(evt);
            }
        });

        mate.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        mate.setForeground(new java.awt.Color(255, 255, 255));
        mate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mate.setText("INGRESAR MATERIAS");

        javax.swing.GroupLayout ingMateLayout = new javax.swing.GroupLayout(ingMate);
        ingMate.setLayout(ingMateLayout);
        ingMateLayout.setHorizontalGroup(
            ingMateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ingMateLayout.setVerticalGroup(
            ingMateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mate, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        ingPara.setBackground(new java.awt.Color(18, 90, 173));
        ingPara.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ingPara.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingPara.setPreferredSize(new java.awt.Dimension(220, 50));
        ingPara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingParaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingParaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingParaMouseExited(evt);
            }
        });

        paralelos.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        paralelos.setForeground(new java.awt.Color(255, 255, 255));
        paralelos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paralelos.setText("INGRESAR PARALELOS");

        javax.swing.GroupLayout ingParaLayout = new javax.swing.GroupLayout(ingPara);
        ingPara.setLayout(ingParaLayout);
        ingParaLayout.setHorizontalGroup(
            ingParaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paralelos, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
        );
        ingParaLayout.setVerticalGroup(
            ingParaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paralelos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        ingTem.setBackground(new java.awt.Color(18, 90, 173));
        ingTem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ingTem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingTem.setPreferredSize(new java.awt.Dimension(220, 50));
        ingTem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingTemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingTemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingTemMouseExited(evt);
            }
        });

        temas.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        temas.setForeground(new java.awt.Color(255, 255, 255));
        temas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        temas.setText("INGRESAR TEMAS");

        javax.swing.GroupLayout ingTemLayout = new javax.swing.GroupLayout(ingTem);
        ingTem.setLayout(ingTemLayout);
        ingTemLayout.setHorizontalGroup(
            ingTemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(temas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ingTemLayout.setVerticalGroup(
            ingTemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(temas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        ingCla.setBackground(new java.awt.Color(18, 90, 173));
        ingCla.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ingCla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingCla.setPreferredSize(new java.awt.Dimension(220, 50));
        ingCla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingClaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingClaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingClaMouseExited(evt);
            }
        });

        clases.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        clases.setForeground(new java.awt.Color(255, 255, 255));
        clases.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clases.setText("INGRESAR CLASES");

        javax.swing.GroupLayout ingClaLayout = new javax.swing.GroupLayout(ingCla);
        ingCla.setLayout(ingClaLayout);
        ingClaLayout.setHorizontalGroup(
            ingClaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ingClaLayout.setVerticalGroup(
            ingClaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clases, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ingHor.setBackground(new java.awt.Color(18, 90, 173));
        ingHor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ingHor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingHor.setPreferredSize(new java.awt.Dimension(220, 50));
        ingHor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingHorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingHorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingHorMouseExited(evt);
            }
        });

        horario.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        horario.setForeground(new java.awt.Color(255, 255, 255));
        horario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        horario.setText("INGRESAR HORARIO");

        javax.swing.GroupLayout ingHorLayout = new javax.swing.GroupLayout(ingHor);
        ingHor.setLayout(ingHorLayout);
        ingHorLayout.setHorizontalGroup(
            ingHorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(horario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ingHorLayout.setVerticalGroup(
            ingHorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(horario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        ingAct.setBackground(new java.awt.Color(18, 90, 173));
        ingAct.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ingAct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingAct.setPreferredSize(new java.awt.Dimension(220, 50));
        ingAct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingActMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingActMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingActMouseExited(evt);
            }
        });

        actividad.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        actividad.setForeground(new java.awt.Color(255, 255, 255));
        actividad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actividad.setText("INGRESAR ACTIVIDADES");

        javax.swing.GroupLayout ingActLayout = new javax.swing.GroupLayout(ingAct);
        ingAct.setLayout(ingActLayout);
        ingActLayout.setHorizontalGroup(
            ingActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actividad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
        );
        ingActLayout.setVerticalGroup(
            ingActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actividad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bakgroundLayout = new javax.swing.GroupLayout(bakground);
        bakground.setLayout(bakgroundLayout);
        bakgroundLayout.setHorizontalGroup(
            bakgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bakgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(bakgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingMate, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(ingTem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(ingAct, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(ingHor, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bakgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingPara, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(ingCla, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addGap(312, 312, 312))
        );
        bakgroundLayout.setVerticalGroup(
            bakgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bakgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(bakgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingMate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingPara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(bakgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ingTem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ingCla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingHor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bakground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bakground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

//===========================================================================================================================================\\ 

    private void ingMateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingMateMouseClicked
        materia dlgMate = new materia();
        dlgMate.setVisible(true);
    }//GEN-LAST:event_ingMateMouseClicked

    private void ingMateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingMateMouseEntered
        ingMate.setBackground(new java.awt.Color(17,79,148));
    }//GEN-LAST:event_ingMateMouseEntered

    private void ingMateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingMateMouseExited
       ingMate.setBackground(new java.awt.Color(18,90,173));
    }//GEN-LAST:event_ingMateMouseExited

//===========================================================================================================================================\\ 

    private void ingParaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingParaMouseEntered
        ingPara.setBackground(new java.awt.Color(17,79,148));
    }//GEN-LAST:event_ingParaMouseEntered

    private void ingParaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingParaMouseExited
        ingPara.setBackground(new java.awt.Color(18,90,173));
    }//GEN-LAST:event_ingParaMouseExited

    private void ingParaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingParaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ingParaMouseClicked

//===========================================================================================================================================\\

    private void ingTemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingTemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ingTemMouseClicked

    private void ingTemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingTemMouseEntered
        ingTem.setBackground(new java.awt.Color(17,79,148));
    }//GEN-LAST:event_ingTemMouseEntered

    private void ingTemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingTemMouseExited
        ingTem.setBackground(new java.awt.Color(18,90,173));
    }//GEN-LAST:event_ingTemMouseExited

//===========================================================================================================================================\\

    private void ingClaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingClaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ingClaMouseClicked

    private void ingClaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingClaMouseEntered
        ingCla.setBackground(new java.awt.Color(17,79,148));
    }//GEN-LAST:event_ingClaMouseEntered

    private void ingClaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingClaMouseExited
        ingCla.setBackground(new java.awt.Color(18,90,173));
    }//GEN-LAST:event_ingClaMouseExited

//===========================================================================================================================================\\
    
    private void ingHorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingHorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ingHorMouseClicked

    private void ingHorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingHorMouseEntered
        ingHor.setBackground(new java.awt.Color(17,79,148));
    }//GEN-LAST:event_ingHorMouseEntered

    private void ingHorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingHorMouseExited
        ingHor.setBackground(new java.awt.Color(18,90,173));
    }//GEN-LAST:event_ingHorMouseExited

//===========================================================================================================================================\\
    
    private void ingActMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingActMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ingActMouseClicked

    private void ingActMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingActMouseEntered
        ingAct.setBackground(new java.awt.Color(17,79,148));
    }//GEN-LAST:event_ingActMouseEntered

    private void ingActMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingActMouseExited
        ingAct.setBackground(new java.awt.Color(18,90,173));
    }//GEN-LAST:event_ingActMouseExited
 
    
    private void ShowJDialog(javax.swing.JDialog p){
        p.setSize(930, 525);
        p.setLocation(0,0);
        p.setTitle("Datos");
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actividad;
    private javax.swing.JPanel bakground;
    private javax.swing.JLabel clases;
    private javax.swing.JLabel horario;
    private javax.swing.JPanel ingAct;
    private javax.swing.JPanel ingCla;
    private javax.swing.JPanel ingHor;
    private javax.swing.JPanel ingMate;
    private javax.swing.JPanel ingPara;
    private javax.swing.JPanel ingTem;
    private javax.swing.JLabel mate;
    private javax.swing.JLabel paralelos;
    private javax.swing.JLabel temas;
    // End of variables declaration//GEN-END:variables
}
