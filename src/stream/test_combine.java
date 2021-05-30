package stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test_combine {

    public static void main(String[] args) {
        List<CouponUser> list = new ArrayList<>();
        list.add(new CouponUser().setStoreId(1001).setCouponId(2001).setCountType(1).setUid(3001));
        list.add(new CouponUser().setStoreId(1001).setCouponId(2001).setCountType(1).setUid(3002));
        list.add(new CouponUser().setStoreId(1001).setCouponId(2002).setCountType(2).setUid(3003));
        list.add(new CouponUser().setStoreId(1001).setCouponId(2002).setCountType(2).setUid(3003));

        list.add(new CouponUser().setStoreId(1002).setCouponId(2001).setCountType(1).setUid(3003));
        list.add(new CouponUser().setStoreId(1002).setCouponId(2001).setCountType(1).setUid(3004));
        list.add(new CouponUser().setStoreId(1002).setCouponId(2002).setCountType(2).setUid(3005));
        list.add(new CouponUser().setStoreId(1002).setCouponId(2003).setCountType(3).setUid(3006));

//        Map<String, Count> map = list.stream().collect(Collectors.toMap(item -> item.getStoreId() + "-" + item.getCouponId(), test_combine::buildCount, test_combine::combineData));
//        map.values().stream().forEach(System.out::println);

        Map<String, Count> map1 = new HashMap<>();
        for (CouponUser item : list) {
            String key = item.getStoreId() + "-" + item.getCouponId();
            Count value = buildCount(item);
            Count put = map1.put(key, value);
            if (put != null) {
                map1.put(key, combineData(map1.get(key), value));
            }
        }
        map1.values().stream().forEach(System.out::println);


    }

    public static Count buildCount(CouponUser cu) {
        return new Count().setStoreId(cu.getStoreId()).setCouponId(cu.getCouponId()).setCouponType(cu.getCountType()).setNum(1);
    }

    public static Count combineData(Count c1, Count c2) {
        return c1.setNum(c1.getNum() + c2.getNum());
    }
}
