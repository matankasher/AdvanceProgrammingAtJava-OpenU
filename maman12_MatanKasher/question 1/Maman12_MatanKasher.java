/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.maman12_matankasher;

import java.util.ArrayList;

/**
 *
 * @author matan
 */
public class Maman12_MatanKasher {

    public static void main(String[] args) {
        ArrayList <Expression> list = new ArrayList <Expression>();
        AtomicExpression e1 = new AtomicExpression(5);
        Expression e2 = new Expression(5, 3, '+');
        Expression e3 = new Expression(6, 6, '+');
        Expression e8 = new Expression(15, 10, '+');
        SubtractionExpression e4 = new SubtractionExpression(e8,e1);
        AdditionExpression e5 = new AdditionExpression(e3,e2);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());
        System.out.println(e5.toString());
        System.out.println(e5.equals(e3));
        System.out.println(e4.equals(e5));
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e1));
        System.out.println(e4.equals(e2));

        
        
    }
}
