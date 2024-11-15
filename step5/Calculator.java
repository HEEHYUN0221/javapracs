package questcal.step5;

public class Calculator {
    private int firstNumber;
    private int secondNumber;

    private AbstractOpration operation;

    public Calculator(AbstractOpration operation) {
        this.operation = operation;
    }

    public Calculator() {
    }

    public void setOperation(AbstractOpration operation) {
        this.operation = operation;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double calculate() {
        double answer = 0;
        answer = operation.oprate(this.firstNumber, this.secondNumber);
        return answer;
    }
}
