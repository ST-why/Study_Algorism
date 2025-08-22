package com.mc.algorism.f2_lambda;

@FunctionalInterface
public interface Predicate<T>{
    boolean test(T arg);
}
