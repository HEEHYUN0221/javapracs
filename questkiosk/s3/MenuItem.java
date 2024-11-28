package questcal.questkiosk.s3;

public class MenuItem {
    private final String menuName;
    private final double menuPrice;
    private final String menuDescription;

    public MenuItem(String menuName, double menuPrice, String menuDescription) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.menuDescription = menuDescription;
    }

    @Override
    public String toString() {
        return menuName + " | W " + menuPrice +
                " | " + menuDescription;
    }


}
