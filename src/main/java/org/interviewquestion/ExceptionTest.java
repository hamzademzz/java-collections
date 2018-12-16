package org.interviewquestion;

import java.util.Collection;
import java.util.Scanner;


public class ExceptionTest {

    public static void main(String[] args) throws ArithmeticException {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter to numbers to divide");

        double num1=input.nextInt();
        double num2=input.nextInt();

        System.out.println(num1/num2);



    }
}
