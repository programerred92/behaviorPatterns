public class ReportesInteracciones implements InteraccionObserver{

    @Override
    public void actualizar(Interaccion interaccion) {
        System.out.println("Generando estadísticas para la interacción " + interaccion.getTipo());

    }

}
