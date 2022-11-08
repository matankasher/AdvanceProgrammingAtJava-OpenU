/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maman12_matankasher;

/**
 *
 * @author matan
 */
public class AtomicExpression extends Expression{
    
    public AtomicExpression(double a) {
        super(a, 0, '0');
    }
    
    @Override
    public String toString()
    {
        String s = "" + a;
        return s;
    }
    
}