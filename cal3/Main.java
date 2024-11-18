package questcal.cal3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator cal = new ArithmeticCalculator();
        double result = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("첫번째 숫자 입력 : ");
                double a = sc.nextDouble();
                System.out.print("두번째 숫자 입력 : ");
                double b = sc.nextDouble();


            System.out.print("연산자 입력 : ");
            System.out.println("ADD/SUB/MUL/DIV");
            String opr = sc.next();

            result= cal.calculate(opr,a,b);

            System.out.println("결과 값은 : " + result + "입니다.");
            cal.setSaveData(opr,a,b);

            ArrayList<Double> bre = cal.biggerSaveData(result);
            System.out.println("a보다 큰 값들:");
            if(bre.isEmpty()){
                System.out.println("더 큰값이 없어요");
            } else {
                for (Double value : bre) {
                    System.out.println(value);
                }
            }



            System.out.println("1. 결과 확인 \n2. 결과 제거 \n3. 나가기\n 처음으로 돌아가시려면 아무 숫자나 입력해주세요.");
            String savey = sc.next();
            if(savey.equals("1")){
                cal.getSaveData();
            }
            else if(savey.equals("2")){
                cal.dataDelete();
            }
            else if(savey.equals("3")){
                break;
            }

            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("오류 발생" + e.getMessage());
            }
        }
    }
}
