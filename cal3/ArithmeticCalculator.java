package questcal.cal3;

import java.util.LinkedList;
import java.util.Queue;


public class ArithmeticCalculator {
    private final Queue<String> saveData = new LinkedList<>();
    private double result;

    public double calculate(String opr, double a, double b) {
        System.out.println("연산 : " + a + opr + b);

        OperatorType operator = null;

        for (OperatorType oprt : OperatorType.values()) {
            if (opr.equals(oprt.getOpr()) || opr.equalsIgnoreCase(oprt.name())) {
                operator = oprt;
                break;
            }
        }

        if(operator!=null){
            result = operator.operate(a,b);
            return result;
        }
        else {
            System.out.println("잘못된 연산자 입니다.");
            return 0;
        }
    }

    public void dataDelete() {
        if (saveData.peek() == null) {
            System.out.println("데이터가 없습니다.");
        } else {
            System.out.println("데이터가 제거 되었습니다. 제거된 식 : " + saveData.poll());
        }
    }

    public void getSaveData() {
        if (saveData.isEmpty()) {
            System.out.println("데이터없음!!");
        }
        for (String qud : saveData) {
            System.out.println(qud);
        }
        System.out.println();
    }

    public void setSaveData(String opr, double a, double b) {
        saveData.offer(+a + opr + b + "=" + result);
        System.out.println("결과가 저장되었습니다.");
    }
}
