
package class_object_1;

public class MainClass {

    public static void main(String[] args) {
        //untuk bisa mengakses class hewan, burung dan ikan perlu membuat object(instance of class)
        
        
        // akses suara, tipe, dan usia dari class hewan
        Hewan burung = new Hewan();
        Hewan ikan = new Hewan();
        
        // method class burung dan ikan
        Burung b = new Burung();
        Ikan i = new Ikan();
        
       
        //cara isi data dari suara, tipe, dan usia
        burung.setTipe("Elang");
        burung.setSuara("Kuakk....");
        burung.setUsia(3);
        
        ikan.setTipe("Hiu");
        ikan.setSuara("wussss");
        ikan.setUsia(2);
        
        
        // cara ambil data dari Hewan, burung, dan ikan
        System.out.println("Aku "+ burung.getTipe()+ " suaraku "+ burung.getSuara() + " usiaku "+ burung.getusia());
        b.terbang();
        
        System.out.println("Aku "+ ikan.getTipe()+ " suaraku "+ ikan.getSuara() + " usiaku "+ ikan.getusia());
        i.berenang();
        
    }
    
    
}
