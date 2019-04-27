package com.bpd.arsip.view;

import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.model.DusModel;

/**
 *
 * @author Dany Candra
 */
public class NewMain {

    /**
     * @param args the command line arguments
     * @throws com.bpd.arsip.exception.ArsipException
     */
    public static void main(String[] args) throws ArsipException {
        DusModel model=new DusModel();
        model.deleteDus(2, "RK-2242019-001-9");
        

    }

}
