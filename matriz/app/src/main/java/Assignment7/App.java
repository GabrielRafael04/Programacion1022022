/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Assignment7;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        
        
        
        int option = 0;
        int[][] matriz = new int[4][4];
        while(option!=7){
            
            System.out.println("MENU");
            System.out.println("1.- Rellenar la matriz.");
            System.out.println("2.- Sumar una fila.");    
            System.out.println("3.- Sumar una columna.");    
            System.out.println("4.- Sumar la diagonal principal.");
            System.out.println("5.- Sumar la diagonal inversa.");
            System.out.println("6.- Sacar media de los valores.");
            System.out.println("7.- Salir.");
            
            option = Integer.parseInt(JOptionPane.showInputDialog("Selecione una opcion"));
            //Scanner entrada = new Scanner(System.in);                
            if(option == 1){
                matriz = Parte1.fill(matriz);
                //int[][] matriz2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
                //matriz = matriz2;
            }       
            if(option == 2){
                int fila = Integer.parseInt(JOptionPane.showInputDialog("Que fila se sumara?"));
                int suma1 = Parte1.sumarFila(matriz, fila);
            }
            if(option == 3){
                int columna = Integer.parseInt(JOptionPane.showInputDialog("Que columna se sumara?"));
                int suma1 = Parte1.sumarColumna(matriz, columna);
            }
            if(option ==4){
                int principal = Parte1.sumaDiagonal(matriz);
            }
            if(option ==5){
                int suma2 = Parte1.sumaInversa(matriz);
            }
            if(option ==6){
                int suma3 = Parte1.media(matriz);
            }
        }
        
        //int[][] matriz = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        //int[][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    
    }   
}