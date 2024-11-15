package questcal.cal3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArithmeticCalculator cal = new ArithmeticCalculator();
        double result = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("첫번째 숫자 입력 : ");
            int a = sc.nextInt();
            System.out.print("두번째 숫자 입력 : ");
            int b = sc.nextInt();
            if (a < 0 || b < 0) {
                System.out.println("양의 정수를 입력해주세요.");
                continue;
            }

            System.out.print("연산자 입력 : ");
            System.out.println("ADD/SUB/MUL/DIV");
            String opr = sc.next();


            result= cal.calculate(opr,a,b);

            System.out.println("결과 값은 : " + result + "입니다.");
            System.out.println("1. 결과저장 \n2. 결과 확인 \n3. 결과 제거 \n4. 나가기");
            String savey = sc.next();
            if(savey.equalsIgnoreCase("1")){
                cal.setSaveData(opr,a,b);
            }
            else if(savey.equalsIgnoreCase("2")){
                cal.getSaveData();
            }
            else if(savey.equalsIgnoreCase("3")){
                cal.dataDelete();
            }
            else if(savey.equalsIgnoreCase("4")) {
                break;
            }
        }
    }
}
