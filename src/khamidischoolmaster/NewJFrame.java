 package khamidischoolmaster;

/**
 *
 * @author Malala
 */
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.*;
 import net.proteanit.sql.DbUtils;

public class NewJFrame extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        //conn =javaconnect.ConnecrDb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpatientId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 4, true));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("You are About To Delete Patient's  Records");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Patient ID");

        jpatientId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Name", "other names"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("DELETE?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 255));
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 255));
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Malala\\Documents\\NetBeansProjects\\KhamidiSchoolMaster\\src\\khamidischoolmaster\\delete11.png")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("(This process might take some moment)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 36, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jpatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jButton1)
                                        .addGap(43, 43, 43)
                                        .addComponent(jButton5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(126, 126, 126)
                        .addComponent(jButton4)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton5)
                    .addComponent(jpatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jpatientId.setText(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String malala = jpatientId.getText();
        int pId = Integer.parseInt(malala);
        Connection conn = null;

        PreparedStatement stm = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/system", "root", "");

            stm = conn.prepareStatement("DELETE from patientdetails where PatientId = ? ");
            stm.setInt(1, pId);
           
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Patient Details deleted successfully");
            //stm.executeQuery("insert into users (username ,emailaddress , password ,usertype ) values ("+ username+ ","+ email+ ","+ password+  "+ 2 +)"); 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "deletion was not successful", "System   Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.toString());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String malala = jpatientId.getText();
        int pId = Integer.parseInt(malala);
        Connection conn = null;

        PreparedStatement stm = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/system", "root", "");

            stm = conn.prepareStatement("select Fname as Sir_name, Lname as Other_Names from patientdetails where PatientId = ? ");
            stm.setInt(1, pId);
            //stm.executeQuery();
            ResultSet rs = stm.executeQuery();
            jTable.setModel(DbUtils.resultSetToTableModel(rs));

            //stm.executeQuery("insert into users (username ,emailaddress , password ,usertype ) values ("+ username+ ","+ email+ ","+ password+  "+ 2 +)"); 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "deletion was not successful. Patient details may not be existing", "System   Error", JOptionPane.ERROR_MESSAGE);
            //System.out.println(e.toString());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTree jTree1;
    private javax.swing.JTextField jpatientId;
    // End of variables declaration//GEN-END:variables
}
