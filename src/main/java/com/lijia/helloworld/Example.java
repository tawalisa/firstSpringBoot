package com.lijia.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.lijia.helloworld.service.HelloworldService;
import com.lijia.helloworld.web.MyRestController;

@RestController
@EnableAutoConfiguration
@ComponentScan({"com.lijia.helloworld.service"})
public class Example {

	@Autowired
	HelloworldService helloworldService;
    @RequestMapping("/")
    String home() {
    	helloworldService.say();
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
    	Object[] aa = {Example.class,MyRestController.class};
        SpringApplication.run(aa,args);
    }

}