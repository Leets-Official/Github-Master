class Calculator {
    static add(a, b) {
        return a - b; //마이너스
    }
}

const operateMaker = (operate) => (a, b) => operate(a, b);

const adder = operateMaker(Calculator.add);

console.log(Calculator.add());
