package questcal.step5;

public class Main {
    public static void main(String[] args) {
        boolean calculateEnded = false;
        // 구현 2.
        while(!calculateEnded){
            try {
                calculateEnded = CalculatorApp.start();
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }
}
