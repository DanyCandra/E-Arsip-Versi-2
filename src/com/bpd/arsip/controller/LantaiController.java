package com.bpd.arsip.controller;

import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.helper.HelperGeneratorAutoId;
import com.bpd.arsip.model.LantaiModel;
import com.bpd.arsip.validator.ValidatorNotNull;
import com.bpd.arsip.validator.ValidatorNumber;
import com.bpd.arsip.validator.ValidatorTextLimit;
import com.bpd.arsip.view.panel.PanelPenyimpananLantai;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author Dany Candra
 */
public class LantaiController {

    private LantaiModel lantaiModel;

    public void setLantaiModel(LantaiModel lantaiModel) {
        this.lantaiModel = lantaiModel;
    }

    public boolean isSelectedRow(PanelPenyimpananLantai view) {
        boolean result = false;
        if (view.getTableLantai().getSelectedRow() != -1 && view.getTableLantai().getSelectedRowCount() == 1) {
            result = true;
        } else {
            JOptionPane.showMessageDialog(view, "Silahkan Pilih Data Terlebih Dahulu");
        }
        return result;
    }

    public void selectPejabat(PanelPenyimpananLantai view) {
        int index = view.getTableLantai().getSelectedRow();
        lantaiModel = view.getTableModelLantai().get(view.getTableLantai().convertRowIndexToModel(index));
        view.getTextNama().setText(lantaiModel.getNamaLantai());
    }

    public void initInputButton(PanelPenyimpananLantai view, boolean value) {
        view.getButtonTambah().setEnabled(value);
        view.getButtonUbah().setEnabled(value);
        view.getButtonHapus().setEnabled(value);
        view.getButtonBatal().setEnabled(!value);
        view.getButtonSimpan().setEnabled(!value);
        view.getTableLantai().setEnabled(value);

        view.getTextNama().setEnabled(!value);
    }

    public void inputText(PanelPenyimpananLantai view, boolean isInput) {
        if (isInput == true) {
            view.getTextNama().setText("");
        }
        view.getTextNama().requestFocus();
    }

    public void insertLantai(PanelPenyimpananLantai view) {
        String namaLantai = view.getTextNama().getText().toUpperCase();

        if (ValidatorNotNull.isNotNull(namaLantai, view, "KODE TEMPAT")
                && ValidatorNumber.isNumber(namaLantai, view, "KODE TEMPAT")
                && ValidatorTextLimit.isLimit(namaLantai,3, view, "KODE TEMPAT")) {
            try {

                lantaiModel.setIdLantai(HelperGeneratorAutoId.generateAutoIdLantai());
                lantaiModel.setNamaLantai(namaLantai);
                if (lantaiModel.isCanInsert() == true) {
                    lantaiModel.insert();
                    JOptionPane.showMessageDialog(view, "Data Berhasil Disimpan");
                    batal(view);
                } else {
                    JOptionPane.showMessageDialog(view, "Data Gagal Disimpan, Data Telah Tersedia");
                }

            } catch (ArsipException ex) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error Dengan Database", ex.getMessage()}, "Telah Terjadi Error", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(LantaiController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void updateLantai(PanelPenyimpananLantai view) {

        if (view.getTableLantai().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Silahkan Pilih Data Terlebih Dahulu");
        } else {
            String namaLantai = view.getTextNama().getText().toUpperCase();

            if (ValidatorNotNull.isNotNull(namaLantai, view, "KODE TEMPAT")
                    && ValidatorNumber.isNumber(namaLantai, view, "KODE TEMPAT")
                    && ValidatorTextLimit.isLimit(namaLantai,3, view, "KODE TEMPAT")) {
                try {

                    lantaiModel.setNamaLantai(namaLantai);
                    lantaiModel.update();
                    JOptionPane.showMessageDialog(view, "Data Berhasil Disimpan");
                    batal(view);

                } catch (ArsipException ex) {
                    JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error Dengan Database", ex.getMessage()}, "Telah Terjadi Error", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(LantaiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public void tambah(PanelPenyimpananLantai view) {
        initInputButton(view, false);
        inputText(view, true);
        view.setInput(true);

    }

    public void ubah(PanelPenyimpananLantai view) {
        if (isSelectedRow(view) == true) {
            view.setInput(false);
            selectPejabat(view);
            initInputButton(view, false);
            inputText(view, false);
            view.setInput(false);
        }
    }

    public void hapus(PanelPenyimpananLantai view) {
        if (isSelectedRow(view) == true) {
            int index = view.getTableLantai().getSelectedRow();
            if (JOptionPane.showConfirmDialog(view, "Apakah Anda Yakin Akan Menghapus Data ?") == JOptionPane.OK_OPTION) {
                try {
                    lantaiModel = view.getTableModelLantai().get(view.getTableLantai().convertRowIndexToModel(index));
                    if (lantaiModel.isCanDelete()) {
                        lantaiModel.delete();
                        initInputButton(view, true);
                        inputText(view, true);
                        JOptionPane.showMessageDialog(view, "Data Berhasil Dihapus");
                        loadTableLantai(view);
                    } else {
                        JOptionPane.showMessageDialog(view, "Data Gagal Dihapus, Data Telah Berelasi Dengan Data Pengarsipan");
                    }
                } catch (ArsipException ex) {
                    Logger.getLogger(PejabatController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void simpan(PanelPenyimpananLantai view) {
        if (view.isInput() == true) {
            insertLantai(view);
        } else if (view.isInput() == false) {
            updateLantai(view);
        }
        loadTableLantai(view);
    }

    public void batal(PanelPenyimpananLantai view) {
        initInputButton(view, true);
        inputText(view, true);
    }

    public void loadTableLantai(PanelPenyimpananLantai view) {
        new SwingWorker<List<LantaiModel>, Object>() {

            @Override
            protected List<LantaiModel> doInBackground() throws Exception {
                view.getMainFrame().startLoading(true);
                List<LantaiModel> select = lantaiModel.load();
                return select;
            }

            @Override
            protected void done() {
                try {
                    view.getTableModelLantai().clear();
                    for (LantaiModel lantaiModel : get()) {
                        view.getTableModelLantai().add(lantaiModel);
                    }
                    view.getMainFrame().startLoading(false);
                } catch (InterruptedException | ExecutionException ex) {
                    Logger.getLogger(LantaiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }.execute();
    }

}
