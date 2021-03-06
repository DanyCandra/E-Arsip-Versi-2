/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.helper.render;

import java.awt.Component;
import java.text.NumberFormat;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author Dany Candra
 */
public class JumlahPertanggunganRender extends TableRenderDefault {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.

        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMinimumIntegerDigits(0);
        numberFormat.setGroupingUsed(true);

        Double tnpBilangan = (Double) value;
        String terbilang = numberFormat.format(tnpBilangan);
        String text = "Rp. " + terbilang;
        label.setText(text);

        return label;
    }

}
