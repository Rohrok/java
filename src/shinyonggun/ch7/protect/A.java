package shinyonggun.ch7.protect;

import shinyonggun.ch7.protected2.D;

public class A {


    protected String field;

    protected A() {
    }

    protected void method() {
        A d = new D();
    }
}
