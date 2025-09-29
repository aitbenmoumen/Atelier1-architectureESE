package com.aitbenmoumen;

import Metier.IGestion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("DAO", "Metier");
        IGestion gestion = (IGestion) context.getBean(IGestion.class);
        System.out.println(gestion.calcule());
    }
}
