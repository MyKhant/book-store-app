package com.example.bookstoreapp.admin.controller;

import com.example.bookstoreapp.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @Autowired
    private BookDao bookDao;
    @GetMapping(value = {"/admin",})
    public String layoutTest(){
        return "forward:/admin/book/all";
    }


}