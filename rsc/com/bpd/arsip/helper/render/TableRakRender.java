/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bpd.arsip.helper.render;


import com.bpd.arsip.model.RakModel;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Dany Candra
 */
public class TableRakRender extends TableRenderDefault{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label= (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
        if (value instanceof RakModel) {
            RakModel rak= (RakModel) value;
            label.setText("Rak "+rak.getNamaRak());
        }
        return label;
    }
    
}
