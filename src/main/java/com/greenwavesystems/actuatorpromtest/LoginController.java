package com.greenwavesystems.actuatorpromtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    private static final String template = "Hello, %s!";

    @PostMapping("/login")
    @ResponseBody
    public Greeting sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        LoginCounter lc = new LoginCounter();
        lc.increment();
        return new Greeting((long) lc.getCount(), String.format(template, name));
    }
}
