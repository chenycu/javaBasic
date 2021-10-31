package settlement.filter;

import org.checkerframework.checker.units.qual.C;
import settlement.GenerateResult;
import settlement.GoodsOrderContext;
import settlement.SettleResult;
import settlement.strategy.SettleTypeStrategy;

import java.util.Collections;

public class SettleOrderAction extends AbstractGoodsSettleAction<GenerateResult, String> {

    private SettleTypeStrategy<GenerateResult> settleTypeStrategy;

    @Override
    public void prepare(GoodsOrderContext<GenerateResult> context) {
        if (context.getResult() == null) {
            GenerateResult gr = new GenerateResult();
            gr.setGoodsOrder("商品订单");
            gr.setGoodsOrderItemList(Collections.singletonList("商品订单明细1"));
            context.setResult(gr);
        }
    }

    @Override
    public String process(GoodsOrderContext<GenerateResult> context) {
        SettleResult settle = settleTypeStrategy.settle(context);
        return null;
    }

    @Override
    public void save(GoodsOrderContext<String> context) {

    }

    @Override
    public void after(GoodsOrderContext<String> context) {

    }
}
