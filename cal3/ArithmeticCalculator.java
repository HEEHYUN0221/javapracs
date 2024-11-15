package questcal.cal3;

import java.util.LinkedList;
import java.util.Queue;


public class ArithmeticCalculator {
    private Queue<String> saveData = new LinkedList<>();
    private double result;
    private String operation;

    public double calculate(String opr,int a, int b){
        System.out.println("연산 : "+ a + opr + b);

//        for(OperatorType opra : OperatorType.values()){
//            if(opra.getOpr().equals(opr)){
//                operation= String.valueOf(OperatorType.valueOf(String.valueOf(opra)));
//            }
//        }
        System.out.println(operation);

        double answer = 0;

//        if (operation.equals("+")||) {
//            AddOperation addOperation = new AddOperation();
//            answer = addOperation.operate(a, b);
//            this.result = answer;
//        } else if (operation.equals("-")) {
//            SubstractOperation substractOperation = new SubstractOperation();
//            answer = substractOperation.operate(a, b);
//            this.result = answer;
//        } else if (operation.equals("*")) {
//            MultiplyOperation multiplyOperation = new MultiplyOperation();
//            answer = multiplyOperation.operate(a, b);
//            this.result = answer;
//        } else if (operation.equals("/")) {
//            DivideOperation divideOperation = new DivideOperation();
//            answer = divideOperation.operate(a, b);
//            this.result = answer;
//        }
        
        return answer;
    }

    public void dataDelete(){
        if(saveData.peek()==null){
            System.out.println("데이터가 없습니다.");
        }
        else {
            System.out.println("데이터가 제거 되었습니다. 제거된 식 : " + saveData.poll());
        }
    }

    public void getSaveData() {
        if(saveData.isEmpty())
        {
            System.out.println("데이터없음!!");
        }
        for(String qud : saveData)
        {
            System.out.println(qud);
        }
        System.out.println();
    }

    public void setSaveData(String opr,int a, int b) {
        saveData.offer(+ a + opr + b + "=" + result);
        System.out.println("결과가 저장되었습니다.");
    }
}
