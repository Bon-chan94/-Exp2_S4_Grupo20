package command;

import model.Inventario;
import view.InventarioView;

public class EliminarProductoCommand implements Command {
    private final Inventario inv; private final InventarioView view; private final String codigo;
    public EliminarProductoCommand(Inventario inv, InventarioView view, String codigo) {
        this.inv = inv; this.view = view; this.codigo = codigo;
    }
    @Override public void Ejecutar() {
        boolean ok = inv.eliminarPorCodigo(codigo);
        view.mostrarResultadoOperacion(ok, ok ? "model.Producto eliminado" : "model.Producto no existe");
    }
}