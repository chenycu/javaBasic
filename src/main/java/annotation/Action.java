package annotation;

import java.util.Timer;
import java.util.TimerTask;

public class Action {

    private NoticeTimeEndListener listener;

    public Action() {

    }

    public void setListener(NoticeTimeEndListener listener) {
        this.listener = listener;
    }

    public void doAction() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                listener.onNext();
            }
        }, 2000);
    }
}
