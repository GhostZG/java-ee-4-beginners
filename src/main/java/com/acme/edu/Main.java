package com.acme.edu;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        //1. Introspection
        Object o = new Object();
        o.getClass();
        Class clazz = Object.class;

        //2. Actions
//        clazz.newInstance();

        //3. Dynamic classloading
        Class.forName("p.p.p.C");

        //4. Dynamic/Virtual Proxy: Interface + Code -> Byte-code Instrumenting

        //5. Byte-code manipulation: AST -> meta-programming: ASM | ByteBuddy
    }
}
