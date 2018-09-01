package org.lanqiao.dao;

import org.lanqiao.entity.CompanyInfo;

import java.util.List;

public interface CompanyInfoDao {

    //展示公司信息

    public List<CompanyInfo> showCompanyInfo(int COMPANY_ID);

}
