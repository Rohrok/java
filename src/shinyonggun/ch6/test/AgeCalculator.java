package shinyonggun.ch6.test;

public class AgeCalculator {

    public static void main(String[] args) {
        User userA = new User("", 5);
        System.out.println(String.format("이름: %s, 나이: %d", userA.getName(), userA.getAge()));
    }
}
