package method.ex;

public class MethodEx2Ref {

    public static void main(String[] args) {

        printMessage("hello! java!", 3);
        printMessage("my dog",5);
        printMessage("good bye~",7);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
