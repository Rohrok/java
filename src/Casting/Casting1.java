package Casting;

public class Casting1 {

    public static void main(String[] args) {
        int inValue = 10;
        long longValue;
        double doubleValue;

        longValue = inValue;
        System.out.println("longValue = " + longValue);

        doubleValue = inValue;
        System.out.println("doubleValue1 = " + doubleValue);

       doubleValue = 20L;
        System.out.println("doubleValue2 = " + doubleValue);


    }
}
