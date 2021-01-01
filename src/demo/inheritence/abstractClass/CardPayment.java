package demo.inheritence.abstractClass;

import java.util.Date;

public class CardPayment extends Payment {
    String cardNumber;
    String cvv;

    public CardPayment() {
        System.out.println("CardPayment.default const called");
    }

    public CardPayment(int paymentId, Date paymentDate, String cardNumber, String cvv) {
        super(paymentId, paymentDate);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        System.out.println("CardPayment.param const called");
    }

    @Override
    public void printReceipt() {
        System.out.println("Receipt printed => PaymentId: " + this.paymentId + " Date: " + this.paymentDate.toString() + " Card#: " + this.cardNumber + " Cvv#: " + this.cvv);
    }
}
