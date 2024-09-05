package com.safatech.java8.service;

@FunctionalInterface
public interface CheckedExceptionHandlerConsumer<Target, ExObj extends Exception> {

    public void accept(Target target) throws ExObj;
}
