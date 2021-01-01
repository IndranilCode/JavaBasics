package com.tutorial;

import demo.constructor.ConstructorDemo;
import demo.constructor.ConstructorDemo2;
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
    }
}
