/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.pe.utp.laboratorio12;

/**
 *
 * @author sebas
 */

/*
*Calcular el monto final que paga una persona que compra un automóvil de 15000 dólares,
sabiendo que al precio de venta se aplica un impuesto del 19% por igv y un impuesto de 8% por
seguro
*/
public class CCar {
    double m_Price = 15000.0;
    double m_FPrice;
    
    public void calcPrice(){
        this.m_FPrice = this.m_Price + this.m_Price * 0.19 + this.m_Price * 0.08;
    }
    
    public void printFinalPrice(){
        System.out.print(this.m_FPrice);
    }
    
}
