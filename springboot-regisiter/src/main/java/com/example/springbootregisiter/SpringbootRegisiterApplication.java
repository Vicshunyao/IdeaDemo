package com.example.springbootregisiter;

import cn.itcast.pojo.Country;
import com.example.aaa.anno.EnableCommonConfig;
import com.example.aaa.config.CommonConfig;
import com.example.aaa.config.CommonImportSelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

//注入第三方库
@SpringBootApplication
//@Import(CommonConfig.class)
//@Import(CommonImportSelector.class)
@EnableCommonConfig
public class SpringbootRegisiterApplication {

    public static void main(String[] args) {


        ApplicationContext context =SpringApplication.run(SpringbootRegisiterApplication.class, args);
        Country country = context.getBean(Country.class);
        System.out.println(country);
//.sout输出打印指令
        System.out.println(context.getBean("province"));
    }



}
