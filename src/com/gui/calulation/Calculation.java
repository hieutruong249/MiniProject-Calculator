package com.gui.calulation;

import com.gui.utilities.length.frmLength;
import com.gui.utilities.mass.frmMass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculation extends JFrame {
    private JPanel panel1;
    private JTabbedPane tabbedPanel;
    private JPanel panelTab1;
    private JPanel panelTab2;
    private JPanel panelTab3;
    private JTextField txtResult;
    private JTextField textField2;
    private JTextField textField1;
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
    private JButton lengthButton;
    private JButton massButton;
    private JButton volumeButton;

    Double num, ans;
    int cal;

    private void initComponents() {
        //setTitle("Kết quả:");

        this.setLocationRelativeTo(null);
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public Calculation() throws HeadlessException {
        initComponents();

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");

            }
        });
        btnNum_Seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + btnNum_Seven.getText());
            }
        });
        btnNum_Eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + btnNum_Eight.getText());
            }
        });
        btnNum_Nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + btnNum_Nine.getText());
            }
        });
        btnNum_Four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + btnNum_Four.getText());
            }
        });
        btnNum_Five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + btnNum_Five.getText());
            }
        });
        btnNum_Six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + btnNum_Six.getText());
            }
        });
        btnNum_Two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + btnNum_Two.getText());
            }
        });
        btnNum_Three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + btnNum_Three.getText());
            }
        });
        btnNum_One.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + btnNum_One.getText());
            }
        });
        btnNum_Zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + btnNum_Zero.getText());
            }
        });

        btnResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arithmetic_operation();
                textField2.setText("");
            }
        });
        btnBackspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textField1.getText();
                if (str != null && str.length() != 0) {
                    textField1.setText(str.substring(0, str.length() - 1));
                }

            }
        });
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + btnDot.getText());
            }
        });

        btnSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.valueOf(textField1.getText());
                cal = 1;
                textField1.setText("");
                textField2.setText(num + btnSum.getText());

            }
        });
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.valueOf(textField1.getText());
                cal = 2;
                textField1.setText("");
                textField2.setText(num + btnSub.getText());

            }
        });
        btnMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.valueOf(textField1.getText());
                cal = 3;
                textField1.setText("");
                textField2.setText(num + btnMul.getText());

            }
        });
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.valueOf(textField1.getText());
                cal = 4;
                textField1.setText("");
                textField2.setText(num + btnDiv.getText());

            }
        });

        btnPer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.valueOf(textField1.getText()) / 100;
                textField1.setText(num.toString());
                //txtParam2.setText(num.toString());
            }
        });

        lengthButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmLength frm = new frmLength();
                frm.setVisible(true);
                dispose();
            }
        });

        massButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmMass frm = new frmMass();
                frm.setVisible(true);
                dispose();
            }
        });
    }

    public void arithmetic_operation() {
        switch (cal) {
            case 1:
                ans = num + Double.valueOf(textField1.getText());
                textField1.setText(ans.toString());
                break;
            case 2:
                ans = num - Double.valueOf(textField1.getText());
                textField1.setText(ans.toString());
                break;
            case 3:
                ans = num * Double.valueOf(textField1.getText());
                textField1.setText(ans.toString());
                break;
            case 4:
                ans = num / Double.valueOf(textField1.getText());
                textField1.setText(ans.toString());
                break;

        }
    }


}
