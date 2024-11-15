package questcal.cal1;

import java.util.Scanner;

public class maincal {
    public static void main(String[] args) {
        while (true) {

            int result = 0;

            Scanner sc = new Scanner(System.in);
            System.out.print("첫번째 숫자 입력 : ");
            int a = sc.nextInt();
            System.out.print("두번째 숫자 입력 : ");
            int b = sc.nextInt();
            if(a<0||b<0){
                System.out.println("양의 정수를 입력해주세요.");
                continue;
            }

            System.out.print("연산자 입력 : ");
            String opr = sc.next();

            if (opr.equals("-")) {
                result = sub(a, b);
            } else if (opr.equals("+")) {
                result = add(a, b);
            } else if (opr.equals("*")) {
                result = mul(a, b);
            } else if (opr.equals("/")) {
                if (b == 0) {
                    System.out.println("분모가 0이 될 수 없습니다.");
                    continue;
                }
                result = div(a, b);
            } else {
                System.out.println("잘못된 연산자 입니다.");
                continue;
            }

            System.out.println("결과 값은 : " + result + "입니다.");
            System.out.println("종료하시려면 exit를 입력해주세요.");
            String ex = sc.next();
            if (ex.equals("exit")) {
                break;
            }

        }

    }

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

}

