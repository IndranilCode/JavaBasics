package demo.inheritence.method.overriding;

public class ClassD extends ClassC {
    int fieldD;

    public ClassD(int fieldC, int fieldD) {
        super(fieldC);
        this.fieldD = fieldD;
    }

    public void methodDemo() {
        System.out.println("ClassD.methodDemo. FieldC :" + this.fieldC + " FieldD :" + fieldD);
    }

    public void methodDemo2() {
        super.methodDemo2(); //Calls the base class method
        System.out.println("ClassD.methodDemo. FieldC :" + this.fieldC + " FieldD :" + fieldD);
    }
}
