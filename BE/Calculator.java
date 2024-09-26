public class Calculator {
    public static void main(String[] args) {
        int foo = 10;
        int b = 10;
        int result = add(foo, b);

        System.out.println("합계: " + result);
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
