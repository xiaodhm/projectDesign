package com.lyq.service;

import com.lyq.bean.Selector;
import com.lyq.bean.UserBean;
import com.lyq.bean.Vote;

public interface VoteService {
    public void insert(Selector selector, UserBean userBean);
}
