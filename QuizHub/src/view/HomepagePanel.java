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
        btnSubjectManagement = new javax.swing.JButton();
        btnOptionManagement = new javax.swing.JButton();
        btnQuestionManagement1 = new javax.swing.JButton();
        btnQuizManagement = new javax.swing.JButton();
        btnUserManagement1 = new javax.swing.JButton();
        btnOptionManagement1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnAvailableQuizzes = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHomepage.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblHomepage.setText("Welcome to the Quiz Application!");
        add(lblHomepage, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        btnUserManagement1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnUserManagement1.setText("User Management");
        btnUserManagement1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserManagement1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUserManagement1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 70));

        btnOptionManagement1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnOptionManagement1.setText("Option Management");
        btnOptionManagement1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionManagementActionPerformed(evt);
            }
        });
        add(btnOptionManagement1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 200, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Take an exam");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        btnAvailableQuizzes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAvailableQuizzes.setText("Available Quizzes");
        btnAvailableQuizzes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailableQuizzesActionPerformed(evt);
            }
        });
        add(btnAvailableQuizzes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnOptionManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionManagementActionPerformed
        mainFrame.showOptionManagementPanel();
    }//GEN-LAST:event_btnOptionManagementActionPerformed

    private void btnAvailableQuizzesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailableQuizzesActionPerformed
        mainFrame.showAvailableQuizManagementPanel();
    }//GEN-LAST:event_btnAvailableQuizzesActionPerformed

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

    private void btnUserManagement1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserManagement1ActionPerformed
        mainFrame.showUserManagementPanel();
    }//GEN-LAST:event_btnUserManagement1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvailableQuizzes;
    private javax.swing.JButton btnOptionManagement;
    private javax.swing.JButton btnOptionManagement1;
    private javax.swing.JButton btnQuestionManagement1;
    private javax.swing.JButton btnQuizManagement;
    private javax.swing.JButton btnSubjectManagement;
    private javax.swing.JButton btnUserManagement1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHomepage;
    // End of variables declaration//GEN-END:variables
}
