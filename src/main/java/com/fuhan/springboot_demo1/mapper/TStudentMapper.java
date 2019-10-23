package com.fuhan.springboot_demo1.mapper;

import com.fuhan.springboot_demo1.entity.TStudent;

public interface TStudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TStudent record);

    int insertSelective(TStudent record);

    TStudent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TStudent record);

    int updateByPrimaryKey(TStudent record);
}