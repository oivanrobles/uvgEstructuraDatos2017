/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

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
        BST<Integer> Arbol = new BST<>();
        Arbol.Insert(12);        
        Arbol.Insert(10);
        Arbol.Insert(21);
        Arbol.Insert(18);
        Arbol.Insert(9);
        
       System.out.println( Arbol.ImprimirPreOrden());
        
//        int resultado = Factorial (4);
//        System.out.println(resultado);
    }
    
    public static int Factorial(int n)
    {
        if (n == 0)
            return 1;
        return n * Factorial(n -1);
    }
}
