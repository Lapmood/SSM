package com.bdqn.service;

import com.bdqn.dao.EmployeeMapper;
import com.bdqn.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public Employee queryEmployeeById(Integer id){
        return employeeMapper.queryEmployeeById(id);
    }
}
