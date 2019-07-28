package com.jyyh.springboot_quick_start.dao;

import com.jyyh.springboot_quick_start.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> findAll();
}
