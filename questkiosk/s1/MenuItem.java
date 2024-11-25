package questcal.questkiosk.s1;

public class MenuItem {
    /*
     * 메뉴 이름, 가격, 설명
     * 메뉴 출력
     */
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
