package org.interviewquestion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private double precision=0.00001;

    @Test
    public void plusShouldAdd() {
        Calculator calculator = new Calculator();
        double num1 = 2;
        double expected = num1 + calculator.getResult();
        double actual = calculator.plus(num1);
        assertEquals(expected, actual, precision);
    }

    @Test
    public void minusShouldSubtract(){
        Calculator calculator =new Calculator();
        double num1=2;
        double expected =calculator.getResult()-num1;
        double actual= calculator.minus(num1);
        assertEquals(expected, actual, precision);
    }

    @Test
    public void divideShouldDivide(){
        Calculator calculator =new Calculator();
        double num1=10;
        double expected=calculator.getResult()/num1;
        double actual =calculator.divide(num1);
        assertEquals(expected, actual, precision);

    }

    @Test(expected = IllegalArgumentException.class)
    public void divideShouldNotDivideByZero(){
        Calculator calculator =new Calculator();
        double num1=0;
        calculator.divide(num1);
    }

    @Test
    public void multiplyShouldMultiply(){
        Calculator calculator=new Calculator(1);
        double num1 =2;
        double expected = calculator.getResult()*num1;
        double actual= calculator.multiply(num1);
        assertEquals(expected, actual, precision);
    }

    @Test
    public void shouldGetResult(){
        Calculator calculator=new Calculator();
        double expected = 0;
        double actual = calculator.getResult();
        assertEquals(expected,actual,precision);
    }

    @Test
    public void getResultShouldRepeatPlusAgain(){
        double initialValue=0;
        Calculator calculator = new Calculator(initialValue);
        double lastValue = 2;
        double firstResult=calculator.plus(lastValue);
        double actual = calculator.getResult();
        double expected = firstResult + lastValue;
        assertEquals(expected, actual, precision);
    }

    @Test
    public void getResultsShouldRepeatSubtractAgain(){
        double initialValue=0;
        Calculator calculator =new Calculator(initialValue);
        double lastValue=10;
        double result= calculator.minus(lastValue);
        double expected = result - lastValue;
        double actual = calculator.getResult();
        assertEquals( expected ,actual , precision);
    }

    @Test
    public void getResultShouldRepeatDivideAgain(){
        double initialValue=0;
        Calculator calculator=new Calculator(initialValue);
        double lastValue=8;
        double result= calculator.divide(lastValue);
        double expected;
    }


}
