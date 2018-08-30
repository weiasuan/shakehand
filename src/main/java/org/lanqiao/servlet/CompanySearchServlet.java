package org.lanqiao.servlet;

import net.sf.json.JSONArray;
import org.lanqiao.dao.CompanyInfoDaoImpl;
import org.lanqiao.entity.CompanyInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/CompanySearch")
public class CompanySearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CompanyInfoDaoImpl companyInfo= new CompanyInfoDaoImpl();
        List<CompanyInfo> companyInfoList= companyInfo.companySearch();
        JSONArray jsonarray= JSONArray.fromObject(companyInfoList);
        PrintWriter out=response.getWriter();
        out.print(jsonarray);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
