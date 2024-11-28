package questcal.questkiosk.s1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KioskMain {
    public static void main(String[] args) {
        /* Scanner를 사용하여 여러 햄버러 메뉴를 출력
         * 글자가 입력되었을 때 예외처리 하기
         * 1-4,0이 아닌 숫자가 입력되었을 때 처음으로 돌아가기
         *  */

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                MenuItem menuShackBurger = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                MenuItem menuSmokeShack = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                MenuItem menuCheeseburger = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                MenuItem menuHamburger = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

                System.out.println("[ SHAKESHACK MENU ]");
                System.out.println("1. " + menuShackBurger);
                System.out.println("2. " + menuSmokeShack);
                System.out.println("3. " + menuCheeseburger);
                System.out.println("4. " + menuHamburger);
                System.out.println("0. 종료      | 종료");

                int inputMenuNumber = scanner.nextInt();

                if (inputMenuNumber == 0) {
                    System.out.println("종료");
                    break;
                }

                switch (inputMenuNumber) {
                    case 1:
                        System.out.println("1. " + menuShackBurger);
                        break;
                    case 2:
                        System.out.println("2. " + menuSmokeShack);
                        break;
                    case 3:
                        System.out.println("3. " + menuCheeseburger);
                        break;
                    case 4:
                        System.out.println("4. " + menuHamburger);
                        break;
                }


            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                scanner.nextLine();
            }
        }
    }
}
