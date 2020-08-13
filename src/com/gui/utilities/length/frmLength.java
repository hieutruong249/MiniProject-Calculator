package com.gui.utilities.length;

import com.gui.utilities.Utilities;
import com.pojo.utilities.length.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;


public class frmLength extends Utilities {

    HashMap<String, String> listUnit = new HashMap<String, String>();
    String unit1 = "";
    String unit2 = "";


    protected void initComponents() {
        setTitle("Length converter");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setContentPane(this.rootPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initUnit() {
        listUnit.put("km", "Kilometer");
        listUnit.put("m", "Meter");
        listUnit.put("dm", "Decimeter");
        listUnit.put("cm", "Centimeter");
        listUnit.put("mm", "Milimeter");
    }

    public frmLength() throws HeadlessException {
        initComponents();
        initUnit();


        for (String unit : listUnit.keySet()) {
            cbUnit1.addItem(unit);
            cbUnit2.addItem(unit);
        }

        cbUnit1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String unit = (String) cbUnit1.getSelectedItem();
                unit1 = listUnit.get(unit);
                lbUnit1.setText(unit1);

            }
        });

        cbUnit2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String unit = (String) cbUnit2.getSelectedItem();
                unit2 = listUnit.get(unit);
                lbUnit2.setText(unit2);
            }
        });
        btnResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = convert(unit1, unit2, Double.valueOf(txtParam1.getText()));
                txtParam2.setText(formatter.format(value));

            }
        });

    }

    public double convert(String unit1, String unit2, double value) {
        Length unit = null;

        if (unit1.equals("Kilometer")) {
            unit = new Kilometer();
        } else if (unit1.equals("Meter")) {
            unit = new Meter();
        } else if (unit1.equals("Decimeter")) {
            unit = new Decimeter();
        } else if (unit1.equals("Centimeter")) {
            unit = new Centimeter();
        } else if (unit1.equals("Milimeter")) {
            unit = new Milimeter();
        } else return value;

        unit.setValue(value);

        if (unit2.equals("Kilometer")) return unit.convertKm();
        else if (unit2.equals("Meter")) return unit.convertM();
        else if (unit2.equals("Centimeter")) return unit.convertCm();
        else if (unit2.equals("Decimeter")) return unit.convertDm();
        else if (unit2.equals("Milimeter")) return unit.convertMm();
        else
            return unit.getValue();
    }


}
