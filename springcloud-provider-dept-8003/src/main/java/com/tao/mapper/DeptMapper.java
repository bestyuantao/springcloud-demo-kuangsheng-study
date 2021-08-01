package com.tao.mapper;

import com.tao.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptMapper {

    Dept getById(Long deptno);

    void addNew(Dept dept);

    List<Dept> getAll();
}
