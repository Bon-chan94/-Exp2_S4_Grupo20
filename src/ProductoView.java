import java.util.List;

public class ProductoView {
    public void mostrarProducto(Producto p) {
        if (p == null) {
            System.out.println("No encontrado");
            return;
        }
        System.out.println(" - " + p.descripcionDetallada());
    }

    public void listarProductos(List<Producto> lista) {
        if (lista == null || lista.isEmpty()) {
            System.out.println("(sin resultados)");
            return;
        }
        for (Producto p : lista) {
            mostrarProducto(p);
        }
    }
}