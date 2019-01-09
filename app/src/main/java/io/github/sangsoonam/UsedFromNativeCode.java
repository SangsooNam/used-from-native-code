package io.github.sangsoonam;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * This annotation is used to indicate that a method is used from native code. It is mostly
 * used along with @SuppressWarnings("UnusedDeclaration") to clarify why it appears unused in IDE.
 * If a method has this annotation, developers should have extra caution while refactoring
 * such as renaming and changing a signature.
 */
@Retention(RetentionPolicy.CLASS)
public @interface UsedFromNativeCode {
}

