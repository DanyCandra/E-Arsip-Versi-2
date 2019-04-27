/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bpd.arsip.helper.render;


import com.bpd.arsip.model.PejabatModel;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author Dany Candra
 */
public class TablePejabatRender extends TableRenderDefault {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
        if (value instanceof PejabatModel) {
            PejabatModel model=(PejabatModel) value;
            String text=model.getNamaPejabat();
            label.setText(text);
        }
        return label;
    }
    
}
