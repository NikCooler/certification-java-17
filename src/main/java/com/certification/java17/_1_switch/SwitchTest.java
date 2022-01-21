package com.certification.java17._1_switch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SwitchTest {

    public static void main(String[] args) {
        System.out.print("her");
        Object a = "her";
        if (a instanceof Integer) {
//            Integer e = a + 1;
//            System.out.println(e);
        }
        String z = "some";
        Integer i = switch (z) {
            case "some", "dome" -> 10;
            case "7" -> 3;
            case "her", "naher" -> 15;
            case "" -> 1;
            default -> 0;
        };

        testSwitch(new ArrayList<>());
    }

    private static void testSwitch(Object some) {
        Integer i = switch (some) {
            case ArrayList s && s.size() == 0 && test() -> 11;
            case ArrayList s && s.size() == 0 && test() -> 12;
            case List s && s.size() < 10 -> 10;
            case null -> 2;
            default -> 1;
        };
        System.out.print(i);
    }

    private static boolean test() {
        Random r = new Random();
        return r.nextInt(10) < 5;
    }
}
