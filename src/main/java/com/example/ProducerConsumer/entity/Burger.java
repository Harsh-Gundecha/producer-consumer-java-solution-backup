package com.example.ProducerConsumer.entity;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Burger extends FastFood {
    private String size;
}
