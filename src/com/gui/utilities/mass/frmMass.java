package com.gui.utilities.mass;

import com.gui.utilities.Utilities;
import com.pojo.utilities.length.*;
import com.pojo.utilities.mass.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class frmMass extends Utilities {
    List<Mass> listUnit = new ArrayList<>();
    Mass unit1, unit2 = null;

    protected void initComponents() {
        setTitle("Length converter");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setContentPane(this.rootPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initUnit() {
        listUnit.add(new Tonne());
        listUnit.add(new Kilogram());
        listUnit.add(new Gram());
        listUnit.add(new Miligram());
    }

    public frmMass() throws HeadlessException {
        initComponents();
        initUnit();

        for (Mass unit : listUnit) {
            cbUnit1.addItem(unit);
            cbUnit2.addItem(unit);
        }

        cbUnit1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                unit1 = (Mass) cbUnit1.getSelectedItem();
                lbUnit1.setText(unit1.getName());

            }
        });

        cbUnit2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                unit2 = (Mass) cbUnit2.getSelectedItem();
                lbUnit2.setText(unit2.getName());
            }
        });
        btnResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = convert(unit1, unit2, Double.valueOf(txtParam1.getText()));
                txtParam2.setText(formatter.format(value));

            }

            private double convert(Mass unit1, Mass unit2, Double value) {
                Mass unit = null;

                if (unit1 instanceof Tonne) {
                    unit = new Tonne();
                } else if (unit1 instanceof Kilogram) {
                    unit = new Kilogram();
                } else if (unit1 instanceof Gram) {
                    unit = new Gram();
                } else if (unit1 instanceof Miligram) {
                    unit = new Miligram();
                } else return value;

                unit.setValue(value);

                if (unit2 instanceof Tonne) return unit.convertTon();
                else if (unit2 instanceof Kilogram) return unit.convertKg();
                else if (unit2 instanceof Gram) return unit.convertG();
                else if (unit2 instanceof Miligram) return unit.convertMg();
                else
                    return unit.getValue();
            }
        });
    }
}
