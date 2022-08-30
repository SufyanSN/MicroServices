package com.example.hellomvc;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MyServiceImpl implements MyService{

    @Override
    public String getUserData() {
        RestTemplate rst = new RestTemplate();

        String result_str = rst.getForObject("http://localhost:8081/getUserFromExternal",String.class);

        //System.out.println("Inside user service");
        return result_str;
    }
}
