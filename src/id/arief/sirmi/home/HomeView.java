package id.arief.sirmi.home;

import id.arief.sirmi.util.MessageUtil;
import id.arief.sirmi.util.ViewUtil;
import id.arief.sirmi.fasilitas.ubahpassword.UbahPasswordView;
import id.arief.sirmi.master.goltarif.GolTarifView;
import id.arief.sirmi.master.karyawan.KaryawanView;
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
        viewSetup();
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
        labelKodeKaryawan = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        labelHakAkses = new javax.swing.JLabel();
        labelTitle1 = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        labelAlamat1 = new javax.swing.JLabel();
        labelIconMobil = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMaster = new javax.swing.JMenu();
        menuItemKaryawan = new javax.swing.JMenuItem();
        menuItemMasterMobil = new javax.swing.JMenuItem();
        menuItemTarif = new javax.swing.JMenuItem();
        menuTransaksi = new javax.swing.JMenu();
        menuItemTambahUser = new javax.swing.JMenuItem();
        menuItemTarifMobil = new javax.swing.JMenuItem();
        menuItemPenyewaan = new javax.swing.JMenuItem();
        menuItemPengembalian = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuItemLaporanDataMaster = new javax.swing.JMenuItem();
        menuItemTransaksi = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuItemUbahPassword = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuItemKeluar = new javax.swing.JMenuItem();
        menuItemTentang = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistem Informasi Rental Mobil Indra");
        setFocusTraversalPolicyProvider(true);
        setUndecorated(true);
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

        labelKodeKaryawan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelKodeKaryawan.setForeground(new java.awt.Color(255, 255, 255));
        labelKodeKaryawan.setText("kode Karyawan");

        labelTitle.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("SISTEM INFORMASI RENTAL MOBIL");

        labelHakAkses.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelHakAkses.setForeground(new java.awt.Color(255, 255, 255));
        labelHakAkses.setText("Hak Akses");

        labelTitle1.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        labelTitle1.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle1.setText("indra banjarbaru");

        labelAlamat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelAlamat.setForeground(new java.awt.Color(255, 255, 255));
        labelAlamat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAlamat.setText("Jl. Permata Kecubung No. 9 RT. 16 Komp. BPI Sungai Ulin Banjarbaru");

        labelAlamat1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelAlamat1.setForeground(new java.awt.Color(255, 255, 255));
        labelAlamat1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAlamat1.setText("08981197003 | 0511-6101958");

        labelIconMobil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        desktopPaneUtama.setLayer(labelTanggal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPaneUtama.setLayer(labelUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPaneUtama.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPaneUtama.setLayer(labelKodeKaryawan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPaneUtama.setLayer(labelTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPaneUtama.setLayer(labelHakAkses, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPaneUtama.setLayer(labelTitle1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPaneUtama.setLayer(labelAlamat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPaneUtama.setLayer(labelAlamat1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPaneUtama.setLayer(labelIconMobil, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneUtamaLayout = new javax.swing.GroupLayout(desktopPaneUtama);
        desktopPaneUtama.setLayout(desktopPaneUtamaLayout);
        desktopPaneUtamaLayout.setHorizontalGroup(
            desktopPaneUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUsername)
                .addGap(18, 18, 18)
                .addComponent(labelKodeKaryawan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelHakAkses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTanggal)
                .addContainerGap())
            .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1271, Short.MAX_VALUE)
            .addComponent(labelTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelAlamat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelIconMobil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desktopPaneUtamaLayout.setVerticalGroup(
            desktopPaneUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(desktopPaneUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsername)
                    .addComponent(jLabel2)
                    .addComponent(labelTanggal)
                    .addComponent(labelKodeKaryawan)
                    .addComponent(labelHakAkses))
                .addGap(94, 94, 94)
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAlamat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAlamat1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelIconMobil)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        jButton1.setText("jButton1");

        menuMaster.setMnemonic('m');
        menuMaster.setText("Master");

        menuItemKaryawan.setText("Karyawan");
        menuItemKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemKaryawanActionPerformed(evt);
            }
        });
        menuMaster.add(menuItemKaryawan);

        menuItemMasterMobil.setText("Mobil");
        menuItemMasterMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMasterMobilActionPerformed(evt);
            }
        });
        menuMaster.add(menuItemMasterMobil);

        menuItemTarif.setText("Golongan Tarif");
        menuItemTarif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTarifActionPerformed(evt);
            }
        });
        menuMaster.add(menuItemTarif);

        jMenuBar1.add(menuMaster);

        menuTransaksi.setMnemonic('t');
        menuTransaksi.setText("Transaksi");

        menuItemTambahUser.setText("Tambah User");
        menuItemTambahUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTambahUserActionPerformed(evt);
            }
        });
        menuTransaksi.add(menuItemTambahUser);

        menuItemTarifMobil.setText("Tarif Mobil");
        menuItemTarifMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTarifMobilActionPerformed(evt);
            }
        });
        menuTransaksi.add(menuItemTarifMobil);

        menuItemPenyewaan.setText("Penyewaan Mobil");
        menuItemPenyewaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPenyewaanActionPerformed(evt);
            }
        });
        menuTransaksi.add(menuItemPenyewaan);

        menuItemPengembalian.setText("Pengembalian Mobil");
        menuTransaksi.add(menuItemPengembalian);

        jMenuBar1.add(menuTransaksi);

        jMenu3.setMnemonic('l');
        jMenu3.setText("Laporan");

        menuItemLaporanDataMaster.setText("Data Master");
        jMenu3.add(menuItemLaporanDataMaster);

        menuItemTransaksi.setText("Data Transaksi");
        jMenu3.add(menuItemTransaksi);

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

        jMenu1.setText("Sistem");

        menuItemKeluar.setText("Keluar");
        menuItemKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemKeluarActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemKeluar);

        menuItemTentang.setText("Tentang Sistem");
        jMenu1.add(menuItemTentang);

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

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        setExtendedState(HomeView.MAXIMIZED_BOTH);
  
        if (labelHakAkses.getText().equals("Karyawan")) {
            menuMaster.setEnabled(false);
            menuItemTambahUser.setVisible(false);
            menuItemTarifMobil.setVisible(false);
           
        } else {
            menuMaster.setEnabled(true);
            menuItemTarifMobil.setEnabled(true);
        }
    }//GEN-LAST:event_formComponentShown

    private void menuItemTarifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTarifActionPerformed
        GolTarifView golTarifView = new GolTarifView();
        desktopPaneUtama.add(golTarifView);
        menuItemTarif.setEnabled(false);
        golTarifView.setVisible(true);
    }//GEN-LAST:event_menuItemTarifActionPerformed

    private void menuItemPenyewaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPenyewaanActionPerformed
        TransaksiPenyewaanView tpv = new TransaksiPenyewaanView();
        desktopPaneUtama.add(tpv);
        menuItemPenyewaan.setEnabled(false);
        tpv.setVisible(true);
    }//GEN-LAST:event_menuItemPenyewaanActionPerformed

    private void menuItemTarifMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTarifMobilActionPerformed
        TarifView tarifView = new TarifView();
        desktopPaneUtama.add(tarifView);
        menuItemTarifMobil.setEnabled(false);
        tarifView.setVisible(true);
    }//GEN-LAST:event_menuItemTarifMobilActionPerformed

    private void menuItemKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemKeluarActionPerformed
        int confirm;
        confirm = MessageUtil.showConfirmMessage("Apakah anda ingin keluar dari aplikasi?", this);
        if (confirm == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_menuItemKeluarActionPerformed

    private void menuItemKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemKaryawanActionPerformed
        KaryawanView karyawanView = new KaryawanView();
        desktopPaneUtama.add(karyawanView);
        menuItemKaryawan.setEnabled(false);
        karyawanView.setVisible(true);
    }//GEN-LAST:event_menuItemKaryawanActionPerformed

    private void menuItemTambahUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTambahUserActionPerformed
        UserView userView = new UserView();
        desktopPaneUtama.add(userView);
        menuItemTambahUser.setEnabled(false);
        userView.setVisible(true);
    }//GEN-LAST:event_menuItemTambahUserActionPerformed

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
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    public static javax.swing.JLabel labelAlamat;
    public static javax.swing.JLabel labelAlamat1;
    public static javax.swing.JLabel labelHakAkses;
    private javax.swing.JLabel labelIconMobil;
    public static javax.swing.JLabel labelKodeKaryawan;
    private javax.swing.JLabel labelTanggal;
    public static javax.swing.JLabel labelTitle;
    public static javax.swing.JLabel labelTitle1;
    public static javax.swing.JLabel labelUsername;
    public static javax.swing.JMenuItem menuItemKaryawan;
    private javax.swing.JMenuItem menuItemKeluar;
    private javax.swing.JMenuItem menuItemLaporanDataMaster;
    public static javax.swing.JMenuItem menuItemMasterMobil;
    private javax.swing.JMenuItem menuItemPengembalian;
    public static javax.swing.JMenuItem menuItemPenyewaan;
    public static javax.swing.JMenuItem menuItemTambahUser;
    private javax.swing.JMenuItem menuItemTarif;
    public static javax.swing.JMenuItem menuItemTarifMobil;
    private javax.swing.JMenuItem menuItemTentang;
    private javax.swing.JMenuItem menuItemTransaksi;
    public static javax.swing.JMenuItem menuItemUbahPassword;
    public static javax.swing.JMenu menuMaster;
    private javax.swing.JMenu menuTransaksi;
    // End of variables declaration//GEN-END:variables
 //</editor-fold>
    private void viewSetup() {
        labelKodeKaryawan.setVisible(false);
        labelHakAkses.setVisible(false);
        setIcons();
    }
    
    public void setIcons() {
        labelIconMobil.setIcon(IconUtil.setIconMobilHome());
        //Menu Master -S
        menuItemMasterMobil.setIcon(IconUtil.setIconMobilMenuItem());
        menuItemTarif.setIcon(IconUtil.setIconTarifMenuItem());
        menuItemKaryawan.setIcon(IconUtil.setIconKaryawanMenuItem());
        //Menu Master -E
        //Menu Transaksi -S
        menuItemPenyewaan.setIcon(IconUtil.setIconPenyewaanMenuItem());
        menuItemPengembalian.setIcon(IconUtil.setIconPengembalianMenuItem());
        menuItemTambahUser.setIcon(IconUtil.setIconTambahUserMenuItem());
        menuItemTarifMobil.setIcon(IconUtil.setIconMobilMenuItem());
        //Menu Transaksi -E
        //Menu Laporan -S
        menuItemLaporanDataMaster.setIcon(IconUtil.setIconTransaksiMenu());
        menuItemTransaksi.setIcon(IconUtil.setIconTransaksiMenu());
        //Menu Laporan -E
        //Menu Fasilitas -S
        menuItemUbahPassword.setIcon(IconUtil.setIconUbahPasswordMenuItem());
        //Menu Fasilitas -E
        //Menu Sistem
        menuItemKeluar.setIcon(IconUtil.setIconKeluarMenuItem());
        menuItemTentang.setIcon(IconUtil.setIconTentangMenuItem());
        
    }
}