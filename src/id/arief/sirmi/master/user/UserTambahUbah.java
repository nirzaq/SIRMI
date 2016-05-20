package id.arief.sirmi.master.user;

import id.arief.sirmi.home.HomeView;
import id.arief.sirmi.master.mobil.*;
import id.arief.sirmi.util.BatasKarakter;
import id.arief.sirmi.util.MessageUtil;
import static id.arief.sirmi.home.HomeView.desktopPaneUtama;
import id.arief.sirmi.util.IconUtil;
import java.awt.event.ItemEvent;

/**
 *
 * @author arief-asus
 */
public class UserTambahUbah extends javax.swing.JInternalFrame {

    MobilController mobilPresenter = new MobilController();

    public UserTambahUbah() {
        initComponents();
        setBatasKarakter();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textKodeUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textUsername = new javax.swing.JTextField();
        buttons = new javax.swing.JPanel();
        buttonSimpan = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textPass1 = new javax.swing.JPasswordField();
        textPass2 = new javax.swing.JPasswordField();
        checkTampilPassword = new javax.swing.JCheckBox();
        labelError = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(551, 432));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Kode User");

        textKodeUser.setText("<Otomatis>");
        textKodeUser.setEnabled(false);

        jLabel2.setText("Username");

        textUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textUsernameKeyReleased(evt);
            }
        });

        buttons.setPreferredSize(new java.awt.Dimension(355, 25));
        buttons.setLayout(new java.awt.GridLayout(1, 0));

        buttonSimpan.setText("Simpan");
        buttonSimpan.setToolTipText("Simpan");
        buttonSimpan.setEnabled(false);
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });
        buttons.add(buttonSimpan);

        buttonReset.setText("Reset");
        buttonReset.setToolTipText("Bersihkan Field");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });
        buttons.add(buttonReset);

        buttonKeluar.setText("Keluar");
        buttonKeluar.setToolTipText("Tutup Form");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });
        buttons.add(buttonKeluar);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Password"));

        jLabel3.setText("Password");

        textPass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textPass1KeyReleased(evt);
            }
        });

        textPass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textPass2KeyReleased(evt);
            }
        });

        checkTampilPassword.setText("Tampilkan Password");
        checkTampilPassword.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkTampilPasswordItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(checkTampilPassword)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(textPass2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(textPass1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(checkTampilPassword))
        );

        labelError.setText("jLabel4");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(171, Short.MAX_VALUE)
                        .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textKodeUser)
                            .addComponent(textUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelError)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textKodeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelTitle.setFont(labelTitle.getFont().deriveFont(labelTitle.getFont().getStyle() | java.awt.Font.BOLD, labelTitle.getFont().getSize()+13));
        labelTitle.setText("MASTER USER");
        jPanel2.add(labelTitle);

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(Container, java.awt.BorderLayout.CENTER);
        Container.getAccessibleContext().setAccessibleName("");
        Container.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        buttonSimpan.setIcon(IconUtil.setIconSimpan());
        buttonReset.setIcon(IconUtil.setIconReset());
        buttonKeluar.setIcon(IconUtil.setIconKeluar());
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated

    }//GEN-LAST:event_formInternalFrameActivated

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        UserView userView = new UserView();
        desktopPaneUtama.add(userView);
        HomeView.menuItemTambahUser.setEnabled(false);
        userView.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed

    }//GEN-LAST:event_buttonResetActionPerformed

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed


    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void textUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textUsernameKeyReleased
        cekFields();
    }//GEN-LAST:event_textUsernameKeyReleased

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentMoved

    private void checkTampilPasswordItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkTampilPasswordItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            textPass1.setEchoChar('\0');
            textPass2.setEchoChar('\0');

        } else {
            textPass1.setEchoChar('*');
            textPass2.setEchoChar('*');
        }
    }//GEN-LAST:event_checkTampilPasswordItemStateChanged

    private void textPass1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPass1KeyReleased
        String pass1 = String.valueOf(textPass1.getPassword());
        String pass2 = String.valueOf(textPass2.getPassword());
        
        if (pass2.equals(pass1)) {
        cekFields();
        } else {
           buttonSimpan.setEnabled(false);
        }
    }//GEN-LAST:event_textPass1KeyReleased

    private void textPass2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPass2KeyReleased
        String pass1 = String.valueOf(textPass1.getPassword());
        String pass2 = String.valueOf(textPass2.getPassword());
        
        if (pass2.equals(pass1)) {
        cekFields();
        } else {
           buttonSimpan.setEnabled(false);
        }
    }//GEN-LAST:event_textPass2KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JButton buttonKeluar;
    private static javax.swing.JButton buttonReset;
    public static javax.swing.JButton buttonSimpan;
    private javax.swing.JPanel buttons;
    private javax.swing.JCheckBox checkTampilPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelError;
    public static javax.swing.JLabel labelTitle;
    public static javax.swing.JTextField textKodeUser;
    public static javax.swing.JPasswordField textPass1;
    public static javax.swing.JPasswordField textPass2;
    public static javax.swing.JTextField textUsername;
    // End of variables declaration//GEN-END:variables
public final void setBatasKarakter() {
        textUsername.setDocument(new BatasKarakter(10));
    }

    public static void clearField() {
        textUsername.setText("");
        textPass1.setText("");
        textPass2.setText("");
        textUsername.requestFocus();
        buttonSimpan.setEnabled(false);
    }

    private void showErrorDataDuplikat() {
        MessageUtil.showErrorMessage("Mobil dengan nopol " + textUsername.getText() + " sudah ada!", this);

        textUsername.requestFocus();
    }

    public void cekFields() {
        if (textUsername.getText().length() < 1 || textPass1.getPassword().length < 1 || textPass2.getPassword().length < 1) {
            buttonSimpan.setEnabled(false);
        } else {
            buttonSimpan.setEnabled(true);
        }

    }

}
