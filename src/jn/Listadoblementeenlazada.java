package jn;

public class Listadoblementeenlazada {
    Nodo inicio;
public Listadoblementeenlazada(){
    inicio=null;
}
public boolean Vacio(){
    return inicio==null;
}
public void insertar(Object dato){
    if (Vacio()) {
        Nodo nuevo = new Nodo(null, dato, null);
        inicio = nuevo;
    }
    else {
        Nodo nuevo=new Nodo(null,dato,inicio);
        inicio.setAnterior(nuevo);
        inicio=nuevo;
    }
}
public void eliminar() {
    if (!Vacio()) {
        if (inicio.getSiguiente() == null) {
            inicio = inicio.getSiguiente();
        } else {
            inicio=inicio.getSiguiente();
            inicio.setAnterior(null);
        }
    }
}
public void mostrarAD(){
    if (!Vacio()){
        Nodo temp=inicio;
        while (temp!=null){
            System.out.print(temp.getDato()+"    ");
        temp=temp.getSiguiente();
        }

    }
}
    public void mostrarAT(){
        System.out.println();
        if (!Vacio()){
            Nodo ultimo=inicio;
            while (ultimo.getSiguiente()!=null){
              ultimo=ultimo.getSiguiente();
                Nodo temp=ultimo;
                while(temp!=null){
                    System.out.print(temp.getDato()+"   ");
                temp=temp.getAnterior();
                }
            }

        }
    }
}
