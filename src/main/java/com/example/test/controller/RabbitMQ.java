package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.producer.Producer;

@RestController
public class RabbitMQ {

	@Autowired
	Producer producer;
	
	@RequestMapping("/send")
	public String sendMsg(@RequestParam("msg")String msg){
		for(int i=0;i<50;i++) {
		producer.produceMsg(msg);
		}
		return "DONE";
	}
	
}
