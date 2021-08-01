package com.tao.service;

import com.tao.mapper.DeptMapper;
import com.tao.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

    @Autowired
    private DeptMapper deptMapper;


    public Dept getById(Long deptno){
        return deptMapper.getById(deptno);
    }

    public Boolean addNew(Dept dept){
         deptMapper.addNew(dept);
         return true;
    }

    public List<Dept> getAll(){
        return deptMapper.getAll();
    }
}
