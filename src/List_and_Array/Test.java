package List_and_Array;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        Integer reduce = list.stream().reduce(
                Integer::sum).orElse(0);
        System.out.println(reduce);
    }
}
