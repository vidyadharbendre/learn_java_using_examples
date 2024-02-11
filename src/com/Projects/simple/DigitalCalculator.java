package com.Projects.simple;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitalCalculator extends JFrame {

    private JTextField displayField;
    private JButton[] digitButtons;
    private JButton addButton, subtractButton, multiplyButton, divideButton, equalsButton, clearButton;

    private double currentValue = 0;
    private String currentOperator = "";
    private boolean isNewValue = true;

    public DigitalCalculator() {
        setTitle("Digital Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayField = new JTextField();
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setFont(new Font("Arial", Font.PLAIN, 20));
        displayField.setEditable(false);

        digitButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            digitButtons[i] = new JButton(String.valueOf(i));
            digitButtons[i].setFont(new Font("Arial", Font.PLAIN, 16));
            digitButtons[i].addActionListener(new DigitButtonListener());
        }

        addButton = createOperatorButton("+");
        subtractButton = createOperatorButton("-");
        multiplyButton = createOperatorButton("*");
        divideButton = createOperatorButton("/");
        equalsButton = new JButton("=");
        equalsButton.setFont(new Font("Arial", Font.PLAIN, 16));
        equalsButton.addActionListener(new EqualsButtonListener());

        clearButton = new JButton("C");
        clearButton.setFont(new Font("Arial", Font.PLAIN, 16));
        clearButton.addActionListener(new ClearButtonListener());

        JPanel calculatorPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        for (int i = 1; i <= 9; i++) {
            calculatorPanel.add(digitButtons[i]);
        }
        calculatorPanel.add(addButton);
        calculatorPanel.add(digitButtons[0]);
        calculatorPanel.add(subtractButton);
        calculatorPanel.add(multiplyButton);
        calculatorPanel.add(divideButton);
        calculatorPanel.add(equalsButton);
        calculatorPanel.add(clearButton);

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.add(displayField, BorderLayout.NORTH);
        mainPanel.add(calculatorPanel, BorderLayout.CENTER);

        add(mainPanel);
    }

    private JButton createOperatorButton(String operator) {
        JButton button = new JButton(operator);
        button.setFont(new Font("Arial", Font.PLAIN, 16));
        button.addActionListener(new OperatorButtonListener(operator));
        return button;
    }

    private class DigitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String digit = source.getText();

            if (isNewValue) {
                displayField.setText(digit);
                isNewValue = false;
            } else {
                displayField.setText(displayField.getText() + digit);
            }
        }
    }

    private class OperatorButtonListener implements ActionListener {
        private String operator;

        public OperatorButtonListener(String operator) {
            this.operator = operator;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            performOperation();
            currentOperator = operator;
            isNewValue = true;
        }
    }

    private class EqualsButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            performOperation();
            currentOperator = "";
            isNewValue = true;
        }
    }

    private class ClearButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            currentValue = 0;
            currentOperator = "";
            displayField.setText("");
            isNewValue = true;
        }
    }

    private void performOperation() {
        if (!isNewValue) {
            double inputValue = Double.parseDouble(displayField.getText());
            switch (currentOperator) {
                case "+":
                    currentValue += inputValue;
                    break;
                case "-":
                    currentValue -= inputValue;
                    break;
                case "*":
                    currentValue *= inputValue;
                    break;
                case "/":
                    if (inputValue != 0) {
                        currentValue /= inputValue;
                    } else {
                        JOptionPane.showMessageDialog(DigitalCalculator.this, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                        clearCalculator();
                        return;
                    }
                    break;
                default:
                    currentValue = inputValue;
                    break;
            }
            displayField.setText(String.valueOf(currentValue));
        }
    }

    private void clearCalculator() {
        currentValue = 0;
        currentOperator = "";
        displayField.setText("");
        isNewValue = true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DigitalCalculator calculator = new DigitalCalculator();
            calculator.setLocationRelativeTo(null); // Center the frame
            calculator.setVisible(true);
        });
    }
}
