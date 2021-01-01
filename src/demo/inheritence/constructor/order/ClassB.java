package demo.inheritence.constructor.order;

import java.util.Date;

public class ClassB extends ClassA {
    String cardNumber;

    public ClassB() {
        //Base class (ClassA) const would be called ven w/o super by default
        System.out.println("ClassB.default const called");
    }

    public ClassB(String cardNumber) {
        //Base class (ClassA) const would be called ven w/o super by default
        this.cardNumber = cardNumber;
        System.out.println("ClassB.param 1 const called");
    }

    public ClassB(int paymentId, Date paymentDate, String cardNumber) {
        super(paymentId, paymentDate);
        this.cardNumber = cardNumber;
        System.out.println("ClassB.param 2 const called");
    }
}
