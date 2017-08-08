package delegate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bill on 2017/8/8.
 * 事件的处理者
 */
public class EventHandler {

    private List<Event> mList;

    public EventHandler() {
        mList = new ArrayList<>();
    }

    public void addEvent(Object object, String methodName, Object... args) {
        mList.add(new Event(object, methodName, args));
    }

    public void notifyX() throws Exception {
        for (Event event : mList) {
            event.invoke();
        }
    }

}
