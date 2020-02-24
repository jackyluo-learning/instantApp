package com.androidgroup.uac.controller;


import com.androidgroup.uac.dao.model.UserInfo;
import com.androidgroup.uac.entity.Data;
import com.androidgroup.uac.entity.Info;
import com.androidgroup.uac.service.UacService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/uac", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UacController {
    @Autowired
    private UacService uacService;

    @GetMapping(value = "/getUserInfo")
    public Data get(@RequestParam(value = "id")Integer id){
        UserInfo userInfo = uacService.getUserinfo(id);
        if(userInfo!=null){
            return new Data().setResponseCode(0).setResult(userInfo.toString());
        }
        else{
            return new Data().setResponseCode(-1).setResult("User does not exist.");
        }
    }


    @PostMapping(value = "/addUserInfo")
    public Data post(@RequestBody Info info){
        return dealWith(info);
    }


    private Data dealWith(Info info) {
        String nickname = info.getUsername();
        String password = info.getPassword();

        if (StringUtils.isEmpty(nickname)) {
            return new Data().setResponseCode(-1).setResult("Username can not be blank.");
        }

        if (StringUtils.isEmpty(password)) {
            return new Data().setResponseCode(-2).setResult("Password can not be blank.");
        }
        ModelMapper modelMapper = new ModelMapper();
        UserInfo userInfo = modelMapper.map(info, UserInfo.class);
        return new Data().setResponseCode(0).setResult(String.valueOf(uacService.addUser(userInfo)));
    }
}
