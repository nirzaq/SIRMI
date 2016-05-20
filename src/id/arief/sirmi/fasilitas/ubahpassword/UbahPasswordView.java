package id.arief.sirmi.fasilitas.ubahpassword;

import id.arief.sirmi.home.HomeView;
import id.arief.sirmi.util.IconUtil;
import id.arief.sirmi.util.MessageUtil;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPasswordField;

/**
 *
 * @author arief-asus
 */
public class UbahPasswordView extends javax.swing.JInternalFrame {

    UbahPasswordController controller = new UbahPasswordController();

    public UbahPasswordView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textKodeUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textPasswordLama = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        textPasswordBaru1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        textPasswordBaru2 = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        buttonSimpan = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();
        checkTampilkanPassword = new javax.swing.JCheckBox();

        setTitle("Ubah Password");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
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

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+13));
        jLabel1.setText("UBAH PASSWORD");
        jPanel1.add(jLabel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Kode User");

        textKodeUser.setEnabled(false);

        jLabel3.setText("Password Lama");

        textPasswordLama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textPasswordLamaKeyReleased(evt);
            }
        });

        jLabel4.setText("Password Baru");

        textPasswordBaru1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textPasswordBaru1KeyReleased(evt);
            }
        });

        jLabel5.setText("Konfirmasi Password Baru");

        textPasswordBaru2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textPasswordBaru2KeyReleased(evt);
            }
        });

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        buttonSimpan.setText("Simpan");
        buttonSimpan.setToolTipText("Simpan");
        buttonSimpan.setEnabled(false);
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });
        jPanel3.add(buttonSimpan);

        buttonReset.setText("Reset");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });
        jPanel3.add(buttonReset);

        buttonKeluar.setText("Keluar");
        buttonKeluar.setToolTipText("Tutup Form Ubah Password");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });
        jPanel3.add(buttonKeluar);

        checkTampilkanPassword.setText("Tampilkan Password");
        checkTampilkanPassword.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkTampilkanPasswordItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkTampilkanPassword)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textKodeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textPasswordLama)
                        .addComponent(textPasswordBaru1)
                        .addComponent(textPasswordBaru2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textKodeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textPasswordLama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textPasswordBaru1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textPasswordBaru2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkTampilkanPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        dispose();
        HomeView.menuItemUbahPassword.setEnabled(true);
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cekFields();
        textKodeUser.setText(HomeView.labelKodeKaryawan.getText());
        buttonSimpan.setIcon(IconUtil.setIconSimpan());
        buttonReset.setIcon(IconUtil.setIconReset());
        buttonKeluar.setIcon(IconUtil.setIconKeluar());
    }//GEN-LAST:event_formInternalFrameOpened

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        textPasswordLama.setText("");
        textPasswordBaru1.setText("");
        textPasswordBaru2.setText("");
        checkTampilkanPassword.setSelected(false);
    }//GEN-LAST:event_buttonResetActionPerformed

    private void textPasswordLamaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPasswordLamaKeyReleased
        cekFields();
    }//GEN-LAST:event_textPasswordLamaKeyReleased

    private void textPasswordBaru1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPasswordBaru1KeyReleased
        String pass1 = String.valueOf(textPasswordBaru1.getPassword());
        String pass2 = String.valueOf(textPasswordBaru2.getPassword());

        if (pass2.equals(pass1)) {
            cekFields();
        } else {
            buttonSimpan.setEnabled(false);
        }
    }//GEN-LAST:event_textPasswordBaru1KeyReleased

    private void textPasswordBaru2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPasswordBaru2KeyReleased
        String pass1 = String.valueOf(textPasswordBaru1.getPassword());
        String pass2 = String.valueOf(textPasswordBaru2.getPassword());

        if (pass2.equals(pass1)) {
            cekFields();
        } else {
            buttonSimpan.setEnabled(false);
        }
    }//GEN-LAST:event_textPasswordBaru2KeyReleased

    private void checkTampilkanPasswordItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkTampilkanPasswordItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            textPasswordLama.setEchoChar('\0');
            textPasswordBaru1.setEchoChar('\0');
            textPasswordBaru2.setEchoChar('\0');
        } else {
            textPasswordLama.setEchoChar('*');
            textPasswordBaru1.setEchoChar('*');
            textPasswordBaru2.setEchoChar('*');
        }
    }//GEN-LAST:event_checkTampilkanPasswordItemStateChanged

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed

        String kodeUser = textKodeUser.getText();
        String passLama = String.copyValueOf(textPasswordLama.getPassword());
        String passBaru = String.copyValueOf(textPasswordBaru2.getPassword());
        if (controller.isPassLamaBenar(kodeUser, passLama)) {
            Password password = new Password();
            password.setKode_user(kodeUser);
            password.setPassLama(passLama);
            password.setPassBaru(passBaru);
            controller.ubahPassword(password);
            MessageUtil.showInfoMessage("Password Telah Diubah!", this);
            HomeView.menuItemUbahPassword.setEnabled(true);
            dispose();
            
        } else {
            MessageUtil.showErrorMessage("Password Lama Anda Tidak Benar!", this);
            textPasswordLama.setText("");
            textPasswordLama.requestFocus();
        }

    }//GEN-LAST:event_buttonSimpanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JCheckBox checkTampilkanPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField textKodeUser;
    private javax.swing.JPasswordField textPasswordBaru1;
    private javax.swing.JPasswordField textPasswordBaru2;
    private javax.swing.JPasswordField textPasswordLama;
    // End of variables declaration//GEN-END:variables
public void cekFields() {
        List<JPasswordField> fields = new ArrayList<>();
        fields.add(textPasswordLama);
        fields.add(textPasswordBaru1);
        fields.add(textPasswordBaru2);

        for (JPasswordField jTextField : fields) {
            if (jTextField.getPassword().length < 1) {
                buttonSimpan.setEnabled(false);
                break;
            } else {
                buttonSimpan.setEnabled(true);
            }
        }

    }
}
