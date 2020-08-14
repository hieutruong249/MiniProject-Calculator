package com.gui.utilities;

import com.pojo.utilities.mass.*;
import com.pojo.utilities.volume.CbCentimeter;
import com.pojo.utilities.volume.CbMeter;
import com.pojo.utilities.volume.Liter;
import com.pojo.utilities.volume.Volume;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class frmVolume extends Utilities{
    List<Volume> listUnit = new ArrayList<>();
    Volume unit1, unit2 = null;

    protected void initComponents() {
        setTitle("Volume converter");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setContentPane(this.rootPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initUnit() {
        listUnit.add(new CbMeter());
        listUnit.add(new CbCentimeter());
        listUnit.add(new Liter());

    }

    public frmVolume() throws HeadlessException {
        initComponents();
        initUnit();

        for (Volume unit : listUnit) {
            cbUnit1.addItem(unit);
            cbUnit2.addItem(unit);
        }

        cbUnit1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                unit1 = (Volume) cbUnit1.getSelectedItem();
                lbUnit1.setText(unit1.getName());

            }
        });

        cbUnit2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                unit2 = (Volume) cbUnit2.getSelectedItem();
                lbUnit2.setText(unit2.getName());
            }
        });

        btnResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = convert(unit1, unit2, Double.valueOf(txtParam1.getText()));
                txtParam2.setText(formatter.format(value));

            }

            private double convert(Volume unit, Volume unit2, Double value) {
                unit.setValue(value);

                if (unit2 instanceof CbMeter) return unit.convertM3();
                else if (unit2 instanceof CbCentimeter) return unit.convertCm3();
                else if (unit2 instanceof Liter) return unit.convertL();
                else
                    return unit.getValue();
            }
        });
    }
}
