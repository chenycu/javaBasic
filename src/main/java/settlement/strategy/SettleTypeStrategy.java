package settlement.strategy;

import settlement.GoodsOrderContext;
import settlement.SettleResult;

public interface SettleTypeStrategy<C> {

    SettleResult settle(GoodsOrderContext<C> context);

    SettleResult pay(GoodsOrderContext<C> context);
}
