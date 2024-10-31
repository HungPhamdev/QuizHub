package view.Question;

import controller.QuestionController;
import controller.QuizController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Question;
import model.Quiz;
import view.MainFrame;

public class QuestionManagementPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    private final QuestionController questionController;
    private final QuizController quizController;
    private String title;
    private String questionType;
    private int quizId;
    private Map<String, Integer> quizMap = new HashMap<>();

    public QuestionManagementPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        questionController = new QuestionController();
        quizController = new QuizController();

        initComponents();

        loadCbbQuizzes();
         loadQuestionData();
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
        txtQuestionType = new javax.swing.JTextField();
        btnBackToHome = new javax.swing.JButton();
        cbbQuizName = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblQuestion = new javax.swing.JTable();

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
        jLabel2.setText("Question Type:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Quiz Name:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        btnAdd.setBackground(new java.awt.Color(0, 153, 51));
        btnAdd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add Question");
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
        btnUpdate.setText("Update Question");
        btnUpdate.setToolTipText("Click to update a user");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, 30));

        btnDelete.setBackground(new java.awt.Color(153, 0, 0));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete Question");
        btnDelete.setToolTipText("Click to delete a user");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, 30));

        txtTitle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 260, 30));

        txtQuestionType.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(txtQuestionType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 260, 30));

        btnBackToHome.setBackground(new java.awt.Color(204, 204, 204));
        btnBackToHome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBackToHome.setText("<- Back to Home");
        btnBackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToHomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnBackToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, -1, -1));

        jPanel2.add(cbbQuizName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 260, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 950, 240));
        jPanel2.getAccessibleContext().setAccessibleName("");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Question Management");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 37, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 100));

        tblQuestion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblQuestion.setModel(new QuestionTableModel());
        tblQuestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuestionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblQuestion);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 950, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteQuestion();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        title = txtTitle.getText();
        questionType = txtQuestionType.getText();
        String selectedQuizName = (String) cbbQuizName.getSelectedItem();
        quizId = quizMap.get(selectedQuizName);

        if (title.trim().isEmpty()) {
            showErrorMessage("Title is required!");
            return;
        } else if (questionType.trim().isEmpty()) {
            showErrorMessage("Question type is required!");
            return;
        } else if (selectedQuizName.trim().isEmpty()) {
            showErrorMessage("Quiz name is required!");
            return;
        }

        boolean isTitleExists = this.questionController.isTitleExists(title);
        if (isTitleExists) {
            showErrorMessage("Title is exists!");
            return;
        }

        addQuestion(title, questionType, quizId);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selectedRow = tblQuestion.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a question to update!");
            return;
        }

        title = txtTitle.getText();
        questionType = txtQuestionType.getText();
        String selectedQuizName = (String) cbbQuizName.getSelectedItem();
        quizId = quizMap.get(selectedQuizName);
        int questionId = ((QuestionTableModel) tblQuestion.getModel()).getQuestionId(selectedRow);

        if (title.trim().isEmpty()) {
            showErrorMessage("Title is required!");
            return;
        } else if (questionType.trim().isEmpty()) {
            showErrorMessage("Question type is required!");
            return;
        } else if (selectedQuizName.trim().isEmpty()) {
            showErrorMessage("Quiz name is required!");
            return;
        }
        String titleInDB = this.questionController.findTitleById(questionId);
        boolean isTitleExists = this.questionController.isTitleExists(title);
        if (!title.equals(titleInDB) && isTitleExists) {
            showErrorMessage("Title is exists!");
            return;
        }

        modifyQuestion(title, questionType, quizId, questionId);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblQuestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuestionMouseClicked
        int row = tblQuestion.getSelectedRow();
        if (row != -1) {
            txtTitle.setText(tblQuestion.getValueAt(row, 1).toString());
            txtQuestionType.setText(tblQuestion.getValueAt(row, 2).toString());
            String selectedQuizName = tblQuestion.getValueAt(row, 3).toString();
            cbbQuizName.setSelectedItem(selectedQuizName);
        }
    }//GEN-LAST:event_tblQuestionMouseClicked

    private void btnBackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToHomeActionPerformed
        mainFrame.showHomePanel();
    }//GEN-LAST:event_btnBackToHomeActionPerformed

    private void loadQuestionData() {
        QuestionTableModel questionModel = (QuestionTableModel) tblQuestion.getModel();
        questionModel.setRowCount(0); // Clear existing rows

        List<Question> questions = questionController.listQuestions();
        for (Question question : questions) {
            questionModel.addQuestion(question.getQuestionId(), question.getTitle(), question.getQuestionType(), question.getQuizName());
        }

        hideColumnByIndex(tblQuestion, 0);
    }

    private void loadCbbQuizzes() {
        List<Quiz> quizzes = quizController.listQuizzes(); // Assuming this fetches all subject data

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        for (Quiz quiz : quizzes) {
            String quizNameItem = quiz.getTitle();
            int quizIdItem = quiz.getQuizId();

            // Add to JComboBox
            model.addElement(quizNameItem);

            // Store in the map
            quizMap.put(quizNameItem, quizIdItem);
        }

        cbbQuizName.setModel(model);
    }

    private void addQuestion(String title, String questionType, int quizId) {
        Question question = new Question();
        question.setTitle(title);
        question.setQuestionType(questionType);
        question.setQuizId(quizId);

        int insertResult = questionController.addQuestion(question);
        String message = insertResult > 0 ? "successfully" : "failed";
        JOptionPane.showMessageDialog(this, String.format("Question added %s!", message));

        loadQuestionData();
        clearFields();
        reloadQuizMap();
    }

    private void modifyQuestion(String title, String questionType, int quizId, int questionId) {
        Question question = new Question();
        question.setTitle(title);
        question.setQuestionType(questionType);
        question.setQuizId(quizId);
        question.setQuestionId(questionId);

        int updateResult = questionController.modifyQuestion(question);
        String message = updateResult > 0 ? "successfully" : "failed";
        JOptionPane.showMessageDialog(this, String.format("Question update %s!", message));

        loadQuestionData();
        clearFields();
        reloadQuizMap();
    }

    private void deleteQuestion() {
        int selectedRow = tblQuestion.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a question to delete!");
            return;
        }

        int questionId = ((QuestionTableModel) tblQuestion.getModel()).getQuestionId(selectedRow);

        int deleteResult = questionController.removeQuestion(questionId);
        String message = deleteResult > 0 ? "successfully" : "failed";
        JOptionPane.showMessageDialog(this, String.format("Question remove %s!", message));

        loadQuestionData();
        clearFields();
        reloadQuizMap();
    }

    private void clearFields() {
        txtTitle.setText("");
        txtQuestionType.setText("");
        cbbQuizName.setSelectedIndex(0);
    }

    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Input Error", JOptionPane.ERROR_MESSAGE);
    }

    private void hideColumnByIndex(javax.swing.JTable jTable, int columnIndex) {
        jTable.getColumnModel().getColumn(columnIndex).setMinWidth(0);
        jTable.getColumnModel().getColumn(columnIndex).setMaxWidth(0);
        jTable.getColumnModel().getColumn(columnIndex).setWidth(0);
    }

    private void reloadQuizMap() {
        quizMap.clear(); // Clear existing entries
        List<Quiz> quizzes = quizController.listQuizzes(); // Fetch all quizzes

        for (Quiz quiz : quizzes) {
            quizMap.put(quiz.getTitle(), quiz.getQuizId());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBackToHome;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbbQuizName;
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
    private javax.swing.JTable tblQuestion;
    private javax.swing.JTextField txtQuestionType;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
