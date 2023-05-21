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
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner hoge = new Scanner(System.in);
        
        //Acumulador y el límite de ciclos
        double tot = 1.0;
        int cnt;
        
        System.out.print("Ingrese la cantidad de veces a multiplicar: "); cnt = hoge.nextInt();
        for(int i = 0; i < cnt; i++){
            tot *= ((i + 1) / ((i + 1) * 2.0));
        }
        System.out.print("Total de la multiplicación: " + tot);
    }
}
