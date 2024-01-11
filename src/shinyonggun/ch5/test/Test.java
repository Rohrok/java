package shinyonggun.ch5.test;

public class Test {
    public static void main(String[] args) {
        String OPEN_STATUS = "가게 문 열림";
        String OPEN_CODE = "A100";

        System.out.println("Status.OPEN = " + Status.STORE_OPEN.getStatus());
        System.out.println("Status.OPEN code = " + Status.STORE_OPEN.getCode());
        System.out.println("Status.CLOSED = " + Status.STORE_CLOSED.getStatus());
        System.out.println("Status.CLOSED code = " + Status.STORE_CLOSED.getCode());
    }
}
