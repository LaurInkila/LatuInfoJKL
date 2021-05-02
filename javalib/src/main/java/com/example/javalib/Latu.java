package com.example.javalib;

/**
 * Luokka ladulle sisÃ¤ltÃ¤Ã¤ tiedot reitin nimestÃ¤, ja kunnostus tiedoista
 */
public class Latu {
    private String nimi;
    private boolean onkoP;
    private boolean onkoV;
    private boolean kunnostettuP;
    private boolean kunnostettuV;
    private String pvmP;
    private String pvmV;

    /**
     * Oletusmuodostaja luokalle Latu
     */
    public Latu(){
    }


    /**
     * Palauttaa ladun tiedot merkkijonona
     * @return ladun tiedot muodossa "Latu 10 Perinteinen kunnostettu 28.1.2021 Vapaa ei hiihtokunnossa.
     */
    @Override
    public String toString(){
        StringBuilder tiedot = new StringBuilder(nimi);
        if (onkoP) {
            tiedot.append(" Perinteinen");
            if(kunnostettuP)tiedot.append(" kunnostettu: " + pvmP);
            else tiedot.append(" ei hiihtokunnossa.");
        }
        if (onkoV) {
            tiedot.append("/n Vapaa");
            if(kunnostettuV)tiedot.append(" kunnostettu: " + pvmV);
            else tiedot.append(" ei hiihtokunnossa.");
        }
        return tiedot.toString();
    }


    /**
     * Täyttää esimerkkitiedoilla luokan testaamista varten
     */
    public void taytaEsimerkkiTiedoilla(){
        nimi = "Metsä 15";
        onkoP = true;
        onkoV = false;
        kunnostettuP = true;
        kunnostettuV = false;
        pvmP = "28.1.2021";
        pvmV = "";
    }


    /**
     * Testi pääohjelma
     * @param args ei käytössä
     */
    @SuppressWarnings("unused")
    public static void main(String[] args){
        Latu latu = new Latu();
        latu.taytaEsimerkkiTiedoilla();
        System.out.println(latu);

    }

}
