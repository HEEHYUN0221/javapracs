package questcal.cal3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;


public class ArithmeticCalculator {
    private Queue<String> saveData = new LinkedList<>();
    private ArrayList<Double> resultData = new ArrayList<>();
    private double result;

    public <T extends Number>double calculate(String opr, T a, T b) {
        System.out.println("연산 : " + a + opr + b);

        OperatorType operator = null;

        for (OperatorType oprt : OperatorType.values()) {
            if (opr.equals(oprt.getOpr()) || opr.equalsIgnoreCase(oprt.name())) {
                operator = oprt;
                break;
            }
        }

        if(operator!=null){
            result = operator.operate(a.doubleValue(),b.doubleValue());
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
            System.out.println("제거 된 결과 값 : " + resultData.remove(0));
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
        resultData.add(result);
        System.out.println("결과가 저장되었습니다.");
    }

    public ArrayList<Double> biggerSaveData(double a){
        return resultData.stream().filter(r ->r > a).collect(Collectors.toCollection(ArrayList::new));
    }//저장된 결과값에서 더 큰 값들을 찾아 출력해주는 함수
}
