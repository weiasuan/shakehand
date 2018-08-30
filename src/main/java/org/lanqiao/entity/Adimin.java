package org.lanqiao.entity;

public class Adimin {
    private int ADMIN_ID;
    private String ADMIN_NAME;
    private String ADMIN_PASSWORD;
    private String ADMIN_ROLE;

    public Adimin(){

    }

    public Adimin(String ADMIN_NAME, String ADMIN_PASSWORD) {
        this.ADMIN_NAME = ADMIN_NAME;
        this.ADMIN_PASSWORD = ADMIN_PASSWORD;
    }

    public int getADMIN_ID() {
        return ADMIN_ID;
    }

    public void setADMIN_ID(int ADMIN_ID) {
        this.ADMIN_ID = ADMIN_ID;
    }

    public String getADMIN_NAME() {
        return ADMIN_NAME;
    }

    public void setADMIN_NAME(String ADMIN_NAME) {
        this.ADMIN_NAME = ADMIN_NAME;
    }

    public String getADMIN_PASSWORD() {
        return ADMIN_PASSWORD;
    }

    public void setADMIN_PASSWORD(String ADMIN_PASSWORD) {
        this.ADMIN_PASSWORD = ADMIN_PASSWORD;
    }

    public String getADMIN_ROLE() {
        return ADMIN_ROLE;
    }

    public void setADMIN_ROLE(String ADMIN_ROLE) {
        this.ADMIN_ROLE = ADMIN_ROLE;
    }
}

