package com.zq.study.newcar2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author milogenius
 * @date 2020/5/17 20:52
 */
@Configuration
public class AnnotationConfig {

    @Bean
    public Car car(Engine engine) {
        return new Car(engine);
    }

    @Bean
    public Engine engine(Camshaft camshaft, Crankshaft crankshaft) {
        return new CombustionEngine(camshaft, crankshaft);
    }

    @Bean
    public Camshaft camshaft() {
        return new Camshaft();
    }

    @Bean
    public Crankshaft crankshaft() {
        return new Crankshaft();
    }
}

