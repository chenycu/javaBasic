package List_and_Array;

import java.util.*;

public class ArrayTest {
    public static void main(String[] args) {
        String[] strArr1 = new String[10];
        System.out.println(strArr1.length);

        List<GoodData> goodList = new ArrayList<>();
//        goodList.add(new GoodData("1", 1));
        goodList.add(new GoodData("2", 1));
        goodList.add(new GoodData("2", 1));
//        goodList.add(new GoodData("3", 1));
//        goodList.add(new GoodData("3", 1));
        goodList.add(new GoodData("2", 1));


        List<GoodData> newGoodList = new ArrayList<>();
       l: for (GoodData item : goodList) {
            for (GoodData reqAmountArg : newGoodList) {
                if (item.itemBar.equals(reqAmountArg.itemBar)) {
                    reqAmountArg.num = item.num + reqAmountArg.num;
                    continue l;
                }
            }
            newGoodList.add(item);
        }
        System.out.println(newGoodList);
    }
}
