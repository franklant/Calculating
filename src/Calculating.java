import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Franklan Taylor
// 4/19/2024
// COMP167-001
// Using javax components to create a personal scientific calculator

public class Calculating extends JFrame implements ActionListener {
    // Components
    private JButton clearButton;
    private JButton buttonSeven;
    private JButton buttonEight;
    private JButton buttonNine;
    private JButton buttonFour;
    private JButton buttonFive;
    private JButton buttonSix;
    private JButton buttonOne;
    private JButton buttonTwo;
    private JButton buttonThree;
    private JButton buttonZero;
    private JButton multButton;
    private JButton divideButton;
    private JButton powerTwoButton;
    private JButton addButton;
    private JButton subtractButton;
    private JButton cubedButton;
    private JButton equalButton;
    private JButton modButton;
    private JButton decimalButton;
    private JButton posOrNegButton;
    private JButton oneOverNButton;
    private JButton percentButton;
    private JButton squareRootButton;
    private JButton sinButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton logButton;
    private JButton lnButton;
    private JButton asinButton;
    private JButton acosButton;
    private JButton atanButton;
    private JButton tenPowerNButton;
    private JButton absButton;
    private JButton sinHButton;
    private JButton cosHButton;
    private JButton tanHButton;
    private JButton exitButton;
    private JButton ansButton;
    private JTextArea inputTextArea;
    private JTextField outputTextField;
    private JTextField currentOperation;
    boolean isAdding;
    boolean isSubtracting;
    boolean isDividing;
    boolean isMultiplyng;
    boolean isModulo;
    double tempVal = 0;
    double nextVal = 0;

