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
public class Kerucut {
        //atribut
        public int r;
        public int s;
        public int t;
    
        //method
        public void hitungVol(){        
        double hasil;
        if (r % 7 == 0){
            hasil  = (22 / 7 * r * r *t) / 3;
        } else {
            hasil = (3.14 * r * r *t) / 3;
        }
        System.out.println("Volume Kerucut: " + hasil + " cm kubik");
    }
    
        public void hitungLuasSelimut(){
        double hasil;
        if (r % 7 == 0){
            hasil  = 22 / 7 * (r *s);
        } else {
            hasil = 3.14 * (r *s);
        }
        System.out.println("Luas Selimut : " + hasil + " cm");
    }
}
