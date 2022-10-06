package com.jojoldu.book.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA auditing 활성화
@SpringBootApplication // 스프링부트 자동설정, 스프링 빈 읽기와 생성 자동설정
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
