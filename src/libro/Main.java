package libro;

import java.util.*;
public class Main {
    
    public void mayor(){
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nombre, autor;
        int id, pag;
        System.out.println("Introduzca los siguientes datos para el primer libro.");
        System.out.print("Autor del libro: ");
        autor = sc.nextLine();
        System.out.print("ISBN del libro: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre del libro: ");
        nombre = sc.nextLine();
        System.out.print("Número de páginas del libro: ");
        pag = sc.nextInt();
        
        Libro g = new Libro(id, nombre, autor, pag);
        System.out.println("Primer libro: "+g.toString());
        sc.nextLine();
        System.out.println("Introduzca los siguientes datos para el segundo libro.");
        System.out.print("Autor del libro: ");
        autor = sc.nextLine();
        System.out.print("ISBN del libro: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre del libro: ");
        nombre = sc.nextLine();
        System.out.print("Número de páginas del libro: ");
        pag = sc.nextInt();
        
        Libro j = new Libro(id, nombre, autor, pag);
        System.out.println("Segundo libro: "+j.toString());
    }
}
