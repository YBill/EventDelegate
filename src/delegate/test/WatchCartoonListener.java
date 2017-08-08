package delegate.test;

import java.util.Date;

/**
 * Created by Bill on 2017/8/8.
 */
public class WatchCartoonListener {
    public void stopPlayingGame(Date args) {
        System.out.println("WatchCartoonListener  老师来了，不玩游戏了，结束时间：" + args.toString());
    }
}
