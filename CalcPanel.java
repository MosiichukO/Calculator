package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcPanel extends JPanel implements ActionListener {
    private JTextField textFieldNum1, textFieldNum2, textFieldMathOperation, textAreaResult;
    private JLabel labelNumber1, labelNumber2, labelMathOperation, labelResult;
    private MyCalculator calc;

    public CalcPanel(MyCalculator calc){
        constructAll();
        this.calc = calc;
    }
    public void constructAll() {
        setLayout(null);
        constructLabels();
        constructTextFields();
        constructButton();
        constructFieldResult();


    }
    private void constructLabels() {
        labelNumber1 = new JLabel("Number 1");
        labelNumber1.setBounds(45, 50, 100, 40);
        add(labelNumber1);
        labelNumber2 = new JLabel("Number 2");
        labelNumber2.setBounds(45, 110, 100, 40);
        add(labelNumber2);
        labelMathOperation = new JLabel("Math operation");
        labelMathOperation.setBounds(45, 170, 100, 40);
        add(labelMathOperation);
        labelResult = new JLabel("Result");
        labelResult.setBounds(45, 280, 100, 40);
        add(labelResult);
    }
    private void constructTextFields() {
        textFieldNum1 = new JTextField();
        textFieldNum1.setBounds(150, 50, 190, 40);
        add(textFieldNum1);
        textFieldNum2 = new JTextField();
        textFieldNum2.setBounds(150, 110, 190, 40);
        add(textFieldNum2);
        textFieldMathOperation = new JTextField();
        textFieldMathOperation.setBounds(150, 170, 190, 40);
        add(textFieldMathOperation);
    }
    public void constructButton(){
        JButton button = new JButton("=");
        button.setBounds(40, 230, 300, 50);
        button.addActionListener(new MyActionListener());
        add(button);

    }
    public void constructFieldResult(){
        textAreaResult = new JTextField();
        textAreaResult.setBounds(150, 290, 190, 50);
        textAreaResult.setEditable(false);
        add(textAreaResult);
    }
    public String getNumber1() {
        return textFieldNum1.getText();
    }


    public String getNumber2() {
        return textFieldNum2.getText();
    }

    public String getMathOperation() {
        return textFieldMathOperation.getText();
    }

    public JTextField getTextFieldResult() {
        return textAreaResult;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calc.getResult();
        }
    }
}
