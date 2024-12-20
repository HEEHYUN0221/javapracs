package questcal.questkiosk.s5;

public class MenuItem {
    private String menuName;
    private double menuPrice;
    private String menuDescription;

    public MenuItem(String menuName, double menuPrice, String menuDescription) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.menuDescription = menuDescription;
    }

    @Override
    public String toString() {
        return menuName+" | W " + menuPrice +
                " | " + menuDescription;
    }

    public String getMenuName() {
        return menuName;
    }

    public double getMenuPrice() {
        return menuPrice;
    }


}
