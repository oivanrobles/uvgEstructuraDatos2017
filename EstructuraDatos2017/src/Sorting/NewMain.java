/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;
import Listas.*;
import EjercicioRadio.MemoryBoton;

/**
 *
 * @author OscarIvan
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        // TODO code application logic here
        String [] texto = new String[5];
        texto[0]= "hello";
        texto[1]= "from";
        texto[2]= "the ";
        texto[3]= "other";
        texto[4]= "side";       
        
        Sorting.selectionSort(texto);
        for (int i =0; i< 5; i++)
        {
            System.out.println(texto [i]);
        }
                
                
        Contact[] Agenda = new Contact[5];
        Agenda[0] = new Contact("Juan", "Martinez","12345678");
        Agenda[1] = new Contact("Pedro", "Gomez","12345678");
        Agenda[2] = new Contact("Esteban", "Gonzalez","12345678");
        Agenda[3] = new Contact("Maria", "Morazan","12345678");
        Agenda[4] = new Contact("Carla", "Solis","12345678");
        
        Sorting.selectionSort(Agenda);
        
        for (int i =0; i< 5; i++)
        {
            System.out.println(Agenda[i]);
        }
        
        MemoryBoton[] ABotones = new MemoryBoton[5];
        
        ABotones[0] =(new MemoryBoton("AM","530"));
        ABotones[1] =(new MemoryBoton("FM","96.5"));
        ABotones[2] =(new MemoryBoton("AM","540"));
        ABotones[3] =(new MemoryBoton("AM","560"));
        ABotones[4] =(new MemoryBoton("FM","94.9"));
        
        Sorting.selectionSort(ABotones);
        for (int i =0; i< 5; i++)
        {
            System.out.println(ABotones [i]);
        }        
            
    }
    
}
