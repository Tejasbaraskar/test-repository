package com.zensar;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class QueuePublisherApplication {

	public static void main(String[] args) throws IOException ,TimeoutException {

		ConnectionFactory factory=new ConnectionFactory();
		Connection connection=factory.newConnection();
		Channel channel=connection.createChannel();
		
		String message = "First message from rabbitmq";
		System.out.println(message);
		
		channel.basicPublish("", "Queue-1", null, message.getBytes());
		
		channel.close();
		connection.close();
		
	}

}
