package com.fuhan.springboot_demo1.pojo;

import lombok.Data;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/10/22
 */
@Data
public class ResultBean<T> {
    private String status;
    private T data;

    public ResultBean(String status, T data) {
        this.status = status;
        this.data = data;
    }
}
