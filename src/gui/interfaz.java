package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.swing.ImageIcon;

import profesor.Usuario;

public class interfaz extends javax.swing.JFrame {

    Color marino = new Color(20,96,179) ;
    Color celestito = new Color(21,101,187);
    
    public interfaz(Usuario user) {
        initComponents();
        SetDate();
        InitContent();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/logoConFondo.png")).getImage());
        name.setText(user.getNombres());
        lastName.setText(user.getApellidos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        BrrVertical = new javax.swing.JPanel();
        Tittle = new javax.swing.JLabel();
        BtnDatos = new javax.swing.JPanel();
        IngDatos = new javax.swing.JLabel();
        BtnCalen = new javax.swing.JPanel();
        Calen = new javax.swing.JLabel();
        BtnEditDate = new javax.swing.JPanel();
        EditDate = new javax.swing.JLabel();
        BtnParalelo = new javax.swing.JPanel();
        Paralelo = new javax.swing.JLabel();
        BtnMateria = new javax.swing.JPanel();
        Materia = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        name = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        IDprofe = new javax.swing.JLabel();
        PnlAyuda = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        BtnAyuda = new javax.swing.JPanel();
        Ayuda = new javax.swing.JLabel();
        BrrHorizontal = new javax.swing.JPanel();
        DateText = new javax.swing.JLabel();
        phoaNoti = new javax.swing.JPanel();
        Photo = new javax.swing.JPanel();
        BtnNoti = new javax.swing.JPanel();
        noti = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1165, 700));
        setSize(new java.awt.Dimension(0, 0));

        background.setBackground(new java.awt.Color(255, 255, 255));

        BrrVertical.setBackground(new java.awt.Color(13, 71, 155));
        BrrVertical.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BrrVertical.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        Tittle.setBackground(new java.awt.Color(0, 0, 0));
        Tittle.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        Tittle.setForeground(new java.awt.Color(255, 255, 255));
        Tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tittle.setText("Bienvenido");
        Tittle.setToolTipText("");

