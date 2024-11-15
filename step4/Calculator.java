package questcal.step4;

public class Calculator {

    private AbstractOpration operation;

    Calculator(AbstractOpration opration) {
        this.operation = opration;
    }
    
    public double calculate(int a, int b){
        double answer = 0;
        answer = operation.oprate(a, b);
        return answer;
    }
    
}
