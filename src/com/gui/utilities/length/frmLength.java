package com.gui.utilities.length;

import com.gui.utilities.Utilities;
import com.pojo.utilities.length.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class frmLength extends Utilities {

    List<Length> listUnit = new ArrayList<>();
    Length unit1, unit2 = null;


    protected void initComponents() {
        super.initComponents();
        setTitle("Length converter");
    }

    public void initUnit() {
        listUnit.add(new Kilometer());
        listUnit.add(new Meter());
        listUnit.add(new Centimeter());
        listUnit.add(new Decimeter());
        listUnit.add(new Milimeter());
    }

    public frmLength() throws HeadlessException {
        initComponents();
        initUnit();

        for (Length unit : listUnit) {
            cbUnit1.addItem(unit);
            cbUnit2.addItem(unit);
        }

        cbUnit1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                unit1 = (Length) cbUnit1.getSelectedItem();
                lbUnit1.setText(unit1.getName());
            }
        });

        cbUnit2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                unit2 = (Length) cbUnit2.getSelectedItem();
                lbUnit2.setText(unit2.getName());
            }
        });
        btnResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(unit1 != null && unit2 !=null){
                    double value = convert(unit1, unit2, Double.valueOf(txtParam1.getText()));
                    txtParam2.setText(formatter.format(value));
                }
            }

            public double convert(Length unit, Length unit2, double value) {
                unit.setValue(value);

                if (unit2 instanceof Kilometer) return unit.convertKm();
                else if (unit2 instanceof Meter) return unit.convertM();
                else if (unit2 instanceof Centimeter) return unit.convertCm();
                else if (unit2 instanceof Decimeter) return unit.convertDm();
                else if (unit2 instanceof Milimeter) return unit.convertMm();
                else
                    return unit.getValue();
            }
        });

    }




}
