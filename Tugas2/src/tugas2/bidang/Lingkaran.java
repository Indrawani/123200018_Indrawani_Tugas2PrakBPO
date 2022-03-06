/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.bidang;

/**
 *
 * @author IIN
 */
public class Lingkaran implements MenghitungBidang{
    private double jarijari;
    
    public Lingkaran(double jari){
        this.jarijari = jari;
} 

    public double getJari() {
        return jarijari;
    }

    public void setJari(double jari) {
        this.jarijari = jari;
    }
    
    @Override
    public double luas() {        
         return 3.14*jarijari*jarijari;    
        }
    
    @Override
    public double keliling() {
         return 3.14*2*jarijari;          
    }
}