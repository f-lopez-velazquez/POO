public class ProductoRefrigerado extends Producto implements InformacionProducto {
    private String codigoOrganismo;

    public ProductoRefrigerado(String fechaCaducidad, int numeroLote, String codigoOrganismo) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
    }

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto Refrigerado:");
        System.out.println("Fecha de Caducidad: " + getFechaCaducidad());
        System.out.println("Número de Lote: " + getNumeroLote());
        System.out.println("Código del Organismo de Supervisión: " + codigoOrganismo);
    }
}
