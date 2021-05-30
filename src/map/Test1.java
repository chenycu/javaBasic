package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test1 {
    public List<String> strings;

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.strings = new ArrayList<>();
        test1.strings.add("mmp");

        test1.getString().add("bb");
        System.out.println(test1.strings);
    }

    public List<String> getString() {
        List<String> list = this.strings;

        return list;
    }
}
