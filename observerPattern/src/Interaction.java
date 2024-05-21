class Interaccion {
    private String id;
    private String tipo;
    private String fecha;
    private String clienteId;
    private String observaciones;
    
    public Interaccion(String id, String tipo, String fecha, String clienteId, String observaciones) {
        this.id = id;
        this.tipo = tipo;
        this.fecha = fecha;
        this.clienteId = clienteId;
        this.observaciones = observaciones;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    
}