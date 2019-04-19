/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.componet;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;
import javax.swing.JViewport;


public class ViewPort extends JViewport {

    public ViewPort() {
        super();
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    @Override
    protected void paintChildren(Graphics g) {
        super.paintChildren(g);

        GeneralPath s = new GeneralPath();
        s.moveTo(0, 0);
        s.lineTo(0, getHeight());
        s.curveTo(0, getHeight(), getWidth() / 5, getHeight() / 5, getWidth(), 0);
        s.closePath();

        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setComposite(AlphaComposite.SrcOver.derive(0.3F));
        g2.setColor(Color.WHITE);
        g2.fill(s);
    }
}
