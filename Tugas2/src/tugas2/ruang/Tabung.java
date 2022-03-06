/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.ruang;

/**
 *
 * @author IIN
 */
import tugas2.bidang.Lingkaran;

public class Tabung extends Lingkaran implements MenghitungRuang{
    private double tinggi;
    
    public Tabung(double tinggi, double jarijari){
        super(jarijari);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return (luas()*tinggi);
    }

    @Override
    public double luaspermukaan() {
        return (2*luas())+ (2*Math.PI*getJari()*tinggi);
    }  
}