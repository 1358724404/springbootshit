package com.fuhan.springboot_demo1.resource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/10/21
 */

@Component
@ConfigurationProperties(prefix = "resource")
public class Resource  {

    private String imageServer;
    private String emailServer;

    public String getImageServer() {
        return imageServer;
    }

    public void setImageServer(String imageServer) {
        this.imageServer = imageServer;
    }

    public String getEmailServer() {
        return emailServer;
    }

    public void setEmailServer(String emailServer) {
        this.emailServer = emailServer;
    }
}
