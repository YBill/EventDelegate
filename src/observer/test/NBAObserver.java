package observer.test;

import observer.Observer;
import observer.Subject;

/**
 * Created by Bill on 2017/8/8.
 */
public class NBAObserver implements Observer {

    @Override
    public void update(Subject subject, Object object) {
        System.out.println("我是" + this.getClass().getSimpleName() + "，  " + object + "别看NBA了");
    }
}
