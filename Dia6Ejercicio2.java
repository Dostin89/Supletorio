
import java.util.Scanner;

public class Dia6Ejercicio2 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("INGRSE EL ABECEDARIO EN LETRA MAYUSCULAS");
        
        for (char letra = 'A'; letra <= 'Z'; letra ++) {
            
            System.out.println(letra + "");
            
            System.out.println("\nabecedario en minusculas"); 
            
            for (char letramenor = 'a'; letramenor <= 'z'; letramenor ++) {
                System.out.println(letramenor + "");
                
            }
        }
    }
}
