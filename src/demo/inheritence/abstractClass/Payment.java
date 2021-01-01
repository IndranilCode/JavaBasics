package demo.inheritence.abstractClass;

import java.util.Date;

public abstract class Payment {
    int paymentId; //Can have fields
    Date paymentDate;

    public Payment() {
        System.out.println("Payment.default const called");
    }

    public Payment(int paymentId, Date paymentDate) {
        this.paymentId = paymentId;
        this.paymentDate = paymentDate;
        System.out.println("Payment.param const called");
    }

    public void printPaymentDetails() {
        System.out.println("Payment details => Payment Id: " + this.paymentId + " , Date: " + this.paymentDate);
    }

    public abstract void printReceipt();
}
