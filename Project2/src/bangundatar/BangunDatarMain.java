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
public class BangunDatarMain {
    public static void main(String[] args) {
        System.out.println("Persegi panjang");
        PersegiPanjang op1 = new PersegiPanjang();
        op1.panjang = 25;
        op1.lebar = 38;
        op1.hitungLuas();
        op1.hitungKeliling();
        System.out.println();
        
        System.out.println("Persegi A");
        Persegi a = new Persegi();
        a.sisi = 10;
        a.hitungLuas();
        a.hitungKeliling();
        System.out.println();
        
        System.out.println("Persegi  B");
        Persegi b = new Persegi();
        b.sisi = 15;
        b.hitungLuas();
        b.hitungKeliling();
        System.out.println();
        
        System.out.println("Lingkaran X");
        Lingkaran x = new Lingkaran();
        x.r = 25;
        x.hitungLuas();
        x.hitungKeliling();
        System.out.println();
        
        System.out.println("Lingkaran Z");
        Lingkaran z = new Lingkaran();
        z.r = 37;
        z.hitungLuas();
        z.hitungKeliling();
    }

}
