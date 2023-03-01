package com.example.aop_poc;

import com.example.aop_poc.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootTest
class AopPocApplicationTests {


	@Autowired
	EmployeeService employeeService;
	@Test
	void contextLoads() {
		employeeService.getEmployeeById(23);
	}

}
