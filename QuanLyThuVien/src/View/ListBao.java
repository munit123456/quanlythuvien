/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Bao;
import model.Sach;
import service.Service;

/**
 *
 * @author Admin
 */
public class ListBao extends javax.swing.JFrame {
    Service service;
    DefaultTableModel defaultTableModel;
    /**
     * Creates new form ListBao
     */
    public ListBao() {
        service = new Service();
        initComponents();
        
        ///Tranh nguoi dung sua du lieu
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        TableBao.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("MaBao");
        defaultTableModel.addColumn("TenBao");
        defaultTableModel.addColumn("TenNXBBao");
        defaultTableModel.addColumn("SoBPH");
        defaultTableModel.addColumn("NgayPH");
        
        List<Bao> bao = service.getALLBao();
        for(Bao baos : bao){
            defaultTableModel.addRow(new Object[]{baos.getMaBao(),baos.getTenB(),baos.getNXB(),baos.getSoBPH(),baos.getNgayPHB() });
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

        BtnXoaBao = new javax.swing.JButton();
        BtnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableBao = new javax.swing.JTable();
        BtnThemBao = new javax.swing.JButton();
        BtnSuaBao = new javax.swing.JButton();
        BtnBackBao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnXoaBao.setText("Xóa");
        BtnXoaBao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnXoaBaoActionPerformed(evt);
            }
        });

        BtnRefresh.setText("Refresh");
        BtnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefreshActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("UTM Akashi", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản lý báo");

        TableBao.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableBao);

        BtnThemBao.setText("Thêm");
        BtnThemBao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnThemBaoActionPerformed(evt);
            }
        });

        BtnSuaBao.setText("Sửa");

        BtnBackBao.setText("Quay lại");
        BtnBackBao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackBaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnThemBao, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnSuaBao, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnXoaBao, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnBackBao, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnThemBao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSuaBao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnXoaBao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBackBao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackBaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackBaoActionPerformed
        // TODO add your handling code here:
        new TuyChon().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnBackBaoActionPerformed

    private void BtnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefreshActionPerformed
        // TODO add your handling code here:
        defaultTableModel.setRowCount(0);
        List<Bao> bao = service.getALLBao();
        for(Bao baos : bao){
            defaultTableModel.addRow(new Object[]{baos.getMaBao(),baos.getTenB(),baos.getNXB(),baos.getSoBPH(),baos.getNgayPHB() });
        }
    }//GEN-LAST:event_BtnRefreshActionPerformed

    private void BtnThemBaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnThemBaoActionPerformed
        // TODO add your handling code here:
        new ThemBao().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnThemBaoActionPerformed

    private void BtnXoaBaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnXoaBaoActionPerformed
        // TODO add your handling code here:
        int row = TableBao.getSelectedRow();
        if(row == -1) {
            JOptionPane.showMessageDialog(ListBao.this, "Vui long chon hoc sinh truoc", "loi",JOptionPane.ERROR_MESSAGE);
        }else{
            int confirm = JOptionPane.showConfirmDialog(ListBao.this,"Ban chac chan muon xoa khong");
            
            if(confirm == JOptionPane.YES_OPTION){
                int MaBao = Integer.valueOf(String.valueOf(TableBao.getValueAt(row, 0)));
                
                service.deleteBao(MaBao);
            
                
             /// Xoa xong rooif refresh
            defaultTableModel.setRowCount(0);
            List<Bao> bao = service.getALLBao();
            for(Bao baos : bao){
            defaultTableModel.addRow(new Object[]{baos.getMaBao(),baos.getTenB(),baos.getNXB(),baos.getSoBPH(),baos.getNgayPHB() });
        }
            }
        }
    }//GEN-LAST:event_BtnXoaBaoActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBackBao;
    private javax.swing.JButton BtnRefresh;
    private javax.swing.JButton BtnSuaBao;
    private javax.swing.JButton BtnThemBao;
    private javax.swing.JButton BtnXoaBao;
    private javax.swing.JTable TableBao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
