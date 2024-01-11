package shinyonggun.ch7.animal;

public class AnimalExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Dog2 dog2 = new Dog2();

        dog.sex();
        cat.sex();

        dog.sound();
        cat.sound();
        dog2.sound();
        System.out.println("-----");
        dog.breathe();
        cat.breathe();

        //변수의 자동 타입 변환
        Animal animal = null;
        animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();
        System.out.println("-----");

        //메소드의 다형성
        animalSound(new Dog());
        animalSound(new Cat());
    }

    public static void animalSound( Animal animal ) {
        animal.sound();
    }
}
