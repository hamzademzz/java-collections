package org.interviewquestion;

public class NoZeroException extends Exception{



    public NoZeroException(double divisor){
        super("you cant divide by zero" + divisor);

    }


}















/*
public class NoZeroException(double divisor) extends Exception{
        super("You cant divide by zero!" + divisor)
        this.divisor=divisor;
    }

    public double getDivisor(){
        return divisor;

    }


      private double divisor;

    public clasNoZeroException(double divisor) extends Exception{
        super("you cant divide by zero" + divisor);
        this.divisor=divisor;
    }

    public double getDivisor(){
        return divisor;
    }
 */