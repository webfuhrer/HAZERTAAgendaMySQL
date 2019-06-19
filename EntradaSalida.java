
package agendamysql;

import java.util.ArrayList;
import java.util.Scanner;

/*Comentario para probar el github*/
class EntradaSalida {
static final int INSERTAR=1;
static final int LISTAR=2;
static final int BUSCAR=3;
static final int SALIR=4;

    static int mostrarMenu() {
        Scanner sc=new Scanner(System.in);
        System.out.println(INSERTAR+"-Insertar contacto");
        System.out.println(LISTAR+"-Listar contactos");
        System.out.println(BUSCAR+"-Buscar contacto");
        System.out.println(SALIR+"-Salir");
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

    static void mostrarContactos(ArrayList<Contacto> lista) {
        if (lista.size()==0)
        {
            System.out.println("No se han encontrado datos");
        }
        else
        {
            for(Contacto c: lista)
            {
                System.out.println(c);
            }
        }
    }
    
}