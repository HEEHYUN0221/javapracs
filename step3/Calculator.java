package questcal.step3;

public class Calculator {
    private String operator;
    private int firstNumber;
    private int secondNumber;

    public double calculate(String opr,int a, int b){
        System.out.println(opr);
        System.out.println(a);
        System.out.println(b);

        double answer = 0;
        this.operator = opr;
        this.firstNumber = a;
        this.secondNumber = b;
        
        if(operator.equals("+")){
            AddOperation addOperation=new AddOperation();
            answer = addOperation.operate(firstNumber,secondNumber);
        }
        else if(operator.equals("-")){
            SubstractOperation substractOperation=new SubstractOperation();
            answer = substractOperation.operate(firstNumber,secondNumber);
        }
        else if(operator.equals("*")){
            MultiplyOperation multiplyOperation=new MultiplyOperation();
            answer = multiplyOperation.operate(firstNumber,secondNumber);
        }
        else if(operator.equals("/")){
            DivideOperation divideOperation=new DivideOperation();
            answer = divideOperation.operate(firstNumber,secondNumber);
        }
        else {
            System.out.println("Invalid operator");
        }
        
        return answer;
    }
    
}
