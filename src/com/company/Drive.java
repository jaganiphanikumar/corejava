package com.company;

import java.io.InputStreamReader;

public interface Drive {

    public InputStreamReader getReadStream();

    default void writeData(){
        System.out.println("Just a default method");
    }

}
