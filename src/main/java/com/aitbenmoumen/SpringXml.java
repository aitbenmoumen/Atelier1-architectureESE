package com.aitbenmoumen;

import DAO.ICalcul;
import Metier.IGestion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        ICalcul cal = (ICalcul) context.getBean(ICalcul.class);
        System.out.println(cal.getValue());
        IGestion gest = (IGestion) context.getBean(IGestion.class);
        System.out.println(gest.getVlue());
    }
}
