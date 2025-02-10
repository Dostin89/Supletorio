import java.util.Scanner;
public class dia6Ejercicio3 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("ADIVINARE EN QUE NUMERO PIENSAS");
        System.out.println("PON EL NUMERO QUE PIENSAS");
        int num = tcl.nextInt();
        System.out.println("tu tumero es:" + num);
        
        System.out.println("INGRESA TU PESO");
        double peso = tcl.nextDouble();
        
        if(peso <= 60){
            System.out.println("peso estable");    
        }else{
            System.out.println("peso alto");
        }
        System.out.println("peso = " + peso);
            for (int pesoo = 0; pesoo < 60; pesoo++) {
                System.out.println("pesoo altoo GORDO :"+ "=C");
                break;
        }
            System.out.println("--------------\n\n\n\n\n--------------");
    }
}
