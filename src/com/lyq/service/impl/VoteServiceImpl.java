package com.lyq.service.impl;

import com.lyq.bean.Selector;
import com.lyq.bean.UserBean;
import com.lyq.bean.Vote;
import com.lyq.dao.VoteDao;
import com.lyq.service.VoteService;

public class VoteServiceImpl implements VoteService {
    private VoteDao voteDao;

    public void setVoteDao(VoteDao voteDao) {
        this.voteDao = voteDao;
    }

    @Override
    public void insert(Selector selector, UserBean userBean) {
        voteDao.insert(selector,userBean);
    }
}
