
package taller1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        System.out.println("Digite su peso =>");
        Scanner teclado = new Scanner(System.in);
        float dato = teclado.nextFloat();
        
        System.out.println("Digite su estatura =>");
        Scanner teclado1 = new Scanner(System.in);
        float dato1 = teclado1.nextFloat();
        
        float estatura= dato1*dato1;
        
        float imc=dato/estatura;
        
        
        if (imc<16) {
            System.out.println("delgadez severa su IMC = "+imc);
            
        } else 
            if (imc>=16&&imc<17) {
                System.out.println("delgadez moderda su IMC = "+imc);
                
            } else 
            if (imc>=17&&imc<18.5) {
                System.out.println("Delgadez leve su IMC = "+imc);
                    
                } else 
                if (imc>=18.5&&imc<25) {
                    System.out.println("peso normal su IMC = "+imc);
            
        } else 
                    if (imc>=25&&imc<30) {
            System.out.println("Sobre peso su IMC = "+imc);
            
        } else 
            if (imc>=30&&imc<35) {
            System.out.println("Obesidad leve su IMC = "+imc);
            
        } else 
            if (imc>=35&&imc<40) {
            System.out.println("Obesidad moderada su IMC = "+imc);
            
        } else { 
            System.out.println("obesidad morbida su IMC = "+imc);
        }
        }
        }
   
        
   
    

