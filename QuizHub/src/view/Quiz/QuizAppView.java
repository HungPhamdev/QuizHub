package view.Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import repositories.QuestionInitializer;

public class QuizAppView extends JPanel {

    private int currentQuestionIndex = 0;
    private String selectedSubject;
    private int score = 0;

    // Define questions and options by subject
    private Map<String, String[]> questionsMap;
    private Map<String, String[][]> optionsMap;
    private Map<String, int[]> correctAnswersMap;

    private JLabel questionLabel;
    private JRadioButton[] optionButtons;
    private JButton nextButton;

    public QuizAppView() {
        setLayout(new BorderLayout());
        setBackground(new Color(245, 245, 245));
        questionsMap = QuestionInitializer.initializeQuestions();
        optionsMap = QuestionInitializer.initializeOptions();
        correctAnswersMap = QuestionInitializer.initializeCorrectAnswers();
        showSubjectSelection();
    }

    private void showSubjectSelection() {
        JPanel subjectPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        subjectPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        subjectPanel.setBackground(new Color(245, 245, 245));

        JLabel label = new JLabel("Select a Subject");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.NORTH);

        JButton mathButton = createStyledButton("Toán");
        JButton englishButton = createStyledButton("Tiếng Anh");
        JButton physicsButton = createStyledButton("Vật Lý");

        subjectPanel.add(mathButton);
        subjectPanel.add(englishButton);
        subjectPanel.add(physicsButton);

        add(subjectPanel, BorderLayout.CENTER);

        mathButton.addActionListener(e -> startQuiz("Toán"));
        englishButton.addActionListener(e -> startQuiz("Tiếng Anh"));
        physicsButton.addActionListener(e -> startQuiz("Vật Lý"));
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(new Color(70, 130, 180));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setFocusPainted(false);
        return button;
    }

    private void startQuiz(String subject) {
        selectedSubject = subject;
        currentQuestionIndex = 0;

        // Clear previous content
        removeAll();

        questionLabel = new JLabel("", SwingConstants.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 20));
        questionLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(questionLabel, BorderLayout.NORTH);

        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(4, 1, 5, 5));
        optionsPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(10, 30, 10, 30),
                BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1)
        ));
        optionsPanel.setBackground(new Color(255, 255, 255));

        optionButtons = new JRadioButton[4];
        ButtonGroup group = new ButtonGroup();

        for (int i = 0; i < optionButtons.length; i++) {
            optionButtons[i] = new JRadioButton();
            optionButtons[i].setFont(new Font("Arial", Font.PLAIN, 16));
            group.add(optionButtons[i]);
            optionsPanel.add(optionButtons[i]);
        }
        add(optionsPanel, BorderLayout.CENTER);

        nextButton = createStyledButton("Next");
        nextButton.setPreferredSize(new Dimension(100, 40));
        nextButton.addActionListener(new NextButtonListener());
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(nextButton);
        buttonPanel.setBackground(new Color(245, 245, 245));
        add(buttonPanel, BorderLayout.SOUTH);

        showQuestion();
        revalidate();
        repaint();
    }

    private void showQuestion() {
        String[] questions = questionsMap.get(selectedSubject);
        String[][] options = optionsMap.get(selectedSubject);

        if (currentQuestionIndex < questions.length) {
            questionLabel.setText(questions[currentQuestionIndex]);
            for (int i = 0; i < options[currentQuestionIndex].length; i++) {
                optionButtons[i].setText(options[currentQuestionIndex][i]);
                optionButtons[i].setSelected(false); // Clear previous selection
            }
        } else {
            showResults();
        }
    }

    private void showResults() {
        int[] correctAnswers = correctAnswersMap.get(selectedSubject);

        // Only increment the score for valid selections
        for (int i = 0; i < currentQuestionIndex; i++) {
            // Check if the user selected the correct answer for each question answered
            if (optionButtons[correctAnswers[i]].isSelected()) {
                score++;
            }
        }

        // Display the results, using currentQuestionIndex for the count of questions answered
        JOptionPane.showMessageDialog(this, "Quiz Finished! You scored " + score + " out of " + currentQuestionIndex + ".");
        System.exit(0);
    }

    private class NextButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < optionButtons.length; i++) {
                if (optionButtons[i].isSelected()) {
                    // Check if the selected option is the correct answer
                    int[] correctAnswers = correctAnswersMap.get(selectedSubject);
                    if (i == correctAnswers[currentQuestionIndex]) {
                        score++;  // Increment score for correct answer
                    }
                    currentQuestionIndex++;
                    showQuestion();  // Show the next question
                    return;
                }
            }
            JOptionPane.showMessageDialog(QuizAppView.this, "Please select an answer.");
        }
    }

}
