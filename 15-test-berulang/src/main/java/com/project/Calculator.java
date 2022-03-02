package com.project;

public class Calculator {

    public Integer add (Integer first, Integer second) {
        return first + second;
    }

    public Integer divide(Integer first, Integer second){
        if(second == 0){
            throw new IllegalArgumentException("Tidak bisa dibagi dengan nol");
        } else {
            return first/second;
        }
    }
}
