package settlement;

import lombok.Data;

import java.util.List;

@Data
public class GoodsOrderContext<C> {

    private String orderInfo;

    private Integer payType;

    private List<Integer> discountTypeList;

    private C result;


}
