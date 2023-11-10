package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@ConfigurationProperties( prefix = "email")
//@Value("${email.user}")

public class Hellocontroller {
    @RequestMapping("/hello")

    public String hello(){
        System.out.println("hellowordlsdfgdgdfgdfg,");


        return "hello,worlfdfdfdd";


    }
}
