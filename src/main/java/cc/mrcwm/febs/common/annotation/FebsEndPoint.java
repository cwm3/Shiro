package cc.mrcwm.febs.common.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author mrcwm
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface FebsEndPoint {
    @AliasFor(annotation = Component.class)
    String value() default "";
}
