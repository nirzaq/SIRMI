package id.arief.sirmi.login;

import id.arief.sirmi.util.IconUtil;
import id.arief.sirmi.util.MessageUtil;
import id.arief.sirmi.home.HomeView;
import static id.arief.sirmi.home.HomeView.labelUsername;
import static id.arief.sirmi.home.HomeView.menuItemTarifMobil;
import static id.arief.sirmi.home.HomeView.menuMaster;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Asus
 */
public class LoginView extends javax.swing.JFrame {

    private final LoginController loginPresenter = new LoginController();
    int retry_max = 3;
    int retry_login = 0;

    /**
     * Creates new form LoginForm
     */
    public LoginView() {
        initComponents();
        buttonKeluar.setIcon(IconUtil.setIconKeluar());
        buttonLogin.setIcon(IconUtil.setIconMasuk());
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(buttonLogin);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textUser = new javax.swing.JTextField();
        checkTampilkanSandi = new javax.swing.JCheckBox();
        textPasswordLogin = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        buttonLogin = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("User");

        jLabel2.setText("Password");

        textUser.setToolTipText("User");

        checkTampilkanSandi.setMnemonic('t');
        checkTampilkanSandi.setText("Tampilkan Password");
        checkTampilkanSandi.setToolTipText("Tampilkan Password Anda");
        checkTampilkanSandi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkTampilkanSandiItemStateChanged(evt);
            }
        });

        textPasswordLogin.setToolTipText("Password Anda");

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        buttonLogin.setMnemonic('l');
        buttonLogin.setText("Login");
        buttonLogin.setToolTipText("Login Ke Aplikasi");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(buttonLogin);

        buttonKeluar.setMnemonic('k');
        buttonKeluar.setText("Keluar");
        buttonKeluar.setToolTipText("Keluar Dari Aplikasi");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonKeluar);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(167, 43));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Login");
        jPanel3.add(jLabel3, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(checkTampilkanSandi)
                                    .addComponent(textUser, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(textPasswordLogin))))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkTampilkanSandi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed

        if (textUser.getText().equals("")) {
            MessageUtil.showWarningMessage("Username belum diisi!", this);
            textUser.requestFocus();
        } else if (textPasswordLogin.getPassword().length == 0) {
            MessageUtil.showWarningMessage("Password belum diisi!", this);
            textPasswordLogin.requestFocus();
        } else {
            retry_login++;
            login();
        }
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void checkTampilkanSandiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkTampilkanSandiItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            textPasswordLogin.setEchoChar('\0');
        } else {
            textPasswordLogin.setEchoChar('*');
        }
    }//GEN-LAST:event_checkTampilkanSandiItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {// UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if (info.getName().equals("Nimbus")) {
                        UIManager.setLookAndFeel(info.getClassName());
                        UIDefaults defaults = UIManager.getLookAndFeelDefaults();
                        defaults.put("Table.gridColor", new Color(0, 0, 0));
                        defaults.put("Table.disabled", false);
                        defaults.put("Table.showGrid", true);
                        defaults.put("Table.intercellSpacing", new Dimension(1, 1));
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                //e.printStackTrace();
            }
            new LoginView().setVisible(true);
        });
    }

    private void login() {
        if (retry_login > 3) {
            MessageUtil.showErrorMessage("Anda telah salah lebih dari 3x memasukkan username dan password, sistem akan berhenti", this);
            System.exit(0);
        } else {
            try {
                String username = textUser.getText();
                String password = String.copyValueOf(textPasswordLogin.getPassword());

                Login login = loginPresenter.getLoginDanHakAkses(username, password);

                if (login.getKode_karyawan().equals("TIDAK ADA")) {
                    JOptionPane.showMessageDialog(this, "username atau password salah");
                } else {
                    //Tutup Form Login
                    this.dispose();
                    //Buka Form Utama
                    //Cek Hak Akses
                    String hak_akses = login.getKategori_user();
                    String kode_karyawan = login.getKode_karyawan();
                    if (hak_akses.equals("Karyawan")) {
                        HomeView homeView = new HomeView();
                        labelUsername.setText(username);
                        HomeView.labelKodeKaryawan.setText(kode_karyawan);
                        HomeView.labelHakAkses.setText("Karyawan");
                        homeView.setVisible(true);
                    } else {
                        HomeView homeView = new HomeView();
                        labelUsername.setText(username);
                        HomeView.labelKodeKaryawan.setText(kode_karyawan);
                         HomeView.labelHakAkses.setText("Admin");
                        homeView.setVisible(true);
                    }
                }
            } catch (Exception exception) {
                System.out.print(exception);
                MessageUtil.showInfoMessage("Sistem Akan Berhenti...", this);
                System.exit(0);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JCheckBox checkTampilkanSandi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField textPasswordLogin;
    private javax.swing.JTextField textUser;
    // End of variables declaration//GEN-END:variables
}
