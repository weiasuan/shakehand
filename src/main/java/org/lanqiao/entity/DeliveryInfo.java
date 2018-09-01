package org.lanqiao.entity;

import java.util.Date;
public class DeliveryInfo {
    private int DELIVERY_ID;
    private int USER_ID;
    private int COMPANY_ID;
    private int JOB_ID;
    private int RESUME_ID;
    private Date DELIVERY_TIME;
    private String IS_CHECK;
    private String IS_SUCCESS;

    public int getDELIVERY_ID() {
        return DELIVERY_ID;
    }

    public void setDELIVERY_ID(int DELIVERY_ID) {
        this.DELIVERY_ID = DELIVERY_ID;
    }

    public int getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(int USER_ID) {
        this.USER_ID = USER_ID;
    }

    public int getCOMPANY_ID() {
        return COMPANY_ID;
    }

    public void setCOMPANY_ID(int COMPANY_ID) {
        this.COMPANY_ID = COMPANY_ID;
    }

    public int getJOB_ID() {
        return JOB_ID;
    }

    public void setJOB_ID(int JOB_ID) {
        this.JOB_ID = JOB_ID;
    }

    public int getRESUME_ID() {
        return RESUME_ID;
    }

    public void setRESUME_ID(int RESUME_ID) {
        this.RESUME_ID = RESUME_ID;
    }

    public Date getDELIVERY_TIME() {
        return DELIVERY_TIME;
    }

    public void setDELIVERY_TIME(Date DELIVERY_TIME) {
        this.DELIVERY_TIME = DELIVERY_TIME;
    }

    public String getIS_CHECK() {
        return IS_CHECK;
    }

    public void setIS_CHECK(String IS_CHECK) {
        this.IS_CHECK = IS_CHECK;
    }

    public String getIS_SUCCESS() {
        return IS_SUCCESS;
    }

    public void setIS_SUCCESS(String IS_SUCCESS) {
        this.IS_SUCCESS = IS_SUCCESS;
    }
}
