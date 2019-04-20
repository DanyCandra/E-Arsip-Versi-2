package com.bpd.arsip.view;

import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.helper.HelperGeneratorAutoId;
import com.bpd.arsip.model.DusModel;
import java.util.Random;

/**
 *
 * @author Dany Candra
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArsipException {
        DusModel dusModel = new DusModel();
        int totalItem = dusModel.getLongList();
        System.out.print(totalItem);

    }

}
