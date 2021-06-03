package com.zensar.controllers;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.beans.Person;

@RestController
@RequestMapping("/api/v1")
public class TestController {

	@Autowired
	RabbitTemplate rabbittemplate;
	
	/*
	 * @GetMapping("/test/{name}") public String testApi(@PathVariable("name")String
	 * name) { Person p=new Person(1L,name);
	 * rabbittemplate.convertAndSend("mobile",p);
	 * rabbittemplate.convertAndSend("FanOut-Exchange","",p); return "success"; }
	 */
	
	/**
	 * @param name
	 * @return
	 * @throws IOException 
	 */
	@GetMapping("/test/{name}")
	public String testApi(@PathVariable("name")String name) throws IOException {
		Person p=new Person(1L,name);
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutput out=new ObjectOutputStream(bos);
		out.writeObject(p);
		out.flush();
		out.close();
		
		byte[] byteMessage=bos.toByteArray();
		bos.close();
				
				Message message=MessageBuilder.withBody(byteMessage).setHeader("item1", "mobile").setHeader("item2", "television").build();
		
	
		rabbittemplate.send("Headers-Exchange","",message);
		return "success";
	}
	
}
