package com.adp.evintegration;

import com.adp.evintegration.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;





public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //PersonClient client = applicationContext.getBean(PersonClient.class);
        System.out.println("Getting list of all people:");
        applicationContext.close();
    }
}

