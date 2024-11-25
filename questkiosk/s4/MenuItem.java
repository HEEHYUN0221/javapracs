package questcal.questkiosk.s4;

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


}
