public class Calculator {
    public static void main(String[] args) {
        int foo = 4;
        int bar = 5;
        int result = add(foo, bar);

        System.out.println("합계: " + result);
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
