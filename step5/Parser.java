package questcal.step5;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws BadInputException {
        if(!firstInput.matches(NUMBER_REG)){
            throw new BadInputException("숫자");
        }
        else {
            calculator.setFirstNumber(Integer.parseInt(firstInput));
        }
        return this;
    }

    public Parser parseSecondNum(String secondInput) throws BadInputException {
        if(secondInput.matches(NUMBER_REG)){
            throw new BadInputException("숫자");
        }
        else {
            calculator.setSecondNumber(Integer.parseInt(secondInput));
        }
        return this;
    }

    public Parser parseOperator(String operationInput) throws BadInputException {
        if(operationInput.matches(OPERATION_REG)){
            throw new BadInputException("연산자");
        }
        else {
            switch (operationInput) {
                case "+" -> this.calculator.setOperation(new AddOperation());
                case "-" -> this.calculator.setOperation(new SubstractOperation());
                case "*" -> this.calculator.setOperation(new MultiplyOperation());
                case "/" -> this.calculator.setOperation(new DivideOperation());
            }
        }
        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}
