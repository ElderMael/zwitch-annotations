package io.eldermael.zwitch;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation that marks Types and Methods to belong to a particular feature determined by {@link
 * Feature#value()}.
 */

@Retention(RetentionPolicy.SOURCE)
@Target({
    ElementType.TYPE,
    ElementType.METHOD
})
public @interface Feature {

  String value();
}