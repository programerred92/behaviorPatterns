import java.util.ArrayList;
import java.util.List;

public class InteraccionRegistro {

    private List<InteraccionObserver> observers = new ArrayList<>();

    public void agregarObservador(InteraccionObserver observer) {
        observers.add(observer);
    }

    public void eliminarObservador(InteraccionObserver observer) {
        observers.remove(observer);
    }

    public void notificarObservadores(Interaccion interaccion) {
        for (InteraccionObserver observer : observers) {
            observer.actualizar(interaccion);
        }
    }

    public void registrarInteraccion(String id, String tipo, String fecha, String clienteId, String observaciones) {
        Interaccion interaccion = new Interaccion(id, tipo, fecha, clienteId, observaciones);
        notificarObservadores(interaccion);
    }
}
