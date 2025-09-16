package command;

import model.Inventario;
import view.InventarioView;

public class AjustarStockCommand implements Command {
    private final Inventario inv; private final InventarioView view;
    private final String codigo; private final int delta;

    public AjustarStockCommand(Inventario inv, InventarioView view, String codigo, int delta) {
        this.inv = inv; this.view = view; this.codigo = codigo; this.delta = delta;
    }

    @Override public void Ejecutar() {
        boolean ok = inv.ajustarStock(codigo, delta);
        view.mostrarResultadoOperacion(ok, ok ? "Stock ajustado" : "model.Producto no existe");
 }
}