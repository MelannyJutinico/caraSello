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
        //un numero aleatorio, uno o cero
        Random rand = new Random();
        int tirarMoneda = Math.abs(rand.nextInt()) % 2;

        return tirarMoneda;
    }

    public static void main(String[] args) {
        
        //inicializacion de variables necesarias
        String jugarNuevamente = "si";
        float saldoTotal = 0;
        int partida = 0;
        
        do {
            //calcular en que partida voy
            partida++;
            
            //traer numero aleatorio
            CaraSello c1 = new CaraSello();
            int juego = c1.juegoCaraSello();
            

            System.out.println("Bienvenido a cara y sello");
            System.out.println("Escribe 0 para cara, 1 para sello");
            
            //opcion de cara o sello
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();
            
            //apuesta a hacer
            System.out.println("Cuanto quieres apostar?");
            float apuesta = sc.nextInt();
            
            //resultado aleatorio
            if (juego==0) {
                System.out.println("Cayó cara");
            } else if (juego == 1) {
                System.out.println("Cayó sello");
            }
            
            //ganaste o perdiste
            if (juego == opcion) {
                saldoTotal = saldoTotal + (apuesta * 2);
                System.out.println("Ganaste: "+apuesta);
            } else if (juego != opcion) {
                saldoTotal = saldoTotal - apuesta;
                System.out.println("Perdiste: "+apuesta);
            }
            
            //preguntar si se vuelve a jugar
            System.out.println("Jugar nuevamente? si/no");
            jugarNuevamente = sc.next();

        } while (jugarNuevamente.equals("si"));
        
        //fin del juego
        System.out.println("Total de veces jugado "+partida);
        System.out.println("total ganado " +saldoTotal );
    }

}
