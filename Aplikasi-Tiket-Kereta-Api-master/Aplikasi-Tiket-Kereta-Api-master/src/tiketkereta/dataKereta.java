/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketkereta;

import koneksi.koneks;
import java.sql.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author user
 */
public class dataKereta extends javax.swing.JFrame {

    //membuat objek    
    private DefaultTableModel model;
    
    //deklarasi variabel
    String Idkereta, Nmkereta;
    /**
     * Creates new form dataKereta
     */
    public dataKereta() {
        initComponents();
        //membuat obyek
        model = new DefaultTableModel();
        
        //memberi nama header pada tabel
        tblKategori.setModel(model);
        model.addColumn("ID KERETA");
        model.addColumn("NAMA KERETA");
        
        //fungsi ambil data
        getDataKereta();
    }
//fungsi membaca data kategori
    public void getDataKereta(){
        //kosongkan tabel
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        //eksekusi koneksi dan kirimkan query ke database
        try{
            //tes koneksi
            Statement stat = (Statement) koneks.getKoneksi().createStatement();
            
            //perintah sql untuk membaca data dari tabel kategori        
            String sql = "SELECT * FROM datakereta";
            ResultSet res = stat.executeQuery(sql);
            
            //baca data
            while(res.next()){
                //membuat obyek berjenis array
                Object[] obj = new Object[2];
                obj[0]=res.getString("id_kereta");
                obj[1]=res.getString("nama_kereta");
                model.addRow(obj);
            }
        }catch(SQLException err){
           JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtNmKategori = new javax.swing.JTextField();
        tblSImpan = new javax.swing.JButton();
        tblReset = new javax.swing.JButton();
        tblHapus = new javax.swing.JButton();
        tblRubah = new javax.swing.JButton();
        tblKeluar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKategori = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtKdKategori = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jLabel3.setText("Nama Kereta");

        tblSImpan.setBackground(new java.awt.Color(255, 204, 204));
        tblSImpan.setForeground(new java.awt.Color(255, 102, 204));
        tblSImpan.setText("SIMPAN");
        tblSImpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblSImpanActionPerformed(evt);
            }
        });

        tblReset.setBackground(new java.awt.Color(255, 204, 204));
        tblReset.setForeground(new java.awt.Color(255, 102, 204));
        tblReset.setText("RESET");
        tblReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblResetActionPerformed(evt);
            }
        });

        tblHapus.setBackground(new java.awt.Color(255, 204, 204));
        tblHapus.setForeground(new java.awt.Color(255, 102, 204));
        tblHapus.setText("HAPUS");
        tblHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblHapusActionPerformed(evt);
            }
        });

        tblRubah.setBackground(new java.awt.Color(255, 204, 204));
        tblRubah.setForeground(new java.awt.Color(255, 102, 204));
        tblRubah.setText("RUBAH");
        tblRubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblRubahActionPerformed(evt);
            }
        });

        tblKeluar.setBackground(new java.awt.Color(255, 204, 204));
        tblKeluar.setForeground(new java.awt.Color(255, 102, 204));
        tblKeluar.setText("KELUAR");
        tblKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblKeluarActionPerformed(evt);
            }
        });

        tblKategori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tblKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKategoriMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblKategori);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Data Kereta Api Sepur");

        jLabel2.setText("Id Kereta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(137, 137, 137)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtKdKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNmKategori))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tblSImpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tblReset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tblRubah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tblHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tblKeluar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKdKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNmKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tblSImpan)
                    .addComponent(tblReset)
                    .addComponent(tblRubah)
                    .addComponent(tblHapus)
                    .addComponent(tblKeluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//membaca data 
    public void loadDataKategori(){
        Idkereta = txtKdKategori.getText();
        Nmkereta = txtNmKategori.getText();
    }
    
    //memilih data saat baris pada tabel dipilih dengan mouse
    public void dataSelect(){
        //deklarasi variabel
        int i = tblKategori.getSelectedRow();
        
        //uji adakah data di tabel?
        if(i == -1){
            //tidak ada yang terpilih atau dipilih.
            return;
        }
        txtKdKategori.setText(""+model.getValueAt(i,0));
        txtNmKategori.setText(""+model.getValueAt(i,1));
    }
     
    //mengosongkan form
    public void reset(){
        Idkereta = "";
        Nmkereta = "";
               
        txtKdKategori.setText(Idkereta);
        txtNmKategori.setText(Nmkereta);
    }
    
    public void simpanDataKereta(){
        //panggil fungsi load data
        loadDataKategori();
        
        //uji koneksi dan eksekusi perintah
        try{
            //test koneksi
            Statement stat = (Statement) koneks.getKoneksi().createStatement();
            
            //perintah sql untuk simpan data
            String  sql =   "INSERT INTO datakereta(id_kereta, nama_kereta)" + "VALUES('"+ Idkereta +"','"+ Nmkereta +"')";
            PreparedStatement p = (PreparedStatement) koneks.getKoneksi().prepareStatement(sql);
            p.executeUpdate();
            
            //ambil data
            getDataKereta();
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }
    
    public void perbaruiDataKereta(){
        //fungsi load data kategori
        loadDataKategori();
        
        try{
            //uji koneksi
            Statement stat = (Statement) koneks.getKoneksi().createStatement();
            
            //kirim perintah sql
            String sql = "UPDATE datakereta SET nama_kereta = '"+ Nmkereta +"' WHERE id_kereta = '"+ Idkereta +"'";
            PreparedStatement p =(PreparedStatement)koneks.getKoneksi().prepareStatement(sql);
            p.executeUpdate();
            
            //ambil data
            getDataKereta();
            
            //kosongkan data
            reset();
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DIPERBARUI");
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }
    public void hapusDataKereta(){
        loadDataKategori(); 
        int pesan = JOptionPane.showConfirmDialog(null, "HAPUS DATA"+ Idkereta +"?","KONFIRMASI", JOptionPane.OK_CANCEL_OPTION);
       
        if(pesan == JOptionPane.OK_OPTION){
            try{
                Statement stat = (Statement) koneks.getKoneksi().createStatement();
                String sql = "DELETE FROM datakereta WHERE id_kereta='"+ Idkereta +"'";
                PreparedStatement p =(PreparedStatement)koneks.getKoneksi().prepareStatement(sql);
                p.executeUpdate();
                
                getDataKereta();
                
                reset();
                JOptionPane.showMessageDialog(null, "DATA BERHASIL DIHAPUS");
            }catch(SQLException err){
                JOptionPane.showMessageDialog(null, err.getMessage());
            }
        }
    }
    private void tblSImpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblSImpanActionPerformed
        //memanggil fungsi simpan data kategori
        simpanDataKereta();
    }//GEN-LAST:event_tblSImpanActionPerformed

    private void tblResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblResetActionPerformed
        //memanggil fungsi reset
        reset();
    }//GEN-LAST:event_tblResetActionPerformed

    private void tblHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblHapusActionPerformed
        //memanggil fungsi hapus data kategori
        hapusDataKereta();
    }//GEN-LAST:event_tblHapusActionPerformed

    private void tblRubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblRubahActionPerformed
        //memanggil fungsi perbarui data kategori
        perbaruiDataKereta();
    }//GEN-LAST:event_tblRubahActionPerformed

    private void tblKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblKeluarActionPerformed
        //fungsi keluar dari master data kategori
        this.dispose();
        
    }//GEN-LAST:event_tblKeluarActionPerformed

    private void tblKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKategoriMouseClicked
        //memanggil fungsi memilih data
        dataSelect();
    }//GEN-LAST:event_tblKategoriMouseClicked

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
            java.util.logging.Logger.getLogger(dataKereta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataKereta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataKereta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataKereta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataKereta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton tblHapus;
    private javax.swing.JTable tblKategori;
    private javax.swing.JButton tblKeluar;
    private javax.swing.JButton tblReset;
    private javax.swing.JButton tblRubah;
    private javax.swing.JButton tblSImpan;
    private javax.swing.JTextField txtKdKategori;
    private javax.swing.JTextField txtNmKategori;
    // End of variables declaration//GEN-END:variables
}
