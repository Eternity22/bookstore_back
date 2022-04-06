package com.group4.bookstoreback.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo {

  private Integer id;
  private Integer number;
  private String info;
  private double totalPrice;
  private String status;
  private String expressDeliveryCompany;
  private Integer addressId;
  private String addressCode;
  private String address;
  private String receiver;
  private String phone;
  private String name;
  private String imgUrl;
  private Integer feedbackId;
  private Integer userId;
  private Integer goodsId;
  private String paymentStatus;

  @TableField(fill = FieldFill.INSERT)
  private Date createTime;

  @TableField(fill = FieldFill.INSERT_UPDATE)
  private Date updateTime;


}
