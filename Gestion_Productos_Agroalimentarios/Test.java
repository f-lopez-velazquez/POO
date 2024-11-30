/**
 * Clase Producto
 * Autor: [Francisco López Velázquez]
 * Fecha: [30/NOV/2024]
 * Descripción: Clase abstracta base para los productos.
 */
public class Test {
    public static void main(String[] args) {
        // Crear objetos de cada tipo
        ProductoFresco fresco = new ProductoFresco("2024-12-15", 101, "2024-11-01", "México");
        ProductoRefrigerado refrigerado = new ProductoRefrigerado("2024-12-30", 102, "ORGAN-12345");
        ProductoCongelado congelado = new ProductoCongelado("2025-01-20", 103, -18.0);

        // Mostrar información de los objetos
        fresco.mostrarInformacion();
        System.out.println();
        refrigerado.mostrarInformacion();
        System.out.println();
        congelado.mostrarInformacion();
    }
}
