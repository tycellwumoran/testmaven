package com.example.wmrmaven;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.TemplateType;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @author tuzhiwu
 * @version 1.0
 * @description 代码生成
 * @className MybatisAutoGenerator
 * @date 2021/11/5 19:14
 */
public class MybatisAutoGenerator {


    public static void main(String[] args) {
        FastAutoGenerator fastAutoGenerator = FastAutoGenerator.create("jdbc:mysql://localhost:3306/panda?useUnicode=true&characterEncoding=utf8",
                "root", "123456");

        // 全局配置
        fastAutoGenerator.globalConfig((scanner, builder) -> builder.author(scanner.apply("请输入作者名称？")).commentDate("yyyy-MM-dd")
                        .outputDir(System.getProperty("user.dir")+"/src/main/java").dateType(DateType.ONLY_DATE))
                // 包配置
                .packageConfig((scanner, builder) -> builder.parent("com.example.wmrmaven.testmysql")
                        .pathInfo(Collections.singletonMap(OutputFile.mapperXml, System.getProperty("user.dir")+"/src/main/resources/mapper"))
                        //包名
                        .service("biz").serviceImpl("biz.impl"))
                // 策略配置
                .strategyConfig(builder -> builder.addTablePrefix("t_")
                        //表名
                        .addInclude(
                                "t_test_mybatis"
                        ))
                .templateConfig(builder -> builder.disable(TemplateType.CONTROLLER))
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }

}
