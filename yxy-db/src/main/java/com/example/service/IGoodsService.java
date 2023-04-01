package service;



import entity.Goods;

import java.util.List;

public interface IGoodsService {
    /**
     * 获取商品名称通过名称
     * @param
     * @return 获取的商品对象的集合
     */
    public Goods getGoodsByName(String name);

    /**
     * 获取最近一个月最火的商品
     * @return
     */
    public Goods getMonthGoods();

    /**
     * 获取该集合，从上到下排序
     * @return
     */
    public List<Goods> getMonthGoodsList();

}
