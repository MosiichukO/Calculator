package SimpleCalc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyCalculator implements ActionListener {
    private CalcPanel panel;

    public MyCalculator() {
        panel = new CalcPanel(this);
        new CalcFrame(panel);
    }

    void  getResult() {
        double num1 = 0, num2 = 0;
        char mathOperation = ' ';
        try {
            num1 = Double.parseDouble(panel.getNumber1());
            num2 = Double.parseDouble(panel.getNumber2());
            mathOperation = panel.getMathOperation().charAt(0);
        } catch (NullPointerException e) {
            panel.getTextFieldResult().setText("Enter number 1 and number 2");
            throw new NullPointerException();
        } catch (NumberFormatException e) {
            panel.getTextFieldResult().setText("Incorrect data");
            throw new NumberFormatException();
        }

        double result;
        result = CalcAPI.calculate(num1, num2, mathOperation);
        panel.getTextFieldResult().setText(String.valueOf(result));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
