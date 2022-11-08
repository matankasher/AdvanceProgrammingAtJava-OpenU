/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maman12_matankasher;

/**
 *
 * @author matan
 */
public class Expression
{
    double a;
    private double b;
    private char  operand;
 
    public Expression (double a, double b, char operand )
    {
        this.a = a;
        this.b = b;
        this.operand = operand;
    }
    public Expression (Expression e)
    {
        this.a = e.a;
        this.b = e.b;
        this.operand = e.operand;
    }
    public double calculate()
    {
        if(operand == '+')
            return a + b;
        return a-b;
    }
        @Override
    public String toString()
    {
        String s;
        if(operand == '0')
        {
            s = a +" ";
        }
        else
        {
            s = a + " " + operand + " " + b;
        }
        return s;
    }
    public boolean equals(Expression o)
    {
        return(this.calculate() == o.calculate());
    }
}
