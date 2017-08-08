package observer;

/**
 * Created by Bill on 2017/8/8.
 * 观察者接口
 */
public interface Observer {
    void update(Subject subject, Object object);
}
