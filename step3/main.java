package questcal.step3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("연산을 입력해주세요");
        String s = sc.nextLine();

        String[] numbers = s.split("[+\\-*/]");
        int fn = Integer.parseInt(numbers[0]);
        int sn = Integer.parseInt(numbers[1]);
        String operator = s.replaceAll("[0-9]", "");

        double answer = 0;

        Calculator calculator = new Calculator();
        answer = calculator.calculate(operator,fn,sn);
        System.out.println("연산의 답은 : " + answer);

    }
}
