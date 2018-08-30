package org.lanqiao.dao;

import org.lanqiao.entity.CompanyInfo;

import java.util.List;

public class CompanyInfoDaoImpl extends BaseDao<CompanyInfo> implements CompanyInfoDao{
    @Override
    public List<CompanyInfo> companySearch() {
        return executeQuery("select * from company_info");
    }
}
