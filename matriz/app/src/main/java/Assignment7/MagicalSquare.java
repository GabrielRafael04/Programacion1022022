/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment7;

/**
 *
 * @author 59169
 */
public class MagicalSquare {
    
    public static void main(String[] args) {
        
        //solo encontre la forma de hacer con impares
        
        int tamañoImpar = 5;
        //Square.magicSquare(tamañoImpar);
        
        int n = tamañoImpar;  
        int i_ant = 0;
        int j_ant = 0;
        int punto_ini = n/2;
        int[][] matrizMagica = new int [n][n];
        int temp = 1;
        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < n ; j++){
            matrizMagica[i][j] = 0;
            }
        }
         
        int i = 0;
        int j = punto_ini;
        while (temp != (n*n)+1){             
            if(matrizMagica[i][j] == 0) {
                matrizMagica[i][j] = temp;
            }
            else{
                i = i_ant +1;
                j = j_ant;
               matrizMagica[i][j]=temp;
            }
            
            i_ant = i;
            j_ant = j;
            
            temp++;
            j++;
            i--;
            if(i<0 && j==n){ // esquina superior derecha
               i = n -1;
               j = 0;
            }
            else if( i < 0){ // fila -1
                i = i + n;
            }
            else if(j==n){ //columna igual a n 
                j = 0;
            }   
        }
        
        for(int x = 0 ; x < n ; x++){
            String result = "";
            for (int k = 0; k < n; k++) {
                result = result + "  " + matrizMagica[x][k];
            }
            System.out.println("" + result); 
        }
        
        
        
    }
    
}
