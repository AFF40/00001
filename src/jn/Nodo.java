package jn;


public class Nodo {
    private Object dato;
    private Nodo anterior;
    private Nodo Siguiente;


    public Nodo( Nodo anterior, Object dato,Nodo siguiente) {
        this.setDato(dato);
        this.setAnterior(anterior);
        this.setSiguiente(siguiente);
    }


    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        Siguiente = siguiente;
    }
}