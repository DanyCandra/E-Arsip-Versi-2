package com.bpd.arsip.dao;

import com.bpd.arsip.entitas.Quota;
import com.bpd.arsip.exception.ArsipException;

/**
 *
 * @author Dany Candra
 */
public interface QuotaDao {

    public void update(Quota quota) throws ArsipException;

    public Quota showQuota() throws ArsipException;
}
