package com.group4.bookstoreback;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.group4.bookstoreback.entity.*;
import com.group4.bookstoreback.service.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookstoreBackApplicationTests {

    @Autowired
    private UserService userService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private AddressService addressService;
    @Autowired
    private ShoppingCartService shoppingCartService;
    @Autowired
    private OrderService orderService;


    @Test
    void contextLoads() {
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name", "admin");
        UserInfo one = userService.getOne(queryWrapper, false);
        System.out.println(one);

    }

    @Test
    void testLogin(){
        System.out.println(userService.queryByUserName("admin"));
    }

    @Test
    void testList(){
        for (GoodsInfo queryAllGood : goodsService.queryAllGoods()) {
            System.out.println(queryAllGood);
        }
    }
    @Test
    void testqueryGoodsByCategoryId(){
        System.out.println(goodsService.queryGoodsByCategoryId(1));
    }

    @Test
    void queryAllCategory(){
        for (Category category : categoryService.queryAllCategory()) {
            System.out.println(category);
        }
    }


    @Test
    void queryAllAddressByUserId(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(104);
        System.out.println(addressService.queryAllAddressByUserId(104));
    }

    @Test
    void addAddress(){
        Address address = new Address();
        address.setAddress("1");
        addressService.addAddress(address);
    }

    @Test
    void deleteAddress(){
        Address address = new Address();
        address.setId(1);

        addressService.deleteAddress(address);
    }

    @Test
    void updateAddress(){
        Address address = new Address();
        address.setId(3);
        address.setAddress("123");

        addressService.updateAddress(address);
    }


    @Test
    void addCart(){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setGoodsId(1);
        shoppingCart.setGoodsId(3);
        System.out.println(shoppingCartService.addGood(shoppingCart));
    }
    @Test
    void queryCart(){
        System.out.println(shoppingCartService.queryCartListByUserId(104));
    }
    @Test
    void deleteCart(){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setId(1);
        shoppingCartService.deleteByCartId(shoppingCart);
    }

    @Test
    void updateCart(){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setId(2);
        shoppingCart.setGoodsId(2);
        shoppingCartService.updateByCartId(shoppingCart);
    }

    @Test
    void queryOrderListByUserId(){
        System.out.println(orderService.queryOrderListByUserId(104));
    }

    @Test
    void cancelOrder(){

    }
}
