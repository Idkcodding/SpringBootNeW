package com.mega.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
// 최소 하나의 @Entity 클래스가 필요
// @WebMvcTest이다 보니 당연히 X
// @EnableJpaAuditing의 @SpringBootApplication 같이있어서 같이 읽기 때문에 문제가 발생합니다.
//@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
