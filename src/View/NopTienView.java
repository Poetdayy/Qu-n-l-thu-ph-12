/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.NopTienController;
import Model.KhoanThuModel;
import Model.NopTienModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ThinkKING
 */
public class NopTienView extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form NopTienView
     */
    NopTienController ntDAO = new NopTienController();
    SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
    String strFind = "";
    String strID = "";

    public NopTienView() {
        initComponents();
        setTitle("Trang chủ Nộp Tiền");
        setLocationRelativeTo(null);
        fillTable();
        addNopTienbtn.addActionListener(this);
        BacktoHomePagebtn.addActionListener(this);
    }

    public void fillTable() {
        DefaultTableModel tbModel = (DefaultTableModel) TableNT.getModel();
        tbModel.setRowCount(0); // Xoa data trong table
        for (NopTienModel nt : ntDAO.getAll()) {
            Object dataRow[] = new Object[3];
            dataRow[0] = nt.getTenNhanKhau().getTen();
            dataRow[1] = nt.getTenKhoanThu().getTenKhoanThu();
            dataRow[2] = formatDate.format(nt.getNgayThu());
            tbModel.addRow(dataRow); // add du lieu vao table Model
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BacktoHomePagebtn = new javax.swing.JButton();
        addNopTienbtn = new javax.swing.JButton();
        delNopTienbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableNT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        BacktoHomePagebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/home (1).png"))); // NOI18N

        addNopTienbtn.setBackground(new java.awt.Color(204, 51, 0));
        addNopTienbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addNopTienbtn.setForeground(new java.awt.Color(255, 255, 255));
        addNopTienbtn.setText("THÊM");

        delNopTienbtn.setBackground(new java.awt.Color(204, 51, 0));
        delNopTienbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delNopTienbtn.setForeground(new java.awt.Color(255, 255, 255));
        delNopTienbtn.setText("XÓA");
        delNopTienbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delNopTienbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BacktoHomePagebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addNopTienbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(delNopTienbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BacktoHomePagebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(addNopTienbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(delNopTienbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TableNT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tên người nộp", "Khoản Thu", "Ngày Thu"
            }
        ));
        TableNT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableNTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableNT);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Tìm kiếm theo tên:");

        tfSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tfSearchCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableNTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableNTMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TableNTMouseClicked

    private void delNopTienbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delNopTienbtnActionPerformed
        // TODO add your handling code here:
        if (strID.equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn mục để xóa");
        } else {
            if (ntDAO.delNopTien(strID) > 0) {
                JOptionPane.showMessageDialog(this, "Xóa thành công");
                fillTable();
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại");
            }
        }
    }//GEN-LAST:event_delNopTienbtnActionPerformed

    private void tfSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfSearchCaretUpdate
        // TODO add your handling code here:
        strFind = tfSearch.getText();
        fillTable();
    }//GEN-LAST:event_tfSearchCaretUpdate

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
            java.util.logging.Logger.getLogger(NopTienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NopTienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NopTienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NopTienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NopTienView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BacktoHomePagebtn;
    private javax.swing.JTable TableNT;
    private javax.swing.JButton addNopTienbtn;
    private javax.swing.JButton delNopTienbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(addNopTienbtn)) {
            addNopTienclick();
        } else if (e.getSource().equals(BacktoHomePagebtn)) {
            backtoHomePageClick();
        } else if (e.getSource().equals(delNopTienbtn)) {
            delNopTienclick();
        }
    }

    public void addNopTienclick() {
        new AddNopTienView().setVisible(true);
        this.dispose();
    }

    public void backtoHomePageClick() {
        new TrangChuView().setVisible(true);
        this.dispose();
    }
        public void delNopTienclick(){
        
    }

}