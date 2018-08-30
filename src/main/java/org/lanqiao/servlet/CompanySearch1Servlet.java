package org.lanqiao.servlet;

import net.sf.json.JSONArray;
import org.lanqiao.dao.CompanyInfoDao_search;
import org.lanqiao.entity.CompanyInfo_search;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/Company")
public class CompanySearch1Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CompanyInfoDao_search companyInfo= new CompanyInfoDao_search();
        List<CompanyInfo_search> companyInfoList= companyInfo.companySearch();
        JSONArray jsonarray= JSONArray.fromObject(companyInfoList);
        PrintWriter out=response.getWriter();
        out.print(jsonarray);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
