import jn.Listadoblementeenlazada;

public class inicio {
    public static void main(String[] args) {
        Listadoblementeenlazada Listadoblemenlazada =new Listadoblementeenlazada();
        Listadoblementeenlazada.insertar(5);
        Listadoblementeenlazada.insertar(4);
        Listadoblementeenlazada.insertar(3);
        Listadoblementeenlazada.insertar(2);
        Listadoblementeenlazada.insertar(1);
        Listadoblementeenlazada.insertar(0);

        Listadoblementeenlazada.mostrarAD();
        Listadoblementeenlazada.mostrarAT();
    }
}