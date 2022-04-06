package com.group4.bookstoreback.controller;


import com.group4.bookstoreback.service.CategoryService;
import com.group4.bookstoreback.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/all")
    public JsonResult getAllCategory(){
        return JsonResult.isOk(categoryService.queryAllCategory());
    }

}
