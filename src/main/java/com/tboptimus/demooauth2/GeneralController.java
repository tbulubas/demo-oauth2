package com.tboptimus.demooauth2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralController {

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

}
