
package id.arief.sirmi.transaksi.tambahuser;

import id.arief.sirmi.home.HomeView;
import static id.arief.sirmi.home.HomeView.desktopPaneUtama;
import java.awt.event.ItemEvent;

/**
 *
 * @author arief-asus
 */
public class TambahUserTU extends javax.swing.JInternalFrame {

    
    public TambahUserTU() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textKodeUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textUsername = new javax.swing.JTextField();
        buttons = new javax.swing.JPanel();
        buttonSimpan = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();
        textPass1 = new javax.swing.JPasswordField();
        textPass2 = new javax.swing.JPasswordField();
        checkTampilPassword = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textKodeKaryawan = new javax.swing.JTextField();
        buttonCariKaryawan = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();

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
        buttons.setLayout(new java.awt.GridLayout());

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

        jLabel3.setText("Password");

        jLabel4.setText("Kode Karyawan");

        textKodeKaryawan.setEnabled(false);

        buttonCariKaryawan.setText("Cari");
        buttonCariKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariKaryawanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(177, Short.MAX_VALUE)
                        .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkTampilPassword)
                            .addComponent(textKodeUser)
                            .addComponent(textUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(textPass1)
                            .addComponent(textPass2, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(textKodeKaryawan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCariKaryawan)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textKodeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textKodeKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCariKaryawan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkTampilPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelTitle.setFont(labelTitle.getFont().deriveFont(labelTitle.getFont().getStyle() | java.awt.Font.BOLD, labelTitle.getFont().getSize()+13));
        labelTitle.setText("TAMBAH USER");
        jPanel2.add(labelTitle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textUsernameKeyReleased
        cekFields();
    }//GEN-LAST:event_textUsernameKeyReleased

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed

    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed

    }//GEN-LAST:event_buttonResetActionPerformed

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        TambahUserView view = new TambahUserView();
        desktopPaneUtama.add(view);
        HomeView.menuItemTambahUser.setEnabled(false);
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonKeluarActionPerformed

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

    private void checkTampilPasswordItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkTampilPasswordItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            textPass1.setEchoChar('\0');
            textPass2.setEchoChar('\0');

        } else {
            textPass1.setEchoChar('*');
            textPass2.setEchoChar('*');
        }
    }//GEN-LAST:event_checkTampilPasswordItemStateChanged

    private void buttonCariKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariKaryawanActionPerformed

    }//GEN-LAST:event_buttonCariKaryawanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton buttonCariKaryawan;
    private javax.swing.JButton buttonKeluar;
    private static javax.swing.JButton buttonReset;
    public static javax.swing.JButton buttonSimpan;
    private javax.swing.JPanel buttons;
    private javax.swing.JCheckBox checkTampilPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel labelTitle;
    public static javax.swing.JTextField textKodeKaryawan;
    public static javax.swing.JTextField textKodeUser;
    public static javax.swing.JPasswordField textPass1;
    public static javax.swing.JPasswordField textPass2;
    public static javax.swing.JTextField textUsername;
    // End of variables declaration//GEN-END:variables

    private void cekFields() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
