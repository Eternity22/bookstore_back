package com.group4.bookstoreback.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.group4.bookstoreback.entity.UserInfo;


public interface UserService extends IService<UserInfo> {
    UserInfo queryByUserName(String userName);

}
