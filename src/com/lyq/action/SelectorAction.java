package com.lyq.action;

import com.lyq.bean.Item;
import com.lyq.bean.Selector;
import com.lyq.service.SelectorService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class SelectorAction  extends ActionSupport{
    private int opId;
    private int itId;
    private int optId;
    private int usrId;
    private String content;
    private List<Object[]> optNumUsr;
    private List<Object[]> optList;
    private List<Object[]> optNum;
    private SelectorService selectorService;
    public void setUsrId(int usrId) {
        this.usrId = usrId;
    }
    public void setOpId(int opId) {
        this.opId = opId;
    }
    public int getItId() {
        return itId;
    }
    public void setItId(int itId) {
        this.itId = itId;
    }
    public int getOptId() {
        return optId;
    }
    public void setOptId(int optId) {
        this.optId = optId;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public List<Object[]> getOptList() { return optList; }
    public List<Object[]> getOptNum() {
        return optNum;
    }
    public List<Object[]> getOptNumUsr() {
        return optNumUsr;
    }
    public void setSelectorService(SelectorService selectorService) {
        this.selectorService = selectorService;
    }


    public String optList(){
        optList=selectorService.queryAllSlctor();
        ActionContext.getContext().getApplication().put("options",optList);
        return SUCCESS;
    }//查看所有选项
    public String optDelete(){
        selectorService.deleteBySlcId(opId);
        return SUCCESS;
    }//删除选项
    public String optSave(){
        Selector selector=new Selector();
        selector.setOid(optId);
        selector.setContent(content);
        Item item=new Item();
        item.setImid(itId);
        selector.setItem(item);
        selectorService.insert(selector);
        return SUCCESS;
    }//添加选项
    public String optCunt(){
        optNum=selectorService.queryAllSlcCounts();
        ActionContext.getContext().getApplication().put("optNumb",optNum);
        return SUCCESS;
    }//管理员查看投票情况
    public String optCheckUser(){
        optNum=selectorService.queryAllSlc();
        ActionContext.getContext().getApplication().put("usrId",usrId);
        ActionContext.getContext().getApplication().put("optNumber",optNum);
        return SUCCESS;
    }//用户查看投票情况
    public String optNumUser(){
        optNumUsr=selectorService.querySlcCountsByUserId(usrId);
        ActionContext.getContext().getApplication().put("optNumUsr",optNumUsr);
        return SUCCESS;
    }//用户的投票情况
}
