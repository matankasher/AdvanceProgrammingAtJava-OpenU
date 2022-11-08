/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maman12_matankasher;

/**
 *
 * @author matan
 */
public abstract class  CompoundExpression extends Expression {
    
    private Expression e;
    public CompoundExpression(Expression e1, Expression e2) {
        super(e1);
        e = new Expression(e2);
        
    }
    public String E1toString()
    {
        return super.toString();
    }
    public String E2toString()
    {
        return e.toString();
    }  
    public double calculateE1()
    {
        return super.calculate();
    }
        public double calculateE2()
    {
        return e.calculate();
    }
}
