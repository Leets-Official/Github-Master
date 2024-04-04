class Calculator {
  static add(a, b) {
    return a + b;
  }

  static subtraction(a, b) {
    return a - b;
  }

  static multiplication(a, b) {
    return a * b;
  }
  static sum(){
    console.log(1+3);
  }
}

const operateMaker = (operate) => (a, b) => operate(a, b);

const adder = operateMaker(Calculator.add);
const subtractor = operateMaker(Calculator.substraction);
const multiply = operateMaker(Calculator.multiplicatoin);
// const divider = operateMaker(Calculator.divide);

console.log(Calculator.sum());