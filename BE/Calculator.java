public class Calculator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int result = add(num1, num2);
        int result2 = subtract(num1, num2);
        System.out.println("합계: " + result);
        System.out.println("뺄셈: " + minus);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }
}