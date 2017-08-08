package observer;

/**
 * Created by Bill on 2017/8/8.
 */
public interface Subject {

    /**
     * 添加观察者
     *
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     *
     * @param observer
     * @param object
     */
    void notify(Observer observer, Object object);

    /**
     * 通知全部
     *
     * @param object
     */
    void notifyAllObserver(Object object);

}
