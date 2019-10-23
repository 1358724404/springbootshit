package com.fuhan.springboot_demo1.entity;

import lombok.Data;

import javax.validation.constraints.*;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/10/22
 */
@Data
public class User {
    @NotNull(message="名字不能为空")
    private String name;

    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机号码格式错误")
    @NotBlank(message = "手机号码不能为空")
    private String phone;

    @Email(message = "邮箱格式不正确")
    private String email;

    @Min(18)
    private Integer age;
}
