package com.fuhan.springboot_demo1.controller;

import com.fuhan.springboot_demo1.entity.TStudent;
import com.fuhan.springboot_demo1.entity.User;
import com.sun.media.jfxmedia.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/10/21
 */
@Controller
@RequestMapping("test")
@Slf4j
public class TestController {

    @RequestMapping("hello")
    public String toHello(Model model){
        model.addAttribute("msg","欢迎使用springboot");
        log.info("我在这");
        return "hello";
    }

    @RequestMapping("getUser")
    public String getUser(@Valid User user){
        System.out.println(user);
        return "hello";
    }


}
