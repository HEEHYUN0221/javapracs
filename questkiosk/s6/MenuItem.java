package questcal.questkiosk.s6;

import java.util.Objects;

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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MenuItem menuItem = (MenuItem) object;
        return Objects.equals(menuName, menuItem.menuName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(menuName);
    }

    public String getMenuName() {
        return menuName;
    }

    public double getMenuPrice() {
        return menuPrice;
    }


}
