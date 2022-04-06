package com.group4.bookstoreback.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

  private Integer id;
  private Integer parentId;
  private String name;
  private Integer rank;
  private Integer state;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;


}
