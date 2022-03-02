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
public class Parte1 {
   
    static int[][] matriz = new int[4][4];
    
    public static int[][] fill(int[][] array){
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = array;
        
        System.out.println("rellene la matriz");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("matriz[ " +i+ "][ " + j+ "]");
                matriz[i][j] = entrada.nextInt();
            }
        }
        return matriz;
    }
    
    public static int sumarFila(int[][] matriz, int fila){
        
        boolean lleno = true;
        int result = 0 ;
        if(matriz[3][3] == 0 && matriz[0][0]==0){
            System.out.println("La matriz debe ser llenada");
            lleno = false;
        }
        if(fila >= matriz.length){
            System.out.println("la fila no existe");
            return 0;
        }
        if(lleno == true){
            for (int i = 0; i < matriz[fila].length; i++) {
                result = result +matriz[fila][i];
            }
        }
        System.out.println("El resultado es: "+result);
        return result;
    }
    
    public static int sumarColumna(int[][] matriz, int columna){
        
        boolean lleno = true;
        int result = 0 ;
        if(matriz[3][3] == 0 && matriz[0][0]==0){
            System.out.println("La matriz debe ser llenada");
            lleno = false;
        }
        if(columna >= matriz.length){
            System.out.println("La columna no existe");
            return 0;
        }
        if(lleno == true){
            for(int i = 0; i < matriz.length; i++) {
                result = result +matriz[i][columna];
            }
        }
        System.out.println("El resultado es: "+result);
        return result;
    }
    
    public static int sumaDiagonal(int[][] matriz){
        int result = 0;
        for (int i = 0; i < matriz.length; i++) {
            result = result + matriz[i][i];
        }
        System.out.println("El resultado es: "+result);
        return result;
    }
    
    public static int sumaInversa(int[][] matriz){
        int fila = 0;
        int columna = matriz[0].length -1;
        int result = 0 ;
        for (int i = 0; i < matriz.length; i++) {
            result = result + matriz[i][columna];
            columna--;
        }
        System.out.println("El resultado es: "+result);
        return result;
    }
    
    public static int media(int[][] matriz){
        int result = 0;
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                result = result + matriz[i][j];
                contador++ ; 
            }
        }
        result = result / contador;
        System.out.println("La media es: "+result);
        return result;
    }
}
