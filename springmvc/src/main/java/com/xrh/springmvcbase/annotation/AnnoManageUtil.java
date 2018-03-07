package com.xrh.springmvcbase.annotation;


import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public final class AnnoManageUtil {
    public static void main(String[] args) {
        getMenus("com.xrh.springmvcbase.controller");
    }

    /**
     *
     * @param packageName
     * @return
     */
    public static Map<String, String> getMenus(String packageName) {
        Reflections reflections = new Reflections(packageName);
        Set<Class<?>> classesList = reflections.getTypesAnnotatedWith(Menu.class);

        Map<String, String> mapp = new HashMap<String, String>();
        for (Class classes : classesList) {
            Menu annotation = (Menu)classes.getAnnotation(Menu.class);
            if(annotation != null){
                mapp.put(annotation.value(), annotation.name());
                System.out.println(annotation.value());
            }

        }
        return mapp;
    }

}