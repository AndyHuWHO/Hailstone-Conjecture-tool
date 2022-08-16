package UI;

import model.HailCalculator;
import model.HailResult;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HailConjectureGUI implements ActionListener {
    private HailCalculator hailCalculator;
    private JFrame mainFrame = new JFrame();
    private JPanel mainPanel = new JPanel();
    private JTextField inputTextField = new JTextField();
    private JButton startButton = new JButton("start");
    private JButton historyButton = new JButton("Show History");
    private JLabel introLabel = new JLabel();

    public HailConjectureGUI (){
        hailCalculator = new HailCalculator();
        setMainFrame();
        setMainPanel();
        setupIntroLabel();
        mainFrame.add(mainPanel);
        inputTextField.setBounds(100,100,100,30);
        startButton.setBounds(230,100,100,30);
        startButton.addActionListener(this);
        historyButton.setBounds(230,200,300,30);
        mainPanel.add(inputTextField);
        mainPanel.add(startButton);
        mainPanel.add(historyButton);
        mainPanel.add(introLabel);
        mainFrame.setVisible(true);
    }

    private void setMainFrame() {
        mainFrame.setTitle("Hail Calculator");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800, 600);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.getContentPane().setBackground(new Color(195, 243, 241));
    }

    private void setMainPanel(){
        mainPanel.setPreferredSize(new Dimension(800, 600));
        mainPanel.setLayout(null);
        mainPanel.setBackground(new Color(195, 243, 241));
    }

    private void setupIntroLabel() {
        introLabel = new JLabel();
        introLabel.setBounds(20, 230, 600, 300);
        introLabel.setText("<html>The ''Hail Conjecture'' proposes that for every positive integer,"
                +" if keep doing the following operation, if the integer is even, divide it by 2, "
                + "if it's odd, multiply it by 3 and plus 1,"
                + " the result will always eventually drop to 1! Enter a positive integer and try it here!</html>");
        introLabel.setForeground(new Color(143, 65, 15));
        introLabel.setFont(new Font("Hail", Font.ITALIC, 15));
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            HailResult hailResult = hailCalculator.hail(Integer.parseInt(inputTextField.getText()));
            new HaiResultGUI(hailResult);
        } if (e.getSource() == historyButton) {
            new HailHistoryGUI(hailCalculator);
        }

    }
}



