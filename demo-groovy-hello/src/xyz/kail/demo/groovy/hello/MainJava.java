package xyz.kail.demo.groovy.hello;

import groovy.util.Eval;

public class MainJava {

    public static void eval() {
        // 输出 99
        System.out.println(Eval.me("33 * 3 "));
        // 输出 KAIL  == "kail".toUpperCase()
        System.out.println(Eval.me("\"kail\".toUpperCase()"));
        // 输出 Hello World  == String.format("Hello %s","World")
        System.out.println(Eval.me("String.format(\"Hello %s\",\"World\")"));
    }

    public static void main(String[] args) {
        eval();
    }

}
