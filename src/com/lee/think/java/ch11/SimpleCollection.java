package com.lee.think.java.ch11;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by mingzhu on 2016/11/16.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<>();
        for(int i = 0; i < 10; i ++){
            c.add(i);
        }
        c.forEach(num -> System.out.println(num));
    }
}
