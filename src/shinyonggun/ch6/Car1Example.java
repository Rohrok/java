package shinyonggun.ch6;

public class Car1Example {
    public static void main(String[] args) {

        Car1 myCar = new Car1("검정", 3000);
        System.out.println("Car1 :" + myCar.color);
        System.out.println("Car1 :" + myCar.cc);

        Car1 myCar2 = new Car1("초록", 5500);
        System.out.println("Car2 :" + myCar2.color);
        System.out.println("Car2 :" + myCar2.cc);

      Car1 myCar3 = new Car1(); //(X) 기본 생성자를 호출할 수 없다.
        System.out.println("myCar3 = " + myCar3.cc);
        myCar3.cc = 500;
        System.out.println("myCar3 = " + myCar3.cc);
    }
}
