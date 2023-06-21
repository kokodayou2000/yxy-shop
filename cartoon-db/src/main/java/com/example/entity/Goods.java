package com.example.entity;

import com.example.common.entry.BaseEntity;
import lombok.*;

import javax.validation.constraints.Min;


@AllArgsConstructor
@Data
@Getter
@Setter
public class Goods{
    public Goods() {
    }

    private int goods_id;
    private String goods_name;
//    @Min(0)
    private int goods_num;
    private float goods_price;
    private boolean goods_able;
    //商品图片连接
    private String goods_picture_url;


}
