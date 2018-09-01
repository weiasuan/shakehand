package org.lanqiao.entity;

public class UserInfo {
    private int USER_ID;
    private String USER_TEL;
    private String USER_PASSWORD;
    private String USER_NAME;
    private String USER_SEX;
    private String USER_EMAIL;
    private String USER_POSITION;
    private String USER_INTRODUCT;
    private String USER_PICADDRESS;
    private String USER_LOCK;


    public UserInfo(String userName, String userSex, String userEmail, String userIntroduct, String userPosition) {
        this.USER_NAME = userName;
        this.USER_SEX = userSex;
        this.USER_EMAIL = userEmail;
        this.USER_INTRODUCT = userIntroduct;
        this.USER_POSITION = userPosition;
    }


    //用于后台删除的构造方式
    public UserInfo(int USER_ID) {
        this.USER_ID = USER_ID;
    }

    // 用于后台添加数据
    public UserInfo(String USER_TEL, String USER_PASSWORD, String USER_NAME, String USER_SEX, String USER_EMAIL, String USER_POSITION, String USER_INTRODUCT, String USER_PICADDRESS) {
        this.USER_TEL = USER_TEL;
        this.USER_PASSWORD = USER_PASSWORD;
        this.USER_NAME = USER_NAME;
        this.USER_SEX = USER_SEX;
        this.USER_EMAIL = USER_EMAIL;
        this.USER_POSITION = USER_POSITION;
        this.USER_INTRODUCT = USER_INTRODUCT;
        this.USER_PICADDRESS = USER_PICADDRESS;
    }

    //用于查找的构造方法
    public UserInfo(String userName, String userSex, String userEmail, String userTel, String userIntroduct, String userPosition,String USER_LOCK) {
        this.USER_NAME = userName;
        this.USER_SEX = userSex;
        this.USER_EMAIL = userEmail;
        this.USER_TEL = userTel;
        this.USER_INTRODUCT = userIntroduct;
        this.USER_POSITION = userPosition;
        this.USER_LOCK = USER_LOCK;
    }


    public UserInfo(String userName, String userSex, String userEmail, String userTel, String userIntroduct, String userPosition) {
        this.USER_NAME = userName;
        this.USER_SEX = userSex;
        this.USER_EMAIL = userEmail;
        this.USER_TEL = userTel;
        this.USER_INTRODUCT = userIntroduct;
        this.USER_POSITION = userPosition;
    }

    /**
     * 空参构造
     */
    public UserInfo() {
    }

    /**
     * @param userName 用户名
     * @param userPassword 密码
     */
    public UserInfo(String userName, String userPassword) {
        this.USER_NAME = userName;
        this.USER_PASSWORD = userPassword;
    }

    public int getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(int USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public String getUSER_PASSWORD() {
        return USER_PASSWORD;
    }

    public void setUSER_PASSWORD(String USER_PASSWORD) {
        this.USER_PASSWORD = USER_PASSWORD;
    }

    public String getUSER_SEX() {
        return USER_SEX;
    }

    public void setUSER_SEX(String USER_SEX) {
        this.USER_SEX = USER_SEX;
    }

    public String getUSER_EMAIL() {
        return USER_EMAIL;
    }

    public void setUSER_EMAIL(String USER_EMAIL) {
        this.USER_EMAIL = USER_EMAIL;
    }

    public String getUSER_TEL() {
        return USER_TEL;
    }

    public void setUSER_TEL(String USER_TEL) {
        this.USER_TEL = USER_TEL;
    }

    public String getUSER_POSITION() {
        return USER_POSITION;
    }

    public void setUSER_POSITION(String USER_POSITION) {
        this.USER_POSITION = USER_POSITION;
    }

    public String getUSER_INTRODUCT() {
        return USER_INTRODUCT;
    }

    public void setUSER_INTRODUCT(String USER_INTRODUCT) {
        this.USER_INTRODUCT = USER_INTRODUCT;
    }

    public String getUSER_PICADDRESS() {
        return USER_PICADDRESS;
    }

    public void setUSER_PICADDRESS(String USER_PICADDRESS) {
        this.USER_PICADDRESS = USER_PICADDRESS;
    }

    public String getUSER_LOCK() {
        return USER_LOCK;
    }

    public void setUSER_LOCK(String USER_LOCK) {
        this.USER_LOCK = USER_LOCK;
    }
}
