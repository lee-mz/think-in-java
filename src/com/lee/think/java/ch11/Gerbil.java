package com.lee.think.java.ch11;

import java.util.ArrayList;

/**
 * Created by mingzhu on 2016/11/16.
 */
public class Gerbil {

    private int gerbilNumber;

    public Gerbil(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }

    public void hop(){
        System.out.println("The Gerbil " + gerbilNumber + " is jumping!");
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        gerbils.add(new Gerbil(1));
        gerbils.add(new Gerbil(2));
        gerbils.add(new Gerbil(3));
        gerbils.forEach(gerbil -> gerbil.hop());
    }
}
