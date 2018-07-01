package com.lyq.bean;

import java.util.HashSet;
import java.util.Set;

public class UserBean {
    private int usrid;
    private String username;
    private String password;
    private String sex;
    private String job;
    private String email;
    private Set<Selector> selectors =new HashSet<Selector>();
    public UserBean(){}

    public int getUsrid() {
        return usrid;
    }

    public void setUsrid(int usrid) {
        this.usrid = usrid;
    }

    public void setUsername(String username) {
        this.username = username; }
    public void setPassword(String password) {
        this.password = password; }
    public void setSex(String sex) {
        this.sex = sex; }
    public void setJob(String job) {
        this.job = job; }
    public void setEmail(String email) {
        this.email = email; }

    public String getPassword() {
        return password; }
    public String getUsername() {
        return username; }
    public String getSex() {
        return sex; }
    public String getJob() {
        return job; }
    public String getEmail() {
        return email; }

    public Set<Selector> getSelectors() {
        return selectors;
    }

    public void setSelectors(Set<Selector> selectors) {
        this.selectors = selectors;
    }
}
