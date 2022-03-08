/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment8;

/**
 *
 * @author 59169
 */
class Assignment8 {
    public static int[] crearAle(int tamaño){
        
        int[] list = new int[tamaño];
        
        for (int i = 0; i < tamaño; i++) {
            int random = (int) (Math.random()*100);
            list[i] = random;
        }
        int[] result =new int[tamaño];
        int contador = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j <list.length; j++) {
                if(list[i]>list[j]){
                    contador ++;
                }
            }
            result[i] = contador;
            contador = 0;
        }
        return result;
    }

    

    Assignment8(String frase) {
        String list[] = frase.split(" ");
        
        for (int i = 0; i < list.length; i++) {
            String string = list[i];
            String MyString = string.replace(",", ""); 
        }
        //String list[] = frase.split(",");
        int position = 0;
        String result = "" ;
        for (int i = 0; i < list.length; i++) {
            String palabra = list[i];
            if(palabra.length()>1){
                String pri = list[i].charAt(0) + "";
                int tam = list[i].length();
                String ult = list[i].charAt(tam-1) + "";
                String penul = "";
                int tamaño = list[i].length()-2;
                if(ult.equals(",")){
                    penul = list[i].charAt(tam-2) + "";
                    tamaño = tamaño-1;
                }
                if(ult.equals(".")){
                    penul = list[i].charAt(tam-2) + "";
                    tamaño = tamaño-1;
                }
                result = result + pri;
                int[] positions =new int[palabra.length()-2];
                positions = crearAle(tamaño);
            
                for (int j = 0; j < positions.length; j++) {
                //pri = palabra.charAt(i)
                    String caracter =palabra.charAt(positions[j]+1)+"";
                    result= result + caracter;
                    //System.out.println(positions[j]);
                }
                result = result + penul +ult +  " ";
            }
            else{
                result= result + palabra+" ";
            }
        }
        System.out.println(result);
    }
    
}
