package com.lijia.helloworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class HelloworldService {
	@Autowired
    public HelloworldService(ApplicationArguments args) {
        boolean debug = args.containsOption("debug");
        List<String> files = args.getNonOptionArgs();
        System.out.println("1===:"+debug);
        for(String s: files){
        	 System.out.println("2===:"+s);
        }
       
        // if run with "--debug logfile.txt" debug=true, files=["logfile.txt"]
    }

	public void say() {
        System.out.println("hi , Here is earth!!!");
		
	}
}
