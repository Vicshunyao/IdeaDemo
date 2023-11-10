package com.example.aaa.anno;

import com.example.aaa.config.CommonImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName:EnableCommonConfig
 * Package:com.example.aaa.anno
 * Description:
 *
 * @Author: wsy
 * @Crete:2023/11/10 0010-11:23
 * @Version:v1.0
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import(CommonImportSelector.class)
public @interface EnableCommonConfig {
}
