package questcal.questkiosk.s2;

import java.util.LinkedList;

public class Menu {
    String category;
    LinkedList<MenuItem> menus= new LinkedList<>();

    public Menu(String category, MenuItem menuItem) {
        this.category = category;
        this.menus.add(menuItem);
    }

}
