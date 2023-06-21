package com.example.service.impl;


import com.example.entity.Goods;
import com.example.mapper.GoodsMapper;
import com.example.service.IGoodsService;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class GoodsService implements IGoodsService {

    @Resource
    private GoodsMapper goodsMapper;


    @Override
    public Goods getGoodsByName(String name) {
        Goods goods = goodsMapper.selectGoodsByName(name);
        return goods;
    }

    @Override
    public List<Goods> getAllGoods() {
        List<Goods> allGoods = goodsMapper.getAllGoods();
        System.out.println(allGoods);
        return allGoods;
    }

    @Override
    public Goods getMonthGoods() {
        return null;
    }

    @Override
    public List<Goods> getMonthGoodsList() {
        return null;
    }

    @Override
    public int insertGoods(Goods newGoods) {
        return goodsMapper.insertGoods(newGoods);
    }
}
