package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by lixingyuan on 2018/5/9.
 */
@Mapper
public interface UserMapper{
    @Select("select * from user ${sql}")
    public User userLogin(@Param("sql") String sql);

}
