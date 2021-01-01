package com.tutorial;

import demo.constructor.ConstructorDemo;
import demo.constructor.ConstructorDemo2;
import demo.inheritence.abstractClass.CardPayment;
import demo.inheritence.abstractClass.Payment;
import demo.inheritence.constructor.order.ClassB;
import demo.inheritence.method.overriding.ClassC;
import demo.inheritence.method.overriding.ClassD;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        //1a. ConstructorDemo - Class without default constructor - only parameterised constructor
        System.out.println("---------------1a. ConstructorDemo - Class without default constructor - only parameterised constructor----------------");
        //ConstructorDemo constructorDemoObj1 = new ConstructorDemo(); //Expected - can't create object via default constructor
        ConstructorDemo constructorDemoObj2 = new ConstructorDemo(1, "A"); //Only parameterized constructor available

        //1b. ConstructorDemo2 - Class without constructor - default const by Java
        System.out.println("---------------1b. ConstructorDemo2 - Class without constructor - default const by Java--------------------------------");
        ConstructorDemo2 constructorDemo2Obj1 = new ConstructorDemo2();

        //2a. InheritanceDemo - order of constructor call
        System.out.println("---------------2a. InheritanceDemo - order of constructor call---------------------------------------------------------");
        ClassB classBObj1 = new ClassB(); //Expected=> ClassA def const -> ClassB def const
        ClassB classBObj2 = new ClassB("Card1"); //Expected=> ClassA def const -> ClassB param 1 const
        ClassB classBObj3 = new ClassB(1, new Date(), "Card2"); //Expected=> ClassA.parameterized const -> ClassB.param 2 const

        //2b. InheritanceDemo - Abstract class
        System.out.println("---------------2b. InheritanceDemo - Abstract class--------------------------------------------------------------------");
        Payment payment = new Payment() { //Seems this is allowed. HOW ??? TODO
            @Override
            public void printReceipt() {
                System.out.println("Overridden Print receipt");
            }
        };
        payment.printReceipt();
        CardPayment cp1 = new CardPayment(); //Payment.default const -> CardPayment.default const
        cp1.printPaymentDetails();
        //cp1.printReceipt(); //No details to print
        CardPayment cp2 = new CardPayment(1, new Date(), "12345", "123"); //Payment.param const -> CardPayment.param const
        cp2.printPaymentDetails();
        cp2.printReceipt();

        //2c. InheritanceDemo - Method overriding
        System.out.println("---------------2c. InheritanceDemo - Method overriding----------------------------------------------------------------");
        ClassC objClassC = new ClassC(1);
        objClassC.methodDemo(); //Calls ClassC method
        ClassD objClassD = new ClassD(2, 3);
        objClassD.methodDemo(); //Calls ClassD method
        ClassC objClassC2 = new ClassD(4,5); //Possible => creating parent from child reference
        objClassC2.methodDemo(); //Calls ClassD method
        //ClassD objClassD2 = new ClassC(6); //Not possible => create child from parent reference

    }
}
