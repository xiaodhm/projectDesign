package com.lyq.action;

import com.lyq.bean.Item;
import com.lyq.service.ItemService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.awt.*;
import java.util.List;

public class ItemAction extends ActionSupport{
    private int imId;
    private String itemName;
    private List<Item> itemList;
    private ItemService itemService;
    public List<Item> getItemList() {
        return itemList;
    }
    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setImId(int imId) {
        this.imId = imId;
    }
    public String  getItemlist(){
        itemList=itemService.queryAlLitems();
        ActionContext.getContext().getApplication().put("items",itemList);
        return SUCCESS;
    }//获取所有的主题信息
    public String showItem(){
        itemList=itemService.queryAlLitems();
        ActionContext.getContext().getApplication().put("iTms",itemList);
        return SUCCESS;
    }
    public String deleteItem(){
        itemService.deleteById(imId);
        return SUCCESS;
    }//删除主题
    public String saveItem(){
        Item item=new Item();
        item.setImid(imId);
        item.setItemname(itemName);
        itemService.save(item);
        return SUCCESS;
    }//添加主题

}

