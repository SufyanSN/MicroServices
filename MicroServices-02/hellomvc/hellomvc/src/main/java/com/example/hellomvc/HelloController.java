package com.example.hellomvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {

    @Autowired
    MyServiceImpl userService;

    @GetMapping("/HelloWorld")
    public String greeting(){
        System.out.println("Hello");
        String str = userService.getUserData();
        return str;
    }

    @GetMapping("/greetQR")
    public ModelAndView QrView(@RequestParam(name="name", required = false, defaultValue = "World") String name, Model model){
        ModelAndView mav = new ModelAndView("developer");
        Developer dev = new Developer(1,"Syed Sufyan Ahmed");
        mav.addObject("developer", dev);
        return mav;
    }

    @GetMapping("/generateQR")
    public String generateQRCode(){
        String res = userService.generateQR();
        return res;
    }
}
