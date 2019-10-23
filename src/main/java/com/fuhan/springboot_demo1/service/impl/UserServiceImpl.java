package com.fuhan.springboot_demo1.service.impl;

import com.fuhan.springboot_demo1.entity.TStudent;
import com.fuhan.springboot_demo1.mapper.TStudentMapper;
import com.fuhan.springboot_demo1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/10/21
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private TStudentMapper studentMapper;

    @Override
    public TStudent getById(int id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
