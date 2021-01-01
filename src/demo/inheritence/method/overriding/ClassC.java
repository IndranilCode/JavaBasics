package demo.inheritence.method.overriding;

public class ClassC {
    int fieldC;

    public ClassC(int fieldC) {
        this.fieldC = fieldC;
    }

    public void methodDemo() {
        System.out.println("ClassC.methodDemo. FieldC :" + this.fieldC);
    }
}
