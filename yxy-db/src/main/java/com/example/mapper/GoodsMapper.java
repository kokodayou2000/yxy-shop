package mapper;


import entity.Goods;

//数据层
//和 mybatis配合使用，可以将本层注入到服务层中使用
//@Mapper
public interface GoodsMapper {
    /**
     * 通过id获取商品
     * @param id
     * @return
     */

    public Goods selectGoodsById(int id);

    /**
     * 通过名称获取商品
     * @param name
     * @return
     */
    public Goods selectGoodsByName(String name);

//    /**
//     * 获取商品总数
//     * @return 返回商品总数
//     */
//    public int getAllGoodsCount();
//
//    /**
//     * 获取某一商品总数
//     * @return
//     */
//    public int getAllGoodsByName();
//
//    public int deleteGoodsById(int id);
//
//    /**
//     * 批量删除
//     * @return
//     */
//    public int deleteGoodsByIds(int[] ids);
}
