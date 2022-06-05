package com.example.hrpayroll.entities;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private Double dailyIncome;
    private Integer days;

    public Double getTotal(){
        return days * dailyIncome;
    }

}
