package com.form;

import javax.swing.*;
import java.awt.*;

public class Calculation extends JFrame{
    private JPanel panel1;
    private JTabbedPane tabbedPanel;
    private JPanel panelTab1;
    private JPanel panelTab2;
    private JPanel panelTab3;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton btnClear;
    private JButton btnBackspace;
    private JButton btnPer;
    private JButton btnNum_Seven;
    private JButton btnNum_Four;
    private JButton btnNum_One;
    private JButton button7;
    private JButton btnNum_Eight;
    private JButton btnNum_Nine;
    private JButton btnMul;
    private JButton btnNum_Five;
    private JButton btnNum_Six;
    private JButton btnSub;
    private JButton btnNum_Two;
    private JButton btnNum_Zero;
    private JButton btnNum_Three;
    private JButton btnDot;
    private JButton btnSum;
    private JButton btnResult;
    private JButton btnDiv;

    private void initComponents() {
        //setTitle("Kết quả:");
        this.setLocationRelativeTo(null);
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public Calculation() throws HeadlessException {
        initComponents();
    }


}
