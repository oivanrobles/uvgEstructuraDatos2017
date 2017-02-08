/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;
import EjercicioRadio.*;

import java.io.Console;

/**
 *
 * @author OscarIvan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Lista<String> miLista = new Lista<>();        
        miLista.AgregarNodo("hello ");
        miLista.AgregarNodo("from ");
        miLista.AgregarNodo("the ");
        miLista.AgregarNodo("other ");
        miLista.AgregarNodo("side ");
        System.out.println(miLista);
        
        Lista<MemoryBoton> ListaBotones = new Lista<MemoryBoton>();       
        
        ListaBotones.AgregarNodo(new MemoryBoton("AM","530"));
        ListaBotones.AgregarNodo(new MemoryBoton("FM","96.5"));
        ListaBotones.AgregarNodo(new MemoryBoton("AM","540"));        
        System.out.println( ListaBotones);
        
        Lista<Radio> ListaRadios = new <Radio> Lista();
        ListaRadios.AgregarNodo(new Radio(12));
        ListaRadios.AgregarNodo(new Radio(10));
        ListaRadios.AgregarNodo(new Radio(8));
        
        System.out.println( ListaRadios);
                       
        Lista<Lista> Matriz = new Lista<Lista>();        
        Matriz.AgregarNodo(ListaBotones);
        Matriz.AgregarNodo(ListaRadios);
        System.out.println(Matriz);
        
        
        //Lista ListaBotones = new <
        Queue<Integer> Q = new Queue<Integer>();
        Q.Enqueue(9);
        Q.Enqueue(6);
        Q.Enqueue(7);
        Q.Enqueue(8);
        
        System.out.println(Q.toString());
        System.out.println(Q.Dequeue().toString());
        System.out.println(Q.toString());
        System.out.println(Q.Dequeue().toString());
        System.out.println(Q.toString());
        System.out.println(Q.Dequeue().toString());
        System.out.println(Q.toString());
        
        
        
        Stack <Boolean> S = new Stack<Boolean>();
        
        S.Push(true);
        S.Push(false);
        S.Push(false);
        S.Push(true);
        
        System.out.println(S.toString());

        System.out.println(S.Pop().toString());
        System.out.println(S.toString());
        System.out.println(S.Pop().toString());
        System.out.println(S.toString());
        System.out.println(S.Pop().toString());
        System.out.println(S.toString());
        
        Matriz.AgregarNodo(miLista);
        Matriz.AgregarNodo(miLista);
        
        Lista L = new Lista();
        L.AgregarNodo(5);
        L.AgregarNodo(6);
        L.AgregarNodo(7);
        
        System.out.println(L.toString());
        System.out.println(L.EliminarNodo().toString());
        System.out.println(L.toString());
        System.out.println(L.EliminarNodo().toString());
        System.out.println(L.toString());
        System.out.println(L.EliminarNodo().toString());
        System.out.println(L);
        
        
        System.out.println("-------------Lista Doble-----------------");
        ListaDoble LD = new ListaDoble();
        LD.AgregarNodo(5);
        LD.AgregarNodo(6);
        LD.AgregarNodo(7);
        LD.AgregarNodo("hola");
        System.out.println(LD.toString());
        
        
        System.out.println(LD.EliminarNodo().toString());
        System.out.println(LD.toString());
        System.out.println(LD.EliminarNodo().toString());
        System.out.println(LD.toString());
        System.out.println(LD.EliminarNodo().toString());
        System.out.println(LD.toString());
        System.out.println("-------------Lista Circular-----------------");
/*
        ListaCircular LC = new ListaCircular();
        LC.AgregarNodo(5);
        LC.AgregarNodo(6);
        LC.AgregarNodo(7);
        System.out.println(LC.toString());
        
        System.out.println(LC.EliminarNodo().toString());
        System.out.println(LC.toString());
        System.out.println(LC.EliminarNodo().toString());
        System.out.println(LC.toString());
        System.out.println(LC.EliminarNodo().toString());
        System.out.println(LC.toString());
        // TODO code application logic here
               
               */
        
       
        
    }
    
}
