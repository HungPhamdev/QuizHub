package view.Quiz;

import controller.QuizController;
import controller.SubjectController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Quiz;
import model.Subject;
import view.MainFrame;

public class QuizManagementPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    private final QuizController quizController;
    private final SubjectController subjectController;
    private String title;
    private int subjectId;
    private String level;
    private Map<String, Integer> subjectMap = new HashMap<>();

    public QuizManagementPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        quizController = new QuizController();
        subjectController = new SubjectController();

        initComponents();

        loadCbbSubjects();
        loadQuizData();
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
        jLabel3 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtTitle = new javax.swing.JTextField();
        cbxLevel = new javax.swing.JComboBox<>();
        cbxSubject = new javax.swing.JComboBox<>();
        btnBackToHome = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblQuiz = new javax.swing.JTable();

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
        jLabel1.setText("Title:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Subject:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Level:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        btnAdd.setBackground(new java.awt.Color(0, 153, 51));
        btnAdd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add Quiz");
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
        btnUpdate.setText("Update Quiz");
        btnUpdate.setToolTipText("Click to update a user");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, 30));

        btnDelete.setBackground(new java.awt.Color(153, 0, 0));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete Quiz");
        btnDelete.setToolTipText("Click to delete a user");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, 30));

        txtTitle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 26, 260, 30));

        cbxLevel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn 1 option", "Easy", "Medium", "Hard" }));
        jPanel2.add(cbxLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 260, 30));

        cbxSubject.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(cbxSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 260, 30));

        btnBackToHome.setBackground(new java.awt.Color(204, 204, 204));
        btnBackToHome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBackToHome.setText("<- Back to Home");
        btnBackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToHomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnBackToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 950, 240));
        jPanel2.getAccessibleContext().setAccessibleName("");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quiz Management");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 37, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 100));

        tblQuiz.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblQuiz.setModel(new QuizTableModel());
        tblQuiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuizMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblQuiz);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 950, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteQuiz();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        title = txtTitle.getText();
        String selectedSubjectName = (String) cbxSubject.getSelectedItem();
        subjectId = subjectMap.get(selectedSubjectName);
        level = cbxLevel.getSelectedItem().toString();

        if (title.trim().isEmpty()) {
            showErrorMessage("Title is required!");
            return;
        } else if (selectedSubjectName.trim().isEmpty()) {
            showErrorMessage("Subject is required!");
            return;
        } else if (cbxLevel.getSelectedIndex() == 0) {
            showErrorMessage("Level is required!");
            return;
        }

        boolean isTitleExists = this.quizController.isTitleExists(title);
        if (isTitleExists) {
            showErrorMessage("Title is exists!");
            return;
        }

        addQuiz(title, subjectId, level);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selectedRow = tblQuiz.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a quiz to update!");
            return;
        }

        int quizId = ((QuizTableModel) tblQuiz.getModel()).getQuizId(selectedRow);
        title = txtTitle.getText();
        String selectedSubjectName = (String) cbxSubject.getSelectedItem();
        subjectId = subjectMap.get(selectedSubjectName);
        level = cbxLevel.getSelectedItem().toString();

        if (title.trim().isEmpty()) {
            showErrorMessage("Title is required!");
            return;
        } else if (selectedSubjectName.trim().isEmpty()) {
            showErrorMessage("Subject is required!");
            return;
        } else if (cbxLevel.getSelectedIndex() == 0) {
            showErrorMessage("Level is required!");
            return;
        }

        String titleInDB = this.quizController.findTitleById(quizId);
        boolean isTitleExists = this.quizController.isTitleExists(title);
        if (!title.equals(titleInDB) && isTitleExists) {
            showErrorMessage("Title is exists!");
            return;
        }

        modifyQuiz(quizId, title, subjectId, level);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblQuizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuizMouseClicked
        int row = tblQuiz.getSelectedRow();
        if (row != -1) {
            txtTitle.setText(tblQuiz.getValueAt(row, 1).toString());

            String subjectName = tblQuiz.getValueAt(row, 2).toString();
            cbxSubject.setSelectedItem(subjectName);

            var level = tblQuiz.getValueAt(row, 3);
            level = level == null ? "Chọn 1 option" : level.toString();
            cbxLevel.setSelectedItem(tblQuiz.getValueAt(row, 3).toString());
        }
    }//GEN-LAST:event_tblQuizMouseClicked

    private void btnBackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToHomeActionPerformed
        mainFrame.showHomePanel();
    }//GEN-LAST:event_btnBackToHomeActionPerformed

    private void loadQuizData() {
        QuizTableModel quizModel = (QuizTableModel) tblQuiz.getModel();
        quizModel.setRowCount(0); // Clear existing rows

        List<Quiz> quizzes = quizController.listQuizzes();
        for (Quiz quiz : quizzes) {
            quizModel.addQuiz(quiz.getQuizId(), quiz.getTitle(), quiz.getSubjectName(), quiz.getLevel());
        }
        
        hideColumnByIndex(tblQuiz, 0);
    }

    private void loadCbbSubjects() {
        List<Subject> subjects = subjectController.listSubjects(); // Assuming this fetches all subject data

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        for (Subject subject : subjects) {
            String subjectNameItem = subject.getSubjectName();
            int subjectIdItem = subject.getId();

            // Add to JComboBox
            model.addElement(subjectNameItem);

            // Store in the map
            subjectMap.put(subjectNameItem, subjectIdItem);
        }

        cbxSubject.setModel(model);
    }

    private void addQuiz(String title, int subjectId, String level) {
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setSubjectId(subjectId);
        quiz.setLevel(level);

        int insertResult = quizController.addQuiz(quiz);
        String message = insertResult > 0 ? "successfully" : "failed";
        JOptionPane.showMessageDialog(this, String.format("Quiz added %s!", message));

        loadQuizData();
        clearFields();
        reloadSubjectMap();
    }

    private void modifyQuiz(int quizId, String title, int subjectId, String level) {
        Quiz quiz = new Quiz();
        quiz.setQuizId(quizId);
        quiz.setTitle(title);
        quiz.setSubjectId(subjectId);
        quiz.setLevel(level);

        int updateResult = quizController.modifyQuiz(quiz);
        String message = updateResult > 0 ? "successfully" : "failed";
        JOptionPane.showMessageDialog(this, String.format("Quiz update %s!", message));

        loadQuizData();
        clearFields();
        reloadSubjectMap();
    }

    private void deleteQuiz() {
        int selectedRow = tblQuiz.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a quiz to delete!");
            return;
        }

        int quizId = ((QuizTableModel) tblQuiz.getModel()).getQuizId(selectedRow);

        int deleteResult = quizController.removeQuiz(quizId);
        String message = deleteResult > 0 ? "successfully" : "failed";
        JOptionPane.showMessageDialog(this, String.format("Quiz remove %s!", message));

        loadQuizData();
        clearFields();
        reloadSubjectMap();
    }

    private void clearFields() {
        txtTitle.setText("");
        cbxSubject.setSelectedIndex(0);
        cbxLevel.setSelectedIndex(0);
    }

    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Input Error", JOptionPane.ERROR_MESSAGE);
    }

    private void hideColumnByIndex(javax.swing.JTable jTable, int columnIndex) {
        jTable.getColumnModel().getColumn(columnIndex).setMinWidth(0);
        jTable.getColumnModel().getColumn(columnIndex).setMaxWidth(0);
        jTable.getColumnModel().getColumn(columnIndex).setWidth(0);
    }

    private void reloadSubjectMap() {
        subjectMap.clear(); // Clear existing entries
        List<Subject> subjects = subjectController.listSubjects(); // Fetch all subjects

        for (Subject subject : subjects) {
            subjectMap.put(subject.getSubjectName(), subject.getId());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBackToHome;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxLevel;
    private javax.swing.JComboBox<String> cbxSubject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblQuiz;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
