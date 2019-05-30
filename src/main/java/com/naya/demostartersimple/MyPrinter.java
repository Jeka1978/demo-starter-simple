package com.naya.demostartersimple;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author Evgeny Borisov
 */

public class MyPrinter {

    @Scheduled(fixedDelay = 500)
    public void printSomething(){
        System.out.println("LANISTER FOREVER");
    }
}
