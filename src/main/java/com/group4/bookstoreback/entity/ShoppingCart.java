package com.group4.bookstoreback.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCart {

  private Integer userId;
  private String name;
  private double number;
  private double price;
  private String imgUrl;
  private Integer goodsId;
  private Integer id;

}
