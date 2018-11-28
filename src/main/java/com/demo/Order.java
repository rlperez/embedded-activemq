package com.demo;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {

    private String content;
    private Date timestamp;

}
