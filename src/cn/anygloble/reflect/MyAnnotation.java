package cn.anygloble.reflect;

import javax.annotation.Resource;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    public abstract String className();
    public abstract String methodName();
}
