package observer.test;

import observer.ConcreteSubject;

/**
 * Created by Bill on 2017/8/8.
 */
public class TestObserver {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        CartoonObserver cartoonObserver = new CartoonObserver();
        NBAObserver nbaObserver = new NBAObserver();
        concreteSubject.addObserver(cartoonObserver);
        concreteSubject.addObserver(nbaObserver);

        concreteSubject.notifyAllObserver("老师来了");
    }
}
