package org.lanqiao.entity;

public class PositionInfo {
    private int POSITION_ID;
    private String POSITION_NAME;
    private String POSITION_INFO;

    public PositionInfo() {
    }

    /**
     * @param positionName 职位名称
     * @param positionInfo 职位详情
     */
    public PositionInfo(String positionName, String positionInfo) {
        this.POSITION_NAME = positionName;
        this.POSITION_INFO = positionInfo;
    }

    public int getPOSITION_ID() {
        return POSITION_ID;
    }

    public void setPOSITION_ID(int POSITION_ID) {
        this.POSITION_ID = POSITION_ID;
    }

    public String getPOSITION_NAME() {
        return POSITION_NAME;
    }

    public void setPOSITION_NAME(String POSITION_NAME) {
        this.POSITION_NAME = POSITION_NAME;
    }

    public String getPOSITION_INFO() {
        return POSITION_INFO;
    }

    public void setPOSITION_INFO(String POSITION_INFO) {
        this.POSITION_INFO = POSITION_INFO;
    }
}
