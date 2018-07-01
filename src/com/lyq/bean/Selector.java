package com.lyq.bean;

import java.util.HashSet;
import java.util.Set;

public class Selector {
    private int oid;
    private String content;
    private Item item;
    private Set<UserBean> userBeans=new HashSet<UserBean>();
    public Selector(){}

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Set<UserBean> getUserBeans() {
        return userBeans;
    }

    public void setUserBeans(Set<UserBean> userBeans) {
        this.userBeans = userBeans;
    }
}
