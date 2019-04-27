/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.component;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Dany Candra
 */
public class CenterFrame {

    public static void makeCenter(Dialog component) {
        component.setTitle("E - Arsip Kredit | Bank Jateng");
        component.setIconImage(getIcon());
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension framesize = component.getSize();
        if (framesize.height > screensize.height) {
            framesize.height = screensize.height;
        }
        if (framesize.width > screensize.width) {
            framesize.width = screensize.width;
        }
        component.setLocation((screensize.width - framesize.width) / 2, (screensize.height - framesize.height) / 2);
    }

    public static void makeCenter(JFrame component) {
        component.setTitle("E - Arsip Kredit | Bank Jateng");
        component.setIconImage(getIcon());
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension framesize = component.getSize();
        if (framesize.height > screensize.height) {
            framesize.height = screensize.height;
        }
        if (framesize.width > screensize.width) {
            framesize.width = screensize.width;
        }
        component.setLocation((screensize.width - framesize.width) / 2, (screensize.height - framesize.height) / 2);
    }

    public static Image getIcon() {
        Image image = Toolkit.getDefaultToolkit().getImage("rsc/com/bpd/arsip/icon/favicon.png");
        return image;
    }

}
