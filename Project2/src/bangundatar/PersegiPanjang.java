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
public class PersegiPanjang {
    // atribut
    public int panjang;
    public int lebar;
    
    //method
    public void hitungLuas(){
        int hasil = panjang * lebar;
        System.out.println("Luas Persegi panjang : " + hasil + " cm persegi");
    }
    
    public void hitungKeliling(){
        int hasil = 2 *(panjang + lebar);
        System.out.println("Keliling Persegi panjang : " + hasil + " cm");
    }
    
}
