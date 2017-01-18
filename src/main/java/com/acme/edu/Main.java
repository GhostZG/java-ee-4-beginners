/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.edu;


import java.io.RandomAccessFile;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author eugene
 */
public class Main {
    public static void main(String[] args) {
        /*
        Collectio<USer> с = userReader.readBatch();
        adapter1.save(c);
        
        //...
        adatper1.readAndSave(userReader)
        
        ///...
        Stream s = BatchedStream();
        s.apply(new UserEntryHandler())
        */
                
        List<Integer> list = Arrays.asList(1,2,3, 6, 1,2,4);
        list.parallelStream()
            .filter(integer -> integer > 1)
            .map(Object::toString)
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList())
                .forEach(System.out::println);
            
        
                
    }
}
