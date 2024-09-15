package view;

import javax.swing.*;

public class ResultPanel extends JPanel {
    private JLabel resultLabel;

    public ResultPanel() {
        resultLabel = new JLabel("Result: ");
        add(resultLabel);
    }

    // Getter and setter for resultLabel
}