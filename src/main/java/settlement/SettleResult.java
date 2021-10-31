package settlement;

import java.util.List;

public class SettleResult {
    /**
     * 商品订单
     */
    private String goodsOrder;
    /**
     * 商品订单明细ist
     */
    private List<String> goodsOrderItemList;
    /**
     * 商品订单优惠List
     */
    private List<String> goodsOrderDiscountList;
    /**
     * 商品订单优惠明细List
     */
    private List<String> goodsOrderItemDiscountList;
}
