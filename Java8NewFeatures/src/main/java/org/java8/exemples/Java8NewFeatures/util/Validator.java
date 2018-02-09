package org.java8.exemples.Java8NewFeatures.util;

@FunctionalInterface
public interface Validator<T> {
	boolean validator(T t);
}
