package ordenamiento;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Paloma
 */
public class LeerArchivoTxt {
    public String leerarchivo(String url){
     String texto = "";
        
        try{
            
            BufferedReader br = new BufferedReader(new FileReader(url)); //Abrimos el archivo para poder leerlo
            String aux = "";
            String buff;
           
            while((buff = br.readLine()) != null){ //Leemos el contenido dentro del txt, realiza el ciclo mientras haya texto
                
                aux = aux + buff; //Utilizamos auxiliar para almacenar de manera concatenada el texto
                
            }
            
            texto = aux; //El auxiliar sólo es útil mientras está dentro del while, guardamos dentro de texto la cadena leída
            
        } catch (FileNotFoundException ex) {//Detecta el error de no encontrar el archivo y devuelve un mensaje a pantalla
            System.out.println("No se encuentra tu archivito, sorry uwu");
        } 
        
        catch (IOException ex) { 
           
        }
        return texto;//Al ser un método String retornamos el valor texto 
        } 
    
}
