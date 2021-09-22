/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Radaza Putri
 */
public class BangunRuangMain {
    public static void main(String[] args) {
        Bola a = new Bola();
        a.r = 14;
        a.hitungVol();
        a.hitungLuasPermukaan();
        System.out.println("");
        
        Kerucut b = new Kerucut();
        b.r = 10;
        b.s = 15;
        b.t = 7;
        b.hitungVol();
        b.hitungLuasSelimut();
        System.out.println("");
        
        Tabung c = new Tabung();
        c.r = 20;
        c.t = 25;
        c.hitungVol();
        c.hitungLuasSelimut();
        System.out.println("");
    }
}
