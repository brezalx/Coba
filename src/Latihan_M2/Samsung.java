/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan_M2;

/**
 *
 * @author BmeX
 */
public class Samsung {
    private int harga,jumlah,total;
    
    public void setHarga(int h){
        harga = h;
    }
    public void setJml(int j){
        jumlah = j;
    }
    
    public int getHrg(){
        return this.harga;
    }
    public int getJml(){
        return this.jumlah;
    }
    public int getBeli(){
        total = getHrg()*getJml();
        return total;
    }
}   
