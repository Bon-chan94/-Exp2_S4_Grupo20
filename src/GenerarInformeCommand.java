public class GenerarInformeCommand implements Command {
    private final Inventario inv; private final InventarioView view;
    public GenerarInformeCommand(Inventario inv, InventarioView view) {
        this.inv = inv; this.view = view;
    }
    @Override public void Ejecutar() {
        view.mostrarInforme(inv.generarInforme());

    }
}