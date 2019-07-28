package com.jyyh.springboot_quick_start.controller;

import com.jyyh.springboot_quick_start.dao.StudentMapper;
import com.jyyh.springboot_quick_start.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ConfigurationProperties(prefix = "student")    //根据yml文件中的配置进行匹配 需要提供getter setter方法
                                                // prefix = "student"    prefix匹配对象名
public class HelloWorldController {

    @Value("${name}")//通过@value属性读取配置文件中的数据
    private String name;

    private String sname;
    private String age;


    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @RequestMapping("/testHello")
    public String testHello() {
        System.out.println(name);
        System.out.println("sname:" + sname);
        System.out.println("age:" + age);
        return "hello SpringBoot";
    }
    @Autowired
    private StudentMapper studentMapper;
    @RequestMapping("/findAll")
    public List<Student> findAll(){
        return studentMapper.findAll();
    }
}