        BtnDatos.setBackground(new java.awt.Color(21, 101, 187));
        BtnDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDatos.setPreferredSize(new java.awt.Dimension(219, 50));
        BtnDatos.setRequestFocusEnabled(false);
        BtnDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDatosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnDatosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnDatosMouseExited(evt);
            }
        });

        IngDatos.setBackground(new java.awt.Color(255, 255, 255));
        IngDatos.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        IngDatos.setForeground(new java.awt.Color(255, 255, 255));
        IngDatos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IngDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/date1.png"))); // NOI18N
        IngDatos.setText("Ingresar Datos");
        IngDatos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(21, 101, 187)));
        IngDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IngDatos.setIconTextGap(15);
        IngDatos.setPreferredSize(new java.awt.Dimension(220, 42));

        javax.swing.GroupLayout BtnDatosLayout = new javax.swing.GroupLayout(BtnDatos);
        BtnDatos.setLayout(BtnDatosLayout);
        BtnDatosLayout.setHorizontalGroup(
            BtnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnDatosLayout.createSequentialGroup()
                .addComponent(IngDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BtnDatosLayout.setVerticalGroup(
            BtnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IngDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        BtnCalen.setBackground(new java.awt.Color(21, 101, 187));
        BtnCalen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCalen.setPreferredSize(new java.awt.Dimension(219, 50));
        BtnCalen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnCalenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnCalenMouseExited(evt);
            }
        });

        Calen.setBackground(new java.awt.Color(21, 101, 187));
        Calen.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        Calen.setForeground(new java.awt.Color(255, 255, 255));
        Calen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calen.png"))); // NOI18N
        Calen.setText("Horario");
        Calen.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 9, 1, 1, new java.awt.Color(21, 101, 187)));
        Calen.setIconTextGap(16);
        Calen.setMaximumSize(new java.awt.Dimension(143, 50));
        Calen.setMinimumSize(new java.awt.Dimension(143, 50));
        Calen.setPreferredSize(new java.awt.Dimension(143, 50));

        javax.swing.GroupLayout BtnCalenLayout = new javax.swing.GroupLayout(BtnCalen);
        BtnCalen.setLayout(BtnCalenLayout);
        BtnCalenLayout.setHorizontalGroup(
            BtnCalenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnCalenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Calen, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BtnCalenLayout.setVerticalGroup(
            BtnCalenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnCalenLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Calen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        BtnEditDate.setBackground(new java.awt.Color(21, 101, 187));
        BtnEditDate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEditDate.setPreferredSize(new java.awt.Dimension(220, 50));
        BtnEditDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnEditDateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnEditDateMouseExited(evt);
            }
        });

        EditDate.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        EditDate.setForeground(new java.awt.Color(255, 255, 255));
        EditDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit.png"))); // NOI18N
        EditDate.setText("Editar Datos");
        EditDate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(21, 101, 187)));
        EditDate.setIconTextGap(15);

        javax.swing.GroupLayout BtnEditDateLayout = new javax.swing.GroupLayout(BtnEditDate);
        BtnEditDate.setLayout(BtnEditDateLayout);
        BtnEditDateLayout.setHorizontalGroup(
            BtnEditDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EditDate, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        BtnEditDateLayout.setVerticalGroup(
            BtnEditDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EditDate, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        BtnParalelo.setBackground(new java.awt.Color(21, 101, 187));
        BtnParalelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnParalelo.setPreferredSize(new java.awt.Dimension(220, 50));
        BtnParalelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnParaleloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnParaleloMouseExited(evt);
            }
        });

        Paralelo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Paralelo.setForeground(new java.awt.Color(255, 255, 255));
        Paralelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Curso.png"))); // NOI18N
        Paralelo.setText("Paralelo");
        Paralelo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(21, 101, 187)));
        Paralelo.setIconTextGap(15);

        javax.swing.GroupLayout BtnParaleloLayout = new javax.swing.GroupLayout(BtnParalelo);
        BtnParalelo.setLayout(BtnParaleloLayout);
        BtnParaleloLayout.setHorizontalGroup(
            BtnParaleloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Paralelo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        BtnParaleloLayout.setVerticalGroup(
            BtnParaleloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Paralelo, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        BtnMateria.setBackground(new java.awt.Color(21, 101, 187));
        BtnMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMateria.setPreferredSize(new java.awt.Dimension(220, 50));
        BtnMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnMateriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnMateriaMouseExited(evt);
            }
        });

        Materia.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Materia.setForeground(new java.awt.Color(255, 255, 255));
        Materia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Materia.png"))); // NOI18N
        Materia.setText("Materia");
        Materia.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(21, 101, 187)));
        Materia.setIconTextGap(15);

        javax.swing.GroupLayout BtnMateriaLayout = new javax.swing.GroupLayout(BtnMateria);
        BtnMateria.setLayout(BtnMateriaLayout);
        BtnMateriaLayout.setHorizontalGroup(
            BtnMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Materia, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        BtnMateriaLayout.setVerticalGroup(
            BtnMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Materia, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        name.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name.setText("{name}");

        lastName.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lastName.setForeground(new java.awt.Color(255, 255, 255));
        lastName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lastName.setText("{lastName}");

        IDprofe.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        IDprofe.setForeground(new java.awt.Color(255, 255, 255));
        IDprofe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IDprofe.setText("ID{ejemplo xd}");

        PnlAyuda.setBackground(new java.awt.Color(13, 71, 155));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        BtnAyuda.setBackground(new java.awt.Color(13, 71, 155));
        BtnAyuda.setToolTipText("Ayuda");
        BtnAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAyuda.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnAyudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnAyudaMouseExited(evt);
            }
        });

        Ayuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ayuda.png"))); // NOI18N

        javax.swing.GroupLayout BtnAyudaLayout = new javax.swing.GroupLayout(BtnAyuda);
        BtnAyuda.setLayout(BtnAyudaLayout);
        BtnAyudaLayout.setHorizontalGroup(
            BtnAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnAyudaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Ayuda, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );
        BtnAyudaLayout.setVerticalGroup(
            BtnAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout PnlAyudaLayout = new javax.swing.GroupLayout(PnlAyuda);
        PnlAyuda.setLayout(PnlAyudaLayout);
        PnlAyudaLayout.setHorizontalGroup(
            PnlAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(PnlAyudaLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(BtnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PnlAyudaLayout.setVerticalGroup(
            PnlAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAyudaLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );

        javax.swing.GroupLayout BrrVerticalLayout = new javax.swing.GroupLayout(BrrVertical);
        BrrVertical.setLayout(BrrVerticalLayout);
        BrrVerticalLayout.setHorizontalGroup(
            BrrVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BrrVerticalLayout.createSequentialGroup()
                .addGroup(BrrVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BrrVerticalLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BrrVerticalLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(IDprofe, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCalen, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(BtnEditDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnParalelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BrrVerticalLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(BrrVerticalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BrrVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BrrVerticalLayout.createSequentialGroup()
                        .addComponent(PnlAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BrrVerticalLayout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        BrrVerticalLayout.setVerticalGroup(
            BrrVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BrrVerticalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(BrrVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(IDprofe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(BrrVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BrrVerticalLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(BtnCalen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(BtnEditDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BtnParalelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BtnMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(PnlAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BrrHorizontal.setBackground(new java.awt.Color(24, 118, 205));

        DateText.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        DateText.setForeground(new java.awt.Color(255, 255, 255));
        DateText.setText("Hoy es {dayname} {day} de {month} de {year}");

        phoaNoti.setBackground(new java.awt.Color(24, 118, 205));
        phoaNoti.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        phoaNoti.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout PhotoLayout = new javax.swing.GroupLayout(Photo);
        Photo.setLayout(PhotoLayout);
        PhotoLayout.setHorizontalGroup(
            PhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        PhotoLayout.setVerticalGroup(
            PhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        phoaNoti.add(Photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 10, 120, 120));

        BtnNoti.setBackground(new java.awt.Color(24, 118, 205));
        BtnNoti.setPreferredSize(new java.awt.Dimension(27, 30));
        BtnNoti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnNotiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnNotiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnNotiMouseExited(evt);
            }
        });

        noti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Notif.png"))); // NOI18N

        javax.swing.GroupLayout BtnNotiLayout = new javax.swing.GroupLayout(BtnNoti);
        BtnNoti.setLayout(BtnNotiLayout);
        BtnNotiLayout.setHorizontalGroup(
            BtnNotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(noti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BtnNotiLayout.setVerticalGroup(
            BtnNotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnNotiLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(noti, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        phoaNoti.add(BtnNoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        javax.swing.GroupLayout BrrHorizontalLayout = new javax.swing.GroupLayout(BrrHorizontal);
        BrrHorizontal.setLayout(BrrHorizontalLayout);
        BrrHorizontalLayout.setHorizontalGroup(
            BrrHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BrrHorizontalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(DateText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(phoaNoti, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BrrHorizontalLayout.setVerticalGroup(
            BrrHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BrrHorizontalLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(DateText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(phoaNoti, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );

        Content.setBackground(new java.awt.Color(204, 204, 204));
        Content.setPreferredSize(new java.awt.Dimension(808, 454));
        Content.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(BrrVertical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addComponent(BrrHorizontal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BrrVertical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(BrrHorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
//===========================================================================================================================================\\

    private void BtnDatosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDatosMouseEntered
        BtnDatos.setBackground(marino);
    }//GEN-LAST:event_BtnDatosMouseEntered

    private void BtnDatosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDatosMouseExited
        BtnDatos.setBackground(celestito);
    }//GEN-LAST:event_BtnDatosMouseExited

//===========================================================================================================================================\\

    private void BtnCalenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCalenMouseEntered
        BtnCalen.setBackground(marino);
    }//GEN-LAST:event_BtnCalenMouseEntered

    private void BtnCalenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCalenMouseExited
        BtnCalen.setBackground(celestito);
    }//GEN-LAST:event_BtnCalenMouseExited

//===========================================================================================================================================\\    
    private void BtnAyudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAyudaMouseEntered
        BtnAyuda.setBackground(new Color(21,101,187));
    }//GEN-LAST:event_BtnAyudaMouseEntered

    private void BtnAyudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAyudaMouseExited
        BtnAyuda.setBackground(new Color(13,71,155));
    }//GEN-LAST:event_BtnAyudaMouseExited

//===========================================================================================================================================\\    
    private void BtnEditDateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEditDateMouseEntered
        BtnEditDate.setBackground(marino);
    }//GEN-LAST:event_BtnEditDateMouseEntered

    private void BtnEditDateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEditDateMouseExited
        BtnEditDate.setBackground(celestito);
    }//GEN-LAST:event_BtnEditDateMouseExited

    private void BtnParaleloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnParaleloMouseEntered
        BtnParalelo.setBackground(marino);
    }//GEN-LAST:event_BtnParaleloMouseEntered

    private void BtnParaleloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnParaleloMouseExited
        BtnParalelo.setBackground(celestito);
    }//GEN-LAST:event_BtnParaleloMouseExited

    private void BtnMateriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMateriaMouseEntered
        BtnMateria.setBackground(marino);
    }//GEN-LAST:event_BtnMateriaMouseEntered

    private void BtnMateriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMateriaMouseExited
        BtnMateria.setBackground(celestito);        
    }//GEN-LAST:event_BtnMateriaMouseExited

    private void BtnNotiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNotiMouseEntered
        BtnNoti.setBackground(new Color(21,101,187));
    }//GEN-LAST:event_BtnNotiMouseEntered

    private void BtnNotiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNotiMouseExited
       BtnNoti.setBackground(new Color(24,118,205));
    }//GEN-LAST:event_BtnNotiMouseExited

    private void BtnDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDatosMouseClicked
        ShowJPanel(new ingDatos());
    }//GEN-LAST:event_BtnDatosMouseClicked

    private void BtnNotiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNotiMouseClicked
        ShowJPanel(new Notif());
    }//GEN-LAST:event_BtnNotiMouseClicked
   
    private void InitContent(){
        ShowJPanel(new Notif());
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz(null).setVisible(true);
            }
        });
    }

    
    private void ShowJPanel(javax.swing.JPanel p){
        p.setSize(930, 525);
        p.setLocation(0,0);
        
        Content.removeAll();
        Content.add(p,BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }
    
    private void SetDate(){
        LocalDate now = LocalDate.now();
        Locale spanish = new Locale("es","ES");
        DateText.setText(now.format(DateTimeFormatter.ofPattern("'Es' EEEE dd 'de' MMMM 'de' yyyy", spanish)));
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ayuda;
    private javax.swing.JPanel BrrHorizontal;
    private javax.swing.JPanel BrrVertical;
    private javax.swing.JPanel BtnAyuda;
    private javax.swing.JPanel BtnCalen;
    private javax.swing.JPanel BtnDatos;
    private javax.swing.JPanel BtnEditDate;
    private javax.swing.JPanel BtnMateria;
    private javax.swing.JPanel BtnNoti;
    private javax.swing.JPanel BtnParalelo;
    private javax.swing.JLabel Calen;
    private javax.swing.JPanel Content;
    private javax.swing.JLabel DateText;
    private javax.swing.JLabel EditDate;
    private javax.swing.JLabel IDprofe;
    private javax.swing.JLabel IngDatos;
    private javax.swing.JLabel Materia;
    private javax.swing.JLabel Paralelo;
    private javax.swing.JPanel Photo;
    private javax.swing.JPanel PnlAyuda;
    private javax.swing.JLabel Tittle;
    private javax.swing.JPanel background;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lastName;
    private javax.swing.JLabel name;
    private javax.swing.JLabel noti;
    private javax.swing.JPanel phoaNoti;
    // End of variables declaration//GEN-END:variables

    

}
