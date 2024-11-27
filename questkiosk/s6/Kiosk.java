package questcal.questkiosk.s6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final List<Menu> menus = new ArrayList<>();

    private Basket basket = new Basket();

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
                System.out.println(0+ ".  종료");

                int mainMenuInputNumber = scanner.nextInt();
                //상위 카테고리 메뉴 선택 후 출력
                Menu selectMenuCategory = menuItemPrint(mainMenuInputNumber - 1);

                //하위 카테고리 메뉴 선택 후 출력
                int inputMenuNumber = scanner.nextInt();
                if (inputMenuNumber == 0) return;
                //0입력시 종료
                System.out.println("선택한 메뉴 : " + selectMenuCategory.getMenus().get(inputMenuNumber-1).toString());


                //선택한 메뉴를 장바구니에 담을지 물어봐야함, 수량은 1번에 1개만 담을 수 있음
                System.out.println("선택한 메뉴를 장바구니에 담으시겠습니까?");
                String yorn = scanner.next();
                if(yorn.equalsIgnoreCase("y")||yorn.equalsIgnoreCase("yes")){
                    basket.addBasket(selectMenuCategory.getMenus().get(inputMenuNumber-1));
                }
                //장바구니 목록 출력
                System.out.println(basket);

                //주문할지 물어봐야함
                System.out.println("주문을 완료하시겠습니까?");
                String yornOrderComplete = scanner.next();
                if(yornOrderComplete.equalsIgnoreCase("y")||yornOrderComplete.equalsIgnoreCase("yes")) {
                    //할인할지 물어보는 부분 Discount Enum 사용
                    System.out.println("할인 정보를 입력해주세요.");
                    System.out.println("1. 국가 유공자 : 10%");
                    System.out.println("2. 군인 : 5%");
                    System.out.println("3. 학생 : 3%");
                    System.out.println("4. 일반 : 0%");
                    int memberNumber = scanner.nextInt();
                    double discountTotalAmount = 0;
                    for(Discount discount : Discount.values()) {
                        if(discount.getIndex()==memberNumber) {
                            discountTotalAmount= discount.getDiscount(basket.calAmount());
                        }
                    }


                    System.out.println("총 금액 : " + (int) discountTotalAmount);
                    basket.allRemoveBasket();
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                scanner.nextLine();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("범위에 벗어난 입력입니다. 다시 입력해주세요.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("알수없는 예외 : "+ e.getMessage());
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
