package com.devLearn.com.Learning.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContreoller {

    @GetMapping("/welcome")
    public String welcome(){

        return "Hello!! this is a get method";

    }


}
