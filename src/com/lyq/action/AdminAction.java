package com.lyq.action;


import com.lyq.bean.Admin;
import com.lyq.service.AdminService;
import com.opensymphony.xwork2.ActionChainResult;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;



public class AdminAction  extends ActionSupport {
    private int adminid;
    private String adminpass;
    private String message1;
    private AdminService adminService;
    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }
    public void setAdminpass(String adminpass) {
        this.adminpass = adminpass;
    }
    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }
    public String getMessage1() { return message1; }
    public String comfirm(){
        Admin admin=adminService.select(adminid,adminpass);
        if(admin==null){
            message1="用户不存在或密码错误";
            return LOGIN;
        }else {
            ActionContext.getContext().getSession().put("admin",admin);
            return SUCCESS;
        }
    }//管理员登录时验证是否合法
}
