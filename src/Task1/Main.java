package Task1;

public class Main {
    public static void main(String[] args) {
        double resultSum = Calculator.sum(10, 15.5);
        double resultSubtract = Calculator.subtract(100.8, 2.6);
        double resultMultiply = Calculator.multiply(5, 5.5);
        double resultDivide = Calculator.divide(36, 4);

        System.out.println("Результат сложения: " + resultSum);
        System.out.println("Результат вычитания: " + resultSubtract);
        System.out.println("Результат умножения: " + resultMultiply);
        System.out.println("Результат деления: " + resultDivide);
    }
}
