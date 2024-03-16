package taller1;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese un numero entre 0 y 9.999:");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        if (numero>=0&&numero<=9999) {
            int cantidanum = String.valueOf(numero).length();
            System.out.println("El numero "+numero+" tiene " +cantidanum+ " Numeros.");
        } else {
            System.out.println("El numero que ingrso tiene mas de 4 digitos");
        }
    }
}
