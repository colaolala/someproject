import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcEngine extends JFrame {

    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton point = new JButton(".");
    JButton equal = new JButton("=");
    JButton clear = new JButton("CLEAR");
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton divide = new JButton("/");
    JButton multiply = new JButton("*");
    JTextArea dispField = new JTextArea(3, 5);
    String value;
    char operator;

    public void makeGui() {
        JPanel content = new JPanel();
        BorderLayout bl = new BorderLayout();
        content.setLayout(bl);

        dispField.setFont(new Font("Arial", Font.PLAIN, 24));
        content.add("North", dispField);

        JPanel pl = new JPanel();
        GridLayout gl = new GridLayout(4, 3);
        pl.setLayout(gl);
        pl.add(button1);
        pl.add(button2);
        pl.add(button3);
        pl.add(button4);
        pl.add(button5);
        pl.add(button6);
        pl.add(button7);
        pl.add(button8);
        pl.add(button9);
        pl.add(point);
        pl.add(button0);
        pl.add(equal);
        content.add("Center", pl);

        JPanel clearbutton = new JPanel();
        BorderLayout br = new BorderLayout();
        clearbutton.setLayout(br);
        clearbutton.add(clear);
        content.add("South", clearbutton);


        JPanel actions = new JPanel();
        GridLayout gr2 = new GridLayout(4, 0);
        actions.setLayout(gr2);
        actions.add(plus);
        actions.add(minus);
        actions.add(multiply);
        actions.add(divide);
        content.add("West", actions);


        JFrame frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispField.setText("");
            }
        });

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispField.append("0".toString());
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispField.append("1".toString());
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispField.append("2".toString());
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispField.append("3".toString());
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispField.append("4".toString());
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispField.append("5".toString());
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispField.append("6".toString());
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispField.append("7".toString());
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispField.append("8".toString());
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispField.append("9".toString());
            }
        });


        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispField.append("+".toString());
                operator = '+';
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispField.append("-".toString());
                operator = '-';
            }
        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispField.append("/".toString());
                operator = '/';
            }
        });

        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispField.append("*".toString());
                operator = '*';
            }
        });

        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String leftSide;
                String rightSide;
                try {
                    leftSide = dispField.getText().substring(0, dispField.getText().indexOf(operator + ""));
                    rightSide = dispField.getText().substring(dispField.getText().indexOf(operator + "") + 1, dispField.getText().length());
                    switch (operator) {
                        case '+':
                            dispField.append(" = " + ((Double.parseDouble(leftSide) + Double.parseDouble(rightSide))));
                            break;
                        case '-':
                            dispField.append(" = " + ((Double.parseDouble(leftSide) - Double.parseDouble(rightSide))));
                            break;
                        case '/':
                            dispField.append(" = " + ((Double.parseDouble(leftSide) / Double.parseDouble(rightSide))));
                            break;
                        case '*':
                            dispField.append(" = " + ((Double.parseDouble(leftSide) * Double.parseDouble(rightSide))));
                            break;
                        default:
                            dispField.setText(" No result...");
                            break;
                    }
                } catch (Exception e1) {
                }
            }
        });
    }
}
