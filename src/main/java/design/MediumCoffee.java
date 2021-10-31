package design;

public class MediumCoffee implements ICoffee {
    @Override
    public void orderCoffee(int count) {
        System.out.println("中杯，一共"+ count + "杯Coffee!");
    }
}
