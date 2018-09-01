package org.lanqiao.servlet;

import org.lanqiao.dao.CommentInfoDao;
import org.lanqiao.entity.CommentInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addMsg")
public class InsertCommentInfoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接收表单提交的数据
        String msg = request.getParameter("msg");
        //将数据封装到实体类中
        CommentInfo commentInfo = new CommentInfo();
        //调用Dao
        CommentInfoDao messageDao = new CommentInfoDao();
        int res = messageDao.insert(commentInfo);
        response.getWriter().print(res);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
