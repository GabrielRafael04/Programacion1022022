/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author 59169
 */
public class tresEnRaya {
    
    public static void main(String[] args) {
        char[][] tablero =Parte3.crearTablero();
        char jugador1 = 'O';
        char jugador2 = 'X';
        Parte3.mostrar(tablero);
        boolean jugable = Parte3.end(tablero);
        int contador = 0;
        while(jugable==false){
            Scanner entrada = new Scanner(System.in);
            if(contador==0){
                System.out.println("Ingrese la fila de su jugada");
                int fila = entrada.nextInt();
                System.out.println("Ingrese la columna de su jugada");
                int columna = entrada.nextInt();
                int[] posicion ={fila, columna};
            
                tablero = Parte3.placeMark(tablero, posicion , jugador1);
                Parte3.mostrar(tablero);
                jugable = Parte3.end(tablero);
                contador++;
            }
            else{
                System.out.println("Ingrese la fila de su jugada");
                int fila = entrada.nextInt();
                System.out.println("Ingrese la columna de su jugada");
                int columna = entrada.nextInt();
                int[] posicion ={fila, columna};
            
                tablero = Parte3.placeMark(tablero, posicion , jugador2);
                Parte3.mostrar(tablero);
                jugable = Parte3.end(tablero);
                contador--;
            }
        }
    }
    
}
