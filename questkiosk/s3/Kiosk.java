package questcal.questkiosk.s3;

import questcal.questkiosk.s2.MenuItem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    List<MenuItem> menus = new ArrayList<>();

    public Kiosk(List<MenuItem> menus) {
        this.menus = menus;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {

                for (int i = 0; i < menus.size(); i++) {
                    System.out.println((i + 1) + ". " + menus.get(i));
                }

                int inputMenuNumber = scanner.nextInt();
                if (inputMenuNumber == 0) break;
                else if (inputMenuNumber < 0 || inputMenuNumber > 4) {
                    System.out.println("잘못된 입력입니다. 범위 내의 메뉴를 입력해주세요.");
                } else {
                    System.out.println("선택된 메뉴 : " + menus.get(inputMenuNumber));
                }

            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                scanner.nextLine();
            }
        }
    }
}
