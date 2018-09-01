package org.lanqiao.servlet;

import net.sf.json.JSONArray;
import org.lanqiao.dao.CompanyInfoImpl;
import org.lanqiao.entity.CompanyInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/ShowCompany")
public class ShowCompanyInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        CompanyInfoImpl companyInfo=new CompanyInfoImpl();


        List<CompanyInfo> list = companyInfo.showCompanyInfo(1);



        JSONArray jsonArray = JSONArray.fromObject(list);


        PrintWriter out =  response.getWriter();

        out.print(jsonArray);

        out.flush();
        out.close();


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);

    }
}
