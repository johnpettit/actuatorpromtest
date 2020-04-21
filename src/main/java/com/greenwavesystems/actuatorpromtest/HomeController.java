package com.greenwavesystems.actuatorpromtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private static final String template = "Hello, %s!";

    @GetMapping("/")
    @ResponseBody
    public Greeting sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        LoginCounter lc = new LoginCounter();
        return new Greeting((long) lc.getCount(), String.format(template, name));
    }
}