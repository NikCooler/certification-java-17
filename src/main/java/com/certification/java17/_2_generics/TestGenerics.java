package com.certification.java17._2_generics;

public class TestGenerics {

    public static void main(String[] args) {

        doSome(new E());
    }

    private static <T extends C & B & A> void doSome(T t) {
        t.doSome();
    }
}

interface A {
    default void doSome() {
        System.out.println("A.doSome");
    }
}
interface B extends A {
    default void doSome() {
        System.out.println("B.doSome");
    }
}

abstract class C implements B, A {}
class E extends C {}
class D {}
