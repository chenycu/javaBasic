package staticfinal;

public final class TestFinalClass {
    public String field1 = "mmp";

    public TestFinalClass(String arg) {
        this.field1 = arg;
    }



    public static void main(String[] args) {
        TestFinalClass t = new TestFinalClass("bbg");
        t.field1 = "ggi";
        System.out.println(t.field1);
    }
}
