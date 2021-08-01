package com.tao.controller;

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

    @GetMapping("/dept/get/{id}")
    public Dept getById(@PathVariable("id") Long id){
        return deptService.getById(id);
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
