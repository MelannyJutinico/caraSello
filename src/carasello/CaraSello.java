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

    public int juegoCaraSello() {
        Random rand = new Random();
        int tirarMoneda = Math.abs(rand.nextInt()) % 2;

        return tirarMoneda;
    }

    public static void main(String[] args) {
        String jugarNuevamente = "si";
        
        do {
            CaraSello c1 = new CaraSello();
            int juego = c1.juegoCaraSello();
            System.out.println(juego);
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();
            System.out.println("Cuanto quieres apostar?");
            int apuesta = sc.nextInt();
            
            if (juego == opcion) {
                System.out.println("Ganaste: "+apuesta);
            } else if (juego != opcion) {
                System.out.println("Perdiste: "+apuesta);
            }
            System.out.println("Jugar nuevamente? si/no");
            jugarNuevamente = sc.next();

        } while (jugarNuevamente.equals("si"));
    }

}
