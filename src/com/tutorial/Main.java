package com.tutorial;

import demo.constructor.ConstructorDemo;
import demo.constructor.ConstructorDemo2;
import demo.inheritence.abstractClass.CardPayment;
import demo.inheritence.abstractClass.Payment;
import demo.inheritence.constructor.order.ClassB;

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

    }
}
