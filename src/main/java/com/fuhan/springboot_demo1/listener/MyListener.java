package com.fuhan.springboot_demo1.listener;

import org.springframework.stereotype.Component;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/10/21
 */
@Component
public class MyListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("listener Destroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("listener Initialized");
    }
}
