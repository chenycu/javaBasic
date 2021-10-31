package settlement.filter;

import settlement.GoodsOrderContext;
import settlement.SettleActionStep;
import settlement.strategy.SettleTypeStrategy;

public abstract class AbstractGoodsSettleAction<C, T> implements GoodsSettleAction<C>, SettleActionStep<C, T> {

    private GoodsSettleAction<T> nextAction;

    public void setNextAction(GoodsSettleAction<T> nextAction) {
        this.nextAction = nextAction;
    }

    @Override
    public GoodsSettleAction<T> getNextAction(GoodsOrderContext<C> context) {
        return nextAction;
    }

    @Override
    public void action(GoodsOrderContext<C> context) {
        T result = this.process(context);
        GoodsOrderContext<T> c = new GoodsOrderContext<>();
        c.setResult(result);
        GoodsSettleAction<T> nextAction = getNextAction(context);
        save(c);
        if (nextAction != null) {
            nextAction.action(c);
        }
        after(c);
    }


}
