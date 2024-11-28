package questcal.questkiosk.s6;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    //메뉴이름, 수량, 가격
    private final HashMap<MenuItem, Integer> mapList;

    public Basket() {
        this.mapList = new HashMap<>();
    }

    public void addBasket(MenuItem selectItem) {
        if (mapList.containsKey(selectItem)) {
            int tempValue = mapList.get(selectItem) + 1;
            mapList.replace(selectItem, tempValue);
        } else {
            mapList.put(selectItem, 1);
        }
    }

    //총 금액 계산
    public double calAmount() {
        double sumanswer = 0;
        for (Map.Entry<MenuItem, Integer> entry : mapList.entrySet()) {
            MenuItem item = entry.getKey();
            int quantity = entry.getValue();

            sumanswer += (item.getMenuPrice() * 1000) * quantity;
        }

        return sumanswer;
    }

    @Override
    public String toString() {
        if (mapList == null || mapList.isEmpty()) {
            return "장바구니가 비어있습니다.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("장바구니 목록 : \n");
        for (Map.Entry<MenuItem, Integer> entry : mapList.entrySet()) {
            MenuItem item = entry.getKey();
            int quantity = entry.getValue();
            sb.append("이름 : ");
            sb.append(item.getMenuName());
            sb.append(", 가격 : ");
            sb.append(item.getMenuPrice() * 1000);
            sb.append("원 , 수량 : ");
            sb.append(quantity);
            sb.append("\n");
        }
        sb.append("총 금액 : ");
        sb.append(calAmount());
        return sb.toString();
    }

    public void allRemoveBasket() {
        mapList.clear();
    }

}
