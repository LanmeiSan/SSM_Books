package com.zhou.service;

import com.zhou.dao.AdminUserMapper;
import com.zhou.pojo.AdminUser;

public class AdminUserServiceImpl implements AdminUserService {

    private AdminUserMapper adminUserMapper;

    public void setAdminUserMapper(AdminUserMapper adminUserMapper) {
        this.adminUserMapper = adminUserMapper;
    }

    public AdminUser queryUser(AdminUser adminUser) {
        return adminUserMapper.queryUser(adminUser);
    }
}
