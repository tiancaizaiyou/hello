package cn.anygloble.threadPool;

import java.util.concurrent.Callable;

public class CallableTest implements Callable {
    @Override
    public String call() throws Exception {
        return "执行成功！";
    }
}
