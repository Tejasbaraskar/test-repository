package com.zensar;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.zensar.beans.Person;

@Service
public class Consumer {

	/*
	 * @RabbitListener(queues = "mobile") public void getMessage(Person p) {
	 * 
	 * System.out.println(p.getName());
	 * 
	 * }
	 */
	
}
