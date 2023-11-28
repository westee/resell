package com.westee.sales.mapper;

import com.westee.sales.data.GoodsInfo;
import com.westee.sales.data.OrderInfo;
import com.westee.sales.generate.OrderTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface MyOrderMapper {
    void insertMultipleOrderGoods(OrderInfo orderInfo);

    List<GoodsInfo> getGoodsInfoOfOrder(long orderId);

    List<OrderTable> getOrderList(String status,Byte pickupType, long userId, int start, int offset,@Param("roleName") String roleName);

    BigDecimal selectOrderAmountByDate(LocalDateTime startOfDay, LocalDateTime endOfDay);

    BigDecimal selectChargeAmountByDate(LocalDateTime startOfDay, LocalDateTime endOfDay);

    int selectOrderCountByDate(LocalDateTime startOfDay, LocalDateTime endOfDay);
}
