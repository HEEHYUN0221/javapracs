package questcal.questkiosk.s6;

public enum Discount {
    NATIONAL_MERIT(10,1),
    SOLDIER(5,2),
    STUDENT(3,3),
    ORDINARY_PERSON(0,4);

    private final int dsp;
    private final int index;

    Discount(int discountPercent, int index) {
        this.dsp = discountPercent;
        this.index = index;
    }

    //총금액 입력받고 계산까지 해주자
    public double getDiscount(double totalPrice) {
        return totalPrice*((100-dsp)*0.01);
    }

    public int getIndex() {
        return index;
    }
}


