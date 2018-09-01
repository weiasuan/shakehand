package org.lanqiao.entity;

public class ResumeInfo {
    private int RESUME_ID;
    private int USER_ID;
    private int POSITION_ID;
    private String RESUME_PICADDRESS;
    private String RESUME_NAME;
    private String RESUME_SEX;
    private String RESUME_ETHNIC;
    private int RESUME_AGE;
    private String RESUME_ADDRESS;
    private String RESUME_TEL;
    private String RESUME_EMAIL;
    private String RESUME_BIRTHPLACE;
    private String RESUME_SALARY;
    private String RESUME_EDUCATION;
    private String RESUME_TRAINING;
    private String RESUME_SKILL;
    private String RESUME_EXPERIENCE;
    private String RESUME_HOBBY;
    private String RESUME_EVALUATION;

    public ResumeInfo() {
    }
    public ResumeInfo(String RESUME_NAME,int RESUME_AGE,String RESUME_ADDRESS, String RESUME_ETHNIC,String RESUME_TEL) {
        this.RESUME_NAME = RESUME_NAME;
        this.RESUME_ETHNIC = RESUME_ETHNIC;
        this.RESUME_AGE = RESUME_AGE;
        this.RESUME_ADDRESS = RESUME_ADDRESS;
        this.RESUME_TEL = RESUME_TEL;
    }

    public ResumeInfo(String RESUME_NAME, int RESUME_AGE, String RESUME_ADDRESS, String RESUME_ETHNIC,
                      String RESUME_TEL, String RESUME_EMAIL, String RESUME_BIRTHPLACE, String RESUME_SALARY, String RESUME_HOBBY,
                      String RESUME_EVALUATION, String RESUME_SEX, String RESUME_SKILL, String RESUME_EXPERIENCE,
                      String RESUME_TRAINING, String RESUME_EDUCATION) {

        this.RESUME_NAME = RESUME_NAME;
        this.RESUME_SEX = RESUME_SEX;
        this.RESUME_ETHNIC = RESUME_ETHNIC;
        this.RESUME_AGE = RESUME_AGE;
        this.RESUME_ADDRESS = RESUME_ADDRESS;
        this.RESUME_TEL = RESUME_TEL;
        this.RESUME_EMAIL = RESUME_EMAIL;
        this.RESUME_BIRTHPLACE = RESUME_BIRTHPLACE;
        this.RESUME_SALARY = RESUME_SALARY;
        this.RESUME_EDUCATION = RESUME_EDUCATION;
        this.RESUME_TRAINING = RESUME_TRAINING;
        this.RESUME_SKILL = RESUME_SKILL;
        this.RESUME_EXPERIENCE = RESUME_EXPERIENCE;
        this.RESUME_HOBBY = RESUME_HOBBY;
        this.RESUME_EVALUATION = RESUME_EVALUATION;
    }
    public int getRESUME_ID() {
        return RESUME_ID;
    }

    public void setRESUME_ID(int RESUME_ID) {
        this.RESUME_ID = RESUME_ID;
    }

    public int getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(int USER_ID) {
        this.USER_ID = USER_ID;
    }

    public int getPOSITION_ID() {
        return POSITION_ID;
    }

    public void setPOSITION_ID(int POSITION_ID) {
        this.POSITION_ID = POSITION_ID;
    }

    public String getRESUME_PICADDRESS() {
        return RESUME_PICADDRESS;
    }

    public void setRESUME_PICADDRESS(String RESUME_PICADDRESS) {
        this.RESUME_PICADDRESS = RESUME_PICADDRESS;
    }

    public String getRESUME_NAME() {
        return RESUME_NAME;
    }

    public void setRESUME_NAME(String RESUME_NAME) {
        this.RESUME_NAME = RESUME_NAME;
    }

    public String getRESUME_SEX() {
        return RESUME_SEX;
    }

    public void setRESUME_SEX(String RESUME_SEX) {
        this.RESUME_SEX = RESUME_SEX;
    }

    public String getRESUME_ETHNIC() {
        return RESUME_ETHNIC;
    }

    public void setRESUME_ETHNIC(String RESUME_ETHNIC) {
        this.RESUME_ETHNIC = RESUME_ETHNIC;
    }

    public int getRESUME_AGE() {
        return RESUME_AGE;
    }

    public void setRESUME_AGE(int RESUME_AGE) {
        this.RESUME_AGE = RESUME_AGE;
    }

    public String getRESUME_ADDRESS() {
        return RESUME_ADDRESS;
    }

    public void setRESUME_ADDRESS(String RESUME_ADDRESS) {
        this.RESUME_ADDRESS = RESUME_ADDRESS;
    }

    public String getRESUME_TEL() {
        return RESUME_TEL;
    }

    public void setRESUME_TEL(String RESUME_TEL) {
        this.RESUME_TEL = RESUME_TEL;
    }

    public String getRESUME_EMAIL() {
        return RESUME_EMAIL;
    }

    public void setRESUME_EMAIL(String RESUME_EMAIL) {
        this.RESUME_EMAIL = RESUME_EMAIL;
    }

    public String getRESUME_BIRTHPLACE() {
        return RESUME_BIRTHPLACE;
    }

    public void setRESUME_BIRTHPLACE(String RESUME_BIRTHPLACE) {
        this.RESUME_BIRTHPLACE = RESUME_BIRTHPLACE;
    }

    public String getRESUME_SALARY() {
        return RESUME_SALARY;
    }

    public void setRESUME_SALARY(String RESUME_SALARY) {
        this.RESUME_SALARY = RESUME_SALARY;
    }

    public String getRESUME_EDUCATION() {
        return RESUME_EDUCATION;
    }

    public void setRESUME_EDUCATION(String RESUME_EDUCATION) {
        this.RESUME_EDUCATION = RESUME_EDUCATION;
    }

    public String getRESUME_TRAINING() {
        return RESUME_TRAINING;
    }

    public void setRESUME_TRAINING(String RESUME_TRAINING) {
        this.RESUME_TRAINING = RESUME_TRAINING;
    }

    public String getRESUME_SKILL() {
        return RESUME_SKILL;
    }

    public void setRESUME_SKILL(String RESUME_SKILL) {
        this.RESUME_SKILL = RESUME_SKILL;
    }

    public String getRESUME_EXPERIENCE() {
        return RESUME_EXPERIENCE;
    }

    public void setRESUME_EXPERIENCE(String RESUME_EXPERIENCE) {
        this.RESUME_EXPERIENCE = RESUME_EXPERIENCE;
    }

    public String getRESUME_HOBBY() {
        return RESUME_HOBBY;
    }

    public void setRESUME_HOBBY(String RESUME_HOBBY) {
        this.RESUME_HOBBY = RESUME_HOBBY;
    }

    public String getRESUME_EVALUATION() {
        return RESUME_EVALUATION;
    }

    public void setRESUME_EVALUATION(String RESUME_EVALUATION) {
        this.RESUME_EVALUATION = RESUME_EVALUATION;
    }
}
