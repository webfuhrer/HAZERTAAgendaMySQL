
package agendamysql;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class EntradaSalida {

    static int mostrarMenu() {
        Scanner sc=new Scanner(System.in);
        System.out.println("1-Insertar contacto");
        System.out.println("2-Listar contactos");
        System.out.println("3-Buscar contacto");
        System.out.println("4-Salir");
        int opcion=sc.nextInt();
        return opcion;
    }

   
    static String pedirNombreUsuario()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el nombre");
        String nombre=sc.nextLine();
        return nombre;
    }

   
    static Contacto pedirContacto() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el nombre:");
        String nombre=sc.nextLine();
        System.out.println("Introduzca el apellido:");
        String apellido=sc.nextLine();
        System.out.println("Introduzca el email:");
        String email=sc.nextLine();
        Contacto c=new Contacto(nombre, apellido, email);
        return c;
        
        
    }
    
}