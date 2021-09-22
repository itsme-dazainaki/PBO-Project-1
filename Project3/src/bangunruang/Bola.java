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
public class Bola {
    //atribut
    public int r;
    
    //method
    public void hitungVol(){        
        double hasil;
        if (r % 7 == 0){
            hasil  =  4 / 3 * (22 / 7 * r*r*r);
        } else {
            hasil = 4 / 3 * (3.14 * r*r*r);
        }
        System.out.println("Volumen Bola : " + hasil + " cm kubik");
    }
    
    public void hitungLuasPermukaan(){
        double hasil;
        if (r % 7 == 0){
            hasil  = 4 * 22 / 7 * (r*r);
        } else {
            hasil = 4 * 3.14 * (r*r);
        }
        System.out.println("Luas Permukaan Bola: " + hasil + " cm persegi");
    }
}
