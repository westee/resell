package com.westee.sales.service;

import com.westee.sales.dao.MenuDAO;
import com.westee.sales.entity.Menu;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService  {
    @Resource
    private MenuDAO menuDAO;

    public List<Menu> getAllMenuByRoleId(Long roleId){
        return menuDAO.getAllMenuByRoleId(roleId);
    }
}
