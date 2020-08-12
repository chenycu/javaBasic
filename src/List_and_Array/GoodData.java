package List_and_Array;

public class GoodData {
    public String itemBar;
    public double num;

    public GoodData(String itemBar, double num) {
        this.itemBar = itemBar;
        this.num = num;
    }

    @Override
    public String toString() {
        return "{itemBar=" + itemBar + ", num=" + num + "}";
    }
}
