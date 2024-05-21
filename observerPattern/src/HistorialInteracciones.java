public class HistorialInteracciones implements InteraccionObserver{

    @Override
    public void actualizar(Interaccion interaccion) {
        System.out.println("Actualizando historico de interacciones en otra BD " + interaccion);
    }

}
