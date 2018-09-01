package org.lanqiao.servlet;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.lanqiao.dao.CommentInfoDao;
import org.lanqiao.util.JsonDateValueProcessor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import org.lanqiao.entity.CommentInfo;

@WebServlet("/showMsg")
public class ShowCommentInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CommentInfoDao messageDao = new CommentInfoDao();
        String num = request.getParameter("pageNum");
        int pageNum = 1;
        if (num!=null&&!num.equals("")){
            pageNum = Integer.parseInt(num);
        }
        List<CommentInfo> list = messageDao.showMsg(pageNum,3);
        int recount = messageDao.rsCount();
        JsonConfig jsonConfig=new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class,new JsonDateValueProcessor());
        JSONArray jsonArray = JSONArray.fromObject(list,jsonConfig);
        PrintWriter out =  response.getWriter();
        jsonArray.add(recount);
        out.print(jsonArray);
        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
