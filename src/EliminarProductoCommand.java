public class EliminarProductoCommand implements Command {
    private final Inventario inv; private final InventarioView view; private final String codigo;
    public EliminarProductoCommand(Inventario inv, InventarioView view, String codigo) {
        this.inv = inv; this.view = view; this.codigo = codigo;
    }
    @Override public void Ejecutar() {
        boolean ok = inv.eliminarPorCodigo(codigo);
        view.mostrarResultadoOperacion(ok, ok ? "Producto eliminado" : "Producto no existe");
    }
}