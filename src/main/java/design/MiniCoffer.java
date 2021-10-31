package design;

public class MiniCoffer implements ICoffee {
    @Override
    public void orderCoffee(int count) {
        System.out.println("小杯，一共"+ count + "杯Coffee!");
    }
}
