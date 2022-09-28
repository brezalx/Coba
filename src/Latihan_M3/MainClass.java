/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan_M3;

import java.io.*;
public class MainClass {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        //karena ada 2 constructor maka dibuat 2 object
        //1. admin.
        //2. akun baru
        Akun admin = new Akun();
        Akun akunbaru = new Akun ("","");
        
        //variabel
        String username, password;
        
         do{
        //menu
        System.out.println("----Login----");
        System.out.println("1. Login admin");
        System.out.println("2. Buat akun baru");
        System.out.println("3. Lihat akun");
        System.out.println("4. Ubah password");
        System.out.println("5. Keluar");
        System.out.print("Pilih Menu: ");
        int menu = Integer.parseInt(br.readLine());
       
        switch (menu){
        
            case 1:
                System.out.println("--Login Admin--");
                System.out.print("Masukkan username : ");
                username = br.readLine();
                System.out.print("Masukkan password : ");
                password = br.readLine();
                
                if (username.equalsIgnoreCase(admin.getUsername())&& password.equals(admin.getPassword())){
                    System.out.println("Sukses!");
                    
                }else{
                    System.err.println("Gagal!");
                }
            break;
            
            case 2: 
                System.out.println("--Buat Akun--");
                System.out.print("Masukkan username : ");
                username = br.readLine();
                System.out.print("Masukkan password : ");
                password = br.readLine();
                
                //memasukan variabel ke dalam constructor
                akunbaru = new Akun(username,password);
            break;
            
            case 3:
                System.out.println("--Lihat Akun--");
                System.out.println("1. Admin");
                System.out.println("Username : "+ admin.getUsername());
                System.out.println("Password : "+ admin.getPassword());
                System.out.println("");
                System.out.println("2. Akun baru");
                System.out.println("Username : "+ akunbaru.getUsername());
                System.out.println("Password : "+ akunbaru.getPassword()+"\n");
            break;
            
            case 4:
                System.out.println("--Ubah Password--");
                //masukkan pass lama
                System.out.println("Masukkan password lama : ");
                password = br.readLine();
                if (password.equals(akunbaru.getPassword())){
                    System.out.println("Sukses!");
                    System.out.println("Masukkan password baru : ");
                    akunbaru.setPassword(br.readLine());
                    
                }else{
                    System.err.println("Passwrod salah!");
                }
                
                
                
                
            break;
            case 5:
                System.exit(0);
        }
        }while(true);
    }
    
}
