/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan_M3;

/**
 *
 * @author BmeX
 */
public class Akun {
    //user, password
    private String username,password;
    
    //constractor non parameter admin
    public Akun(){
        username = "admin";
        password = "admin";
    }
    
    //constractor parameter akun baru
    public Akun(String u, String p){
        username = u;
        password = p;
        
        
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
