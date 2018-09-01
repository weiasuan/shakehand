package org.lanqiao.dao;

import java.util.List;
import org.lanqiao.entity.CommentInfo;

public class CommentInfoDao extends BaseDao<CommentInfo>{
    public int insert(CommentInfo commentInfo){
       String sql = "insert into comment_info(COMMENT_INFO) values(?)";
       Object[] os ={commentInfo.getCOMMENT_ID(),commentInfo.getCOMMENT_INFO()};
       return executeUpdate(sql,os);
    }

    public List<CommentInfo> showMsg(int pageNum, int pageSize){
        return  executeQuery("select * from comment_info order by COMMENT_ID desc limit ?,? ",new Object[]{(pageNum-1)*pageSize,pageSize});
    }
    public int rsCount(){
        return  getRecordCount("select count(*) from comment_info");
    }

}
