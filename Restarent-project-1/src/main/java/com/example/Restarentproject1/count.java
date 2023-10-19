package com.example.Restarentproject1;


import org.springframework.stereotype.Component;

@Component
public class count {

    public Integer count=0;

    public Integer getCount(){
        return count++;
    }
}
