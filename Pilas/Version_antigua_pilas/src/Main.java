import Implementacion.Estrategia_1;
import Implementacion.Estrategia_2;
import Implementacion.Estrategia_3;
import Interfaces.PilaTDA;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        PilaTDA p1 = new Estrategia_1();
        PilaTDA p2 = new Estrategia_2();
        PilaTDA p3 = new Estrategia_3();
        editorCodigo(p3);
    }

    public static void probarPila(String nombre, PilaTDA pila) {
        System.out.println("=== " + nombre + " ===");

        pila.InicializarPila();

        pila.Apilar(10);
        pila.Apilar(20);
        pila.Apilar(30);

        System.out.println("Tope luego de apilar 10, 20, 30: " + pila.Tope());

        pila.Desapilar();
        System.out.println("Tope luego de desapilar una vez: " + pila.Tope());

        pila.Desapilar();
        System.out.println("Tope luego de desapilar otra vez: " + pila.Tope());

        pila.Desapilar();
        System.out.println("¿Pila vacía?: " + pila.PilaVacia());

        System.out.println();
    }

    public static void historialNavegacion(PilaTDA pila) {
        pila.InicializarPila();
        pila.Apilar(1); //fi.uba.ar
        pila.Apilar(2); //campus.utn.edu.ar
        pila.Apilar(1); //stackoverflow.com
        System.out.println("Pagina Actual: " + pila.Tope());

        //Atras
        if (!pila.PilaVacia()) {
            pila.Desapilar();
            System.out.println("Atras, Pagina Actual: " + pila.Tope());
        }

    }
    public static void editorCodigo(PilaTDA pila){
        pila.InicializarPila();
        Scanner lectura = new Scanner(System.in);
        String bandera = "";
        int contador = 0;
        String ctrl_z = "Si";
        HashMap<Integer,String> lineas = new HashMap<>();
        while (bandera.isEmpty()){
            System.out.print("Introduce una linea de codigo: ");
            String codigo = lectura.nextLine();
            lineas.put(contador,codigo);
            pila.Apilar(contador);
            System.out.print("Ingrese cualquier tecla para salir o  deje vacio para seguir escribiendo lineas");
            bandera = lectura.nextLine();
            contador += 1;
        }
        System.out.println("Linea Actual: " + lineas.get(pila.Tope()));
        //El usuario toca ctrl z
        System.out.print("Desea borrar la linea actual?, responda con SI para BORRAR o con NO para MANTENER.");
        ctrl_z = lectura.nextLine();
        if (ctrl_z.equals("SI")) {
            pila.Desapilar();
            System.out.println("Linea Actual: " + lineas.get(pila.Tope()));
        }



    }
}

