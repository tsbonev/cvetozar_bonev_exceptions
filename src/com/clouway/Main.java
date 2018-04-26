package com.clouway;

import java.math.*;

public class Main {

    public static void main(String[] args) {

        /*
        Sumator sumator = new Sumator();

        System.out.println(sumator.sum(2, 2));
        System.out.println(sumator.sum((double)2.00, (double)2.34));
        System.out.println(sumator.sum("two", "three"));
        BigInteger bigIntA = new BigInteger("9911111111111");
        BigInteger bigIntB = new BigInteger("91155555555555");
        System.out.println(sumator.sum( bigIntA, bigIntB ));
        BigDecimal bigDecA = new BigDecimal("93.423421424636361241");
        BigDecimal bigDecB = new BigDecimal("1241.635537476475457");
        System.out.println(sumator.sum(bigDecA, bigDecB));
        */


        SumatorExceptions sumator = new SumatorExceptions();

        System.out.println(sumator.sum("2131", "1341412"));
        System.out.println(sumator.sum("21gr2", "412g")); //NumberFormat
        System.out.println(sumator.sum("213176756435364737", "1341412125454634636774623")); //NumberFormat
        System.out.println(sumator.sum(null, null)); //NumberFormat
        System.out.println("-----------");


        ExceptionList list = new ExceptionList();
        list.Add("1");
        list.Add("2");
        list.printAllElements();
        list.Remove();
        list.Remove();


    }
}
