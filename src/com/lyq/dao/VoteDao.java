package com.lyq.dao;

import com.lyq.bean.Selector;
import com.lyq.bean.UserBean;
import com.lyq.bean.Vote;

public interface VoteDao {
    public void insert(Selector selector, UserBean userBean);
}
