package demo.inheritence.constructor.order;

import java.util.Date;

public class ClassA {
    int paymentId;
    Date paymentDate;

    public ClassA() {
        System.out.println("ClassA.default const called");
    }

    public ClassA(int paymentId, Date paymentDate) {
        this.paymentId = paymentId;
        this.paymentDate = paymentDate;
        System.out.println("ClassA.parameterized const called");
    }
}
