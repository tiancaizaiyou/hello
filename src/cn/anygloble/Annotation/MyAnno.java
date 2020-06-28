package cn.anygloble.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.TYPE})//作用于类上
@Retention(RetentionPolicy.CLASS)
public @interface MyAnno {
}
