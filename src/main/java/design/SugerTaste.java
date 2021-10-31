package design;

public class SugerTaste extends TasteDecorate {

    public SugerTaste(ICoffee iCoffee) {
        super(iCoffee);
    }

    @Override
    public void orderCoffee(int count) {
        super.orderCoffee(count);
        addSuger();
    }

    public void addSuger() {
        System.out.println("加糖");
    }
}
