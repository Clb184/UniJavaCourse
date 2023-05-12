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
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner hoge = new Scanner(System.in);
		
        //Some vars for weight
	int less55 = 0, bet55and70 = 0, more70 = 0;
        double weight, mostweightNat = 0.0, leastWeightEx = 10000.0;
		
	//Flag for ending
	boolean end;
	int hold;
		
        do{
            do{
            System.out.print("¿Es deportista nacional? [1 Si / 2 No]: "); hold = hoge.nextInt();
            if(hold != 1 && hold != 2)
                    System.out.print("Ingrese una respuesta válida.\n");
            }while(hold != 1 && hold != 2);
            
            System.out.print("Ingrese su peso (KG): "); weight = hoge.nextDouble();
            
            end = weight < 0.0;
            if(!end){
                if(weight < 55.0)
                    less55++;
                else if(weight >= 55.0  && weight <= 70.0)
                    bet55and70++;
                else if(weight > 70.0)
                    more70++;
            
            
                if(hold == 1 && weight > mostweightNat)
                    mostweightNat = weight;
                else if (hold == 2 && weight < leastWeightEx)
                    leastWeightEx = weight;
            }
	}while(!end);
        
        System.out.println("Deportistas con peso menor a 55Kg: " + less55);
        System.out.println("Deportistas con peso entre 55 y 70Kg: " + bet55and70);
        System.out.println("Deportistas con peso mayor a 77Kg: " + more70);
        System.out.println("Mayor peso de deportista nacional: " + mostweightNat);
        System.out.println("Menor peso de deportista extranjero: " + leastWeightEx);
    }
}
