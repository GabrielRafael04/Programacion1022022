/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment9;

/**
 *
 * @author fundacion
 */
class Utility {
    
    public static String[] Repeated(String frase){
        String parts[] = frase.split(" ");
        String lista[] = frase.split(" ");
        int tamaño = parts.length;
        String result = "";
        int moreRepet = 0;
 
        for (int i = 0; i < tamaño; i++){
            int contador = 0;
            String palabra = parts[i];
 
            for (int t = 0; t < tamaño; t++){
                if (palabra.equalsIgnoreCase(lista[t])){
                    contador++;
                    parts[t] = "";
                }
            }
            if ((contador > 1)&& (contador > moreRepet)){
                result = palabra;
                moreRepet = contador;
            }
            else if ((contador > 1)&& (contador == moreRepet)){
                result += " " + palabra;
            }       
        }
        String repeticion = moreRepet +"";
        String resultado[] = {result, repeticion};
        return resultado;
    }
    
}
