package design;

public class LargeCoffer implements ICoffee {

    @Override
    public void orderCoffee(int count) {
        System.out.println("大杯，一共"+ count + "杯Coffee!");
    }
}
