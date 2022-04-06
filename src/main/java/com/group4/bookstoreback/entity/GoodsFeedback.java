package com.group4.bookstoreback.entity;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

import java.util.Date;

public class GoodsFeedback {

  private Integer id;
  private Integer parentId;
  private Integer itemId;
  private Integer userId;
  private Integer orderId;
  private Integer goodsId;
  private String orderNumber;
  private String username;
  private String image;
  private long qualityScore;
  private long logisticsScore;
  private String qualityInfo;
  private String logisticsInfo;
  private long praise;
  private long rank;
  private long state;
  @TableField(fill = FieldFill.INSERT)
  private Date createTime;

  @TableField(fill = FieldFill.INSERT_UPDATE)
  private Date updateTime;




}
