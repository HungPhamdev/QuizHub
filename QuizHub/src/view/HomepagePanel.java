package view;

public class HomepagePanel extends javax.swing.JPanel {

    private MainFrame mainFrame;

    public HomepagePanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHomepage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnUserManagement = new javax.swing.JButton();
        btnQuizManagement1 = new javax.swing.JButton();
        btnQuestionManagement1 = new javax.swing.JButton();
        btnOptionManagement = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHomepage.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblHomepage.setText("Welcome to the Quiz Application!");
        add(lblHomepage, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUserManagement.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnUserManagement.setText("User Management");
        btnUserManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserManagementActionPerformed(evt);
            }
        });
        jPanel1.add(btnUserManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnQuizManagement1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnQuizManagement1.setText("Quiz Management");
        btnQuizManagement1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizManagement1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuizManagement1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        btnQuestionManagement1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnQuestionManagement1.setText("Question Management");
        btnQuestionManagement1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuestionManagement1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuestionManagement1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 200, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 70));

        btnOptionManagement.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnOptionManagement.setText("Option Management");
        btnOptionManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionManagementActionPerformed(evt);
            }
        });
        add(btnOptionManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 200, -1));

        jButton1.setText("Quizz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnOptionManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionManagementActionPerformed
        mainFrame.showOptionManagementPanel();
    }//GEN-LAST:event_btnOptionManagementActionPerformed

    private void btnUserManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserManagementActionPerformed
        mainFrame.showUserManagementPanel();
    }//GEN-LAST:event_btnUserManagementActionPerformed

    private void btnQuizManagement1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizManagement1ActionPerformed
        mainFrame.showQuizManagementPanel();
    }//GEN-LAST:event_btnQuizManagement1ActionPerformed

    private void btnQuestionManagement1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuestionManagement1ActionPerformed
        mainFrame.showQuestionManagementPanel();
    }//GEN-LAST:event_btnQuestionManagement1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mainFrame.showQuizAppPanel();
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOptionManagement;
    private javax.swing.JButton btnQuestionManagement1;
    private javax.swing.JButton btnQuizManagement1;
    private javax.swing.JButton btnUserManagement;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHomepage;
    // End of variables declaration//GEN-END:variables
}
