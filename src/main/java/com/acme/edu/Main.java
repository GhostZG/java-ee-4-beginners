/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.edu;
/**
 *
 * @author eugene
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        //1. Introspection
        String obj = new String();
        obj.getClass();        
        Main.m(String.class);
        
        //2. Dynamic Class loading
        Class.forName("Main22222");
                
        //3. Dynamic/Virtual Proxies
        //4. Byte-code manipulation / instrumenting : ByteBuddy, ASM (AST)
    }
    
    static <T> T m(Class<T> a) {
        return null;
    }
}
