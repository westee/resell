package com.westee.sales.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface MyShoppingCartMapper {
    void updateByExampleSelectiveWithStatus(Map<String, Object> params);
}
