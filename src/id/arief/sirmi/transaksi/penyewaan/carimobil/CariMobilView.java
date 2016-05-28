package id.arief.sirmi.transaksi.penyewaan.carimobil;

import id.arief.sirmi.transaksi.penyewaan.TransaksiPenyewaanController;
import id.arief.sirmi.transaksi.penyewaan.TransaksiPenyewaanView;
import id.arief.sirmi.util.TableUtil;
import java.util.List;

/**
 *
 * @author arief-asus
 */
public class CariMobilView extends javax.swing.JInternalFrame {
    public static String jenisTarif;
    TarifMobilTableModel tableModel = new TarifMobilTableModel();
   
    TransaksiPenyewaanController penyewaanController = new TransaksiPenyewaanController();
    public static boolean per12;
    public static boolean perHari;
    public CariMobilView() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboCariMobil = new javax.swing.JComboBox<>();
        textCariMobil = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        buttonBatal = new javax.swing.JButton();

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

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelTitle.setFont(labelTitle.getFont().deriveFont(labelTitle.getFont().getStyle() | java.awt.Font.BOLD, labelTitle.getFont().getSize()+13));
        labelTitle.setText("Cari Mobil");
        jPanel2.add(labelTitle);

        jLabel1.setText("Cari");

        comboCariMobil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nama Mobil", "Merk", "Nopol", "Jenis", "Tahun Buat", "Kode Mobil" }));
        comboCariMobil.setToolTipText("Cari Mobil Berdasarkan");

        textCariMobil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textCariMobilFocusGained(evt);
            }
        });
        textCariMobil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCariMobilKeyReleased(evt);
            }
        });

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
        tableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableData);

        buttonBatal.setText("Batal");
        buttonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCariMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCariMobil, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboCariMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCariMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonBatal, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textCariMobilFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textCariMobilFocusGained
       
    }//GEN-LAST:event_textCariMobilFocusGained

    private void textCariMobilKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCariMobilKeyReleased
//        try {
//            String sqlParameter = null;
//            String searchParameter;
//            switch (comboCariMobil.getSelectedIndex()) {
//                case 0:
//                sqlParameter = "nama_mobil";
//                break;
//                case 1:
//                sqlParameter = "merk_mobil";
//                break;
//                case 2:
//                sqlParameter = "nopol_mobil";
//                break;
//                case 3:
//                sqlParameter = "jenis_mobil";
//                break;
//                case 4:
//                sqlParameter = "tahun_pembuatan";
//                break;
//                case 5:
//                sqlParameter = "kode_mobil";
//                break;
//            }
//
//            searchParameter = textCariMobil.getText();
//            List<Mobil> list = controller
//            .getMobilByParameter(sqlParameter, searchParameter);
//            tableModel.setData(list);
//        } catch (Exception error) {
//            System.out.println("Terjadi kesalahan : \n& " + error);
//            JOptionPane.showMessageDialog(this, "Terjadi kesalahan : ");
//        }
    }//GEN-LAST:event_textCariMobilKeyReleased

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        tableData.setModel(tableModel);
        loadDatabase();        
        TableUtil.resizeColumnWidth(tableData);
    }//GEN-LAST:event_formInternalFrameOpened

    private void tableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseClicked
        if (evt.getClickCount() == 2) {
            
            int row = tableData.getSelectedRow();
            TarifMobil tarifMobil = tableModel.get(row);
                TransaksiPenyewaanView.textCariMobil.setText(tarifMobil.getKode_mobil());
                TransaksiPenyewaanView.biayaSewa = tarifMobil.getTarif();
                TransaksiPenyewaanView.kodeTarif = tarifMobil.getKodeTarif();
                if (per12) {
                TransaksiPenyewaanView.labelBiayaSewa.setText("Rp."+String.valueOf(tarifMobil.getTarif()));
                dispose();
                } else {
                    dispose();
                }
                    
        }
    }//GEN-LAST:event_tableDataMouseClicked

    private void buttonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBatalActionPerformed
        
        TransaksiPenyewaanView.textCariMobil.setText("");
        TransaksiPenyewaanView.buttonCariMobil.setEnabled(true);
        TransaksiPenyewaanView.radioPer12.setEnabled(true);
        TransaksiPenyewaanView.radioPerHari.setEnabled(true);
        dispose();
        
    }//GEN-LAST:event_buttonBatalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBatal;
    private javax.swing.JComboBox<String> comboCariMobil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel labelTitle;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField textCariMobil;
    // End of variables declaration//GEN-END:variables
    private void loadDatabase() {
        try {
            List<TarifMobil> list = penyewaanController.getTarifMobil(jenisTarif);
            tableModel.setData(list);
            } catch (Exception e) {
        
            }
    }
}
