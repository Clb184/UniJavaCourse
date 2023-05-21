/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.pe.utp.laboratorio08;
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner hoge = new Scanner(System.in);
        
        //Nombre, cantidad de conductores, etc
        String name = "";
        int cnt, tamnt;
        
        //Otras variables para máximos y mínimos
        String maxAmntStr = "";
        int maxAmntOverall = 0;
        
        System.out.print("Ingrese la cantidad de camioneros: "); cnt = hoge.nextInt();
        for(int i = 0; i < cnt; i++){
            int maxAmntTrip = 0, minAmntTrip = 65536, amnt;
            System.out.print("Ingrese el nombre del camionero: "); name = hoge.next();
            System.out.print("Ingrese la cantidad de viajes: "); tamnt = hoge.nextInt();
            for(int j = 0; j < tamnt; j++){
                System.out.print("Ingrese la carga del viaje " + (j + 1) + ": "); amnt = hoge.nextInt();
                if(amnt > maxAmntTrip)
                    maxAmntTrip = amnt;
                if(amnt < minAmntTrip)
                    minAmntTrip = amnt;
            }
            
            if(maxAmntTrip > maxAmntOverall){
                maxAmntOverall = maxAmntTrip;
                maxAmntStr = name;
            }
        }
        System.out.print("Mayor carga es de " + maxAmntOverall + " de " + maxAmntStr);
    }
}
