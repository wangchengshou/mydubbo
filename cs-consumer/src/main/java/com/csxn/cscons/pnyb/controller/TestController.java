package com.csxn.cscons.pnyb.controller;

import com.csxn.comapi.pnyb.dto.User;
import com.csxn.comapi.pnyb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangchengshou
 * @version 1.0
 * @date 2020/6/16 10:32
 */
@RestController
public class TestController {
    @Autowired
    private IUserService iUserService;
    @RequestMapping("test")
    public User test(){
        return iUserService.queryUserById(12);
    }
}
