package com.westee.sales.service;

import com.westee.sales.generate.ExpressGoodsType;
import com.westee.sales.generate.ExpressGoodsTypeExample;
import com.westee.sales.generate.ExpressGoodsTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpressGoodsTypeService {
    private final ExpressGoodsTypeMapper expressGoodsTypeMapper;

    @Autowired
    public ExpressGoodsTypeService(ExpressGoodsTypeMapper expressGoodsTypeMapper) {
        this.expressGoodsTypeMapper = expressGoodsTypeMapper;
    }

    public List<ExpressGoodsType> getExpressGoodsTypes() {
        ExpressGoodsTypeExample expressGoodsTypeExample = new ExpressGoodsTypeExample();
        return expressGoodsTypeMapper.selectByExample(expressGoodsTypeExample);
    }
}
