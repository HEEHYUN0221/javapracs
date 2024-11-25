package questcal.questkiosk.s2;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class KioskMain {
    public static void main(String[] args) {
        /* Scanner를 사용하여 여러 햄버러 메뉴를 출력
         * 글자가 입력되었을 때 예외처리 하기
         * 1-4,0이 아닌 숫자가 입력되었을 때 처음으로 돌아가기
         *  */

        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                List<MenuItem> menus= new ArrayList<>();

                menus.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
                menus.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
               menus.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
                menus.add( new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

                for(int i =0;i< menus.size();i++){
                    System.out.println((i+1)+". " + menus.get(i));
                }

                int inputMenuNumber = scanner.nextInt();
                if (inputMenuNumber==0) break;
                if (inputMenuNumber<0||inputMenuNumber>4){
                    System.out.println("잘못된 입력입니다. 범위 내의 메뉴를 입력해주세요.");
                }

            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                scanner.nextLine();
            }
        }
    }
}
