package com.gui.utilities;

import com.gui.calulation.Calculation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Utilities extends JFrame {
    protected JComboBox cbUnit1;
    protected JTextField txtParam1;
    protected JComboBox cbUnit2;
    protected JTextField txtParam2;
    protected JButton btnNum_Seven;
    protected JButton btnNum_Eight;
    protected JButton btnNum_Nine;
    protected JButton btnNum_Four;
    protected JButton btnNum_Five;
    protected JButton btnNum_Six;
    protected JButton btnNum_One;
    protected JButton btnNum_Two;
    protected JButton btnNum_Three;
    protected JButton btnNum_Zero;
    protected JButton btnDot;
    protected JButton btnClear;
    protected JButton btnBackspace;
    protected JPanel rootPanel;
    protected JButton button14;
    protected JLabel lbUnit1;
    protected JLabel lbUnit2;
    protected JButton btnResult;

    final protected DecimalFormat formatter = new DecimalFormat("#,###.###");

    protected void initComponents() {
        this.setLocationRelativeTo(null);
        this.setContentPane(this.rootPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        txtParam1.setText("0");
    }

    protected Utilities() throws HeadlessException {
        initComponents();
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calculation frm = new Calculation();
                frm.setLocationRelativeTo(null);
                frm.setVisible(true);
                dispose();
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtParam1.setText("");
                txtParam2.setText("");
            }
        });
        btnNum_One.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtParam1.setText(txtParam1.getText() + btnNum_One.getText());
            }
        });
        btnNum_Two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtParam1.setText(txtParam1.getText() + btnNum_Two.getText());
            }
        });
        btnNum_Three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtParam1.setText(txtParam1.getText() + btnNum_Three.getText());
            }
        });
        btnNum_Four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtParam1.setText(txtParam1.getText() + btnNum_Four.getText());
            }
        });
        btnNum_Five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtParam1.setText(txtParam1.getText() + btnNum_Five.getText());
            }
        });
        btnNum_Six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtParam1.setText(txtParam1.getText() + btnNum_Six.getText());
            }
        });
        btnNum_Seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtParam1.setText(txtParam1.getText() + btnNum_Seven.getText());
            }
        });
        btnNum_Eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtParam1.setText(txtParam1.getText() + btnNum_Six.getText());
            }
        });
        btnNum_Nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtParam1.setText(txtParam1.getText() + btnNum_Nine.getText());
            }
        });
        btnNum_Zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtParam1.setText(txtParam1.getText() + btnNum_Zero.getText());
            }
        });
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtParam1.setText(txtParam1.getText() + btnDot.getText());
            }
        });
        btnBackspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = txtParam1.getText();
                if (str != null && str.length() != 0) {
                    txtParam1.setText(str.substring(0, str.length() - 1));
                }
            }
        });

    }
}
