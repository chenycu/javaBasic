package annotation;

public class MyNoticeEndListener implements NoticeTimeEndListener {

    public MyNoticeEndListener () {

    }

    @Override
    public void onNext() {
        System.out.println("zhixingle ...........");
    }
}
