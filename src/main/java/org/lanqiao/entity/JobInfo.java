package org.lanqiao.entity;

import java.util.Date;

public  class JobInfo {

    private int JOB_ID;
    private int COMPANY_ID;
    private int POSITION_ID;
    private int JOB_SALARY;
    private String JOB_ADDRESS;
    private String JOB_EXPERIENCE;
    private String JOB_EDUCATION;
    private String JOB_KIND;
    private Date JOB_RELEASETIME;
    private String JOB_DESCRIPTION;

    public int getJOB_ID() {
        return JOB_ID;
    }

    public void setJOB_ID(int JOB_ID) {
        this.JOB_ID = JOB_ID;
    }

    public int getCOMPANY_ID() {
        return COMPANY_ID;
    }

    public void setCOMPANY_ID(int COMPANY_ID) {
        this.COMPANY_ID = COMPANY_ID;
    }

    public int getPOSITION_ID() {
        return POSITION_ID;
    }

    public void setPOSITION_ID(int POSITION_ID) {
        this.POSITION_ID = POSITION_ID;
    }

    public int getJOB_SALARY() {
        return JOB_SALARY;
    }

    public void setJOB_SALARY(int JOB_SALARY) {
        this.JOB_SALARY = JOB_SALARY;
    }

    public String getJOB_ADDRESS() {
        return JOB_ADDRESS;
    }

    public void setJOB_ADDRESS(String JOB_ADDRESS) {
        this.JOB_ADDRESS = JOB_ADDRESS;
    }

    public String getJOB_EXPERIENCE() {
        return JOB_EXPERIENCE;
    }

    public void setJOB_EXPERIENCE(String JOB_EXPERIENCE) {
        this.JOB_EXPERIENCE = JOB_EXPERIENCE;
    }

    public String getJOB_EDUCATION() {
        return JOB_EDUCATION;
    }

    public void setJOB_EDUCATION(String JOB_EDUCATION) {
        this.JOB_EDUCATION = JOB_EDUCATION;
    }

    public String getJOB_KIND() {
        return JOB_KIND;
    }

    public void setJOB_KIND(String JOB_KIND) {
        this.JOB_KIND = JOB_KIND;
    }

    public Date getJOB_RELEASETIME() {
        return JOB_RELEASETIME;
    }

    public void setJOB_RELEASETIME(Date JOB_RELEASETIME) {
        this.JOB_RELEASETIME = JOB_RELEASETIME;
    }

    public String getJOB_DESCRIPTION() {
        return JOB_DESCRIPTION;
    }

    public void setJOB_DESCRIPTION(String JOB_DESCRIPTION) {
        this.JOB_DESCRIPTION = JOB_DESCRIPTION;
    }
}