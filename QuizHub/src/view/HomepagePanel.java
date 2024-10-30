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
        btnSubjectManagement = new javax.swing.JButton();
        btnOptionManagement = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnQuestionManagement1 = new javax.swing.JButton();
        btnQuizManagement = new javax.swing.JButton();

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

        btnSubjectManagement.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSubjectManagement.setText("Subject Management");
        btnSubjectManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubjectManagementActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubjectManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

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
        jPanel1.add(btnOptionManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 200, -1));

        btnQuestionManagement1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnQuestionManagement1.setText("Question Management");
        btnQuestionManagement1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuestionManagement1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuestionManagement1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 200, -1));

        btnQuizManagement.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnQuizManagement.setText("Quiz Management");
        btnQuizManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizManagementActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuizManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnOptionManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionManagementActionPerformed
        mainFrame.showOptionManagementPanel();
    }//GEN-LAST:event_btnOptionManagementActionPerformed

    private void btnUserManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserManagementActionPerformed
        mainFrame.showUserManagementPanel();
    }//GEN-LAST:event_btnUserManagementActionPerformed

    private void btnSubjectManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubjectManagementActionPerformed
        mainFrame.showSubjectManagementPanel();
    }//GEN-LAST:event_btnSubjectManagementActionPerformed

    private void btnQuestionManagement1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuestionManagement1ActionPerformed
        mainFrame.showQuestionManagementPanel();
    }//GEN-LAST:event_btnQuestionManagement1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mainFrame.showQuizAppPanel();
        
    }//GEN-LAST:event_jButton1ActionPerformed
    private void btnQuizManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizManagementActionPerformed
        mainFrame.showQuizManagementPanel();
    }//GEN-LAST:event_btnQuizManagementActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOptionManagement;
    private javax.swing.JButton btnQuestionManagement1;
    private javax.swing.JButton btnQuizManagement;
    private javax.swing.JButton btnSubjectManagement;
    private javax.swing.JButton btnUserManagement;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHomepage;
    // End of variables declaration//GEN-END:variables
}
