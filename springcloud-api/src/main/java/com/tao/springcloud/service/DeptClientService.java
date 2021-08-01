package com.tao.springcloud.service;

import com.tao.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
@FeignClient(value = "SPRINGCLOUDPROVIDERr")
public interface DeptClientService {

    @GetMapping("/dept/get/{id}")
    public Dept getById(@PathVariable("id") Long id);

    @GetMapping("/dept/add")
    public Boolean addNew(Dept dept);

    @GetMapping("/dept/list")
    public List<Dept> getAll();
}
