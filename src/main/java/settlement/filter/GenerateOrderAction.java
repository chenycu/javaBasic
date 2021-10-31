package settlement.filter;

import settlement.GenerateResult;
import settlement.GoodsOrderContext;

import java.util.Collections;

public class GenerateOrderAction extends AbstractGoodsSettleAction<Object, GenerateResult> {


    @Override
    public void prepare(GoodsOrderContext<Object> context) {

    }

    @Override
    public GenerateResult process(GoodsOrderContext<Object> context) {
        GenerateResult result = new GenerateResult();
        result.setGoodsOrder("商品订单");
        result.setGoodsOrderItemList(Collections.singletonList("商品订单明细"));
        return result;
    }

    @Override
    public void save(GoodsOrderContext<GenerateResult> context) {
        // 保存商品订单
        // 保存商品明细
    }

    @Override
    public void after(GoodsOrderContext<GenerateResult> context) {

    }
}
