package org.chenzhiqiang.homework;

import java.lang.annotation.*;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：SelfAnnotation
 * Date：2023/3/6
 * Filename：SelfAnnotation
 */
@Target({ElementType.METHOD,ElementType.CONSTRUCTOR,ElementType.LOCAL_VARIABLE,ElementType.FIELD,ElementType.PACKAGE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface SelfAnnotation {
    LEVE level() default LEVE.ONE;
}
