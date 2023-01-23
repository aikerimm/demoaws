package com.example.demoaws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping(path = "/demo1")
    public String demo() {
        return "Hello from Demo!";
    }
}
