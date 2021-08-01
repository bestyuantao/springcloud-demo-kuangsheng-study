package com.tao.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tao.service.DeptService;
import com.tao.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;


    @HystrixCommand(fallbackMethod = "HystrixGet")
    @GetMapping("/dept/get/{id}")
    public Dept getById(@PathVariable("id") Long id){
        Dept dept = deptService.getById(id);

        if (dept==null){
            throw new RuntimeException("这个id=>\"+id+\",不存在该用户，或信息无法找到~\"");
        }
        return dept;
    }

    public Dept HystrixGet(@PathVariable("id") Long id){
        Dept dept = new Dept();
        dept.setDeptno(id);
        dept.setDname("这个id=>"+id+",没有对应的信息,null---@Hystrix~");
        dept.setDbsource("在MySQL中没有这个数据库");

        return dept;
    }

    @GetMapping("/dept/add")
    public Boolean addNew(Dept dept){
        return deptService.addNew(dept);
    }

    @GetMapping("/dept/list")
    public List<Dept> getAll(){
        return deptService.getAll();
    }
}
