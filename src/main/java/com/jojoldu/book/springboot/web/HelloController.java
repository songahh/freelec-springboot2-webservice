package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Json을 반환하는 컨트롤러 생성
public class HelloController {

    @GetMapping("/hello") // HTTP Get method 요청을 받을 수 있는 API 생성
    public String hello(){
        return "hello";
    }
}
