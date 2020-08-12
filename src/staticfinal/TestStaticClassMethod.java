package staticfinal;

public class TestStaticClassMethod {

    public TestStaticClassMethod() {
        System.out.println("TestStaticClassMethod 实例化了");
    }

    class Myclass {

        public Myclass() {
            System.out.println("Myclass 实例化了");
        }
    }

    private static class Instance {
        static final String a = "1";
        static final TestStaticClassMethod b = new TestStaticClassMethod();
        static {
            System.out.println("Instance 中的静态代码块执行了");
        }
        static String getString() {
            System.out.println("zhixingle.....");
            return "aa";
        }
    }

    public static void main(String[] args) {
        TestStaticClassMethod a1 = Instance.b;

//        TestStaticClassMethod t = new TestStaticClassMethod();
    }
}
