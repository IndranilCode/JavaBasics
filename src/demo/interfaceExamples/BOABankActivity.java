package demo.interfaceExamples;

public class BOABankActivity implements BankActivity {
    @Override
    public void method1() {
        System.out.println("Class BOABankActivity -> Method 1 called");
    }

    @Override
    public void method2() {
        System.out.println("Class BOABankActivity -> Method 2 called");
    }

    @Override
    public void method6() {
        System.out.println("Class BOABankActivity -> Method 6 (abstract overridden) called");
    }

//    @Override
//    public void method3() {
//
//    }
}
