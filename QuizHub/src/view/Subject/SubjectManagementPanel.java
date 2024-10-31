package view.Subject;

import controller.SubjectController;
import java.util.List;
import javax.swing.JOptionPane;
import model.Subject;
import view.MainFrame;

public class SubjectManagementPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    private final SubjectController subjectController;
    private String subjectName;
    private String description;

    public SubjectManagementPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        subjectController = new SubjectController();

        initComponents();

        loadSubjectData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtDescription = new javax.swing.JTextField();
        txtSubjectName = new javax.swing.JTextField();
        btnBackToHome = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSubject = new javax.swing.JTable();

        jTextField2.setText("jTextField2");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setPreferredSize(new java.awt.Dimension(1000, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Subject Name:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Description:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 30));

        btnAdd.setBackground(new java.awt.Color(0, 153, 51));
        btnAdd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add Subject");
        btnAdd.setToolTipText("Click to add a new user");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 30));

        btnUpdate.setBackground(new java.awt.Color(0, 51, 204));
        btnUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update Subject");
        btnUpdate.setToolTipText("Click to update a user");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, 30));

        btnDelete.setBackground(new java.awt.Color(153, 0, 0));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete Subject");
        btnDelete.setToolTipText("Click to delete a user");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, 30));

        txtDescription.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 260, 30));

        txtSubjectName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(txtSubjectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 260, 30));

        btnBackToHome.setBackground(new java.awt.Color(204, 204, 204));
        btnBackToHome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBackToHome.setText("<- Back to Home");
        btnBackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToHomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnBackToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 950, 240));
        jPanel2.getAccessibleContext().setAccessibleName("");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Subject Management");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 37, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 100));

        tblSubject.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblSubject.setModel(new SubjectTableModel());
        tblSubject.setColumnSelectionAllowed(true);
        tblSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSubjectMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSubject);
        tblSubject.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 950, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteSubject();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        subjectName = txtSubjectName.getText();
        description = txtDescription.getText();

        if (subjectName.trim().isEmpty()) {
            showErrorMessage("Subject name is required!");
            return;
        }

        boolean isSubjectNameExists = this.subjectController.isSubjectNameExists(subjectName);
        if (isSubjectNameExists) {
            showErrorMessage("Subject name is exists!");
            return;
        }

        addSubject(subjectName, description);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selectedRow = tblSubject.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a subject to update!");
            return;
        }
        int subjectId = ((SubjectTableModel) tblSubject.getModel()).getSubjectId(selectedRow);
        subjectName = txtSubjectName.getText();
        description = txtDescription.getText();

        if (subjectName.trim().isEmpty()) {
            showErrorMessage("Subject name is required!");
            return;
        }

        String subjectNameInDB = this.subjectController.findSubjectNameById(subjectId);

        boolean isSubjectNameExists = this.subjectController.isSubjectNameExists(subjectName);
        if (!subjectName.equals(subjectNameInDB) && isSubjectNameExists) {
            showErrorMessage("Subject name is exists!");
            return;
        }

        modifySubject(subjectId, subjectName, description);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSubjectMouseClicked
        int row = tblSubject.getSelectedRow();
        if (row != -1) {
            txtSubjectName.setText(tblSubject.getValueAt(row, 1).toString());
            txtDescription.setText(tblSubject.getValueAt(row, 2).toString());
        }
    }//GEN-LAST:event_tblSubjectMouseClicked

    private void btnBackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToHomeActionPerformed
        mainFrame.showHomePanel();
    }//GEN-LAST:event_btnBackToHomeActionPerformed

    private void loadSubjectData() {
        SubjectTableModel subjectModel = (SubjectTableModel) tblSubject.getModel();
        subjectModel.setRowCount(0); // Clear existing rows

        List<Subject> subjects = subjectController.listSubjects();
        for (Subject subject : subjects) {
            subjectModel.addSubject(subject.getId(), subject.getSubjectName(), subject.getDescription());
        }

        hideColumnByIndex(tblSubject, 0);
    }

    private void addSubject(String subjectName, String description) {
        Subject subject = new Subject();
        subject.setSubjectName(subjectName);
        subject.setDescription(description);

        int insertResult = subjectController.addSubject(subject);
        String message = insertResult > 0 ? "successfully" : "failed";
        JOptionPane.showMessageDialog(this, String.format("Subject added %s!", message));

        loadSubjectData();
        clearFields();
    }

    private void modifySubject(int subjectId, String subjectName, String description) {
        Subject subject = new Subject();
        subject.setId(subjectId);
        subject.setSubjectName(subjectName);
        subject.setDescription(description);

        int updateResult = subjectController.modifySubject(subject);
        String message = updateResult > 0 ? "successfully" : "failed";
        JOptionPane.showMessageDialog(this, String.format("Subject update %s!", message));

        loadSubjectData();
        clearFields();
    }

    private void deleteSubject() {
        int selectedRow = tblSubject.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a subject to delete!");
            return;
        }

        int subjectId = ((SubjectTableModel) tblSubject.getModel()).getSubjectId(selectedRow);

        int deleteResult = subjectController.removeSubject(subjectId);
        String message = deleteResult > 0 ? "successfully" : "failed";
        JOptionPane.showMessageDialog(this, String.format("Subject remove %s!", message));

        loadSubjectData();
        clearFields();
    }

    private void clearFields() {
        txtSubjectName.setText("");
        txtDescription.setText("");
    }

    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    
    private void hideColumnByIndex(javax.swing.JTable jTable, int columnIndex){
        jTable.getColumnModel().getColumn(columnIndex).setMinWidth(0);
        jTable.getColumnModel().getColumn(columnIndex).setMaxWidth(0);
        jTable.getColumnModel().getColumn(columnIndex).setWidth(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBackToHome;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblSubject;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtSubjectName;
    // End of variables declaration//GEN-END:variables
}
