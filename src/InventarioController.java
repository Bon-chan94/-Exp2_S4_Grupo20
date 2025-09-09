public class InventarioController {
    private final Inventario modelo;
    private final InventarioView view;

    public InventarioController(Inventario modelo, InventarioView view) {
        this.modelo = modelo; this.view = view;
    }

    public void agregarProducto(String c, String n, String d, double pr, int st) {
        new AgregarProductoCommand(modelo, view, new Producto(c,n,d,pr,st)).Ejecutar();
    }

    public void actualizarPrecio(String codigo, double nuevoPrecio) {
        new ActualizarPrecioCommand(modelo, view, codigo, nuevoPrecio).Ejecutar();
    }

    public void ajustarStock(String codigo, int delta) {
        new AjustarStockCommand(modelo, view, codigo, delta).Ejecutar();
    }

    public void eliminarPorCodigo(String codigo) {
        new EliminarProductoCommand(modelo, view, codigo).Ejecutar();
    }

    public void buscarPorCodigo(String codigo) {
        new BuscarPorCodigoCommand(modelo, view, codigo).Ejecutar();
    }

    public void buscarPorNombre(String nombre) {
        new BuscarPorNombreCommand(modelo, view, nombre).Ejecutar();
    }

    public void listar() { new ListarInventarioCommand(modelo, view).Ejecutar(); }

    public void informe() { new GenerarInformeCommand(modelo, view).Ejecutar();}
}