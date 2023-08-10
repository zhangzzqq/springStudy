package com.zq.study.framework3;

import com.zq.study.framework2.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    // Method
    public Student student() {

        return new Student("1", "Geek");
    }
}
