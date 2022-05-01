package com.assignment.customer.publisher;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.customer.config.MessagingConfig;
import com.assignment.customer.model.customer;

@RestController
@RequestMapping("/order")
public class OrderPublisher {
    @Autowired
    private RabbitTemplate template;

    @PostMapping("/")
    public String bookOrder(@RequestBody customer customer) {
        customer.setCostumerId("9");
        System.out.println(customer);
        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, customer);
        return "Success !!";
    }
    @GetMapping("/get")
    public customer getc(){
        customer c = new customer();
        c.setCostumerId(UUID.randomUUID().toString());
        c.setAge(22);
        c.setName("Vamsi");
        c.setMobile_number("9381358140");
        return  c ;
    }
}
