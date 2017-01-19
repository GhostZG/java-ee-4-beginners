package com.acme.edu;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        System.load(""); //JNI -> JNA -> jCOM
        final Process exec = Runtime.getRuntime().exec("util -kfjghdkfjgh ");
    }
}