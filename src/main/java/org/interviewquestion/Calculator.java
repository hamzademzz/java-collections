package org.interviewquestion;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Calculator {

    private double result;
    private double lastValue;
    private Operand lastOperand=Operand.None;
    enum Operand{
        ADD("plus"),
        SUBTRACT("minus"),
        MULTIPLY("multiply"),
        DIVIDE("divide"),
        None("none");

        private String name;
        Operand(String name){
            this.name=name;
        }

        public String getName(){
            return this.name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    public Calculator() {

    }

    public Calculator(double num1) {
        this.result = num1;
    }

    public double plus(double num1) {
        this.lastOperand=Operand.ADD;
        this.lastValue = num1;
        this.result = this.result + this.lastValue;

        return this.result;
    }

    public double minus(double num1) {
        this.lastOperand=Operand.SUBTRACT;
        this.lastValue = num1;
        this.result = this.result - this.lastValue;
        return this.result;

    }

    public double divide(double num1) {
        if (num1 == 0) {
            throw new IllegalArgumentException("Can not devide by zero!");
        }
        this.lastOperand=Operand.DIVIDE;
        this.lastValue = num1;
        this.result = this.result / this.lastValue;
        return this.result;
    }

    public double multiply(double num1) {
        this.lastOperand=Operand.MULTIPLY;
        this.lastValue=num1;
        this.result = this.result * this.lastValue;
        return this.result;
    }

    public double getResult() {
        switch (lastOperand){
            case ADD:return plus(this.lastValue);
            case SUBTRACT:return minus(this.lastValue);
//            case DIVIDE:return divide(this.lastValue);
//            case MULTIPLY:return multiply(this.lastValue);
//            case None:return this.result;
            default:return this.result;
        }
    }




}
