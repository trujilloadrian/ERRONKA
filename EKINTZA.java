/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gazteleku;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
/**
 *
 * @author martinez.mikel.a
 */
public class EKINTZA {
    private String id_ekintza;
    private String izena;
    private LocalDate hasiera_data;
    private LocalDate amaiera_data;
    
    public EKINTZA() {//berezko balioak
        id_ekintza="aaaa0";
        izena="soka salto";
        hasiera_data=LocalDate.of(5, 11, 2026);
        amaiera_data=LocalDate.of(16,04,2027);        
    }
     public EKINTZA(String e, String i, LocalDate fecha, LocalDate a) {
        id_ekintza=e;
        izena=i;
        hasiera_data=fecha;
        amaiera_data=a;        
    }

    public void setid_ekintza(){
        String e;
        Scanner sc=new Scanner(System.in);
        System.out.println("Sartu ekintzaren id-a");
        e=sc.nextLine();
        id_ekintza=e;
    }
  
    public void setId_ekintza(String e) {//gainkargatua
        id_ekintza = e;
    }

    public void setIzena(){
        String i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Sartu ekintzaren izena");
        i=sc.nextLine();
        izena=i;
    }
    public void setIzena(String i) {//gainkargatua
        izena = i;
    }

    public void setHasiera_data(){
        String textofecha;
        Boolean b=false;
        //konprobatzeko data ondo sartu duen 
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Sartu ekintzaren hasiera data dd/MM/yyyy");
            textofecha=sc.nextLine();
            try
            {
                LocalDate fecha=LocalDate.parse(textofecha, formato);
                hasiera_data=fecha;
                b=true;
            }
            catch(DateTimeParseException d){
                System.out.println("Data txarto sartu duzu. Erabili dd/MM/yyyy formatua");
            }
        }while(b==false);
    }

    public void setAmaiera_data(){
        String textofecha;
        Boolean b=false;
        //konprobatzeko data ondo sartu baduen 
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Sartu ekintzaren amaiera data dd/MM/yyyy");
            textofecha=sc.nextLine();
            try
            {
                LocalDate a=LocalDate.parse(textofecha, formato);
                amaiera_data=a;
                b=true;
            }
            catch(DateTimeParseException d){
                System.out.println("Data txarto sartu duzu. Erabili dd/MM/yyyy formatua");
            }
        }while(b==false);
    }

    public void getId_ekintza() {
        System.out.println("Ekintzaren id-a hau da: "+id_ekintza);
    }

    public void  getIzena() {
        System.out.println("Hau da ekintzaren izena: "+izena);
    }

    public void getHasiera_data() {
       System.out.println("Hau da ekintzaren hasiera data: "+hasiera_data);
    }
    
    public void getAmaiera_data() {
        System.out.println("Hau da ekintzaren amaiera data: "+amaiera_data);
    }
    public void getAll() {
        getId_ekintza();
        getIzena();
        getAmaiera_data();
        getHasiera_data();             
    }
}
