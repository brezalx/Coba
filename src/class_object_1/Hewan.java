
package class_object_1;


public class Hewan {
    private String suara;
    private String tipe;
    private int usia;
    
    //setter
    public void setTipe(String t){
        tipe = t;
    }
    public void setSuara(String suara){
        this.suara=suara;
    }
    public void setUsia(int usia){
        this.usia=usia;
    }
    
    //getter
    /*getter biasanya tidak memiliki parameter karena langsung mengambill dari data setter*/
    
    public String getTipe(){
        return this.tipe;
    }
    public String getSuara(){
        return this.suara;
    }
    public int getusia(){
        return this.usia;
    }
}