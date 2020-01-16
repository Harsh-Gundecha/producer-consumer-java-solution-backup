package com.example.ProducerConsumer.service;

import com.example.ProducerConsumer.entity.FastFood;
import com.example.ProducerConsumer.resource.OrderQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessFastFood {
    @Autowired
    private OrderQueue orderQueue;

    public synchronized boolean addOrder(FastFood fastFood){
        return orderQueue.getOrderQueue().add(fastFood);
    }

    public synchronized FastFood getOrder(){
        if(!orderQueue.getOrderQueue().isEmpty())
            return orderQueue.getOrderQueue().remove();
        else
            return null;
    }

}
