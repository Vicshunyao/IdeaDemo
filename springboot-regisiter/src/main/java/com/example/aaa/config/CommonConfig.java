package com.example.aaa.config;

import cn.itcast.pojo.Country;
import cn.itcast.pojo.Province;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:CommonConfig
 * Package:com.example.springbootregisiter.config
 * Description:
 *
 * @Author: wsy
 * @Crete:2023/11/10 0010-10:59
 * @Version:v1.0
 */
@Configuration
public class CommonConfig {
    //    注入country对象
    @Bean
    public Country country(){
        return new Country();
    }

//    对象默认的名字是方法名
//    @Bean("aa")
//    如果方法内部需要使用到ioc容器中已经存在的bean对象，那么只需要在方法中声明即可，springboot会自动的注入
    @Bean
    public Province province(Country country){
        System.out.println( "province"+country);
        return new Province();
    }

}
