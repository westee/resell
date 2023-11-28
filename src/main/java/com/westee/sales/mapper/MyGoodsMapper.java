package com.westee.sales.mapper;

import com.westee.sales.generate.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MyGoodsMapper {
    List<Goods> selectGoodsByName(int start, int offset, String name);
    int countGoodsByName(String name);
}
