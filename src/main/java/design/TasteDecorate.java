package design;

public abstract class TasteDecorate implements ICoffee {
    private ICoffee mICoffee;

    public TasteDecorate(ICoffee iCoffee) {
        this.mICoffee = iCoffee;
    }

    @Override
    public void orderCoffee(int count) {
        mICoffee.orderCoffee(count);
    }
}
