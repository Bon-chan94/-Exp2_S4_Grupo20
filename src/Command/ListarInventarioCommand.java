package command;

import model.Inventario;
import view.InventarioView;

public class ListarInventarioCommand implements Command {
    private final Inventario inv; private final InventarioView view;
    public ListarInventarioCommand(Inventario inv, InventarioView view) {
        this.inv = inv; this.view = view;
    }
    @Override public void Ejecutar() {
        view.mostrarListado(inv.listarTodos());
    }
}