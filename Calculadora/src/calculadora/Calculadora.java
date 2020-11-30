package calculadora;
import java.util.Scanner;
/**
 *
 * @author azofe
 */
public class Calculadora {

    public static void main(String[] args) {
        
        boolean salir = false;
        while(!salir){
            
            Scanner entrada = new Scanner(System.in);
            System.out.println("Seleccione una Opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccionar Opción: ");
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
                result = num1 + num2;
                System.out.println("");
                System.out.println("El resultado de la operación es: "+result);
                System.out.println("");
              break;
            case "2":
                System.out.println("Ingrese el primer número de la resta.");
                num1=entrada.nextFloat();
                System.out.println("Ingrese el segundo número de la resta.");
                num2=entrada.nextFloat();
                result = num1 - num2;
                System.out.println("");
                System.out.println("El resultado de la operación es: "+result);
                System.out.println("");
              break;
            case "3":
                System.out.println("Ingrese el primer número de la multiplicación.");
                num1=entrada.nextFloat();
                System.out.println("Ingrese el segundo número de la multiplicación.");
                num2=entrada.nextFloat();
                result = num1 * num2;
                System.out.println("");
                System.out.println("El resultado de la operación es: "+result);
                System.out.println("");
              break;
            case "4":
                System.out.println("Ingrese el primer número de la división.");
                num1=entrada.nextFloat();
                System.out.println("Ingrese el segundo número división.");
                num2=entrada.nextFloat();
                if(num2 != 0){
                    result = num1 / num2;
                    System.out.println("");
                    System.out.println("El resultado de la operación es: "+result);
                    System.out.println("");
                }else{
                    System.out.println("");
                    System.out.println("División inválida");
                    System.out.println("");
                }
              break;
            case "5":
                salir = true;
                System.out.println("");
                System.out.println("Gracias por usar la Calculadora");
                System.out.println("");
                
              break;
              default:
                System.out.println("");
                System.out.println("No se reconoce la opción.");
                System.out.println("");
            }
        }
        
    }
    
}
