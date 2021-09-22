/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Radaza Putri
 */
public class Lingkaran {
    // atribut
    public int r;
    
    //method
    public void hitungLuas(){        
        double hasil;
        if (r % 7 == 0){
            hasil  = 22 / 7 * (r*r);
        } else {
            hasil = 3.14 * (r*r);
        }
        System.out.println("Luas Lingkaran: " + hasil + " cm persegi");
    }
    
    public void hitungKeliling(){
        double hasil;
        if (r % 7 == 0){
            hasil  = 22 / 7 * (2*r);
        } else {
            hasil = 3.14 * (2*r);
        }
        System.out.println("Keliling Lingkaran : " + hasil + " cm");
    }
}
