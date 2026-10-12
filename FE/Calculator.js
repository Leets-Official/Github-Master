class Calculator {
  static minus(a, b) {
    return a + b;
  }
}

const operateMaker = (operate) => (a, b) => operate(a, b);

const minuses = operateMaker(Calculator.minus);

console.log(Calculator.minus());
