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
public class Bazkidea extends Pertsona {//oinordetzan jaso 
    private String id_bazkidea;
    public Bazkidea(String n, String a, String i, String b){
        super (n, a ,i);
        id_bazkidea=b;
    }
    public Bazkidea(){//defektuzko balioak
        id_bazkidea="aaaa0";
    }
    public void setid_bazkidea(){
        String b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Sartu bazkidearen id zenbakia");
        b=sc.nextLine();
        id_bazkidea=b;
    }
    public void setid_bazkidea(String b){//gainkargatua
        id_bazkidea=b;
    }
    public void getid_bazkidea(){
        System.out.println("Hau da bazkidearen id zenbakia: \n"+id_bazkidea);
    }
    public void getAll(){
        super.getall();
        getid_bazkidea();       
    }
}
