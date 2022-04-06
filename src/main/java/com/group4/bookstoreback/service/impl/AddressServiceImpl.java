package com.group4.bookstoreback.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group4.bookstoreback.entity.Address;
import com.group4.bookstoreback.entity.UserInfo;
import com.group4.bookstoreback.mapper.AddressMapper;
import com.group4.bookstoreback.service.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements AddressService {

    @Autowired
    private AddressMapper addressMapper;
    @Override
    public List<Address> queryAllAddressByUserId(Integer userId) {
        return addressMapper.queryAllAddressByUserId(userId);
    }

    @Override
    public int addAddress(Address address) {
        return addressMapper.insert(address);
    }

    @Override
    public int deleteAddress(Address address) {
        return addressMapper.deleteById(address.getId());
    }

    @Override
    public int updateAddress(Address address) {
        return addressMapper.updateById(address);
    }
}