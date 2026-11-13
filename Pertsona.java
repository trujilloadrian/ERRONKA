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
public class Pertsona {
    private String NAN;
    private String Abizena;
    private String Izena;
    
    public Pertsona(){//defektuzko balioak
        NAN="12345678A";
        Abizena="Bospheramus";
        Izena="Zelda";
    }
    public Pertsona(String n, String a, String i){
        NAN=n;
        Abizena=a;
        Izena=i;
    }
    public void setNAN(){
         String n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Sartu NAN zenbakia");
        n=sc.nextLine();
        NAN=n;
    }
    public void setNAN(String n){//sobrekargado
        NAN=n;
    }
    public void setAbizena(){
        String a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Sartu abizen bat");
        a=sc.nextLine();
        Abizena=a;
    }
    public void setAbizena(String a){//sobrekargado
        Abizena=a;
    }
    public void setIzena(){
        String i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Sartu izen bat");
        i=sc.nextLine();
        Izena=i;                
    }
    public void setIzena(String i){//sobrekargado
        Izena=i;
    } 
    public void getNAN(){
        System.out.println("NAN zenbakia hau da: \n"+NAN);
    }
    public void getAbizena(){
        System.out.println("Abizena hau da: \n"+Abizena);
    }
    public void getIzena(){
        System.out.println("Izena hau da: \n"+Izena);
    }
    public void getall(){
        getNAN();
        getIzena();
        getAbizena();
    }      
}//class 