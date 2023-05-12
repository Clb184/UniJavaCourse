/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.pe.utp.laboratorio07;
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner hoge = new Scanner(System.in);
        
        //Input number
        int num, topMost, evenSum, oddSum;
        
        //Digits
        int m, d, c, u;
        
        //Flag
        boolean end = false;
        
        do{
            topMost = 0;
            do{
                System.out.print("Ingrese un número de 4 cifras: "); num = hoge.nextInt();
                end = num == 1000 || num == 9999;
                if(num < 1000 || num > 9999)
                    System.out.print("El número ingresado es inválido.\n");
            } while(num < 1000 || num > 9999); 
            if(!end){
                evenSum = 0;
                oddSum = 0;
                m = num / 1000;
                c = (num / 100) % 10;
                d = (num / 10) % 10;
                u = num % 10;
                
                //Can't use a for loop here :(
                if(m > topMost)
                    topMost = m;
                if(c > topMost)
                    topMost = c;
                if(d > topMost)
                    topMost = d;
                if(u > topMost)
                    topMost = u;
                
                if((m % 2) == 0)
                    evenSum += m;
                else
                    oddSum +=m;
                
                if((c % 2) == 0)
                    evenSum += c;
                else
                    oddSum +=c;
                
                if((d % 2) == 0)
                    evenSum += d;
                else
                    oddSum +=d;
                
                if((u % 2) == 0)
                    evenSum += u;
                else
                    oddSum +=u;
                
                System.out.print("La suma de pares es: " + evenSum + "\n");
                System.out.print("La suma de impares es: " + oddSum + "\n");
                System.out.print("El mayor dígito del número ingresado es: " + topMost + "\n");
                
            }
            
        }while(!end);
    }
}
