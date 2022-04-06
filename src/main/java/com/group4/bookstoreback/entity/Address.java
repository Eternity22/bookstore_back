package com.group4.bookstoreback.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

  private Integer id;
  private Integer userId;
  private String receiver;
  private String phone;
  private Integer postcode;
  private Integer addressCode;
  private String address;
  private Integer isDefault;
  private Integer state;
  private Date createTime;
  private Date updateTime;



}
