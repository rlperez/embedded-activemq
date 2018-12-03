package com.demo;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {
    private String content;
    private Long timestamp;
}
