/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
import java.util.Scanner;
public class Bekertertek {
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int a, b, terulet, kerulet;
      System.out.println("Kérem az első számot: ");
      a=sc.nextInt();
      System.out.println("Kérem a második számot: ");
      b=sc.nextInt();
      terulet=a*b;
      kerulet=2*(a+b);
      System.out.println("Kerület: "+kerulet+"m");
      System.out.println("Terület: "+terulet+"nm2");
      System.out.println("Köszönjük, hogy programunkat választotta!");
    }
    
}
