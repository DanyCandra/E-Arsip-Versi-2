package com.bpd.arsip.entitas;

/**
 *
 * @author Dany Candra
 */
public class Quota {
    
    private Integer id;
    private Integer isiDus;
    private Integer isiRak;
    
    public Quota() {
    }
    
    public Quota(Integer id, Integer isiDus, Integer isiRak) {
        this.id = id;
        this.isiDus = isiDus;
        this.isiRak = isiRak;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getIsiDus() {
        return isiDus;
    }
    
    public void setIsiDus(Integer isiDus) {
        this.isiDus = isiDus;
    }
    
    public Integer getIsiRak() {
        return isiRak;
    }
    
    public void setIsiRak(Integer isiRak) {
        this.isiRak = isiRak;
    }
    
    
    
}
