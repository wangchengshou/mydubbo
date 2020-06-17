package com.csxn.csprovider.pnyb.service.impl;


import com.csxn.comapi.pnyb.dto.User;
import com.csxn.comapi.pnyb.service.IUserService;

/**
 * @author wangchengshou
 * @version 1.0
 * @date 2020/6/15 17:02
 */
public class IUserServiceImpl implements IUserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setAge("25");
        user.setName("朱茵");
        return user;
    }
}
