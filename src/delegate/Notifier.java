package delegate;

/**
 * Created by Bill on 2017/8/8.
 */
public abstract class Notifier {

    protected EventHandler eventHandler = new EventHandler();

    public abstract void addListener(Object object, String methodName, Object... args);

    public abstract void notifyX();

}
