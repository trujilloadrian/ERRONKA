/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gazteleku;
import java.util.Scanner;
/**
 *
 * @author martinez.mikel.a
 */
public class Udalekua {
    private String id_udalekua;
    private String Kokapen_herria;
  
    public Udalekua() {//berezko balioak
        id_udalekua="aaaa6";
        Kokapen_herria="Ermua";
    }
    public Udalekua(String u, String k) {
        id_udalekua=u;
        Kokapen_herria=k;
    }

   public void setId_udalekua(){
       String u;
       Scanner sc=new Scanner(System.in);
       System.out.println("Sartu udalekuaren id-a");
       u=sc.nextLine();
       id_udalekua=u;
   }
    public void setId_udalekua(String u) {//gainkargatua
        id_udalekua = u;
    }

    public void setKokapen_herria(){
        String k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Sartu kokapen herria");
        k=sc.nextLine();
        Kokapen_herria=k;
                
    }
    public void setKokapen_herria(String k) {//gainkargatua
        Kokapen_herria = k;
    }
  
    public void getId_udalekua() {
        System.out.println("Udalekuaren id-a hau da: "+id_udalekua);
    }

    public void getKokapen_herria() {
        System.out.println("Kokapen herria hau da: "+Kokapen_herria);
    }
   
    public void getAll() {
        getId_udalekua();
        getKokapen_herria();
    }
}

