/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.model;

import com.bpd.arsip.helper.render.TableRenderDefault;
import com.stripbandunk.jwidget.annotation.TableColumn;

/**
 *
 * @author Dany
 */
public class BerkasModel {

    @TableColumn(name = "NAMA BERKAS", number = 1, size = 50,renderer = TableRenderDefault.class)
    private String namaBerkas;
    @TableColumn(name = "ISI BERKAS", number = 2, size = 50,renderer = TableRenderDefault.class)
    private String isiBerkas;

    public BerkasModel() {
    }

    public BerkasModel(String namaBerkas, String isiBerkas) {
        this.namaBerkas = namaBerkas;
        this.isiBerkas = isiBerkas;
    }

    public String getNamaBerkas() {
        return namaBerkas;
    }

    public void setNamaBerkas(String namaBerkas) {
        this.namaBerkas = namaBerkas;
    }

    public String getIsiBerkas() {
        return isiBerkas;
    }

    public void setIsiBerkas(String isiBerkas) {
        this.isiBerkas = isiBerkas;
    }

}
