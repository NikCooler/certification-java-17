package com.certification.java17._1_switch;

import java.util.Random;

public class SwitchTest1 {

    public static void main(String[] args) {
        var d = new D(1);
        test(d);
    }
    private static void test(A a) {
        class E {
            public boolean rand() {
                var r = new Random();
                return r.nextInt(10) < 5;
            }
        }
        var ee = new E();
        var i = switch (a) {
            case C c && c.i() > 10 -> 11;
            case C c && c.i() <= 10 -> 12;
            case D c -> 13;
            default -> 111;
        };
        System.out.println(i);
    }
}

interface B {}
sealed interface A extends B permits C, D {
    public default int i() {
        return 1000;
    }
}

final class C implements A, B {
    private final int i;
    public C(int i) {
        this.i = i;
    }

    public int i() {
        return i;
    }
}

record D(int i) implements A {}
