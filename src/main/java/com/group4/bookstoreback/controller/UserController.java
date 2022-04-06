package com.group4.bookstoreback.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.group4.bookstoreback.entity.UserInfo;
import com.group4.bookstoreback.mapper.UserMapper;
import com.group4.bookstoreback.service.UserService;
import com.group4.bookstoreback.service.impl.UserServiceImpl;
import com.group4.bookstoreback.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Wrapper;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

//    登陆
    @RequestMapping("/login")
    public JsonResult login(@RequestBody UserInfo userInfo,HttpServletRequest request){

        UserInfo user = userService.queryByUserName(userInfo.getUserName());
        if(userInfo.getPassword().equals(user.getPassword())){
            HttpSession session = request.getSession();
            session.setAttribute("userName",user.getUserName());
            session.setAttribute("userId",user.getUserId());
            return  JsonResult.isOk(user);
        }
        return JsonResult.isError(300,"用户名或密码错误");
    }


//    注册
    @RequestMapping("/register")
    public JsonResult register(@RequestBody UserInfo userInfo) {
        String userName = userInfo.getUserName();
        if (userService.queryByUserName(userName) == null && userInfo.getPassword() != null) {
            boolean save = userService.save(userInfo);
            if (save) {
                return JsonResult.isOk(userInfo);
            }
            return JsonResult.isError(300, "注册失败，请重试");
        }

        return JsonResult.isError(300,"用户名已存在，请更换用户名后重试");
    }

//
    @RequestMapping("/update")
    public JsonResult update(@RequestBody UserInfo userInfo){
        UpdateWrapper<UserInfo> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("user_id",userInfo.getUserId());
        userService.update(userInfo,updateWrapper);
        return JsonResult.isOk(new UserInfo());
    }

}





