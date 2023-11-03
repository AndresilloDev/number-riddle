import java.util.Random;//importa la clase Random
import java.util.Scanner;//importa la clase Scanner

public class App {
    public static void main(String[] args) {
        Random rand = new Random();//Iniciamos funcion random
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Cuantos intentos quieres?");
        int intentos = scanner.nextInt();
        System.out.print("Cuantos numeros quieres?");
        int numeros = scanner.nextInt();
        boolean adivinado = false;//Iniciamos el bolleano en falso
        int numeroAdivinar = rand.nextInt(numeros) + 1; // Genera un número aleatorio entre 1 y 10

        System.out.println("Adivina el número (entre 1 y " + numeros + "). Tienes " + intentos + " intentos");
        int i = 0; 
        while (i < intentos) {
            i++;
            System.out.print("Intento #" + (i + 1) + ": ");
            int intento = scanner.nextInt();

            if (intento == numeroAdivinar) {//Si el numero coincide con el numero random entra en este if
                adivinado = true;//Al entrar en el if cambia el valor del boleano (adivinado) a true
                break; // Sale del bucle si adivinó el número
            } else {
                System.out.println("Incorrecto. Tienes " + (intentos - i) + " intentos restantes.");

                if (intento > numeroAdivinar){ //Se le dan pistas al usuario
                    System.out.println("El numero correcto es mas chico"); 
                }else{
                    System.out.println("El numero correcto es mas grande");
                }
            }//Mensaje si el primer intento no fue correcto y vuelve a repetirse por el ciclo for hasta que se cumpla la condicion del for (i<intentos)
        }

        if (adivinado) {//Si el boleano cambio a true en el proceso anterior entra en el if para asi mandar mensaje de felicitacion
            System.out.println("¡Felicidades! Adivinaste el número " + numeroAdivinar + ".");
        } else {
            System.out.println("No adivinaste. El número era " + numeroAdivinar + ".");//Si en los 3 intentos no se pudo adivinar el numero se manda este mensaje junto con el numero que se genero en el random
        }

        scanner.close();//Cerramos libreria scanner
    }
}
