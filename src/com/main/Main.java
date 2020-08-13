package com.main;

import com.gui.calulation.Calculation;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Calculation frm = new Calculation();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        /**
        DecimalFormat formatter = new DecimalFormat("#,###.###");
        String str = "12455055.125555000";
        str = str.replaceAll("[^\\d.]", "");
        System.out.println(formatter.format(Double.valueOf(str)));
         **/
    }
}
