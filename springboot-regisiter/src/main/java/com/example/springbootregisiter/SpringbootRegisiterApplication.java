package com.example.springbootregisiter;

import cn.itcast.pojo.Country;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

//注入第三方库
@SpringBootApplication
public class SpringbootRegisiterApplication {

    public static void main(String[] args) {


        ApplicationContext context =SpringApplication.run(SpringbootRegisiterApplication.class, args);
        Country country = context.getBean(Country.class);
        System.out.println(country);
    }

//    注入country对象
    @Bean
    public Country country(){
        return new Country();
    }


}
