/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gazteleku;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author martinez.mikel.a
 */
public class Gazteleku {
    public void Bazkidea(ArrayList<Bazkidea> listaBazkidea){
        int aukera, i, P;//P=posizioa
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("AUKERAK");
            System.out.println("1-Gehitu bazkidea");
            System.out.println("2-Ezabatu bazkidea");
            System.out.println("3-Bistaratu bazkidea");
            System.out.println("4-Atzera");
            aukera=sc.nextInt();
            switch(aukera){
                case 1://gehitu 
                    Bazkidea b1 = new Bazkidea("", "", "", "");
                    b1.setNAN();
                    b1.setIzena();
                    b1.setAbizena();
                    b1.setid_bazkidea();
                    listaBazkidea.add(b1);
                    break;
                case 2://ezabatu
                    System.out.println("Zein bazkide kendu nahi duzu?(Posizioa sartu 0-tik hasita)");
                    P=sc.nextInt();
                    listaBazkidea.remove(P);
                    break;
                case 3://bistaratu 
                    for(i=0; i<listaBazkidea.size(); i++)
                    {
                        listaBazkidea.get(i).getAll();
                    }
                    break;
                case 4://amaitu
                break;
                    default:
                    System.out.println("Hori ez da aukera bat. Aukeratu berriro, mesedez.");
            }
        }
        while(aukera!=4);
    }
    public void Langilea(ArrayList<Langilea> listaLangilea){
        int aukera, i, P;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("AUKERAK");
            System.out.println("1-Gehitu langilea");
            System.out.println("2-Ezabatu langilea");
            System.out.println("3-Bistaratu langilea");
            System.out.println("4-Atzera");
            aukera=sc.nextInt();
                                
            switch(aukera){
                case 1: //gehitu
                    Langilea l1 = new Langilea("", "", "","");
                    l1.setNAN();
                    l1.setIzena();
                    l1.setAbizena();
                    l1.setid_langilea();
                    listaLangilea.add(l1);
                        break;
                case 2://ezabatu
                    System.out.println("Zein langile kendu nahi duzu?(Posizioa sartu 0-tik hasita)");
                    P=sc.nextInt();
                    listaLangilea.remove(P);
                    break;
                case 3://bistaratu
                    for(i=0; i<listaLangilea.size(); i++)
                    {
                        listaLangilea.get(i).getAll();
                    }
                    break;
                case 4://amaitu
                break;
                    default:
                    System.out.println("Hori ez da aukera bat. Aukeratu berriro, mesedez.");
            }
        }
        while(aukera!=4);
    }
    public void inskripzioa(ArrayList<inskripzioa> listainskripzioa){
         int aukera,i, P;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("AUKERAK");
            System.out.println("1-Gehitu inskripzioa");
            System.out.println("2-Ezabatu inskripzioa");
            System.out.println("3-Bistaratu inzkripzioa");
            System.out.println("4-Atzera");
            aukera=sc.nextInt();
            switch(aukera){
                case 1: //gehitu
                    inskripzioa i1 = new inskripzioa("", "", "", LocalDate.now());
                    i1.setid_inskripzioa();
                    i1.setid_bazkidea();
                    i1.setid_ekintza();
                    i1.setinskripzio_data();
                    listainskripzioa.add(i1);
                    break;
                case 2://ezabatu
                    System.out.println("Zein inskripzio kendu nahi duzu?(Posizioa sartu 0-tik hasita)");
                    P=sc.nextInt();
                    listainskripzioa.remove(P);
                    break;
                case 3://bistaratu
                    for(i=0; i<listainskripzioa.size(); i++)
                    {
                        listainskripzioa.get(i).getAll();
                    }
                    break;
                case 4://amaitu
                    break;
                default:
                    System.out.println("Hori ez da aukera bat. Aukeratu berriro, mesedez.");
            }
        }
        while(aukera!=4);
    }
    public void Ekintza(ArrayList<EKINTZA> listaEkintza){
         int aukera,i, P;
        Scanner sc=new Scanner(System.in);
        
        do
        {
            System.out.println("AUKERAK");
            System.out.println("1-Gehitu ekintza");
            System.out.println("2-Ezabatu ekintza");
            System.out.println("3-Bistaratu ekintza");
            System.out.println("4-Atzera");
            aukera=sc.nextInt();
            switch(aukera){
                case 1: //gehitu
                    EKINTZA e1 = new EKINTZA("", "", LocalDate.now(), LocalDate.now());
                    e1.setid_ekintza();
                    e1.setIzena();
                    e1.setHasiera_data();
                    e1.setAmaiera_data();
                    listaEkintza.add(e1);
                    break;
                case 2://ezabatu
                    System.out.println("Zein ekintza kendu nahi duzu?(Posizioa sartu 0-tik hasita)");
                    P=sc.nextInt();
                    listaEkintza.remove(P);
                    break;
                case 3://bistaratu
                    for(i=0; i<listaEkintza.size(); i++)
                    {
                        listaEkintza.get(i).getAll();
                    }
                    break;
                case 4://amaitu
                    break;
                default:
                    System.out.println("Hori ez da aukera bat. Aukeratu berriro, mesedez.");
            }
        }
        while(aukera!=4);
    }
    public void Udalekua(ArrayList<Udalekua> listaUdalekua){
         int aukera, i, P;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("AUKERAK");
            System.out.println("1-Gehitu udalekua");
            System.out.println("2-Ezabatu udalekua");
            System.out.println("3-Bistaratu udalekua");
            System.out.println("4-Atzera");
            aukera=sc.nextInt();
            switch(aukera){
                case 1: //gehitu
                    Udalekua u1 = new Udalekua("", "");
                    u1.setId_udalekua();
                    u1.setKokapen_herria();
                    listaUdalekua.add(u1);
                    break;
                case 2://ezabatu
                    System.out.println("Zein udaleku kendu nahi duzu?(Posizioa sartu 0-tik hasita)");
                    P=sc.nextInt();
                    listaUdalekua.remove(P);
                    break;
                case 3://bistartu
                    for(i=0; i<listaUdalekua.size(); i++)
                    {
                        listaUdalekua.get(i).getAll();
                    }
                    break;
                case 4://amaitu
                    break;
                default:
                    System.out.println("Hori ez da aukera bat. Aukeratu berriro, mesedez.");
            }
        }
        while(aukera!=4);
    }
        public void main(String[] args) {
        int aukera;
        Scanner sc=new Scanner(System.in);
        ArrayList<Bazkidea> listaBazkidea=new ArrayList();
        ArrayList<Langilea> listaLangilea=new ArrayList();
        ArrayList<EKINTZA> listaEkintza=new ArrayList();
        ArrayList<inskripzioa> listainskripzioa=new ArrayList();
        ArrayList<Udalekua> listaUdalekua=new ArrayList();
        do{//menu printzipala
            System.out.println("----Menua----");
            System.out.println("1-Bazkidea");
            System.out.println("2-Langilea");
            System.out.println("3-Ekintza");
            System.out.println("4-Inskripzioa");
            System.out.println("5-Udalekua");
            System.out.println("6-Amaitu");
            aukera=sc.nextInt();
            switch(aukera)
            {
                case 1://bazkidea
                    Bazkidea(listaBazkidea);
                    break;
                case 2://Langilea
                    Langilea(listaLangilea);
                    break;
                case 3://Ekintza
                    Ekintza(listaEkintza);
                    break;
                case 4://Inskripzioa
                    inskripzioa(listainskripzioa);
                    break;
                case 5:
                    Udalekua(listaUdalekua);
                    break;     
                case 6://amaitu
                    break;
                default:
                    System.out.println("Hori ez da aukera bat. Aukeratu berriro, mesedez.");
            }//switch  
        }//do
        while(aukera!=6);
    }//main
}//class