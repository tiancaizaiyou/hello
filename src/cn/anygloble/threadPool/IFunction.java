package cn.anygloble.threadPool;
@FunctionalInterface
public interface IFunction<P,R> {
    public abstract R change(P p);
}
