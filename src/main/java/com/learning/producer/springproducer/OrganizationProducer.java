package com.learning.producer.springproducer;

import com.learning.producer.springproducer.model.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class OrganizationProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendTo(String destination, Organization org) {
        jmsTemplate.convertAndSend(destination, org);
        System.out.println("Producer> Message Sent");
    }
}
