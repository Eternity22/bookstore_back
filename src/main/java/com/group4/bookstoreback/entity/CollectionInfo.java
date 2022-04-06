package com.group4.bookstoreback.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CollectionInfo {

  private Integer id;
  private Integer userId;
  private String imgUrl;
  private Integer goodsId;
  private Integer categoryId;
  private String categoryName;
  private String name;
  private String info;
  private String tags;
  private Double price;

}
