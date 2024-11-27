package questcal.questkiosk.s5;


import java.util.ArrayList;
import java.util.List;

public class KioskMain {
    public static void main(String[] args) {
        List<MenuItem> menus = new ArrayList<>();

        menus.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menus.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menus.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menus.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu hamburger= new Menu("Hamburger", menus);

        List<MenuItem> menusDrinks = new ArrayList<>();

        menusDrinks.add(new MenuItem("Ice Americano",3.0, "시원한 아이스 아메리카노"));
        menusDrinks.add(new MenuItem("Ice Caffelatte",4.5, "시원한 아이스 카페라떼"));
        menusDrinks.add(new MenuItem("Ice tea",2.5, "커피 못먹는 사람들을 위한 아이스티"));
        menusDrinks.add(new MenuItem("cola",3.0, "버거와 함께하는 시원한 콜라"));

        Menu Drinks =new Menu("Drinks",menusDrinks);

        List<MenuItem> menusDessert = new ArrayList<>();

        menusDessert.add(new MenuItem("Cheese Cake",3.5, "달콤한 치즈 케이크"));
        menusDessert.add(new MenuItem("French Fries",2.0, "바삭한 감자튀김"));
        menusDessert.add(new MenuItem("Ketchup",0.5, "케챱은 별도입니다."));

        Menu Desserts =new Menu("Dessert",menusDessert);

        Kiosk kioskapp = new Kiosk(hamburger);
        kioskapp.addMenu(Drinks);
        kioskapp.addMenu(Desserts);
        kioskapp.start();
    }
}
