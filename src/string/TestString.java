package string;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TestString {
    public static void main(String[] args) {
        String str = "LJ123";
        System.out.println(str.substring(0, 2));

        String name = "cheny,xiaodan;bbda;";
        StringTokenizer st = new StringTokenizer(name, ",;");
        List<String> tokens = new ArrayList<>();
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            token = token.trim();
            tokens.add(token);
        }
        System.out.println(tokens);
    }
}
