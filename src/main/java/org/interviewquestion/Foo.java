package org.interviewquestion;

public class Foo {
    int i;
    static int s;

    public static void main(String[] args) {
        Foo tester =new Foo();
        System.out.println(tester.i);

        System.out.println();

        Foo f1 = new Foo();
        System.out.println("f1.i is " + f1.i + " f1.s is " + f1.s);
        System.out.println("-------------------------------");
        Foo f2 = new Foo();
        System.out.println("f2.i is " + f2.i + " f2.s is " + f2.s);
        System.out.println("-------------------------------");
        Foo f3 = new Foo();
        System.out.println("f3.i is " + f3.i + " f3.s is " + f3.s);
        System.out.println("-------------------------------");

    }

    public Foo() {
        i++;
        s++;
    }
}