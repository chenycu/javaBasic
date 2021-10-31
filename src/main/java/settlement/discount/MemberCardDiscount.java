package settlement.discount;

public class MemberCardDiscount implements DiscountCount{
    @Override
    public String calculate() {
        return "会员卡优惠";
    }

    @Override
    public Integer order() {
        return 10;
    }
}
