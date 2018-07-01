package com.lyq.action;

import com.lyq.bean.UserBean;
import com.lyq.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;




public class UserAction  extends ActionSupport {
    private int userId;
    private String password;
    private String message;
    private UserService userService;
    public void setUserId(int userId) {
        this.userId = userId; }
    public void setPassword(String password) { this.password = password;
    }
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public String getMessage() {
        return message;
    }
    public String login(){
        UserBean userBean=userService.login(userId,password);
        if(userBean==null) {
            message = "用户不存在或密码错误";
          return LOGIN;
        }else{
            ActionContext.getContext().getSession().put("user",userBean);
            return SUCCESS;
        }
    }//用户登录时的验证
}

