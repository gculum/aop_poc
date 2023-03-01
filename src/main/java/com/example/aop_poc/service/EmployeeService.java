package com.example.aop_poc.service;

import com.example.aop_poc.annotations.TrackExecutionTime;
import com.example.aop_poc.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService
{
    @TrackExecutionTime
    public Employee getEmployeeById(Integer employeeId) {
        System.out.println("Method getEmployeeById() called");
        
        for (int i=0; i<1000000; i++) {
            int[] ints = new int[1024];
        }

        return new Employee(employeeId, "Goran Ćulum", 37);
    }
}