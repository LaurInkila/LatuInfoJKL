package com.example.javalib;

import com.example.javalib.Latu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Reetu Inkila
 * @version Apr 30, 2021
 * Luokka alueelle joka sisaltaa latuja
 */
public class Alue implements Iterable<Latu>{
    private final List<Latu> alkiot = new ArrayList<Latu>();
    
    /**
     * Parametriton muodostaja
     */
    public Alue() {
    }
    
    
    /** Lisaa ladun luokkaan
     * @param lisattava latu joka lisataan
     */
    public void addLatu(Latu lisattava) {
        alkiot.add(lisattava);
    }


    /**
     * Iteraattori kaikkien Latujen lapikaymiseen
     * @return latuiteraattori
     */
    @Override
    public Iterator<Latu> iterator() {
        return alkiot.iterator();
    }


    /** Testipaaohjelma luokalle Alue
     * @param args ei kaytossa
     */
    public static void main(String[] args) {
        Alue hiihtomaa = new Alue();
        Latu latu1 = new Latu(); Latu latu2 = new Latu();
        latu1.taytaEsimerkkiTiedoilla(); latu2.taytaEsimerkkiTiedoilla();
        hiihtomaa.addLatu(latu1); hiihtomaa.addLatu(latu2);

        for (Latu latu: hiihtomaa){
            System.out.println(latu);
        }
    }
}
