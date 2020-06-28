package cn.anygloble;

public class FanXingTest<T> {
    private T t;

    public FanXingTest() {
    }

    public FanXingTest(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
