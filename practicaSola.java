import java.util.Scanner;

public class practicaSola {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        // Matriz para almacenar la información (solo 3 columnas: Paquetes, Peso, Edad)
        String[][] matriz = new String[1][3];

        int producto;
        System.out.println("Ingresa la cantidad de paquetes en cada venta:");
        producto = tcl.nextInt();
        
        if (producto < 5) {
            System.out.println("No se permiten compras inferiores a 5");
            tcl.close();
            return; // Termina el programa si el pedido es menor a 5
        } 

        String envio;
        if (producto >= 5 && producto <= 15) {
            envio = "Costo de envío: $10";
        } else {
            envio = "Envío gratuito";
        }

        System.out.println(envio);
        System.out.println("¡¡¡¡¡¡¡Gracias por la compra!!!!!!!");

        // Ingresar el peso del paquete
        System.out.println("Ingresa el peso de su paquete:");
        double peso = tcl.nextDouble();
        String estadoPeso = (peso < 60) ? "Peso normal" : "Peso excesivo";

        // Ingresar la edad
        System.out.println("Ingresa tu edad:");
        int edad = tcl.nextInt();
        String estadoEdad;
        if (edad < 18) {
            estadoEdad = "Menor de edad - Autorización denegada";
            System.out.println(estadoEdad);
            tcl.close();
            return; // Si es menor de edad, termina el programa
        } else {
            estadoEdad = "Mayor de edad - Autorización aceptada";
            System.out.println(estadoEdad);
            System.out.println("!!!!!PAQUETE ENVIADO!!!!!!");
        }

        // Guardamos los datos en la matriz
        matriz[0][0] = "Paquetes: " + producto;
        matriz[0][1] = "Peso: " + peso + "kg (" + estadoPeso + ")";
        matriz[0][2] = "Edad: " + edad + " años (" + estadoEdad + ")";

        // Imprimir la tabla de resultados
        System.out.println("\n********** RESUMEN DE COMPRA **********");
        System.out.println("--------------------------------------------");
        System.out.printf("| %-15s | %-25s | %-35s |\n", "Paquetes", "Peso", "Edad");
        System.out.println("--------------------------------------------");
        System.out.printf("| %-15s | %-25s | %-35s |\n", matriz[0][0], matriz[0][1], matriz[0][2]);
        System.out.println("--------------------------------------------");

        tcl.close();
    }
}
