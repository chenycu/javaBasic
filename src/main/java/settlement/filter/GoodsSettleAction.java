package settlement.filter;

import settlement.GoodsOrderContext;

public interface GoodsSettleAction<C> {

    void action(GoodsOrderContext<C> context);

}
