package star;

public class Star {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print("ㅁ");
                }
            } else {
                for (int j = 0; j < i; j++) {
                    System.out.print("★");
                }
            }
            System.out.println();
        }
        for (int i = 5; i > 0; i--) {
            if (i % 2 == 1) {
                for (int j = 1; j < i; j++) {
                    System.out.print("ㅈ");
                }
            } else {
                for (int j = 1; j < i; j++) {
                    System.out.print("★");
                }
            }
            System.out.println();
        }
    }
}