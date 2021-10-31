package settlement;

import settlement.filter.GoodsSettleAction;

public interface SettleActionStep<C, T> {
    /**
     * 准备数据
     */
    void prepare(GoodsOrderContext<C> context);
//
//    /**
//     * 校验
//     */
//    void check(GoodsOrderContext<C> context);

    /**
     * 获取当前状态处理器处理完毕后，所处于的下一个状态
     */
    GoodsSettleAction<T> getNextAction(GoodsOrderContext<C> context);

    /**
     * 状态动作方法，主要状态迁移逻辑
     */
    T process(GoodsOrderContext<C> context);

    /**
     * 状态数据持久化
     */
    void save(GoodsOrderContext<T> context);

    /**
     * 状态迁移成功，持久化后执行的后续处理
     */
    void after(GoodsOrderContext<T> context);
}
