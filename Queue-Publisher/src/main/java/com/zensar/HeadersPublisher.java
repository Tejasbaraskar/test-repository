package com.zensar;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class HeadersPublisher {


		public static void main(String[] args) throws IOException, TimeoutException {
	        ConnectionFactory factory = new ConnectionFactory();
	        Connection connection = factory.newConnection();
	        Channel channel = (Channel) connection.createChannel();
		
	        
	String message ="Message for mobile and tv";
	
	Map<String, Object> headerMap=new HashMap<String, Object>();
	headerMap.put("item1","mobile");
	headerMap.put("item2","television");
	        
	BasicProperties br=new BasicProperties();
	br=br.builder().headers(headerMap).build();
	        channel.basicPublish("Headers-Exchange","",br,message.getBytes());
	        
	        channel.close();
	        connection.close();
	}
	
}
