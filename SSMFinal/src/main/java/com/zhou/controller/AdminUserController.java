package com.zhou.controller;

import com.zhou.pojo.AdminUser;
import com.zhou.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class AdminUserController {

    @Autowired
    @Qualifier("AdminUserServiceImpl")
    private AdminUserService adminUserService;



    @RequestMapping("/toLogin")
    public String toLogin(){
        return "/adminLogin";
    }

    @RequestMapping("/adminLogin")
    public String login(AdminUser adminUser, @RequestParam(value = "userName",required = false) String userName,@RequestParam(value = "password",required = false) String password,Model model){
        AdminUser adminUser1 = adminUserService.queryUser(adminUser);
//        System.out.println(adminUser1.getUserName()+".."+adminUser1.getUserPwd()+"/"+userName+"..."+password);
        if (adminUser1.getUserName().equals(userName) && adminUser1.getUserPwd().equals(password)) {
            return "redirect:/book/allBook";//重定向allBook请求
        }else{
            model.addAttribute("error_login", "用户名或密码错误");
            return "adminLogin";
        }
    }
}
