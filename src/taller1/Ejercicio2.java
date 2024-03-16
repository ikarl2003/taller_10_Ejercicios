
package taller1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        System.out.println("Digite su contraseña a guardar =>");
        Scanner teclado = new Scanner(System.in);
        String contrasena = teclado.nextLine();
        
        System.out.println("Digite su contraseña de nuevo=>");
        Scanner teclado1 = new Scanner(System.in);
        String conficontrasena = teclado1.nextLine();
        
        if (contrasena==conficontrasena) {
            System.out.println("Su contraseña es correcta ");
            
        } else {
            System.out.println("Su contraseña es incorrecta");
        }
        

                
  
    }
    
}
