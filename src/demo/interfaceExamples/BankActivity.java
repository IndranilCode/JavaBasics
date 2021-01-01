package demo.interfaceExamples;

public interface BankActivity {
    public void method1();

    //No access specifier - implicitly public
    void method2();

    //public void method3() { } //Not allowed - concrete methods

    //Allowed - default methods
    public default void method3() {
        System.out.println("Interface BankActivity -> Method 3 default called");
    }

    //Static method in interface
    public static void method4() {
        System.out.println("Interface BankActivity -> Method 4 static called");
    }

    //Private method in interface
    private void method5() {
        System.out.println("Interface BankActivity -> Method 5 private called");
    }

    //Allowed - abstract method
    public abstract void method6();
}
