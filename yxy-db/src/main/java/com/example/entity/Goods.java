package entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Goods {

    private int goods_id;
    private String goods_name;
//    @Min(0)
    private int goods_num;
    private float goods_price;
    //创建时间
//    private Date createTime;
//    //最近售卖时间
//    private Date salesTime;
    //最近一个月卖的最多的商品
//    private int salesByMonth;
    //商品是否上架
    private boolean goods_able;
}
