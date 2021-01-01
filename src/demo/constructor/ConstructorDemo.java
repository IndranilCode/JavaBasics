package demo.constructor;

/**
 * 1a> Class without default constructor - only parameterised constructor
 * Expected - can't create object by default constructor
 */
public class ConstructorDemo {
    int valA;
    String valB;

    //Default Constructor is not created - cant create object by default constructor

    public ConstructorDemo(int valA, String valB) {
        this.valA = valA;
        this.valB = valB;
    }
}
