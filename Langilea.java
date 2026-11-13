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
public class Langilea extends Pertsona{//oinordetzan jaso 
    private String id_langilea;
    public Langilea(String n, String a, String i, String l){
        super (n, a ,i);
        id_langilea=l;
    }
     public Langilea(){//defektuzko balioak
        id_langilea="aaaa0";
    }
     
    public void setid_langilea(){
        String l;
        Scanner sc=new Scanner(System.in);
        System.out.println("Sartu langilearen id zenbakia");
        l=sc.nextLine();
        id_langilea=l;
    }
    public void setid_langilea(String l){//gainkargatua
        id_langilea=l;
    }
    public void getid_langilea(){
        System.out.println("Hau da langilearen id zenbakia: \n"+id_langilea);
    }
    public void getAll(){
        super.getall();
        getid_langilea();      
    }
}
