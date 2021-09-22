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
public class Tabung {
    //atribut
    public int r;
    public int t;
    
    //method
    public void hitungVol(){        
        double hasil;
        if (r % 7 == 0){
            hasil  = 22 / 7 * (r*r) * t;
        } else {
            hasil = 3.14 * (r*r) * t;
        }
        System.out.println("Volumen Tabung : " + hasil + " cm kubik");
    }
    
    public void hitungLuasSelimut(){
        double hasil;
        if (r % 7 == 0){
            hasil  = 22 / 7 * (2*r) * t;
        } else {
            hasil = 3.14 * (2*r) *t;
        }
        System.out.println("Luas Selimut Tabung : " + hasil + " cm persegi");
    }
}
