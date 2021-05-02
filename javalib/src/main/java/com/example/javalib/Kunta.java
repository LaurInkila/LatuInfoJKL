package com.example.javalib;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.example.javalib.Alue;
/**
 * Luokka latuinfon kunnnalle
 */
public class Kunta implements Iterable<Alue> {
    private final List<Alue> alkiot = new ArrayList<Alue>();


    /**
     * Lisätään alue luokkaan
     * @param lisattava alue joka lisätään
     */
    public void addAlue(Alue lisattava){
        alkiot.add(lisattava);
    }


    /**
     * Parametriton muodostaja
     */
    public Kunta(){
        //
    }


    /**
     * Iteraattori luokalle Kunta
     * @return Alue iteraattori
     */
    @Override
    public Iterator<Alue> iterator() {
        return alkiot.iterator();
    }


    /**
     * Testipääohjelma luokalle
     * @param args ei köytössä
     */
    public static void main(String[] args){
        //
    }
}
