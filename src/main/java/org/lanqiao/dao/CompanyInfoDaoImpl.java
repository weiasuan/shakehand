package org.lanqiao.dao;

import org.lanqiao.entity.CompanyInfo;

import java.util.List;

public class CompanyInfoDaoImpl extends BaseDao<CompanyInfo> implements CompanyInfoDao{
    @Override
    public List<CompanyInfo> companySearch() {
        return executeQuery("select COMPANY_NAME,COMPANY_PROFILE,COMPANY_LABEL from company_info where COMPANY_ID=1");
    }
}
