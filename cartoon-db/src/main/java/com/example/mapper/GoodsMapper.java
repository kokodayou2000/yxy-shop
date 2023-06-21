package com.example.mapper;


import com.example.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GoodsMapper {
    /**
     * 通过id获取商品
     * @param id
     * @return
     */

    public Goods selectGoodsById(int id);

    public List<Goods> getAllGoods();

    /**
     * 通过名称获取商品
     * @param name
     * @return
     */
    public Goods selectGoodsByName(String name);

    /**
     * 插入商品
     * @param goods
     * @return
     */
    public int insertGoods(Goods goods);


}
