package design.sub_pub;

public class TestSub_pub {
    public static void main(String[] args) {
        ZhanSanSub zhanSanSub = new ZhanSanSub();
        Broker.getInstance().addSub("java", zhanSanSub);
        MyPublisher myPublisher = new MyPublisher();
        myPublisher.publish("java1", "妈妈哄！");
    }
}
