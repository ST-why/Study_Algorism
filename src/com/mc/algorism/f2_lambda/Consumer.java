package com.mc.algorism.f2_lambda;

@FunctionalInterface
public interface Consumer<T> {

    void accept(T t);
}
