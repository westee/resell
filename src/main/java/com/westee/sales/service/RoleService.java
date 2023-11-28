package com.westee.sales.service;

import com.westee.sales.generate.Role;
import com.westee.sales.generate.UserRoleMapper;
import com.westee.sales.generate.RoleMapper;
import com.westee.sales.generate.UserRoleExample;
import com.westee.sales.generate.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleService {

    private final UserRoleMapper userRoleMapper;
    private final RoleMapper roleMapper;

    @Autowired
    public RoleService(UserRoleMapper userRoleMapper, RoleMapper roleMapper) {
        this.userRoleMapper = userRoleMapper;
        this.roleMapper = roleMapper;
    }

    public List<Role> findByUserid(Long userId){
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria().andUserIdEqualTo(userId);
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        ArrayList<Role> objects = new ArrayList<>();
        userRoles.forEach(userRole -> objects.add(roleMapper.selectByPrimaryKey(userRole.getRoleId())));
        return objects;
    }

    public Role getUserRoleById(Long roleId) {
        return roleMapper.selectByPrimaryKey(roleId);
    }
}
