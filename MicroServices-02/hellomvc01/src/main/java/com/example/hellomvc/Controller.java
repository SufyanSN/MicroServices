package com.example.hellomvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/getUserFromExternal")
    public String greeting01(){
        System.out.println("Inside the external-user-service");

        return "Inside the external-user-service";
    }
}
