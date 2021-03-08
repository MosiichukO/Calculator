package SimpleCalc;
import javax.swing.*;
import java.awt.*;

public class CalcFrame extends JFrame {

    public CalcFrame(JPanel calcPanel) {
        frameMaking(calcPanel);
    }

    public void frameMaking(JPanel calcPanel){
        setTitle("Calculator");
        setSize(400, 400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(calcPanel);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
