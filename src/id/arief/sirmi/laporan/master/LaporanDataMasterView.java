
package id.arief.sirmi.laporan.master;

import id.arief.sirmi.database.Connection;
import id.arief.sirmi.home.HomeView;
import id.arief.sirmi.transaksi.penyewaan.Penyewaan;
import id.arief.sirmi.util.IconUtil;
import java.sql.SQLException;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author arief-asus
 */
public class LaporanDataMasterView extends javax.swing.JInternalFrame {


    public LaporanDataMasterView() {
        initComponents();
        buttonSimpan.setIcon(IconUtil.setIconPrint());
        buttonKeluar.setIcon(IconUtil.setIconKeluar());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboMaster = new javax.swing.JComboBox<>();
        buttons = new javax.swing.JPanel();
        buttonSimpan = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+13));
        jLabel1.setText("LAPORAN DATA MASTER");
        jPanel1.add(jLabel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Pilih Data");

        comboMaster.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Karyawan", "Mobil", "Golongan Tarif" }));
        comboMaster.setSelectedIndex(-1);
        comboMaster.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMasterItemStateChanged(evt);
            }
        });

        buttons.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buttons.setPreferredSize(new java.awt.Dimension(355, 25));
        buttons.setLayout(new java.awt.GridLayout(1, 0));

        buttonSimpan.setText("Cetak");
        buttonSimpan.setToolTipText("Simpan");
        buttonSimpan.setEnabled(false);
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });
        buttons.add(buttonSimpan);

        buttonKeluar.setText("Keluar");
        buttonKeluar.setToolTipText("Tutup Form");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });
        buttons.add(buttonKeluar);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboMaster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
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

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        String namaReport = null;
        switch (comboMaster.getSelectedIndex()) {
            case 0 :
                namaReport = "MasterKaryawan";
                break;
            case 1 :
                namaReport = "MasterMobil";
                break;
            case 2 :
                namaReport = "MasterGolonganTarif";
                break;
            
        }
        
        cetakLaporan(namaReport);
        //JasperViewer.viewReport(jasperPrint, false);
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        HomeView.menuItemLaporanDataMaster.setEnabled(true);
        dispose();
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void comboMasterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMasterItemStateChanged
        if (comboMaster.getSelectedIndex() != -1) {
            buttonSimpan.setEnabled(true);
        } else {
            buttonSimpan.setEnabled(false);
        }
    }//GEN-LAST:event_comboMasterItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonKeluar;
    public static javax.swing.JButton buttonSimpan;
    private javax.swing.JPanel buttons;
    private javax.swing.JComboBox<String> comboMaster;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
public JasperPrint cetakLaporan(String namaReport) {
     try {
            Penyewaan penyewaan = new Penyewaan();
            
            penyewaan.setPathReport("./report/");
            penyewaan.setSourceReport(penyewaan.getPathReport()+"templates/"+namaReport+".jrxml");
            penyewaan.setResultReport(penyewaan.getPathReport()+"result/"+namaReport+".html");

            JasperReport jasperReport = JasperCompileManager.compileReport(penyewaan.getSourceReport());
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, Connection.getConnection());
            JasperExportManager.exportReportToHtmlFile(jasperPrint, penyewaan.getResultReport());
            JasperViewer.viewReport(jasperPrint, false);
            return jasperPrint;
        } catch(JRException | SQLException exception) {
            System.out.println("Terjadi kesalahan :" + exception);
            return null;
        }
    }
}

