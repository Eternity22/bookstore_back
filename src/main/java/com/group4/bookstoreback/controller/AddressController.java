package com.group4.bookstoreback.controller;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.group4.bookstoreback.entity.Address;
import com.group4.bookstoreback.entity.UserInfo;
import com.group4.bookstoreback.service.AddressService;
import com.group4.bookstoreback.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @RequestMapping("/all")
    public JsonResult addressList(@RequestBody UserInfo userInfo){
        return JsonResult.isOk(addressService.queryAllAddressByUserId(userInfo.getUserId()));
    }

    @RequestMapping("/add")
    public JsonResult addAddress(@RequestBody Address address){
        addressService.addAddress(address);
        return JsonResult.isOk(addressService.queryAllAddressByUserId(address.getUserId()));
    }

    @RequestMapping("/delete")
    public JsonResult deleteAddress(@RequestBody Address address){
        addressService.deleteAddress(address);
        return JsonResult.isOk(addressService.queryAllAddressByUserId(address.getUserId()));
    }

    @RequestMapping("/update")
    public JsonResult updateAddress(@RequestBody Address address){
        if (address.getIsDefault() == 1){
            UpdateWrapper<Address> updateWrapper = new UpdateWrapper<>();
            updateWrapper.eq("is_default",1).set("is_default",0);
            addressService.update(updateWrapper);
        }
        addressService.updateAddress(address);
        return JsonResult.isOk(addressService.queryAllAddressByUserId(address.getUserId()));
    }


}
