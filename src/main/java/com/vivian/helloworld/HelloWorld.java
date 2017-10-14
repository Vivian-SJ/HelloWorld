package com.vivian.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vivian on 2017/10/14.
 */
@Controller
@RestController
public class HelloWorld {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello, world!";
    }
}
