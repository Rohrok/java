package calculator;
public class CalculatorYoung {
    int calculator(int x, String operator, int y) {
        if (operator.equals("+")) {
            int result = plus(x, y);
            return result;
        } else if (operator.equals("-")) {
            int result = minus(x, y);
            return result;
        } else if (operator.equals("*")) {
            int result = multiply(x, y);
            return result;
        } else if (operator.equals("/")) {
            int result = divide(x, y);
            return result;
        } else {
            return 1;
        }
    }

    int plus(int x, int y) {
        return x + y;
    }
    int minus(int x, int y) {
        return x - y;
    }
    int  multiply(int x, int y) {
        return x * y;
    }
    int divide(int x, int y) {
        return x / y;
    }
}