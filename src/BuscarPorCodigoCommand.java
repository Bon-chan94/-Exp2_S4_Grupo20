public class BuscarPorCodigoCommand implements Command {
    private final Inventario inv; private final InventarioView view; private final String codigo;
    public BuscarPorCodigoCommand(Inventario inv, InventarioView view, String codigo) {
        this.inv = inv; this.view = view; this.codigo = codigo;
    }
    @Override public void Ejecutar() {
        view.mostrarProducto(inv.buscarPorCodigo(codigo));

    }
}