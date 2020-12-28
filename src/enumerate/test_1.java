package enumerate;


import java.awt.*;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class test_1 {

    enum Day {
        MONDAY("cheny", 1), TUESDAY("xiaodan", 2);
        private String name;
        private int type;

        private static final Map<Integer, Day> stringToEnum =
                Stream.of(values()).collect(
                        toMap(Day::getType, e -> e));

        // Returns Operation for string, if any
        public static Day fromString(Integer symbol) {
            if (stringToEnum.get(symbol) == null) {
                throw new IllegalArgumentException(symbol + "in Enum Day#type not find in method fromString");
            }
            return stringToEnum.get(symbol);
        }

        Day(String name, int type) {
            this.name = name;
            this.type = type;
        }
        public void setType(int type) {
            this.type = type;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getType() {
            return type;
        }

        public String getName() {
            return name;
        }
        public static Day valueOf(int type) {
            Day[] values = Day.values();
            List<Day> collect = Arrays.stream(values).filter(value -> value.getType() == type).collect(Collectors.toList());
            if (collect.size() > 0) {
                return collect.get(0);
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Day[] values = Day.values();
        Arrays.stream(values).forEach(System.out::println);
        System.out.println(Day.MONDAY.name());
        System.out.println(Day.valueOf(Day.MONDAY.name()));

        int type = 1;
        System.out.println(Day.valueOf(type));

        System.out.println();

        EnumMap<Day, Object> dayObjectEnumMap = new EnumMap<>(Day.class);
        dayObjectEnumMap.forEach((key, value) -> {
            System.out.println(key + "-" + value);
        });

        System.out.println(Day.fromString(33).getName());

        System.out.println("我是最新修改的");
        System.out.println("commit_1");
        System.out.println("commit_2");
    }
}
