class Calculator {
  static add(a, b) {
    return a + b;
  }

  static substraction(a, b) {
    return a - b;
  }

  static multiplicatoin(a, b) {
    return a * b;
  }

  static divide(a, b) {
    if (b === 0) {
      throw Error('0으로는 나눌 수 없습니다.');
    }
    return a / b;
  }
}

const operateMaker = (operate) => (a, b) => operate(a, b);

const adder = operateMaker(Calculator.add);
const substractor = operateMaker(Calculator.substraction);
const mult = operateMaker(Calculator.multiplicatoin);
const dividor = operateMaker(Calculator.divide);
