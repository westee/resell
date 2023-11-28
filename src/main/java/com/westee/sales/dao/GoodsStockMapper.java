package com.westee.sales.dao;

import com.westee.sales.data.GoodsInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsStockMapper {
    int deductStock(GoodsInfo goodsInfo);
    int addStock(Long id, Long number);
}
