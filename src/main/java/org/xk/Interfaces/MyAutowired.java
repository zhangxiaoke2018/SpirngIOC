package org.xk.Interfaces;

import java.lang.annotation.*;
//用来修饰疏解，元注解 runtime：注解不仅保存到class文件中，jvm加载class文件之后，仍然存在。
@Retention(RetentionPolicy.RUNTIME)
//@Target说明了Annotation所修饰的对象范围
@Target(ElementType.FIELD)
//@Documented 注解表明这个注解应该被 javadoc工具记录 所以注解类型信息也会被包括在生成的文档中，是一个标记注解，没有成员。
@Documented
public @interface MyAutowired {
    String value() default "";
}
