package command;

import model.Inventario;
import view.InventarioView;

public class ActualizarPrecioCommand implements Command {
    private final Inventario inv;
    private final InventarioView view;
    private final String codigo;
    private final double nuevoPrecio;

    public ActualizarPrecioCommand(Inventario inv, InventarioView view, String codigo, double nuevoPrecio) {
        this.inv = inv; this.view = view; this.codigo = codigo; this.nuevoPrecio = nuevoPrecio;
    }

    @Override public void Ejecutar() {
        boolean ok = inv.actualizarPrecio(codigo, nuevoPrecio);
        view.mostrarResultadoOperacion(ok, ok ? "Precio actualizado" : "model.Producto no existe");
 }
}