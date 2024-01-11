package shinyonggun.ch7.animal;

public class Dog extends Animal {
    public Dog() {
        this.kind = "포유류";
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    @Override
    public void sex() {
        System.out.println("아기84");
    }

    public void run() {
        System.out.println("시속 160km");
    }
}
