package com.bdqn.test;

import com.bdqn.pojo.Employee;
import com.bdqn.service.EmployeeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SSMTest {

    @Test
    public void test(){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);

        Employee employee = employeeService.queryEmployeeById(1);

        System.out.println(employee);
    }

}
