
class CalculatorConundrum {
  public String calculate(int operand1, int operand2, String operation) {
    int val = 0;
    validateOperation(operation);
    validateAll(operand2, operation);

    if (operation.equals("+")) {
      val = operand1 + operand2;
    } else if (operation.equals("*")) {
      val = operand1 * operand2;
    } else if (operation.equals("/")) {
      try {
        val = operand1 / operand2;
      } catch (ArithmeticException ae) {
        throw new IllegalOperationException("Division by zero is not allowed", ae);
      }
    }

    return operand1 + " " + operation + " " + operand2 + " = " + val;
  }

  public void validateOperation(String operation) {
    if (operation == null) {
      throw new IllegalArgumentException("Operation cannot be null");
    } else if (operation.equals("")) {
      throw new IllegalArgumentException("Operation cannot be empty");
    }
  }

  public void validateAll(int operand2, String operation) {
    if (operation != "+" && operation != "*" && operation != "/") {
      throw new IllegalOperationException("Operation '" + operation + "' does not exist");
    }
  }
}
