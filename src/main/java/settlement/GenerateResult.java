package settlement;

import lombok.Data;

import java.util.List;

@Data
public class GenerateResult {

    private String goodsOrder;

    private List<String> goodsOrderItemList;
}
