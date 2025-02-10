
import java.util.Scanner;

/***
 * Ejercicio: "Calculadora de Notas"
Descripción:
Crea un programa en Java que lea n calificaciones de estudiantes, donde n es el número de estudiantes ingresados por el usuario. El 
* programa debe calcular el promedio de las calificaciones y determinar si el estudiante ha aprobado o reprobado en base al promedio. 
* Las condiciones para aprobar son:

Si el promedio es mayor o igual a 6, el estudiante aprueba.
Si el promedio es menor a 6, el estudiante reprueba.
Pasos a seguir:
Pedir al usuario cuántas calificaciones se van a ingresar (esto será el número de estudiantes).
Pedir la calificación de cada estudiante.
Calcular el promedio de las calificaciones.
Usar un ciclo para repetir la entrada de calificaciones.
Usar un if-else para verificar si el promedio es suficiente para aprobar o reprobar.
Imprimir el resultado para cada estudiante al final.
Requisitos:
Usa un ciclo for o while para ingresar las calificaciones.
Usa un if-else para verificar el resultado (aprobar o reprobar).
 * @Dostin Maza =(
 */
import java.util.Scanner;

public class dia5DeClaseDeRecuperacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int cantidadCalificaciones, calificacionEstudiante; 
        double calificacionTotal = 0;

        System.out.println("¿Cuántas calificaciones se van a ingresar?");
        cantidadCalificaciones = tcl.nextInt();

        for (int i = 0; i < cantidadCalificaciones; i++) {
            System.out.println("Ingrese la calificación del estudiante " + (i + 1));
            calificacionEstudiante = tcl.nextInt();

            calificacionTotal += calificacionEstudiante;
        }
        double promedio = calificacionTotal/cantidadCalificaciones;

        System.out.println("La calificación total es: " + promedio);
        if (promedio >= 6) {
            System.out.println("APROBADO");  
        }else{
            System.out.println("REPROBADO");
            int materiasQuedadas = 0;
            if(materiasQuedadas > 5){
                System.out.println("Materias quedadas son de"+ materiasQuedadas);
            }else
                System.out.println("no te quedas en ninguna materia");
                materiasQuedadas = tcl.nextInt();
            }
                
            }
          
        }
    

