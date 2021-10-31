package rtti;

class Initable {
    static int staticFinal = 89;
    static {
        System.out.println("Initable static code block");
    }
    Initable(){
        System.out.println("Initable Constructor run");
    }

    BB b = new BB();

    class BB {
        BB() {
            System.out.println("bb Constructor run");
        }
    }
}
