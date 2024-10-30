package view.Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class QuizAppView extends JPanel {
    private int currentQuestionIndex = 0;
    private String selectedSubject;
        private int score = 0;


    // Define questions and options by subject
    private Map<String, String[]> questionsMap = new HashMap<>();
    private Map<String, String[][]> optionsMap = new HashMap<>();
    private Map<String, int[]> correctAnswersMap = new HashMap<>();

    private JLabel questionLabel;
    private JRadioButton[] optionButtons;
    private JButton nextButton;

    public QuizAppView() {
        setLayout(new BorderLayout());
        setBackground(new Color(245, 245, 245));
        initializeQuestions();
        showSubjectSelection();
    }

    private void initializeQuestions() {
        // Math questions
        questionsMap.put("Math", new String[]{
            "What is 2 + 2?", 
            "What is 10 / 2?", 
            "What is the square root of 16?"
        });
        optionsMap.put("Math", new String[][]{
            {"4", "3", "2", "1"},
            {"10", "5", "3", "2"},
            {"2", "4", "6", "8"}
        });
        correctAnswersMap.put("Math", new int[]{0, 1, 1});

        // English questions
        questionsMap.put("English", new String[]{
            "What is the synonym of 'happy'?", 
            "What is the antonym of 'big'?",
            "What is a noun?"
        });
        optionsMap.put("English", new String[][]{
            {"Sad", "Joyful", "Angry", "Funny"},
            {"Small", "Huge", "Tiny", "Large"},
            {"An action", "A place", "A thing or person", "A description"}
        });
        correctAnswersMap.put("English", new int[]{1, 0, 2});

        // Physics questions
        questionsMap.put("Physics", new String[]{
            "What is the speed of light?", 
            "What is Newton's first law?",
            "What is the unit of force?"
        });
        optionsMap.put("Physics", new String[][]{
            {"300,000 km/s", "150,000 km/s", "500,000 km/s", "1,000 km/s"},
            {"Inertia", "Gravity", "Relativity", "Energy"},
            {"Joule", "Newton", "Watt", "Pascal"}
        });
        correctAnswersMap.put("Physics", new int[]{0, 0, 1});
    }

    private void showSubjectSelection() {
        JPanel subjectPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        subjectPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        subjectPanel.setBackground(new Color(245, 245, 245));

        JLabel label = new JLabel("Select a Subject");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.NORTH);

        JButton mathButton = createStyledButton("Math");
        JButton englishButton = createStyledButton("English");
        JButton physicsButton = createStyledButton("Physics");

        subjectPanel.add(mathButton);
        subjectPanel.add(englishButton);
        subjectPanel.add(physicsButton);

        add(subjectPanel, BorderLayout.CENTER);

        mathButton.addActionListener(e -> startQuiz("Math"));
        englishButton.addActionListener(e -> startQuiz("English"));
        physicsButton.addActionListener(e -> startQuiz("Physics"));
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
        String[] questions = questionsMap.get(selectedSubject);
        int[] correctAnswers = correctAnswersMap.get(selectedSubject);

        for (int i = 0; i < questions.length; i++) {
            if (optionButtons[correctAnswers[i]].isSelected()) {
                score++;
            }
        }

        JOptionPane.showMessageDialog(this, "Quiz Finished! You scored " + score + " out of " + questions.length + ".");
        System.exit(0);
    }

    private class NextButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < optionButtons.length; i++) {
                if (optionButtons[i].isSelected()) {
                    currentQuestionIndex++;
                    showQuestion();
                    return;
                }
            }
            JOptionPane.showMessageDialog(QuizAppView.this, "Please select an answer.");
        }
    }
}
