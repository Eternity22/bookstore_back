package com.group4.bookstoreback.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.group4.bookstoreback.entity.Address;
import com.group4.bookstoreback.entity.UserInfo;

import java.util.List;


public interface AddressService extends IService<Address> {
    List<Address> queryAllAddressByUserId(Integer userId);
    int addAddress(Address address);
    int deleteAddress(Address address);
    int updateAddress(Address address);

}
