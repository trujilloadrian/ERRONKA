/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gazteleku_jolasak;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author martinez.mikel.a
 */
public class Gazteleku_jolasak {
    public void Zenbakia_asmatu(){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        int ausazkoa, sahiakera, zenbakia, aukera;


        do {
            //Arauak azaldu
            System.out.println("1. Programak ausazko zenbaki bat sortuko du eta zenbaki hori asmatu behar duzu 1 eta 100 artean.");
            System.out.println("2. Sartu zure zenbakia. 6 Sahiakera dituzu guztiz.");
            System.out.println("3. Zure zenbakia eta auzazko zenbakia berdinak baldin badira, irabazi egiten duzu.");
            System.out.println("4. Desberdinak baldin badira, programak sahiakera bat kenduko dizu eta azuzako zenbakia zure zenbakia baino handiago edo txikiago den ezango dizu.");
            System.out.println("5. Errepikatu irabazi edo sahiakera gabe geratu harte.");
            System.out.println("SAKATU TEKLA JARRAITZEKO");
            sc.nextLine();

            ausazkoa = r.nextInt(100) + 1;//Auzazko zenbakia sortu
            sahiakera = 6;//Sahiakera Kopurua
           
            while (sahiakera > 0) {//Sahiakerak gertatzen ari diren bitartean jarraitu

                System.out.print("ZENBAKIA IRAKURRI: ");
                zenbakia = sc.nextInt();

                if (zenbakia == ausazkoa) {
                    System.out.println("IRABAZI DUZU");
                    break;// Zenbakia asmatuz gero, joko-bukletik irten
                } else {                   
                    sahiakera--;// Ez bada asmatu, saiakera bat gutxiago

                    if (zenbakia > ausazkoa) {
                        System.out.println("ZENBAKIA TXIKIAGOA DA");//Zuk esandakoa handiegia denez, pista eman
                        System.out.println("Asmatzeko aukerak: "+sahiakera);
                    } else {
                        System.out.println("ZENBAKIA HANDIAGOA DA");// Zuk esandakoa txikiegia denez, pista eman
                        System.out.println("Asmatzeko aukerak: "+sahiakera);
                    }
                }
            }
            if (sahiakera == 0) {
                System.out.println("GALDU DUZU");
                System.out.println("Asmatu beharreko zenbakia: "+ausazkoa);
            }
            System.out.println("Berriro jolastu nahi duzu?");
            System.out.println("0-Ez");
            System.out.println("1-Bai");
            aukera=sc.nextInt();
        }//do
        while(aukera!=0);
    }//main
    public void Aurpegia_gurutzea(){
        int aukera;
         //Scaneer-ra erabiliko dugu teklatutik irakurtzeko
        //Random-a ausazko aukera bat ateratzeko erabiliko dugu
        Scanner sc= new Scanner(System.in);
        Random random = new Random();
        //StrinSg-arekin jokalariak sartzen duena gordeko du
        int opcion;
        String resultado;
        //Aukeratu zuk nahi duzun aukera,(Aurpegia edo Gurutzea).
        do{
        System.out.println("JOLASA:AURPEGIA EDO GURUTZEA");
        System.out.println("Aukeratu aurpegia edo gurutzea:");
        System.out.println("0-Aurpegia");
        System.out.println("1-Gurutzea");
        opcion = sc.nextInt();
        //Ausazko zenbaki bat aukeratzen du sistemak 
        int numero = random.nextInt(2);
        //if-a aurpegia edo gurutzea konprobatzeko erabiliko dugu 
        if (numero == 0) {
            resultado = "aurpegia";
        } else  {
            resultado = "gurutzea";
            //else erabiliz beste aukera bat aukeratzeko da
            //horrela aurpegia edo gurutzea berriro aukeratu ahal duzu
        }

        System.out.println("Irten da: " + resultado);

        if (opcion==0 && numero==1) {
            System.out.println("Irabazi duzu!");
            //if-a aurpegia edo gurutzea konprobatzeko erabiliko dugu 
        } else if(opcion==numero) {
            System.out.println("Empate");
            //else erabiliz beste aukera bat aukeratzeko da
            //horrela aurpegia edo gurutzea berriro aukeratu ahal duzu
        }
        else {
            System.out.println("Galdu duzu");
        }
            
        System.out.println("Berriro jolastu nahi duzu?");
        System.out.println("0-Bai");
        System.out.println("1-Ez");
        aukera=sc.nextInt();
        }//do
        while(aukera!=1);
    }
    public void Dadoen_jolasa(){
         //---DEKLARAZIOAK---
         int aukera;
    Scanner sc=new Scanner (System.in);
    int dado1,dado2,dado3,dado4,emaitz1,emaitz2;
    Random random = new Random();
    do{
        System.out.println("---JOLASAREN ARAUAK---");
        System.out.println("-1. Zure dadoak behin botako dira.-");
        System.out.println("-2. Aurkariaren dadoak behin botako dira.-");
        System.out.println("-3. Zenbaki handiena duena jolasa irabaziko du.-");
        System.out.println("---SAKATU EDOZEIN TEKLA HASTEKO---");
        sc.nextLine();
        //Erabiltzailearen dadoei balio bat eman eta gehitu//
        System.out.println("-Dadoak botatzen...-");
        dado1= random.nextInt(6)+1;
        dado2= random.nextInt(6)+1;

        emaitz1=dado1+dado2;

        System.out.println("-Zure puntuazioa "+emaitz1+" da.-");
        //Makinaren dadoei balio bat eman eta gehitu//
        System.out.println("-Aurkariaren dadoak botatzen...-");
        dado3= random.nextInt(6)+1;
        dado4= random.nextInt(6)+1;


        emaitz2=dado3+dado4;


        System.out.println("-Aurkariaren puntuazioa "+emaitz2+" da.-");
        //Konparaketa egiten da eta irabazlea adierazten da//
        if (emaitz1>emaitz2)
            {
             System.out.println("-IRABAZI DUZU!-");
            }
        if (emaitz1<emaitz2)
            {
            System.out.println("-Galdu duzu.-");
            }
        if (emaitz1==emaitz2)
        {
            System.out.println("-Empate!-");
        }
        System.out.println("Berriro jolastu nahi duzu?");
        System.out.println("0-Bai");
        System.out.println("1-Ez");
        aukera=sc.nextInt();
    }//do
    while(aukera!=1);
    }
    public void Harri_orri_ar(){
        // aldagaien deklarazioak
        int era, ordenagailua, aukera;
        do
        {
            //random-a sortu erabiltzailearen aurka jokatzeko
        Random random = new Random();
        ordenagailua = random.nextInt(3);
        Scanner sc= new Scanner(System.in);
        //jokua azaldu 
        System.out.println("Jolasaren arauak:");
        System.out.println("1-Harriak artaziei irabazten dio");
        System.out.println("2-Artaziak orriari irabazten dio");
        System.out.println("3-Orriak harriari irabazten dio");
        System.out.println("4-Berdina ateratzen bada ez du inork irabazten");
        System.out.println("----AUKERAK----");
        System.out.println("0 zenbakia harria da");
        System.out.println("1 zenbakia orria da");
        System.out.println("2 zenbakia artaziak dira");
        era=sc.nextInt();
        //konparaketak erabakitzeko nork irabazten duen 
        System.out.println("ordenagailuaren aukera: "+ ordenagailua);
        if(era==ordenagailua)
        {
            System.out.println("ez du inork irabazi");
        }
        switch(era)//erabiltzailea sartuak
        {
            case 0://harria
                switch (ordenagailua)//ordenagailuaren aukera random-ean sortuta
                {
                case 1:
                    System.out.println("Galdu duzu");
                    break;
                case 2:
                    System.out.println("Irabazi duzu");
                    break;
                }
                break;//case 0
            case 1://orria erabiltzaileak aukeratua
                switch(ordenagailua)
                {
                    case 0:
                        System.out.println("irabazi duzu");
                        break;
                    case 2:
                        System.out.println("Galdu duzu");
                        break;
                }
                break;//case 1
            case 2://artaziak erabiltzaileak aukeratua
                switch(ordenagailua)
                {
                    case 0:
                        System.out.println("Galdu duzu");
                        break;
                    case 1:
                        System.out.println("Irabazi duzu");
                        break;
                }
                break;//case 2
        }
        //berriro jolasteko erabakia
        System.out.println("Berriro jolastu nahi duzu?");
        System.out.println("0-Bai");
        System.out.println("1-Ez");
        aukera=sc.nextInt();
        }
        while (aukera!=1);
    }            
    public void main(String[] args) {
        int aukera;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("----Menua----");
            System.out.println("1-Zenbakia asmatu");
            System.out.println("2-Aurpegia edo gurutzea");
            System.out.println("3-Dadoen jolasa");
            System.out.println("4-Harri-orri-ar");
            System.out.println("5-Amaitu");
            aukera=sc.nextInt();
            switch(aukera)
            {
                case 1://zenbakia asmatu
                    Zenbakia_asmatu();
                break;
                case 2://aurpegia edo gurutzea
                    Aurpegia_gurutzea();
                break;
                case 3://dadoen jolasa
                    Dadoen_jolasa();
                break;
                case 4://harri-orri-ar
                    Harri_orri_ar();
                break;
                case 5://amaitu
                break; 
                default://erabiltzaileak beste zerbait sartzen badu 
                    System.out.println("Hori ez da aukera bat. Aukeratu berriro, mesedez.");
            }//switch 2 
        }//do
        while(aukera!=5);    
    }//main
}//class