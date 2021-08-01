package tao.controller;

import com.tao.springcloud.pojo.Dept;
import com.tao.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptConsumerController {

    @Autowired
    public DeptClientService deptClientService = null;


    @GetMapping("/consumer/get/{id}")
    public Dept getById(@PathVariable("id") Long id){
        return deptClientService.getById(id);
    }

    @GetMapping("/consumer/add")
    public Boolean addNew(Dept dept){
        return deptClientService.addNew(dept);
    }

    @GetMapping("/consumer/list")
    public List<Dept> getAll(){
        return deptClientService.getAll();
        
    }
}
