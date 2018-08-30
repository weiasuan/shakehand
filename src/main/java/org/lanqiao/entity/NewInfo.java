package org.lanqiao.entity;

public class NewInfo {
    private int NEWS_ID;
    private int ADMIN_ID;
    private String NEWS_TITLE;
    private String NEWS_TIME;
    private String NEWS_DETAILS;

    public NewInfo(){

    }

    public NewInfo(int newsId,int adminId, String newsTitle,
                   String newsTime,String newsDetails){

        this.NEWS_ID=newsId;
        this.ADMIN_ID=adminId;
        this.NEWS_TITLE=newsTitle;
        this.NEWS_TIME=newsTime;
        this.NEWS_DETAILS=newsDetails;
    }

    public int getNEWS_ID() {
        return NEWS_ID;
    }

    public void setNEWS_ID(int NEWS_ID) {
        this.NEWS_ID = NEWS_ID;
    }

    public int getADMIN_ID() {
        return ADMIN_ID;
    }

    public void setADMIN_ID(int ADMIN_ID) {
        this.ADMIN_ID = ADMIN_ID;
    }

    public String getNEWS_TITLE() {
        return NEWS_TITLE;
    }

    public void setNEWS_TITLE(String NEWS_TITLE) {
        this.NEWS_TITLE = NEWS_TITLE;
    }

    public String getNEWS_TIME() {
        return NEWS_TIME;
    }

    public void setNEWS_TIME(String NEWS_TIME) {
        this.NEWS_TIME = NEWS_TIME;
    }

    public String getNEWS_DETAILS() {
        return NEWS_DETAILS;
    }

    public void setNEWS_DETAILS(String NEWS_DETAILS) {
        this.NEWS_DETAILS = NEWS_DETAILS;
    }
}
