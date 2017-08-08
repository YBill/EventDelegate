package delegate.test;

import java.util.Date;

/**
 * Created by Bill on 2017/8/8.
 */
public class WatchingNBAListener {
    public void stopWatchingTV(Date args) {
        System.out.println("WatchingNBAListener  老师来了，不看电视了，结束时间：" + args.toString());
    }
}
