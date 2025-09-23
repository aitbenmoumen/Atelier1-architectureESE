package com.aitbenmoumen;

import DAO.ICalcul;
import Metier.IGestion;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class InstanciationDynamique {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("conf.txt"));
        String calcul = sc.nextLine();
        Class obj = Class.forName(calcul);
        ICalcul cal = (ICalcul) obj.getConstructor().newInstance();
        System.out.println(cal.getValue());

        String gestion = sc.nextLine();
        Class obj2 = Class.forName(gestion);
        IGestion cal2 = (IGestion) obj2.getConstructor().newInstance();
        // Method meth = obj2.getMethod("setCal", ICalcul.class);
        Method meth = obj2.getMethod("setCalcul", ICalcul.class);
        meth.invoke(cal2, cal);
        System.out.println(cal2.getVlue());

    }
}
