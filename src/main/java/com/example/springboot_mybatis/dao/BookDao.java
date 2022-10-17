package com.example.springboot_mybatis.dao;

import com.example.springboot_mybatis.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao {

    @Select("select * from tbl_user where id= #{id}")
    public Book getById(Integer id);
}
