package exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class TestException {
    public static void main(String[] args) {
        String a = null;
        try{
            a.length();
        } catch (Exception e) {
            e.printStackTrace();
            Writer result = new StringWriter();
            PrintWriter printWriter = new PrintWriter(result);
            e.fillInStackTrace().printStackTrace(printWriter);
            System.out.println(result.toString());
        }

    }
}
