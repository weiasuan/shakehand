package org.lanqiao.entity;

public class User_Info {
    private int userId;
    private String userName;
    private String userPassword;
    private String userSex;
    private String userEmail;
    private String userTel;
    private String userIntroduct;
    private String userPosition;
    private String userPicAddress;
    private String userLock;

    public String getUserLock() {
        return userLock;
    }

    public void setUserLock(String userLock) {
        this.userLock = userLock;
    }

    /**
     * 空参构造
     */
    public User_Info() {
    }

    /**
     * @param userName 用户名
     * @param userPassword 密码
     */
    public User_Info(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserIntroduct() {
        return userIntroduct;
    }

    public void setUserIntroduct(String userIntroduct) {
        this.userIntroduct = userIntroduct;
    }

    public String getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition;
    }

    public String getUserPicAddress() {
        return userPicAddress;
    }

    public void setUserPicAddress(String userPicAddress) {
        this.userPicAddress = userPicAddress;
    }
}
