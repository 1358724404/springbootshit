package com.fuhan.springboot_demo1.controller;


import com.fuhan.springboot_demo1.entity.TStudent;
import com.fuhan.springboot_demo1.pojo.ResultBean;
import com.fuhan.springboot_demo1.resource.Resource;
import com.fuhan.springboot_demo1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/10/21
 */

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private Resource resource;

    @RequestMapping("getImageServer")
    public String getImageServer(){
        return resource.getImageServer();
    }

    @RequestMapping("getEmailServer")
    public String getEmailServer(){
        return resource.getEmailServer();
    }

    @RequestMapping("getById/{id}")
    public TStudent getById(@PathVariable int id){
        return userService.getById(id);
    }

    @RequestMapping("toprint")
    public  String  print(){
        int i =1/0;
        return "123";
    }

    @RequestMapping("getUser")
    public String getUser(TStudent student){
        System.out.println(student);
        return "hello";
    }

}
