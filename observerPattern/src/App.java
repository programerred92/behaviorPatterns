public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicio App InteraCoop");
        InteraccionRegistro registro = new InteraccionRegistro();

        // Crear observadores
        HistorialInteracciones historial = new HistorialInteracciones();
        ReportesInteracciones reporte = new ReportesInteracciones();

        // Registrar observadores
        registro.agregarObservador(historial);
        System.out.println("Observador HistorialInteracciones registrado.");
        registro.agregarObservador(reporte);
        System.out.println("Observador ReportesInteracciones registrado.");
        /* INFORMACION DE INTERACCION */
        String idInteraccion = "1";
        String tipoInteraccion = "Llamada al cliente";
        String fechaInteraccion = "2024-05-20T14:56:50";
        String clienteId = "1094222333";
        String observaciones = "El cliente muestra interés en el producto tarjeta de crédito";
        /* */
        // Información detallada de la interacción
        System.out.println("Registrando nueva interacción:");
        System.out.println("   ID: " + idInteraccion);
        System.out.println("   Tipo: " + tipoInteraccion);
        System.out.println("   Fecha: " + fechaInteraccion);
        System.out.println("   Cliente ID: " + clienteId);
        System.out.println("   Observaciones: " + observaciones);

        /* REGISTRO */
        registro.registrarInteraccion("1", "Llamada al cliente", "2024-05-20T14:56:50", "1094222333",
                "El cliente muestra interes en el producto tarjeta de credito");

    }
}
