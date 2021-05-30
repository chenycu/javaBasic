package map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        Map<String, Order> map =
                orders.stream().collect(Collectors.toMap(Order::getId, Function.identity(), (v1, v2) -> v1));
        System.out.println(map.get("1"));

    }

    public static class Order {
        public String id;
        public String name;

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
