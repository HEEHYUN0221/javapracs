package questcal.questkiosk.s6;


import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String category;
    private List<MenuItem> menus= new ArrayList<>();

    public Menu(String category, List<MenuItem> menuItem) {
        this.category = category;
        this.menus = menuItem;
    }

    public void printMenus() {

        for (int i = 0; i < menus.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i+1);
            sb.append(". ");
            sb.append(menus.get(i).toString());
            System.out.println(sb);

        }

    }

    public String getCategory() {
        return category;
    }

    public List<MenuItem> getMenus() {
        return menus;
    }

    //1. List에 들어있는 MenuItem을 순차적으로 보여주는 함수가 Kiosk에 의지하는대...우쨔지...

}
