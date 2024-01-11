package shinyonggun.ch7.animal;

public abstract class Animal {  //추상클래스
    public String kind;
    public abstract void sound();

    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    public void sex() {
        System.out.println("아기84");
    }


 }
