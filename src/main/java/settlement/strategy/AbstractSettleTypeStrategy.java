package settlement.strategy;

import settlement.GoodsOrderContext;
import settlement.SettleResult;
import settlement.discount.DiscountCount;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class AbstractSettleTypeStrategy<C> implements SettleTypeStrategy<C>{

    private List<DiscountCount> discountCountList = new ArrayList<>();

    @Override
    public SettleResult settle(GoodsOrderContext<C> context) {
        List<String> orderItemDiscountList = deductionDiscount(context);
        settleProcess(context, orderItemDiscountList);
        return null;
    }

    protected abstract void settleProcess(GoodsOrderContext<C> context, List<String> discountList);

    @Override
    public SettleResult pay(GoodsOrderContext<C> context) {
        return null;
    }

    public List<String> deductionDiscount(GoodsOrderContext<C> context) {
        discountCountList.sort(Comparator.comparing(DiscountCount::order));
        List<String> orderItemDiscountList = new ArrayList<>();
        for (DiscountCount count : discountCountList) {
            String result = count.calculate();
            if (result != null) {
                orderItemDiscountList.add(result);
            }
        }
        return orderItemDiscountList;
    }

}
