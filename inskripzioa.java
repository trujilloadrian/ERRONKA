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
public class inskripzioa {
    private String id_inskripzioa;
    private String id_bazkidea;
    private String id_ekintza;
    private LocalDate inskripzio_data;
    
    public inskripzioa(){
        id_inskripzioa="aaaa0";
        id_bazkidea="aaaa00";
        id_ekintza="aaaa000";
        inskripzio_data=LocalDate.of(5, 11, 2026);
    }
    public inskripzioa(String in, String ba, String e, LocalDate fecha){
        id_inskripzioa=in;
        id_bazkidea=ba;
        id_ekintza=e;
        inskripzio_data=fecha;
    }
    public void setid_inskripzioa(){
        String in;
        Scanner sc=new Scanner(System.in);
        System.out.println("Sartu inskripzioaren id-a");
        in=sc.nextLine();
        id_inskripzioa=in;
    }
    public void setid_inskripzioa(String i){//gainkargatua
        id_inskripzioa="aaaa0";
    }
    public void setid_bazkidea(){
        String ba;
        Scanner sc=new Scanner(System.in);
        System.out.println("Sartu bazkidearen id-a");
        ba=sc.nextLine();
        id_bazkidea=ba;
    }
        public void setid_bazkidea(String b){//gainkargatua
            id_bazkidea="aaaa00";
        }
    public void setid_ekintza(){
        String e;
        Scanner sc=new Scanner(System.in);
        System.out.println("Sartu ekintzen id-a");
        e=sc.nextLine();
        id_ekintza=e;
    }
    public void setid_ekintza(String e){//gainkargatua
        id_ekintza="aaaa000";
    }
    public void setinskripzio_data(){
        String textofecha;
        Boolean b=false;
        //konprobatzeko data ondo sartu duen edo ez 
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Sartu inskripzioaren data dd/MM/yyyy");
            textofecha=sc.nextLine();
            try
            {
                LocalDate fecha=LocalDate.parse(textofecha, formato);
                inskripzio_data=fecha;
                b=true;
            }
            catch(DateTimeParseException d){
                System.out.println("Data txarto sartu duzu. Erabili dd/MM/yyyy formatua");
            }
        }while(b==false);
    }
    public void getid_inskripzioa(){
        System.out.println("hau da inskripzioaren id-a: "+id_inskripzioa);
    }
    public void getid_bazkidea(){
        System.out.println("Hau da bazkidearen id-a: "+id_bazkidea);
        
    }
    public void getid_ekintza(){
        System.out.println("Hau da ekintzaren id-a: "+id_ekintza);
    }
    public void getinskripzio_data(){
        System.out.println("hau da inskripzioaren data: "+inskripzio_data);
    }
    public void getAll(){
        getid_inskripzioa();
        getid_bazkidea();
        getid_ekintza();
        getinskripzio_data();
    }
}

