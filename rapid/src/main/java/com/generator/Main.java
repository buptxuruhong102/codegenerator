package com.generator;

import cn.org.rapid_framework.generator.GeneratorFacade;
import cn.org.rapid_framework.generator.GeneratorProperties;

/**
 * Created by xuruhong on 2017/5/21.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        GeneratorFacade g = new GeneratorFacade();
        g.getGenerator().addTemplateRootDir("classpath:template");
        g.deleteOutRootDir();
        //删除生成器的输出目录//
        //g.generateByTable("table_name","template");
        //通过数据库表生成文件,template为模板的根目录
        //g.generateByTable("s_user");
        g.generateByAllTable();
        //自动搜索数据库中的所有表并生成文件,template为模板的根目录
        //g.generateByClass(Blog.class,"template_clazz");
        //  g.deleteByTable("table_name", "template");
        //删除生成的文件
        Runtime.getRuntime().exec("cmd.exe /c start "+ GeneratorProperties.getRequiredProperty("outRoot"));
    }
}
