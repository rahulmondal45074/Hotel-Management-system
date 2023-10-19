package com.example.Restarentproject1;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BeanBag {

    @Bean
    public List<Res> getDatasource(){
        return new ArrayList<>();
    }
}
