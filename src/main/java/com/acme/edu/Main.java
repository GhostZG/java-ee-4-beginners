/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.edu;

import java.io.Closeable;
import java.io.IOException;
import java.util.*;

import static java.util.Collections.emptyList;

/**
 *
 * @author eugene
 */

public class Main {
    public static void main(String[] args) {
//        Collections.sort();
        Collections.unmodifiableList(Arrays.asList(1, 2, 3, 0));
//        Collections.emptyList().add("");
        Collections.synchronizedList(emptyList());

        //Main$1.class
        Closeable cc = new Closeable() {
            @Override
            public void close() throws IOException {

            }
        };

        //1.
        Set init = new HashSet() {{

        }};

        //2.
        Set init2 = map(1,2, set());


        Set collision = new HashSet();
        DTO dto1 = new DTO(1);
        collision.add(dto1);
        dto1.setState(2);

        collision.add(new DTO(2));
        System.out.println(collision);


    }
}

class Anon implements Closeable {
    @Override
    public void close() throws IOException {

    }
}

class DTO {
    private int state;



    DTO(int state) {
//        super();
        this.state = state;
    }

    public int getState() {
        return state;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DTO)) return false;

        DTO dto = (DTO) o;

        return getState() == dto.getState();
    }

    @Override
    public int hashCode() {
        return getState();
    }
}
