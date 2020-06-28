package cn.anygloble.singleton;

public class SingletonEnum {
    private SingletonEnum(){}
    static enum SingletonEnumTrue{
        INSTANCE;
        private SingletonEnum anEnum;
        private SingletonEnumTrue(){
            anEnum = new SingletonEnum();
        }
        public SingletonEnum getInstance(){
            return anEnum;
        }
    }
    public SingletonEnum getInstance(){
        return SingletonEnumTrue.INSTANCE.getInstance();
    }
}
