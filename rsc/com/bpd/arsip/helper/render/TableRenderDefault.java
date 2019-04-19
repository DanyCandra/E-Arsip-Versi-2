/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.helper.render;

import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Dany
 */
public class TableRenderDefault implements TableCellRenderer {

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = null;
        final Color dark = new Color(1F, 1F, 1F, 0F);
        final Color light = new Color(1F, 1F, 1F, 0.3F);
        if (column % 2 == 0) {
            label = new JLabel(value.toString()) {

                @Override
                protected void paintComponent(Graphics g) {
                    GradientPaint paint = new GradientPaint(0, 0, dark, getWidth(), 0, light);
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setPaint(paint);
                    g2.fillRect(0, 0, getWidth(), getHeight());
                    super.paintComponent(g);
                }
            };
        } else {
            label = new JLabel(value.toString()) {

                @Override
                protected void paintComponent(Graphics g) {
                    GradientPaint paint = new GradientPaint(0, 0, light, getWidth(), 0, dark);
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setPaint(paint);
                    g2.fillRect(0, 0, getWidth(), getHeight());
                    super.paintComponent(g);
                }
            };
        }

        label.setOpaque(false);

        if (isSelected) {
            label.setOpaque(true);
            label.setForeground(table.getSelectionForeground());
            label.setBackground(Color.BLUE);
        } else {
            label.setForeground(table.getForeground());
        }

        return label;
    }
}
