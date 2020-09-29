package ordenamiento;


public class Ordenamiento {

    public static void main(String[] args) {
        LeerArchivoTxt arch = new LeerArchivoTxt(); //Creamos un objeto de la clase LeerArchivoTxt
        
        String oracion = arch.leerarchivo("C:\\Users\\Paloma\\Desktop\\Oracion.txt");//Obtenemos la cadena del txt
        
        System.out.println("Texto del archivo: " + oracion);//Mostramos a pantalla el contenido del txt
        
        //Separar la cadena y almacenarla
        String[] arr1 = oracion.split(","); //Utilizamos como delimitador la ","
        String[] correcto = {"Por", "morder", "la", "cazuela", "jaja"};//Frase ordenada de manera correcta
        String[] arr1aux = oracion.split(",");//Arreglo auxiliar de la frase desordenada para evitar que palabras desaparezcan
        String aux = "";//Auxiliar para las palabras
        
        //Ordenar arreglo
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1.length; j++){ 
                if(arr1[i].equals(correcto[j])){//El arreglo en la posición i se compara con la posición j del arreglo "correcto", si son iguales...
                    arr1aux[j] = correcto[j];//El arreglo auxiliar en la posicion j, guarda la palabra del arreglo "correcto" que se está evaluando en ese momento 
                }
                
            }
        }
        
        //Imprimimos el arreglo ordenado
        for(int i = 0; i < arr1.length; i++){
            aux = aux + arr1aux[i];//Utilizando un auxiliar, guardamos cada palabra ordenada previamente por los ciclos for anteriores
            aux = aux + " ";//Colocamos entre cada palabra un espacio en blanco, para que no se junten las palabras, esto es por estética jaja
        }
        System.out.println("Texto ordenado: " + aux);//Imprimimos a pantalla cada palabra de la oración ya ordenada
    }
    
}
