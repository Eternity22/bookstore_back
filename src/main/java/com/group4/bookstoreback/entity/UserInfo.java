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
public class UserInfo {

  private String userName;
  private String nickName;
  private String realName;
  private java.sql.Date birthday;
  private String telPhone;
  private String email;
  private String address;
  private Integer userId;
  private Integer grade;
  private String password;
  @TableField(fill = FieldFill.INSERT)
  private Date createTime;

  @TableField(fill = FieldFill.INSERT_UPDATE)
  private Date updateTime;




}
