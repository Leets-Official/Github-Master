class Calculator {
    static add(a, b) {
        b = b +3;
        a = a- 4;
        a =b*2;
        b = a/4;
        return a + b;
    }
}

const operateMaker = (operate) => (a, b) => operate(a, b);

const adder = operateMaker(Calculator.add);

console.log(Calculator.add());
