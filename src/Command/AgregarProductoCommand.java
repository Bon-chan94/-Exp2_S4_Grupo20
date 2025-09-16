package command;

import model.Inventario;
import model.Producto;
import view.InventarioView;

public class AgregarProductoCommand implements Command {
    private final Inventario inv; private final InventarioView view; private final Producto p;
    public AgregarProductoCommand(Inventario inv, InventarioView view, Producto p) {
        this.inv = inv; this.view = view; this.p = p;
    }
    @Override public void Ejecutar() {
        boolean ok = inv.agregarProducto(p);
        view.mostrarResultadoOperacion(ok, ok ? "model.Producto agregado" : "Codigo duplicado");

    }
}