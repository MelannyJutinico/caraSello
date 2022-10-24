/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carasello;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Meru
 */
public class CaraSello {
    
    public int juegoCaraSello(){
        Random rand = new Random();
        int tirarMoneda = Math.abs(rand.nextInt()) % 2;
        
        return tirarMoneda;
    }
    
    
    
    public static void main(String[] args) {
        CaraSello c1 = new CaraSello();
        int juego = c1.juegoCaraSello();
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        
        if (c1.juegoCaraSello() == opcion) {
             System.out.println("Ganaste");
        }else if(c1.juegoCaraSello() != opcion){
            System.out.println("Perdiste");
        }
        
    }
    
}
