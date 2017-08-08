package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bill on 2017/8/8.
 * 具体的主题对象
 */
public class ConcreteSubject implements Subject {

    private List<Observer> mList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("observer is null");
        }
        if (!mList.contains(observer)) {
            mList.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        mList.remove(observer);
    }

    @Override
    public void notify(Observer observer, Object object) {
        if (observer != null) {
            observer.update(this, object);
        }
    }

    @Override
    public void notifyAllObserver(Object object) {
        for (Observer observer : mList) {
            observer.update(this, object);
        }
    }
}
