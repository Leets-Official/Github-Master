public class Calculator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int result = add(num1, num2);
        int minus = minus(num1, num2);
        int mul = mul(num1,num2);
        System.out.println("합계: " + result);
        System.out.println("뺄셈: " + minus);
        System.out.println("곱하기 = " + mul);
    }
  
    private static int add(int a, int b) {
        return a + b;
    }
    private static int minus(int a, int b) {
        return a - b;
    }
    private static int mul(int a, int b){ return a * b; }
}