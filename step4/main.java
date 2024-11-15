package questcal.step4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("연산을 입력해주세요");
        String s = sc.nextLine();

        String[] numbers = s.split(" ");
        int fn = Integer.parseInt(numbers[0]);
        int sn = Integer.parseInt(numbers[1]);

        double answer = 0;

        Calculator add = new Calculator(new AddOperation());
        answer = add.calculate(fn,sn);
        System.out.println("더하기 값 : " + answer);

        Calculator sub = new Calculator(new SubstractOperation());
        answer = sub.calculate(fn,sn);
        System.out.println("빼기 값 : " + answer);

        Calculator mul = new Calculator(new MultiplyOperation());
        answer = mul.calculate(fn,sn);
        System.out.println("곱하기 값 : " + answer);

        Calculator div = new Calculator(new DivideOperation());
        answer = div.calculate(fn,sn);
        System.out.println("나누기 값 : " + answer);

    }
}
