package shinyonggun.ch7.protect;

public class B {
    public void method() {
        A a = new A();
        a.field = "value";
        a.method();
    }
}
