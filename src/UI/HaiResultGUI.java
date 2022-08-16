package UI;

import model.HailResult;

import javax.swing.*;
import java.awt.*;

public class HaiResultGUI {
    HailResult hailResult;

    private JFrame resultFrame = new JFrame();
    private JPanel resultPanel = new JPanel();
    private JLabel resultLabel = new JLabel();
    private JLabel detailLabel = new JLabel();


    public HaiResultGUI(HailResult hailResult) {
        this.hailResult = hailResult;
        setResultFrame();
        setupResultLabel();
        setupDetailLabel();
        setResultPanel();
        resultFrame.add(resultPanel);
        resultPanel.add(resultLabel);
        resultPanel.add(detailLabel);
        resultFrame.setVisible(true);
    }




    private void setResultFrame() {
        resultFrame.setTitle("Hail Calculator");
        resultFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        resultFrame.setSize(800, 600);
        resultFrame.setLayout(new BorderLayout());
        resultFrame.getContentPane().setBackground(new Color(195, 243, 241));
    }

    private void setResultPanel(){
        resultPanel.setPreferredSize(new Dimension(800, 600));
        resultPanel.setLayout(null);
        resultPanel.setBackground(new Color(195, 243, 241));
    }

    private void setupResultLabel() {
        resultLabel = new JLabel();
        resultLabel.setBounds(20, 100, 700, 300);
        resultLabel.setText(hailResult.toString());
        resultLabel.setForeground(new Color(143, 65, 15));
        resultLabel.setFont(new Font("Hail", Font.BOLD, 13));
    }

    private void setupDetailLabel() {
        detailLabel = new JLabel();
        detailLabel.setBounds(20, 140, 700, 300);
        detailLabel.setText(hailResult.resultString());
        //detailLabel.setForeground(new Color(143, 65, 15));
        detailLabel.setFont(new Font("Hail", Font.BOLD, 13));
    }



}
