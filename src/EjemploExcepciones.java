import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Ana M.Hunter on 12/10/2017.
 * Versión 2 18/10/2017
 */
public class EjemploExcepciones
{
    public static void main(String[] args) //throws FileNotFoundException
    {
        try {
            File archivo = new File("entrada.txt");
            Scanner teclado = new Scanner(archivo);
            System.out.println("Escribe el primer número:");
            int num1 = teclado.nextInt();
            System.out.println("Escribe el segúndo número:");
            int num2 = teclado.nextInt();
            System.out.print("La división es: " + num1 / num2);
        }
        catch(ArithmeticException e)
        {
          System.out.println("División por cero");
            //System.out.println(e.getMessage());
        }
        catch(InputMismatchException e)
        {
            System.out.println("Entrada incorrecta");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("No existe el archivo");
        }

    }
}
