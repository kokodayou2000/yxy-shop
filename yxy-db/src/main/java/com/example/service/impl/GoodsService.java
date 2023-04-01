package service.impl;


import entity.Goods;
import mapper.GoodsMapper;
import org.springframework.stereotype.Service;
import service.IGoodsService;

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
    public Goods getMonthGoods() {
        return null;
    }

    @Override
    public List<Goods> getMonthGoodsList() {
        return null;
    }
}
