package design.sub_pub;

public class ZhanSanSub implements Subscriber<String> {
    @Override
    public void onEvent(String event) {
        System.out.println("ZhanSanSub 接收到了事件: " + event);
    }
}
