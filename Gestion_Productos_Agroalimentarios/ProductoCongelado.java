public class ProductoCongelado extends Producto implements InformacionProducto {
    private double temperaturaCongelacion;

    public ProductoCongelado(String fechaCaducidad, int numeroLote, double temperaturaCongelacion) {
        super(fechaCaducidad, numeroLote);
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    public double getTemperaturaCongelacion() {
        return temperaturaCongelacion;
    }

    public void setTemperaturaCongelacion(double temperaturaCongelacion) {
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto Congelado:");
        System.out.println("Fecha de Caducidad: " + getFechaCaducidad());
        System.out.println("Número de Lote: " + getNumeroLote());
        System.out.println("Temperatura de Congelación Recomendada: " + temperaturaCongelacion + "°C");
    }
}
