package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("숫자를 입력하세요 (0을 누르면 종료): ");
            int num = input.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
        }

        System.out.println("숫자의 합은 : " + sum);
        System.out.println("프로그램을 종료합니다.");
    }
}
