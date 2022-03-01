package co.mr.springBootTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + @ResponseBody
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "Hello World!!!";
    }

    @GetMapping("/helloObj")
    public Hello helloObj() {
        return new Hello("Hi Spring!!!");
    }
}
