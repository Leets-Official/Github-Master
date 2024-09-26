public class Calculator {
    public static void main(String[] args) {
        int foo = 5;
        int bar = 3;
        int result = add(foo, bar);

        System.out.println("합계: " + result);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int minus(int a, int b){
   	return a - b;
    }

    private static int multiply(int a, int b) {
    	return a * b;
    }

}
