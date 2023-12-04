package com.westee.sales.service;

import cn.dev33.satoken.stp.StpInterface;
import com.westee.sales.generate.Role;
import com.westee.sales.generate.RoleExample;
import com.westee.sales.generate.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StpInterfaceImpl implements StpInterface {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<String> getPermissionList(Object loginId, String loginType) {
        return new ArrayList<>();
    }

    @Override
    public List<String> getRoleList(Object loginId, String loginType) {
        RoleExample roleExample = new RoleExample();
        roleExample.createCriteria().andUserIdEqualTo(Long.valueOf(loginId.toString()));
        List<Role> roles = roleMapper.selectByExample(roleExample);
        List<String> list = new ArrayList<>();
        roles.forEach( l -> {
            String roleName = l.getRoleName();
            list.add(roleName);
        });
        return list;
    }
}
