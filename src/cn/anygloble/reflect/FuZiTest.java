package cn.anygloble.reflect;

public class FuZiTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Zi zi = Zi.class.newInstance();
        Zi zi1 = new Zi("s");
    }
}
