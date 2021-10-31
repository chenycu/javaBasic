package settlement.discount;

public class ModifyPriceDiscount implements DiscountCount{

    @Override
    public String calculate() {
        return "改价优惠";
    }

    @Override
    public Integer order() {
        return 1;
    }
}
