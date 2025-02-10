
import java.util.Scanner;


public class operadorTernario {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double promedio;
        String condicionFinal;
        System.out.println("Igrese el promedio del alumno");
        promedio = tcl.nextDouble();
        
        condicionFinal = (promedio >=6) ? "Aprobado" : "Desaprobado";
        System.out.println("El promdeio final del alumno es:" + condicionFinal + "\nEl promedio final:" + promedio);
    }
  
}
