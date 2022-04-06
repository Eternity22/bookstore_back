package com.group4.bookstoreback.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.group4.bookstoreback.entity.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressMapper extends BaseMapper<Address> {
    List<Address> queryAllAddressByUserId(Integer userId);
    int addAddress(Address address);
    int deleteAddress(Address address);
    int updateAddress(Address address);

}
