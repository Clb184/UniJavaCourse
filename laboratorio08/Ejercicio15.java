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
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner hoge = new Scanner(System.in);
        
        //Cantidad de ciclos y acumulador
        int cnt;
        int tot = 0;
        
        System.out.print("Ingrese el número: "); cnt = hoge.nextInt();
        
        //Comenzaremos con el "final"
        System.out.print("La suma de los dívisores ");
        for(int i = 1; i < cnt; i++){
            if(cnt % i == 0){
                tot += i;
                System.out.print(i + ", ");
            }
        }
        tot += cnt;
        System.out.print("y " + cnt + " es: " + tot);
    }
}
