package calculator;

public class CalculatorYoungExample {
    public static void main(String[] args) {
        CalculatorYoung calculator = new CalculatorYoung();
//        calculator.calculator(1, "+", 2);
        int result = calculator.calculator(3, "+", 5);

        System.out.println(result);

        int result1 = calculator.calculator(5,"-",3);
        System.out.println(result1);

        int result2 = calculator.calculator(8,"*",4);
        System.out.println(result2);

        double x = 10;
        double y = 4;
        System.out.println(x / y);
    }
}
