package id.arief.sirmi.home;

import id.arief.sirmi.util.MessageUtil;
import id.arief.sirmi.util.ViewUtil;
import id.arief.sirmi.fasilitas.ubahpassword.UbahPasswordView;
import id.arief.sirmi.master.goltarif.GolTarifView;
import id.arief.sirmi.master.mobil.MobilView;
import id.arief.sirmi.master.user.UserView;
import id.arief.sirmi.transaksi.penyewaan.TransaksiPenyewaanView;
import id.arief.sirmi.transaksi.tarifmobil.TarifView;
import id.arief.sirmi.util.IconUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Asus
 */
public class HomeView extends javax.swing.JFrame {
    Timer timer;
    /**
     * Creates new form HomeView
     */
    public HomeView() {
        initComponents();
        tanggalSekarang();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        desktopPaneUtama = new javax.swing.JDesktopPane();
        labelTanggal = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMaster = new javax.swing.JMenu();
        menuItemMasterMobil = new javax.swing.JMenuItem();
        menuItemMasterUser = new javax.swing.JMenuItem();
        menuItemTarif = new javax.swing.JMenuItem();
        menuTransaksi = new javax.swing.JMenu();
        menuItemTarifMobil = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuItemPenyewaan = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        menuItemUbahPassword = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistem Informasi Rental Mobil Indra");
        setFocusTraversalPolicyProvider(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        desktopPaneUtama.setBackground(new java.awt.Color(0, 204, 204));
        desktopPaneUtama.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                desktopPaneUtamaComponentAdded(evt);
            }
        });

        labelTanggal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTanggal.setForeground(new java.awt.Color(255, 255, 255));
        labelTanggal.setText("Tanggal");

        labelUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(255, 255, 255));
        labelUsername.setText("Username");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User :");

        desktopPaneUtama.setLayer(labelTanggal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPaneUtama.setLayer(labelUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPaneUtama.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneUtamaLayout = new javax.swing.GroupLayout(desktopPaneUtama);
        desktopPaneUtama.setLayout(desktopPaneUtamaLayout);
        desktopPaneUtamaLayout.setHorizontalGroup(
            desktopPaneUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1081, Short.MAX_VALUE)
                .addComponent(labelTanggal)
                .addContainerGap())
        );
        desktopPaneUtamaLayout.setVerticalGroup(
            desktopPaneUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(desktopPaneUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsername)
                    .addComponent(jLabel2)
                    .addComponent(labelTanggal))
                .addContainerGap(499, Short.MAX_VALUE))
        );

        jButton1.setText("jButton1");

        menuMaster.setMnemonic('m');
        menuMaster.setText("Master");

        menuItemMasterMobil.setText("Mobil");
        menuItemMasterMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMasterMobilActionPerformed(evt);
            }
        });
        menuMaster.add(menuItemMasterMobil);

        menuItemMasterUser.setText("User");
        menuItemMasterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMasterUserActionPerformed(evt);
            }
        });
        menuMaster.add(menuItemMasterUser);

        menuItemTarif.setText("Tarif");
        menuItemTarif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTarifActionPerformed(evt);
            }
        });
        menuMaster.add(menuItemTarif);

        jMenuBar1.add(menuMaster);

        menuTransaksi.setMnemonic('t');
        menuTransaksi.setText("Transaksi");

        menuItemTarifMobil.setText("Tarif Mobil");
        menuItemTarifMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTarifMobilActionPerformed(evt);
            }
        });
        menuTransaksi.add(menuItemTarifMobil);

        jMenuItem1.setText("Registrasi Pelanggan");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuTransaksi.add(jMenuItem1);

        menuItemPenyewaan.setText("Penyewaan Mobil");
        menuItemPenyewaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPenyewaanActionPerformed(evt);
            }
        });
        menuTransaksi.add(menuItemPenyewaan);

        jMenuItem4.setText("Pengembalian Mobil");
        menuTransaksi.add(jMenuItem4);

        jMenuBar1.add(menuTransaksi);

        jMenu3.setMnemonic('l');
        jMenu3.setText("Laporan");
        jMenuBar1.add(jMenu3);

        jMenu4.setMnemonic('a');
        jMenu4.setText("Fasilitas");

        menuItemUbahPassword.setText("Ubah Password");
        menuItemUbahPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUbahPasswordActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemUbahPassword);

        jMenuBar1.add(jMenu4);

        jMenu1.setText("Keluar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPaneUtama)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPaneUtama)
        );

        desktopPaneUtama.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void tanggalSekarang() {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE | dd MMMM yyyy | HH:mm:ss");
        String tgl = simpleDateFormat.format(now);
        labelTanggal.setText(tgl);
        
        ActionListener ActionInfoWaktu = (ActionEvent e) -> {
            labelTanggal.setText(ViewUtil.showDateNow()+ViewUtil.showTimeNow());
        };
        timer = new Timer(1000, ActionInfoWaktu);
        timer.start();
        
    }
    private void menuItemMasterMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMasterMobilActionPerformed
        MobilView mobilView = new MobilView();
        desktopPaneUtama.add(mobilView);
        menuItemMasterMobil.setEnabled(false);
        mobilView.setVisible(true);
    }//GEN-LAST:event_menuItemMasterMobilActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int confirm;
        confirm = MessageUtil.showConfirmMessage("Apakah anda ingin keluar dari aplikasi?", this);
        if (confirm == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void menuItemUbahPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUbahPasswordActionPerformed
        UbahPasswordView ubahPasswordView = new UbahPasswordView();
        desktopPaneUtama.add(ubahPasswordView);
        menuItemUbahPassword.setEnabled(false);
        ubahPasswordView.setVisible(true);
    }//GEN-LAST:event_menuItemUbahPasswordActionPerformed

    private void desktopPaneUtamaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_desktopPaneUtamaComponentAdded
        ViewUtil.moveOff(desktopPaneUtama);
        ViewUtil.makeCenter(desktopPaneUtama);
    }//GEN-LAST:event_desktopPaneUtamaComponentAdded

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuItemMasterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMasterUserActionPerformed
        UserView userView = new UserView();
        desktopPaneUtama.add(userView);
        menuItemMasterUser.setEnabled(false);
        userView.setVisible(true);
    }//GEN-LAST:event_menuItemMasterUserActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        setExtendedState(HomeView.MAXIMIZED_BOTH);
        if (labelUsername.getText().equals("degea")) {
            menuMaster.setEnabled(false);
            menuItemTarifMobil.setEnabled(false);
        } else {
            menuMaster.setEnabled(true);
            menuItemTarifMobil.setEnabled(true);
        }
        
        
    }//GEN-LAST:event_formComponentShown

    private void menuItemTarifMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTarifMobilActionPerformed
        TarifView tarifView = new TarifView();
        desktopPaneUtama.add(tarifView);
        menuItemTarifMobil.setEnabled(false);
        tarifView.setVisible(true);
    }//GEN-LAST:event_menuItemTarifMobilActionPerformed

    private void menuItemTarifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTarifActionPerformed
        GolTarifView golTarifView = new GolTarifView();
        desktopPaneUtama.add(golTarifView);
        menuItemTarif.setEnabled(false);
        golTarifView.setVisible(true);
    }//GEN-LAST:event_menuItemTarifActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        MessageUtil.showInfoMessage("Testing", this);
        
    }//GEN-LAST:event_jMenu1MouseClicked

    private void menuItemPenyewaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPenyewaanActionPerformed
        TransaksiPenyewaanView tpv = new TransaksiPenyewaanView();
        desktopPaneUtama.add(tpv);
        menuItemPenyewaan.setEnabled(false);
        tpv.setVisible(true);
    }//GEN-LAST:event_menuItemPenyewaanActionPerformed

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
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HomeView().setVisible(true);
        });
    }
    //<editor-fold defaultstate="collapsed" desc="Variables Declaration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane desktopPaneUtama;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JLabel labelTanggal;
    public static javax.swing.JLabel labelUsername;
    public static javax.swing.JMenuItem menuItemMasterMobil;
    public static javax.swing.JMenuItem menuItemMasterUser;
    public static javax.swing.JMenuItem menuItemPenyewaan;
    private javax.swing.JMenuItem menuItemTarif;
    public static javax.swing.JMenuItem menuItemTarifMobil;
    public static javax.swing.JMenuItem menuItemUbahPassword;
    public static javax.swing.JMenu menuMaster;
    private javax.swing.JMenu menuTransaksi;
    // End of variables declaration//GEN-END:variables
 //</editor-fold>
}