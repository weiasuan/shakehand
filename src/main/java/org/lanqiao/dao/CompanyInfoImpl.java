package org.lanqiao.dao;

import org.lanqiao.entity.CompanyInfo;

import java.util.List;

public  class CompanyInfoImpl  extends  BaseDao<CompanyInfo> implements CompanyInfoDao{


    public List<CompanyInfo> showCompanyInfo(int COMPANY_ID){

        return  executeQuery("select * from company_info where COMPANY_ID ="+COMPANY_ID);

    }

}
