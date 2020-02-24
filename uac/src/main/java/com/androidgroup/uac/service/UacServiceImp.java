package com.androidgroup.uac.service;

import com.androidgroup.uac.dao.UserInfoMapper;
import com.androidgroup.uac.dao.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UacServiceImp implements UacService{
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public int addUser(UserInfo userInfo) {
        return userInfoMapper.insert(userInfo);
    }

    @Override
    public UserInfo getUserinfo(Integer id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }
}
