package settlement.filter;

import settlement.GenerateResult;
import settlement.GoodsOrderContext;
import settlement.filter.AbstractGoodsSettleAction;
import settlement.strategy.SettleTypeStrategy;

public class PayOrderAction extends AbstractGoodsSettleAction {

    private SettleTypeStrategy<GenerateResult> settleTypeStrategy;

    @Override
    public void prepare(GoodsOrderContext context) {

    }

    @Override
    public Object process(GoodsOrderContext context) {
        settleTypeStrategy.pay(context);
        return null;
    }

    @Override
    public void save(GoodsOrderContext context) {

    }

    @Override
    public void after(GoodsOrderContext context) {

    }
}
