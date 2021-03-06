package com.assignment.customerservice.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.assignment.customerservice.config.MessagingConfig;
import com.assignment.customerservice.model.customer;
import com.assignment.customerservice.model.transactions;

@Component
public class customer_service {
    @Autowired
    private transactions Transactions;


    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(customer c) {
        System.out.println("Message recieved from queue : " + c);
        customer customer = Transactions.saveCustomer(c);
    }
}
