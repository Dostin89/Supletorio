
import java.util.Scanner;

/**
 * *
 * Ejercicio: "Gestor de Inventario" Descripción: Crea un programa en Java que
 * permita gestionar el inventario de una tienda. El programa debe:
 *
 * Pedir al usuario cuántos productos va a registrar. Pedir el nombre y la
 * cantidad disponible de cada producto. Mostrar un resumen con todos los
 * productos y sus cantidades. Verificar si hay productos con stock bajo (menos
 * de 5 unidades) y advertir al usuario. Requisitos: ✅ Usa un Array o ArrayList
 * para almacenar los productos. ✅ Usa un ciclo for o while para el ingreso de
 * datos. ✅ Usa un if para verificar el stock bajo. ✅ Usa Scanner para la
 * entrada de datos.
 *
 * @author IK
 */
public class dia6ClaseDeSupletorio {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("¿CUANTOS PRODUCTO VA A INGRSAR");
        int numDeProducto = tcl.nextInt();
        tcl.nextLine();

        String[] producto = new String[numDeProducto];
        int[] cantidad = new int[numDeProducto];
        
         for (int i = 0; i < numDeProducto; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            producto [i] = tcl.nextLine();
            
            do {
                System.out.print("Ingrese la cantidad disponible de " + producto[i] + ": ");
                cantidad[i] = tcl.nextInt();
                tcl.nextLine(); 

                if (cantidad[i] < 0) {
                    System.out.println("❌ La cantidad no puede ser negativa. Inténtalo de nuevo.");
                }
            } while (cantidad[i] < 0);
        }

        System.out.println("\n Inventario de la tienda:");
        boolean hayStockBajo = false;

        for (int i = 0; i < numDeProducto; i++) {
            System.out.println(" --- " + producto[i] + ": " + cantidad[i] + " unidades");

            if (cantidad[i] < 5) {
                System.out.println("cantidad baja de stock:" + producto[i]);
                hayStockBajo = true;
            }
        }
        if (hayStockBajo) {
            System.out.println("EL STOCK ESTA BAJO");
        } else {
            System.out.println("STOCK LIBRE");
        }
        System.out.println("\n\n\nGracias por su compra ");
    }
}
