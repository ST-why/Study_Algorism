package com.mc.algorism.f2_lambda;

@FunctionalInterface
public interface Function<T, U> {

    U apply(T arg, T arg2);
}
