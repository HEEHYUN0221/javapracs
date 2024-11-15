package questcal.cal2;


import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private Queue<String> saveData = new LinkedList<>();
    private int result;
    
    public int calculate(String opr,int a, int b){
        System.out.println("연산 : "+ a + opr + b);

        int answer = 0;

        switch (opr) {
            case "+" -> {
                AddOperation addOperation = new AddOperation();
                answer = addOperation.operate(a, b);
                this.result=answer;
            }
            case "-" -> {
                SubstractOperation substractOperation = new SubstractOperation();
                answer = substractOperation.operate(a, b);
                this.result=answer;
            }
            case "*" -> {
                MultiplyOperation multiplyOperation = new MultiplyOperation();
                answer = multiplyOperation.operate(a, b);
                this.result=answer;
            }
            case "/" -> {
                DivideOperation divideOperation = new DivideOperation();
                answer = divideOperation.operate(a, b);
                this.result=answer;
            }
            default -> System.out.println("Invalid operator");
        }
        
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
        saveData.offer("" + a + opr + b + "=" + result);
        System.out.println("결과가 저장되었습니다.");
    }
}
