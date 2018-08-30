package org.lanqiao.entity;

import java.util.Date;

public class CommentInfo {
    private int COMMENT_ID;
    private int USER_ID;
    private int COMPANY_ID;
    private String COMMENT_INFO;
    private Date COMMENT_TIME;
    private int COMMENT_SCORE;
    private int COMMENT_NUM;

    public int getCOMMENT_ID() {
        return COMMENT_ID;
    }

    public void setCOMMENT_ID(int COMMENT_ID) {
        this.COMMENT_ID = COMMENT_ID;
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

    public String getCOMMENT_INFO() {
        return COMMENT_INFO;
    }

    public void setCOMMENT_INFO(String COMMENT_INFO) {
        this.COMMENT_INFO = COMMENT_INFO;
    }

    public Date getCOMMENT_TIME() {
        return COMMENT_TIME;
    }

    public void setCOMMENT_TIME(Date COMMENT_TIME) {
        this.COMMENT_TIME = COMMENT_TIME;
    }

    public int getCOMMENT_SCORE() {
        return COMMENT_SCORE;
    }

    public void setCOMMENT_SCORE(int COMMENT_SCORE) {
        this.COMMENT_SCORE = COMMENT_SCORE;
    }

    public int getCOMMENT_NUM() {
        return COMMENT_NUM;
    }

    public void setCOMMENT_NUM(int COMMENT_NUM) {
        this.COMMENT_NUM = COMMENT_NUM;
    }
}
