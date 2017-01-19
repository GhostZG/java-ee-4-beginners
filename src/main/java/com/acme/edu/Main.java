package com.acme.edu;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;


public class Main {
    @SuppressWarnings("jhkdjfhg")
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

@Component
class MyService {
    @javax.annotation.PreDestroy
    public void m() {
        //clean-up
    }
}
