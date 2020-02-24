package com.androidgroup.uac.service;

import com.androidgroup.uac.dao.model.UserInfo;
import org.springframework.stereotype.Service;

@Service
public interface UacService {
    int addUser(UserInfo userInfo);

    UserInfo getUserinfo(Integer id);
}