    Calculating() {
        // Variables
        GridBagConstraints layoutConstraints = null;
        Color buttonColor = new Color(125, 125, 125);
        Color textAreaColor = new Color(175, 175, 175);

        setLayout(new GridBagLayout());
        getContentPane().setBackground(new Color(0, 25, 153)); // set background color

        // JTextArea inputTextArea
        inputTextArea = new JTextArea("0");
        inputTextArea.setEditable(false);
        inputTextArea.setBackground(textAreaColor);
        inputTextArea.setFont(new Font("bold", Font.BOLD, 20));

        // JTextField outputTextField
        outputTextField = new JTextField("0");
        outputTextField.setEditable(false);
        outputTextField.setBackground(textAreaColor);
        outputTextField.setFont(new Font("bold", Font.BOLD, 20));
        outputTextField.setHorizontalAlignment(JTextField.RIGHT);

        // JTextField currentOperation
        currentOperation = new JTextField("");
        currentOperation.setEditable(false);
        currentOperation.setBackground(textAreaColor);
        currentOperation.setFont(new Font("bold", Font.BOLD, 20));
        currentOperation.setHorizontalAlignment(JTextField.CENTER);

        // JButton clearButton
        clearButton = new JButton("C");
        clearButton.addActionListener(this);
        clearButton.setBackground(buttonColor);

        // JButton buttonSeven
        buttonSeven = new JButton("7");
        buttonSeven.addActionListener(this);
        buttonSeven.setBackground(buttonColor);

        // JButton buttonEight
        buttonEight = new JButton("8");
        buttonEight.addActionListener(this);
        buttonEight.setBackground(buttonColor);

        // JButton buttonNine
        buttonNine = new JButton("9");
        buttonNine.addActionListener(this);
        buttonNine.setBackground(buttonColor);

        // JButton buttonFour
        buttonFour = new JButton("4");
        buttonFour.addActionListener(this);
        buttonFour.setBackground(buttonColor);

        // JButton buttonFive
        buttonFive = new JButton("5");
        buttonFive.addActionListener(this);
        buttonFive.setBackground(buttonColor);

        // JButton buttonSiz
        buttonSix = new JButton("6");
        buttonSix.addActionListener(this);
        buttonSix.setBackground(buttonColor);

        // JButton buttonOne
        buttonOne = new JButton("1");
        buttonOne.addActionListener(this);
        buttonOne.setBackground(buttonColor);

        // JButton buttonTwo
        buttonTwo= new JButton("2");
        buttonTwo.addActionListener(this);
        buttonTwo.setBackground(buttonColor);

        // JButton buttonThree
        buttonThree = new JButton("3");
        buttonThree.addActionListener(this);
        buttonThree.setBackground(buttonColor);

        // JButton buttonZero
        buttonZero = new JButton("0");
        buttonZero.addActionListener(this);
        buttonZero.setBackground(buttonColor);

        // JButton multButton
        multButton = new JButton("×");
        multButton.addActionListener(this);
        multButton.setBackground(buttonColor);

        // JButton divideButton
        divideButton = new JButton("÷");
        divideButton.addActionListener(this);
        divideButton.setBackground(buttonColor);

        // JButton powerButton
        powerTwoButton = new JButton("x²");
        powerTwoButton.addActionListener(this);
        powerTwoButton.setBackground(buttonColor);

        // JButton addButton
        addButton = new JButton("+");
        addButton.addActionListener(this);
        addButton.setBackground(buttonColor);

        // JButton subtractButton
        subtractButton = new JButton("-");
        subtractButton.addActionListener(this);
        subtractButton.setBackground(buttonColor);

        // JButton cubedButton
        cubedButton = new JButton("x³");
        cubedButton.addActionListener(this);
        cubedButton.setBackground(buttonColor);

        // JButton equalButton
        equalButton = new JButton("=");
        equalButton.addActionListener(this);
        equalButton.setBackground(buttonColor);

        // JButton modButton
        modButton = new JButton("Mod");
        modButton.addActionListener(this);
        modButton.setBackground(buttonColor);

        // JButton decimalButton
        decimalButton = new JButton(".");
        decimalButton.addActionListener(this);
        decimalButton.setBackground(buttonColor);

        // JButton posOrNegButton
        posOrNegButton = new JButton("±");
        posOrNegButton.addActionListener(this);
        posOrNegButton.setBackground(buttonColor);

        // JButton oneOverNButton
        oneOverNButton = new JButton("1/n");
        oneOverNButton.addActionListener(this);
        oneOverNButton.setBackground(buttonColor);

        // JButton percentButton
        percentButton = new JButton("%");
        percentButton.addActionListener(this);
        percentButton.setBackground(buttonColor);

        // JButton squareRootButton
        squareRootButton = new JButton("√");
        squareRootButton.addActionListener(this);
        squareRootButton.setBackground(buttonColor);

        // JButton sinButton
        sinButton = new JButton("sin");
        sinButton.addActionListener(this);
        sinButton.setBackground(buttonColor);

        // JButton cosButton
        cosButton = new JButton("cos");
        cosButton.addActionListener(this);
        cosButton.setBackground(buttonColor);

        // JButton tanButton
        tanButton = new JButton("tan");
        tanButton.addActionListener(this);
        tanButton.setBackground(buttonColor);

        // JButton logButton
        logButton = new JButton("log");
        logButton.addActionListener(this);
        logButton.setBackground(buttonColor);

        // JButton lnButton
        lnButton = new JButton("ln");
        lnButton.addActionListener(this);
        lnButton.setBackground(buttonColor);

        // JButton asinButton
        asinButton = new JButton("asin");
        asinButton.addActionListener(this);
        asinButton.setBackground(buttonColor);

        // JButton acosButton
        acosButton = new JButton("acos");
        acosButton.addActionListener(this);
        acosButton.setBackground(buttonColor);

        // JButton atanButton
        atanButton = new JButton("atan");
        atanButton.addActionListener(this);
        atanButton.setBackground(buttonColor);

        // JButton tenPowerNButton
        tenPowerNButton = new JButton("10^n");
        tenPowerNButton.addActionListener(this);
        tenPowerNButton.setBackground(buttonColor);

        // JButton absButton
        absButton = new JButton("abs");
        absButton.addActionListener(this);
        absButton.setBackground(buttonColor);

        // JButton sinHButton
        sinHButton = new JButton("sinh");
        sinHButton.addActionListener(this);
        sinHButton.setBackground(buttonColor);

        // JButton cosHButton
        cosHButton = new JButton("cosh");
        cosHButton.addActionListener(this);
        cosHButton.setBackground(buttonColor);

        // JButton tanHButton
        tanHButton = new JButton("tanh");
        tanHButton.addActionListener(this);
        tanHButton.setBackground(buttonColor);

        // JButton exitButton
        exitButton = new JButton("EXIT");
        exitButton.addActionListener(this);
        exitButton.setBackground(buttonColor);

        // JButton ansButton
        ansButton = new JButton("ans");
        ansButton.addActionListener(this);
        ansButton.setBackground(buttonColor);
        
        // add components and styling
        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 0;
        layoutConstraints.gridwidth = 6;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(20, 10, 10, 10);
        add(outputTextField, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 1;
        layoutConstraints.gridwidth = 6;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(10, 10, 10, 10);
        add(inputTextArea, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 2;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 10, 5, 10);
        add(currentOperation, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 5;
        layoutConstraints.gridy = 2;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 10);
        add(clearButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 3;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 10, 5, 5);
        add(buttonSeven, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 3;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(buttonEight, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 2;
        layoutConstraints.gridy = 3;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(buttonNine, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 4;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 10, 5, 5);
        add(buttonFour, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 4;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(buttonFive, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 2;
        layoutConstraints.gridy = 4;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(buttonSix, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 5;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 10, 5, 5);
        add(buttonOne, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 5;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(buttonTwo, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 2;
        layoutConstraints.gridy = 5;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(buttonThree, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 6;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 10, 30, 5);
        add(buttonZero, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 3;
        layoutConstraints.gridy = 3;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(multButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 4;
        layoutConstraints.gridy = 3;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(divideButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 5;
        layoutConstraints.gridy = 3;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 10);
        add(powerTwoButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 3;
        layoutConstraints.gridy = 4;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(addButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 4;
        layoutConstraints.gridy = 4;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(subtractButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 5;
        layoutConstraints.gridy = 4;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 10);
        add(cubedButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 3;
        layoutConstraints.gridy = 5;
        layoutConstraints.gridwidth = 2;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(equalButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 5;
        layoutConstraints.gridy = 5;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 10);
        add(modButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 6;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 30, 5);
        add(decimalButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 2;
        layoutConstraints.gridy = 6;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 30, 5);
        add(posOrNegButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 3;
        layoutConstraints.gridy = 6;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 30, 5);
        add(oneOverNButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 4;
        layoutConstraints.gridy = 6;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 30, 5);
        add(percentButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 5;
        layoutConstraints.gridy = 6;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 30, 10);
        add(squareRootButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 7;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(sinButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 2;
        layoutConstraints.gridy = 7;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(cosButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 3;
        layoutConstraints.gridy = 7;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(tanButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 4;
        layoutConstraints.gridy = 7;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(logButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 5;
        layoutConstraints.gridy = 7;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 10);
        add(lnButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 8;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(asinButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 2;
        layoutConstraints.gridy = 8;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(acosButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 3;
        layoutConstraints.gridy = 8;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(atanButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 4;
        layoutConstraints.gridy = 8;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(tenPowerNButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 5;
        layoutConstraints.gridy = 8;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 10);
        add(absButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 9;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 10, 5, 5);
        add(ansButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 9;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(sinHButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 2;
        layoutConstraints.gridy = 9;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(cosHButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 3;
        layoutConstraints.gridy = 9;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 5);
        add(tanHButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 4;
        layoutConstraints.gridy = 9;
        layoutConstraints.gridwidth = 2;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(0, 0, 5, 10);
        add(exitButton, layoutConstraints);

    } // Calculating()

    public String calculate(double num1, double num2) {
        // handles all arithmetic functionality for double values
        double outputVal = 0;

        if (isAdding) {
            outputVal = num1 + num2;
            isAdding = false;
        } else if (isSubtracting) {
            outputVal = num1 - num2;
            isSubtracting = false;
        } else if (isMultiplyng) {
            outputVal = num1 * num2;
            isMultiplyng = false;
        } else if (isDividing) {
            try {
                outputVal = num1 / num2;
                isDividing = false;
            } catch (ArithmeticException e) {
                System.out.println("Div by zero");
            } // prevents a div by zero exception
        } else if (isModulo) {
            try {
                outputVal = num1 % num2;
                isModulo = false;;
            } catch (ArithmeticException e) {
                System.out.println("Div by zero");
            } // prevents a div by zero exception
        }
        return "" + outputVal;
    } // calculate() default

    public String calculate(int num1, int num2) {
        // handles all arithmetic functionality for int values
        int outputVal = 0;

        if (isAdding) {
            outputVal = num1 + num2;
            isAdding = false;
        } else if (isSubtracting) {
            outputVal = num1 - num2;
            isSubtracting = false;
        } else if (isMultiplyng) {
            outputVal = num1 * num2;
            isMultiplyng = false;
        } else if (isDividing) {
            try {
                outputVal = num1 / num2;
                isDividing = false;
            } catch (ArithmeticException e) {
                System.out.println("Div by zero");
            } // prevents a div by zero exception
        } else if (isModulo) {
            try {
                outputVal = num1 % num2;
                isModulo = false;;
            } catch (ArithmeticException e) {
                System.out.println("Div by zero");
            } // prevents a div by zero exception
        }
        return "" + outputVal;
    } // calculate() overload

    public double operate(JButton source, double tempVal) {
        // handles all trig functionality
        double outputVal = 0.0;
        if (source == sinButton) {
            outputVal = Math.sin(tempVal);
        } else if (source == cosButton) {
            outputVal = Math.cos(tempVal);
        } else if (source == tanButton) {
            outputVal = Math.tan(tempVal);
        } else if (source == logButton) {
            outputVal = Math.log10(tempVal);
        } else if (source == lnButton) {
            outputVal = Math.log(tempVal);
        } else if (source == asinButton) {
            outputVal = Math.asin(tempVal);
        } else if (source == acosButton) {
            outputVal = Math.acos(tempVal);
        } else if (source == atanButton) {
            outputVal = Math.atan(tempVal);
        } else if (source == tenPowerNButton) {
            outputVal = Math.pow(10, tempVal);
        } else if (source == absButton) {
            outputVal = Math.abs(tempVal);
        } else if (source == sinHButton) {
            outputVal = Math.sinh(tempVal);
        } else if (source == cosHButton) {
            outputVal = Math.cosh(tempVal);
        } else if (source == tanHButton) {
            outputVal = Math.tanh(tempVal);
        }

        return outputVal;
    } // operate()

    public boolean isDecimal(double num) {
        // determines whether a specific value is a decimal
        return num != Math.floor(num);
    } // isDecimal()

    public void buttonHandling(JButton source) {
        if (source == buttonSeven) {
            // buttonSeven

            if (inputTextArea.getText().equals("0")) {
                inputTextArea.setText(buttonSeven.getText());
            } else {
                inputTextArea.append(buttonSeven.getText());
            } // if the buttons current value is 0 then replace the number, else append to the number
        } else if (source == buttonEight) {
            // buttonEight

            if (inputTextArea.getText().equals("0")) {
                inputTextArea.setText(buttonEight.getText());
            } else {
                inputTextArea.append(buttonEight.getText());
            } // if the buttons current value is 0 then replace the number, else append to the number
        } else if (source == buttonNine) {
            // buttonNine

            if (inputTextArea.getText().equals("0")) {
                inputTextArea.setText(buttonNine.getText());
            } else {
                inputTextArea.append(buttonNine.getText());
            } // if the buttons current value is 0 then replace the number, else append to the number
        } else if (source == buttonFour) {
            // buttonFour

            if (inputTextArea.getText().equals("0")) {
                inputTextArea.setText(buttonFour.getText());
            } else {
                inputTextArea.append(buttonFour.getText());
            } // if the buttons current value is 0 then replace the number, else append to the number
        } else if (source == buttonFive) {
            // buttonFive

            if (inputTextArea.getText().equals("0")) {
                inputTextArea.setText(buttonFive.getText());
            } else {
                inputTextArea.append(buttonFive.getText());
            } // if the buttons current value is 0 then replace the number, else append to the number
        } else if (source == buttonSix) {
            // buttonSix

            if (inputTextArea.getText().equals("0")) {
                inputTextArea.setText(buttonSix.getText());
            } else {
                inputTextArea.append(buttonSix.getText());
            } // if the buttons current value is 0 then replace the number, else append to the number
        } else if (source == buttonOne) {
            // buttonOne

            if (inputTextArea.getText().equals("0")) {
                inputTextArea.setText(buttonOne.getText());
            } else {
                inputTextArea.append(buttonOne.getText());
            } // if the buttons current value is 0 then replace the number, else append to the number
        } else if (source == buttonTwo) {
            // buttonTwo

            if (inputTextArea.getText().equals("0")) {
                inputTextArea.setText(buttonTwo.getText());
            } else {
                inputTextArea.append(buttonTwo.getText());
            } // if the buttons current value is 0 then replace the number, else append to the number
        } else if (source == buttonThree) {
            // buttonThree

            if (inputTextArea.getText().equals("0")) {
                inputTextArea.setText(buttonThree.getText());
            } else {
                inputTextArea.append(buttonThree.getText());
            } // if the buttons current value is 0 then replace the number, else append to the number
        } else if (source == buttonZero) {
            // buttonZero

            if (inputTextArea.getText().equals("0")) {
                inputTextArea.setText(buttonZero.getText());
            } else {
                inputTextArea.append(buttonZero.getText());
            } // if the buttons current value is 0 then replace the number, else append to the number
        } else if (source == addButton) {
            // addButton
            // store the first value within tempVal and turn on the isAdding state
            // same for the rest of the (+,-,/,*,Mod) buttons
            tempVal = Double.parseDouble(inputTextArea.getText());
            isAdding = true;
            inputTextArea.setText("0");
            currentOperation.setText("+");
        } else if (source == subtractButton) {
            // subtractButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            isSubtracting = true;
            inputTextArea.setText("0");
            currentOperation.setText("-");
        } else if (source == multButton) {
            // multButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            isMultiplyng = true;
            inputTextArea.setText("0");
            currentOperation.setText(multButton.getText());
        } else if (source == divideButton) {
            // divideButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            isDividing = true;
            inputTextArea.setText("0");
            currentOperation.setText(divideButton.getText());
        } else if (source == modButton) {
            // modButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            isModulo = true;
            inputTextArea.setText("0");
            currentOperation.setText(modButton.getText());
        }
        else if (source == decimalButton) {
            // decimalButton

            inputTextArea.append(".");
        } else if (source == posOrNegButton) {
            // posOrNegButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            tempVal = -tempVal;
            if (isDecimal(tempVal)) {
                inputTextArea.setText("" + tempVal);
            } else {
                inputTextArea.setText("" + (int)tempVal);
            }
        } else if (source == oneOverNButton) {
            // oneOverNButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            outputTextField.setText("" + ( 1 / tempVal));
            inputTextArea.setText("0");
        } else if (source == percentButton) {
            // percentButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            outputTextField.setText("" + (tempVal / 100));
            inputTextArea.setText("0");
        }
        else if (source == equalButton) {
            // equalButton

            // get the next value from the input area, then use it for the final calculation
            nextVal = Double.parseDouble(inputTextArea.getText());

            if (isDecimal(tempVal) || isDecimal(nextVal)) {
                outputTextField.setText(calculate(tempVal, nextVal));
            } else {
                outputTextField.setText(calculate((int) tempVal, (int) nextVal)); // "" makes it a string
            } // if the first value is a decimal, keep it as a decimal
            inputTextArea.setText("0");
            currentOperation.setText("");
        } else if (source == powerTwoButton) {
            // powerTwoButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            if (!isDecimal(tempVal)) {
                int outputVal = (int) Math.pow((int)tempVal, 2);
                outputTextField.setText("" + outputVal);
            } else {
                outputTextField.setText("" + Math.pow(tempVal, 2));
            }
            inputTextArea.setText("0"); // clear the input area after
        } else if (source == cubedButton) {
            // cubedButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            if (!isDecimal(tempVal)) {
                int outputVal = (int) Math.pow(tempVal, 3);
                outputTextField.setText("" + outputVal);
            } else {
                outputTextField.setText("" + Math.pow(tempVal, 3));
            }
            inputTextArea.setText("0"); // clear the input area after
        } else if (source == squareRootButton) {
            // squareRootButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            double outputVal = Math.sqrt(tempVal);
            if (!isDecimal(outputVal)) {
                outputTextField.setText("" + (int) outputVal);
            } else {
                outputTextField.setText("" + outputVal);
            }
            inputTextArea.setText("0");
        } else if (source == sinButton) {
            // sinButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            double outputVal = operate(source, tempVal);

            if (isDecimal(outputVal)) {
                outputTextField.setText("" + outputVal);
            } else {
                outputTextField.setText("" + (int) outputVal);
            }
            inputTextArea.setText("0");
        } else if (source == cosButton) {
            // cosButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            double outputVal = operate(source, tempVal);

            if (isDecimal(outputVal)) {
                outputTextField.setText("" + outputVal);
            } else {
                outputTextField.setText("" + (int) outputVal);
            }
            inputTextArea.setText("0");
        } else if (source == tanButton) {
            // tanButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            double outputVal = operate(source, tempVal);

            if (isDecimal(outputVal)) {
                outputTextField.setText("" + outputVal);
            } else {
                outputTextField.setText("" + (int) outputVal);
            }
            inputTextArea.setText("0");
        } else if (source == logButton) {
            // logButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            double outputVal = operate(source, tempVal);

            if (isDecimal(outputVal)) {
                outputTextField.setText("" + outputVal);
            } else {
                outputTextField.setText("" + (int) outputVal);
            }
            inputTextArea.setText("0");
        } else if (source == lnButton) {
            // lnButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            double outputVal = operate(source, tempVal);

            if (isDecimal(outputVal)) {
                outputTextField.setText("" + outputVal);
            } else {
                outputTextField.setText("" + (int) outputVal);
            }
            inputTextArea.setText("0");
        } else if (source == asinButton) {
            // asinButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            double outputVal = operate(source, tempVal);

            if (isDecimal(outputVal)) {
                outputTextField.setText("" + outputVal);
            } else {
                outputTextField.setText("" + (int) outputVal);
            }
            inputTextArea.setText("0");
        } else if (source == acosButton) {
            // acosButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            double outputVal = operate(source, tempVal);

            if (isDecimal(outputVal)) {
                outputTextField.setText("" + outputVal);
            } else {
                outputTextField.setText("" + (int) outputVal);
            }
            inputTextArea.setText("0");
        } else if (source == atanButton) {
            // atanButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            double outputVal = operate(source, tempVal);

            if (isDecimal(outputVal)) {
                outputTextField.setText("" + outputVal);
            } else {
                outputTextField.setText("" + (int) outputVal);
            }
            inputTextArea.setText("0");
        } else if (source == tenPowerNButton) {
            // tenPowerNButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            double outputVal = operate(source, tempVal);

            if (isDecimal(outputVal)) {
                outputTextField.setText("" + outputVal);
            } else {
                outputTextField.setText("" + (int) outputVal);
            }
            inputTextArea.setText("0");
        } else if (source == absButton) {
            // absButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            double outputVal = operate(source, tempVal);

            if (isDecimal(outputVal)) {
                outputTextField.setText("" + outputVal);
            } else {
                outputTextField.setText("" + (int) outputVal);
            }
            inputTextArea.setText("0");
        } else if (source == sinHButton) {
            // sinHButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            double outputVal = operate(source, tempVal);

            if (isDecimal(outputVal)) {
                outputTextField.setText("" + outputVal);
            } else {
                outputTextField.setText("" + (int) outputVal);
            }
            inputTextArea.setText("0");
        } else if (source == cosHButton) {
            // cosHButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            double outputVal = operate(source, tempVal);

            if (isDecimal(outputVal)) {
                outputTextField.setText("" + outputVal);
            } else {
                outputTextField.setText("" + (int) outputVal);
            }
            inputTextArea.setText("0");
        } else if (source == tanHButton) {
            // tanHButton

            tempVal = Double.parseDouble(inputTextArea.getText());
            double outputVal = operate(source, tempVal);

            if (isDecimal(outputVal)) {
                outputTextField.setText("" + outputVal);
            } else {
                outputTextField.setText("" + (int) outputVal);
            }
            inputTextArea.setText("0");
        }
        else if (source == ansButton) {
            // ansButton

            tempVal = Double.parseDouble(outputTextField.getText());

            if (isDecimal(tempVal)) {
                inputTextArea.setText("" + tempVal);
            } else {
                inputTextArea.setText("" + (int)tempVal);
            }
        }
        else if (source == clearButton) {
            // clearButton

            inputTextArea.setText("0");
        } else if (source == exitButton) {
            // exitButton

            System.exit(0); // closes the program
        }
    } // buttonHandling()

    @Override
    public void actionPerformed(ActionEvent e) {
        // Finding the source of the action event
        JButton source = (JButton) e.getSource();

        // If the source is coming from one of the buttons, execute specific function
        buttonHandling(source);

    } // actionPerformed()

    public static void main(String[] args) {
        Calculating frame = new Calculating();

        frame.setTitle("Calculating");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    } // main()
}
