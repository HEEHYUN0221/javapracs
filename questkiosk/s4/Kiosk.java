package questcal.questkiosk.s4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final List<Menu> menus = new ArrayList<>();

    public Kiosk(Menu menus) {
        this.menus.add(menus);
    }//메뉴를 계속 장르별로 추가하고싶은데 유ㅜ카지

    public void addMenu(Menu menus) {
        this.menus.add(menus);
    }


    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {

                //상위 카테고리 메뉴 출력
                System.out.println("[ MAIN MENU ] ");
                for (int i = 0; i < menus.size(); i++) {
                    System.out.println(i + 1 + ". " + menus.get(i).getCategory());
                }

                int mainMenuInputNumber = scanner.nextInt();
                //상위 카테고리 메뉴 선택 후 출력
                Menu selectMenuCategory = menuItemPrint(mainMenuInputNumber - 1);

                //하위 카테고리 메뉴 선택 후 출력
                int inputMenuNumber = scanner.nextInt();
                if (inputMenuNumber == 0) return;
                else if (inputMenuNumber < 0 || inputMenuNumber > selectMenuCategory.getMenus().size()) {
                    System.out.println("잘못된 입력입니다. 범위 내의 메뉴를 입력해주세요.");
                } else {
                    System.out.println("선택한 메뉴 : " + selectMenuCategory.getMenus().get(inputMenuNumber-1).toString());
                }


            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                scanner.nextLine();
            }
        }
    }

    private Menu menuItemPrint(int i) throws InputMismatchException {
        System.out.println(i + 1 + ". " + menus.get(i).getCategory());
        System.out.println("[ " + menus.get(i).getCategory() + " MENU ]");
        menus.get(i).printMenus();
        return menus.get(i);
    }


}
