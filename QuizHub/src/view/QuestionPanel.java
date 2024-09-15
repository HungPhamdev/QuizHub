package view;

import javax.swing.*;

public class QuestionPanel extends JPanel {
    private JLabel questionLabel;
    private ButtonGroup answerGroup;
    private JRadioButton[] answerButtons;

    public QuestionPanel() {
        questionLabel = new JLabel();
        answerGroup = new ButtonGroup();
        answerButtons = new JRadioButton[4];

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(questionLabel);

        for (int i = 0; i < answerButtons.length; i++) {
            answerButtons[i] = new JRadioButton();
            answerGroup.add(answerButtons[i]);
            add(answerButtons[i]);
        }
    }

    // Getters and setters for questionLabel and answerButtons
}