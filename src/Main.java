import lcde.ListaCircularDoblementeEnalazada;
import lcse.ListaCircularSimplementeEnlazada;
import lde.ListaDoblementeEnlazada;
import lse.ListaSimplementeEnlazada;

public class Main {
    public static void main(String[]args){
        /*
        ListaSimplementeEnlazada listaSimplementeEnlazada = new ListaSimplementeEnlazada();
        System.out.println(listaSimplementeEnlazada.estaVacia());

        listaSimplementeEnlazada.insertar(5);
        listaSimplementeEnlazada.insertar(4);
        listaSimplementeEnlazada.insertar(3);
        listaSimplementeEnlazada.insertar(2);
        listaSimplementeEnlazada.insertar(1);
        listaSimplementeEnlazada.insertar(0);


        listaSimplementeEnlazada.mostrar();

        listaSimplementeEnlazada.eliminar();
        listaSimplementeEnlazada.eliminar();

        listaSimplementeEnlazada.mostrar();




        ListaDoblementeEnlazada listaDoblementeEnlazada = new ListaDoblementeEnlazada();
        System.out.println(listaDoblementeEnlazada.estaVacia());

        for (int i = 20; i > 0 ; i--) {
            listaDoblementeEnlazada.insertar(i);

        }
        System.out.println(listaDoblementeEnlazada.estaVacia());
        listaDoblementeEnlazada.mostrarAdelante();

        listaDoblementeEnlazada.eliminar();
        listaDoblementeEnlazada.eliminar();

        listaDoblementeEnlazada.mostrarAdelante();
        listaDoblementeEnlazada.mostrarAtras();


        ListaCircularSimplementeEnlazada listaCircularSimplementeEnlazada = new ListaCircularSimplementeEnlazada();
        System.out.println(listaCircularSimplementeEnlazada.estaVacia());
        System.out.println(listaCircularSimplementeEnlazada.tamaño());

        for (int i = 1; i <= 12; i++) {
            listaCircularSimplementeEnlazada.insertarFin(i);
        }
        listaCircularSimplementeEnlazada.mostrar();
        System.out.println(listaCircularSimplementeEnlazada.tamaño());

        //listaCircularSimplementeEnlazada.eliminarFin();
        //listaCircularSimplementeEnlazada.eliminarFin();

        //listaCircularSimplementeEnlazada.mostrar();
        listaCircularSimplementeEnlazada.mostrarCircular(2);

         */
        ListaCircularDoblementeEnalazada listaCircularDoblementeEnalazada = new ListaCircularDoblementeEnalazada();

        System.out.println(listaCircularDoblementeEnalazada.estaVacio());
        for (int i = 1; i <= 5; i++) {
            listaCircularDoblementeEnalazada.insetarFinal(i);

        }
        listaCircularDoblementeEnalazada.mostrar();

        listaCircularDoblementeEnalazada.eliminarFinal();
        listaCircularDoblementeEnalazada.eliminarFinal();
        listaCircularDoblementeEnalazada.mostrar();

        listaCircularDoblementeEnalazada.mostrarAdelante(8);
        listaCircularDoblementeEnalazada.mostrarAtras(8);
    }
}
