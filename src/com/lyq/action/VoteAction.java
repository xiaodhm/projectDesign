package com.lyq.action;

import com.lyq.bean.Selector;
import com.lyq.bean.UserBean;
import com.lyq.dbs.DB;
import com.lyq.service.VoteService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;
public class VoteAction  extends ActionSupport {
    private int optId;
    private int usrId;
    private String message;
    private VoteService voteService;
    public String getMessage() {
        return message;
    }
    public void setOptId(int optId) {
        this.optId = optId;
    }
    public void setUsrId(int usrId) {
        this.usrId = usrId;
    }
    public void setVoteService(VoteService voteService) {
        this.voteService = voteService;
    }
    public String voted(){
        Connection cone=null;
        PreparedStatement prestmt=null;  ResultSet rsl=null;
        String sql="insert into voted(usrid,slcid) values(?,?)";
        DB db=new DB(); int row=0;
        try{
            prestmt=db.getPreStatement(sql);
            prestmt.setInt(1,usrId);
            prestmt.setInt(2,optId);
            row=prestmt.executeUpdate();
        }catch (SQLException e){  e.printStackTrace(); }
        finally { db.close();  db.closePreparedStatement(prestmt); }
        if (row>0){ message="投票成功"; return SUCCESS; }
        else { message="你已经为该用户投过一票,只能投一票";
        ActionContext.getContext().getApplication().put("info",message);return ERROR;
        }
    }//执行投票操作
    public String voteOption(){

        Selector selector=new Selector();
        selector.setOid(optId);

        UserBean userBean=new UserBean();
        userBean.setUsrid(usrId);

        selector.getUserBeans().add(userBean);
        userBean.getSelectors().add(selector);

        voteService.insert(selector,userBean);
        return SUCCESS;

    }
}
