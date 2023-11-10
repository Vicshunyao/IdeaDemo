package com.example.aaa.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:CommonImportSelector
 * Package:com.example.aaa.config
 * Description:
 *
 * @Author: wsy
 * @Crete:2023/11/10 0010-11:11
 * @Version:v1.0
 */
public class CommonImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
//        读取配置文件内容，配置文件中多行注入写多行
        List<String> imports =new ArrayList<>();
      InputStream is= CommonImportSelector.class.getClassLoader().getResourceAsStream("common.imports");
        BufferedReader br =new BufferedReader(new InputStreamReader(is));

        String line =null;
        try {
            while ((line=br.readLine())!=null){
                imports.add(line);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
//        return new String[]{"com.example.aaa.config.CommonConfig"};
        return imports.toArray(new String[0]);
    }
}
