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
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner hoge = new Scanner(System.in);
        //Factor que se irá toggleando en cada ciclo
        int fact = 1;
        
        //Acumulador + cantidad de ciclos
        int cnt;
        double tot = 0.0;
        
        System.out.print("Ingrese la cantidad de números a sumar: "); cnt = hoge.nextInt();
        for(int i = 0; i < cnt; i++){
            tot += (4.0 /(1.0 + i * 2.0)) * fact;
            fact = -fact;
        }
        System.out.print("Total de la suma: " + tot);
    }
}
