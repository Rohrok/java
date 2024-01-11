package shinyonggun.ch3;

public class OverflowExample {
    public static void main(String[] args) {
        int x = 1000000;    //long x = 1000000;
        int y = 1000000;    //long y = 1000000;
        int z = x * y;      //long z = x * y; ->오버플로우 해결
        System.out.println(z);
    }
}
