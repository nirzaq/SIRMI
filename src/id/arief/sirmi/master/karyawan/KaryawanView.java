package id.arief.sirmi.master.karyawan;

import id.arief.sirmi.util.IconUtil;
import id.arief.sirmi.util.MessageUtil;
import id.arief.sirmi.util.ViewUtil;
import static id.arief.sirmi.home.HomeView.desktopPaneUtama;
import static id.arief.sirmi.home.HomeView.menuItemKaryawan;
import id.arief.sirmi.util.TableUtil;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import org.jdesktop.xswingx.PromptSupport;

/**
 *
 * @author arief-asus
 */
public class KaryawanView extends javax.swing.JInternalFrame {
    KaryawanTableModel tableModel = new KaryawanTableModel();
    KaryawanController controller = new KaryawanController();
    KaryawanTambahUbah karyawanTambahUbah = new KaryawanTambahUbah();
   
    public KaryawanView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textKodeKaryawan = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboCari = new javax.swing.JComboBox<>();
        textCari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        buttonTambah = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();

        textKodeKaryawan.setText("jTextField1");

        setAutoscrolls(true);
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
        jLabel1.setText("MASTER KARYAWAN");
        jPanel1.add(jLabel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Cari");

        comboCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kode Karyawan", "Nama", "Tanggal Lahir", "No Telepon" }));
        comboCari.setToolTipText("Cari Mobil Berdasarkan");

        textCari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textCariFocusGained(evt);
            }
        });
        textCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCariKeyReleased(evt);
            }
        });

        tableData.setAutoCreateRowSorter(true);
        tableData.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableData.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableData.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableData.setEditingColumn(1);
        tableData.setEditingRow(1);
        tableData.setFocusTraversalPolicyProvider(true);
        tableData.setGridColor(new java.awt.Color(0, 0, 0));
        tableData.setName(""); // NOI18N
        jScrollPane1.setViewportView(tableData);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        buttonTambah.setText("Tambah");
        buttonTambah.setToolTipText("Tambah Mobil");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });
        jPanel3.add(buttonTambah);

        buttonUbah.setText("Ubah");
        buttonUbah.setToolTipText("Ubah Mobil");
        buttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahActionPerformed(evt);
            }
        });
        jPanel3.add(buttonUbah);

        buttonHapus.setText("Hapus");
        buttonHapus.setToolTipText("Hapus Mobil");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });
        jPanel3.add(buttonHapus);

        buttonClear.setText("Bersih");
        buttonClear.setToolTipText("Reset Form Master Mobil");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });
        jPanel3.add(buttonClear);

        buttonKeluar.setText("Keluar");
        buttonKeluar.setToolTipText("Tutup Form Master Mobil");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });
        jPanel3.add(buttonKeluar);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCari, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCari))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        PromptSupport.setPrompt("Masukkan Kata Kunci", textCari);
        
        buttonTambah.setIcon(IconUtil.setIconTambah());
        buttonUbah.setIcon(IconUtil.setIconEdit());
        buttonHapus.setIcon(IconUtil.setIconHapus());
        buttonClear.setIcon(IconUtil.setIconReset());
        buttonKeluar.setIcon(IconUtil.setIconKeluar());
       
        tableData.setModel(tableModel);
       
        TableUtil.kolomRataTengah(tableData, 1);
        TableUtil.tabelKosong(tableData, tableModel);
        refresh();
        TableUtil.resizeColumnWidth(tableData);
      

        tableAction();

    }//GEN-LAST:event_formInternalFrameOpened

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        refresh();
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        dispose();
        menuItemKaryawan.setEnabled(true);
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        KaryawanTambahUbah.labelTitleTambahUbahKaryawan.setText("TAMBAH KARYAWAN");
        ViewUtil.showForm(desktopPaneUtama, this, karyawanTambahUbah);
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahActionPerformed
        KaryawanTambahUbah.labelTitleTambahUbahKaryawan.setText("UBAH KARYAWAN");
        KaryawanTambahUbah.textKodeKaryawan.setEnabled(false);
        ViewUtil.showForm(desktopPaneUtama, this, karyawanTambahUbah);
    }//GEN-LAST:event_buttonUbahActionPerformed

    private void textCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCariKeyReleased
        try {
            String sqlParameter = null;
            String searchParameter;
            switch (comboCari.getSelectedIndex()) {
                case 0:
                    sqlParameter = "kode_karyawan";
                    break;
                case 1:
                    sqlParameter = "nama_karyawan";
                    break;
                case 2:
                    sqlParameter = "tanggal_lahir";
                    break;
                case 3:
                    sqlParameter = "kontak_karyawan";
                    break;
            }

            searchParameter = textCari.getText();
            List<Karyawan> list = controller.getKaryawanByParameter(sqlParameter, searchParameter);
            tableModel.setData(list);
        } catch (Exception error) {
            System.out.println("Terjadi kesalahan : \n& " + error);
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan : ");
        }
    }//GEN-LAST:event_textCariKeyReleased

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        int confirm = MessageUtil.
            showConfirmMessage("Apakah anda ingin menghapus karyawan dengan kode " + textKodeKaryawan.getText() + " ?", this);
        if (confirm == JOptionPane.YES_OPTION) {
            controller.deleteKaryawan(textKodeKaryawan.getText());
            refresh();
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void textCariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textCariFocusGained
        buttonClear.doClick();
    }//GEN-LAST:event_textCariFocusGained

    // <editor-fold defaultstate="collapsed" desc="Generated Code">           
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JComboBox<String> comboCari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tableData;
    private javax.swing.JTextField textCari;
    private javax.swing.JTextField textKodeKaryawan;
    // End of variables declaration//GEN-END:variables
    public void tableAction() {
        tableData
                .getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            int row = tableData.getSelectedRow();
            //Cek Baris, Apakah terseleksi?
            if (row != -1) {
                Karyawan karyawan = tableModel.get(row);
               
                //Disable Button Tambah
                buttonTambah.setEnabled(false);
                buttonUbah.setEnabled(true);
                buttonHapus.setEnabled(true);
                textKodeKaryawan.setText(karyawan.getKodeKaryawan());
                //Pass data ke TambahUbah
                KaryawanTambahUbah.textKodeKaryawan.setText(karyawan.getKodeKaryawan());
                KaryawanTambahUbah.textNamaKaryawan.setText(karyawan.getNamaKaryawan());
                KaryawanTambahUbah.textTanggalLahirKaryawan.setDate(karyawan.getTanggalLahirKaryawan());
                KaryawanTambahUbah.textTeleponKaryawan.setText(karyawan.getKontakKaryawan());
                
            }
        });
    }
    
    /**
     * Method untuk mengambil data dari database
     * 
     */
    public void loadDatabase() {
        try {
            List<Karyawan> list = controller.getData();
            tableModel.setData(list);
        } catch (Exception error) {
            System.out.println("Terjadi kesalahan : \n& " + error);
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan : ");
        }
    }

    private void refresh() {
        //Ambil Data dari Database
        loadDatabase();
        //Disable Button
        KaryawanTambahUbah.buttonSimpan.setEnabled(false);
        textCari.setText("");
        tableData.clearSelection();
        buttonUbah.setEnabled(false);
        buttonHapus.setEnabled(false);
        buttonTambah.setEnabled(true);
    }
}