
package Latihan_M2;

public class Handphone {
    private String tipe, warna, kapasitas;
    
    public void setTipe(String t){
        tipe = t;
    }
    public void setWarna(String w){
        warna = w;
    }
    public void setKaps(String k){
        kapasitas = k;
    }
    
    
    public String getTipe(){
        return this.tipe;
    }
    public String getWarna(){
        return this.warna;
    }
    public String gerKaps(){
        return this.kapasitas;
    }
        
}
