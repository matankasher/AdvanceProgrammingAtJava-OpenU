/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maman12_matankasher;

/**
 *
 * @author matan
 */
public class SubtractionExpression extends CompoundExpression {
    
    public SubtractionExpression(Expression e1, Expression e2) {
        super(e1, e2);
    }
        @Override
    public String toString()
    {
        return  super.E1toString() + " - " + super.E2toString();
    }
            @Override
    public double calculate()
    {
        return  super.calculateE1() - super.calculateE2();
    }
    @Override
        public boolean equals(Expression o)
    {
        return(this.calculate() == o.calculate());
    }

}

