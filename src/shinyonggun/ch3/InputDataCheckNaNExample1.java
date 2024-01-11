package shinyonggun.ch3;

public class InputDataCheckNaNExample1 {
    public static void main(String[] args) {
        String userInput = "NaN"; //사용자로부터 입력받은 값
        double val = Double.valueOf( userInput );

        double currentBalance = 10000.0;

        currentBalance += val;
        System.out.println(currentBalance);
    }
}
