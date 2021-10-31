package design;

import java.math.BigDecimal;

public class MyTest {
    public static void main(String[] args) {
//        SugerTaste sugerTaste = new SugerTaste(new LargeCoffer());

        BigDecimal sub = sub(1, 0.1);
        System.out.println(sub.doubleValue());

        String warehouse = "000001|stock_name";
        String[] split = warehouse.split("|");
        System.out.println(split.length);
    }
    public static BigDecimal sub(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2);
    }
}
