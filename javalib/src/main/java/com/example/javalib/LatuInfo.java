package com.example.javalib;

import java.util.ArrayList;
import java.util.List;

public class LatuInfo {
    private final List<Kunta> kunnat = new ArrayList<Kunta>();

    /**
     * Parametriton muodostaja
     */
    public LatuInfo(){
        //
    }

    /**
     * Lisää kunnan latuinfoon
     * @param lisattava latuinfoon lisättävä kunta
     */
    public void lisaaKunta(Kunta lisattava){
        kunnat.add(lisattava);
    }

    /**
     * Testipääohjelma luokalle
     * @param args ei käytössä
     */
    public static void main(String[] args){
        //
    }
}
