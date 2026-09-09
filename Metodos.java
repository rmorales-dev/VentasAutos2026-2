import java.util.Scanner;
import java.util.Stack;
public class Metodos {
    public Stack<ObjVentaCarros> IngresarCarro(Stack<ObjVentaCarros> pila, Scanner sc, Metodos m)
    {
        boolean continuar = true;
        while (continuar) {
            ObjVentaCarros o = new ObjVentaCarros();
            System.out.println("Ingrese la placa del vehiculo: ");
            o.setPlaca(m.ValidarString(sc));
            System.out.println("Ingrese el modelo del vehiculo");
            o.setModelo(m.ValidarEntero(sc));
            System.out.println("Ingrese la marca");
            o.setMarca(m.ValidarString(sc));
            System.out.println("Ingrese el valor del vehiculo");
            o.setValor(sc.nextDouble());
            System.out.println("Presione 1 si desea agregar otro vehiculo, para salir preisones 2");
            int opt=m.ValidarEntero(sc);
            if (opt == 2) {
                continuar = false;
            }
            return pila;
        }
    }

    public String ValidarString(Scanner sc)
    {
        while (!sc.hasNext()) {
            System.out.println("Por favor ingrese un valor alfa numerico");
            sc.next();
        }
        return sc.next();
    }
    public int ValidarEntero(Scanner sc)
    {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor tenga en cuenta ingresar el modelo en años");
            sc.next();
        }
        return sc.next();
    }
}
