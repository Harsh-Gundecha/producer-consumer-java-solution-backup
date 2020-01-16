package com.example.ProducerConsumer.controller;

import com.example.ProducerConsumer.entity.Burger;
import com.example.ProducerConsumer.entity.FastFood;
import com.example.ProducerConsumer.entity.Pizza;
import com.example.ProducerConsumer.service.ProcessFastFood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class ProductController {

    @Autowired
    private ProcessFastFood processFastFood;

    @PostMapping("/burger")
    ResponseEntity<Boolean> postOrder(@RequestBody Burger burger){
        return ResponseEntity.ok(processFastFood.addOrder(burger));
    }

    @PostMapping("/pizza")
    ResponseEntity<Boolean> postOrder(@RequestBody Pizza pizza){
        return ResponseEntity.ok(processFastFood.addOrder(pizza));
    }

    @GetMapping
    ResponseEntity<FastFood> getOrder(){
        return ResponseEntity.ok(processFastFood.getOrder());
    }

}
