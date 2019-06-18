/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendamysql;

/**
 *
 * @author Admin
 */
public class AgendaMySQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=EntradaSalida.mostrarMenu();
        
        while(opcion!=4)
        {
            switch(opcion)
            {
                case 1:
                    //Codigo insercion
                    Contacto c=EntradaSalida.pedirContacto();
                    boolean estado_correcto=AccesoBD.grabarContacto(c);
                    if(estado_correcto==true)
                    {
                        System.out.println("El contacto se grabó correctamente");
                    }
                    else
                    {
                        System.out.println("Error al grabar el contacto");
                    }
                    
                    break;
                case 2: 
                    //Codigo listar
                    ArrayList<Contacto> lista=AccesoBD.recuperarContactos();
                    EntradaSalida.mostrarContactos(lista);
                    break;
                case 3:
                    //Codigo buscar
                    String nombre_buscado=EntradaSalida.pedirNombreUsuario();
                    ArrayList<Contacto> lista_buscados=AccesoBD.buscarPorNombre(nombre_buscado);
                    EntradaSalida.mostrarContactos(lista_buscados);
                    break;
                    
                    
                    
            }
         opcion=EntradaSalida.mostrarMenu();
        }
        
    }
    
}
