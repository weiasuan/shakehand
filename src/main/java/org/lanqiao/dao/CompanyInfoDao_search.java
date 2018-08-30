package org.lanqiao.dao;

import org.lanqiao.entity.CompanyInfo_search;

import java.util.List;

public class CompanyInfoDao_search extends BaseDao<CompanyInfo_search> {
    public List<CompanyInfo_search> companySearch() {
        return executeQuery("select COMPANY_NAME,COMPANY_PROFILE,COMPANY_LABEL from company_info where COMPANY_ID=1");
    }
}
