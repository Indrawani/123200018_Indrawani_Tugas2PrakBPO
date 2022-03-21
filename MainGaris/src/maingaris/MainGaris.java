/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maingaris;

import javax.swing.*;

/**
 *
 * @author IIN
 */
public class MainGaris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat objek baru 
        JFrame frame = new JFrame ("Pembentukan Garis Miring ke Bawah");
        
        //menghentikan program saat menekan tombol close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //membuat objek
        MiringBawah brs = new MiringBawah();
        
        //set x dan y miringbawah
        brs.setx1(500); 
        brs.sety1(180); 
        brs.setx2(140);
        brs.sety2(300);
        
        //membuat frame
        frame.add(brs);
        
        frame.setBounds(450, 100, 700, 700);
        
        //menampilkan frame saat di running
        frame.setVisible(true); 
        frame.setResizable(true);
    }   
}