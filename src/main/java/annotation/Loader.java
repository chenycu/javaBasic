package annotation;

public class Loader {
    @ActionListener(listener = MyNoticeEndListener1.class)
    Action action;

    public Loader() {
        try {
            ActionListenerInstaller.install(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        action.doAction();
    }

    public class MyNoticeEndListener1 implements NoticeTimeEndListener {

        public MyNoticeEndListener1 () {

        }

        @Override
        public void onNext() {
            System.out.println("zhixingle ...........");
        }
    }
}
