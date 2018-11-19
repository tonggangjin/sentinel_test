package com.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowRuleManager;

@SpringBootApplication
@RestController
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
	
	@GetMapping("test")
	public String getTest(String test) {
		return test;
	}
	
	@GetMapping("rules")
	public List<?> getRules() {
		return ParamFlowRuleManager.getRules();
	}
}
