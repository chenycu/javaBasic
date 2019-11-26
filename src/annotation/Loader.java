package annotation;

public class Loader {
    @ActionListener(listener = MyNoticeEndListener1.class)
    Action action = new Action();
    public Loader() {
        try {
            ActionListenerInstaller.install(this);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
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
