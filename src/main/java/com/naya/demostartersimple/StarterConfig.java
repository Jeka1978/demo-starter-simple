package com.naya.demostartersimple;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */

@Configuration
@EnableScheduling
public class StarterConfig {

    @Bean
    public InjectRandomIntAnnotationBPP injectRandomIntAnnotationBPP(){
        return new InjectRandomIntAnnotationBPP();
    }

    @Bean
    public MyPrinter printer(){
        return new MyPrinter();
    }

    @Bean
    public Faker faker(){
        return new Faker();
    }

    @Bean
    public GameOfThroneService gameOfThroneService(){
        return new GameOfThroneService();
    }
}
