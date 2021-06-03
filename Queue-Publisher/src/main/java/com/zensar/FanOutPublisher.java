package com.zensar;




import java.io.IOException;
import java.util.concurrent.TimeoutException;

 

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

 

public class FanOutPublisher {

 


    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.newConnection();
        Channel channel = (Channel) connection.createChannel();
        
        String message ="This is mobile and AC";
        
        channel.basicPublish("FanOut-Exchange","",null,message.getBytes());
        
        channel.close();
        connection.close();

 

    }

 

}