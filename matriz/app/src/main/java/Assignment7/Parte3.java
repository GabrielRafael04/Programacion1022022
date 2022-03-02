/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment7;

public class Parte3 {
    
    public static char[][] crearTablero(){
        char vacio = '-';
        char[][] tablero ={{vacio,vacio,vacio},{vacio,vacio,vacio},{vacio,vacio,vacio}};
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.print("");
        }        
        return tablero;
    }
    
    public static char[][] placeMark(char[][] tablero, int[] position, char mark){
        int contador = 0;
        char vacio = '-';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(tablero[i][j] == vacio){
                    contador++ ;
                }
            }
        }
        
        int[][] libres = new int [contador][2];
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(tablero[i][j] == vacio){
                    int[] posicion = {i,j} ;
                    libres[contador-1] = posicion;
                    contador--;
                }
            }
        }
        boolean posible= false;
        for (int i = 0; i < libres.length; i++) {
            if(libres[i][0]==position[0] && libres[i][1]==position[1]){
                posible = true;
            }
            //else{
              //  posible = false;
            //}
        }
        
        if(posible == false){
            System.out.println("la posicion no esta disponible");
            return tablero;
        }
        tablero[position[0]][position[1]] = mark;
        return tablero;
    }
    
    public static void mostrar(char[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
           
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(" "+tablero[i][j]+" ");
                if(j <tablero.length-1){
                    System.out.print("|");                
                }                
            }
            if(i<tablero.length-1){
                System.out.println("");
                System.out.println("---+---+---");
            }
        }
        System.out.println("");
    }
    //terminar el juego
    public static boolean end(char[][] tablero){
        int contador = 0;
        char vacio = '-';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(tablero[i][j] == vacio){
                    contador++ ;
                }
            }
        }
        
        boolean triple = false;
        
        if(contador==0){
            triple = true;
            return triple;
        }
        
        for (int i = 0; i < tablero.length; i++) {
            
            if(tablero[i][0]==tablero[i][1] && tablero[i][0]==tablero[i][2] ){
                if(tablero[i][0]!=vacio){
                    triple = true;}
                else{
                triple = false;
            }
            }
            
            if(tablero[0][i]==tablero[1][i] && tablero[0][i]==tablero[2][i]){
                if(tablero[0][i]!=vacio){
                    triple = true;}
                else{
                triple= false;
            }
            }
            
            if(tablero[0][0]==tablero[1][1] && tablero[0][0]==tablero[2][2]){
                if(tablero[0][0]!=vacio){
                    triple = true;}
                else{
                triple= false;
            }
            }
            
            if(tablero[0][2]==tablero[1][1] && tablero[0][2]==tablero[2][0]){
                if(tablero[0][2]!=vacio){
                    triple = true;}
                else{
                triple= false;
            }
            }
            
        }
        return triple;
        
    }

}
