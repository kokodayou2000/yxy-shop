package com.example.web.controller.dao;

import com.example.entity.Goods;

import com.example.service.impl.GoodsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.example.service.IGoodsService;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/Goods")
public class GoodsController {

    @Resource
    private IGoodsService goodsService;

    @GetMapping("/show")
    public Goods getGoodsByName(){
        Goods goodsByName = goodsService.getGoodsByName("1");
        System.out.println(goodsByName);
        return goodsByName;
    }

    @GetMapping("/all")
    public List<Goods> getAllGoods(){
        return goodsService.getAllGoods();
    }

    @PostMapping(value = "/insert")
    public int insertGoods(@RequestBody Goods newGoods){
        System.out.println(newGoods);
        return goodsService.insertGoods(newGoods);
    }



}
