package calculadora;
import java.util.Scanner;
/**
 *
 * @author azofe
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        while(!salir){
            System.out.println("Seleccione una Opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Respuesta: ");

            String respuesta = entrada.nextLine();
            float num1 = 0;
            float num2 = 0;
            float result = 0;
            switch(respuesta) {
            case "1":
                System.out.println("Ingrese el primer número de la suma.");
                num1=entrada.nextFloat();
                System.out.println("Ingrese el segundo número de la suma.");
                num2=entrada.nextFloat();
              break;
            case "2":
                System.out.println("Ingrese el primer número.");
                num1=entrada.nextFloat();
                System.out.println("Ingrese el segundo número.");
                num2=entrada.nextFloat();
              break;
            case "3":
                System.out.println("Ingrese el primer número.");
                num1=entrada.nextFloat();
                System.out.println("Ingrese el segundo número.");
                num2=entrada.nextFloat();
              break;
            case "4":
                System.out.println("Ingrese el primer número.");
                num1=entrada.nextFloat();
                System.out.println("Ingrese el segundo número.");
                num2=entrada.nextFloat();
              break;
            case "5":
              // code block
              break;
            default:
                System.out.println("Opción no reconocida.");
          }
        }
        
    }
    
}
