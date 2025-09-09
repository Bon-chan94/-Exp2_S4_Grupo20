public class Producto {
    private String codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;

    public Producto(String codigo, String nombre, String descripcion, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setStock(int stock) { this.stock = stock; }

    public void actualizarPrecio(double nuevoPrecio) {
        if (nuevoPrecio < 0) throw new IllegalArgumentException("Precio inválido: no puede ser negativo");
        this.precio = nuevoPrecio;
    }

    public void ajustarStock(int delta) {
        int nuevo = this.stock + delta;
        if (nuevo < 0) throw new IllegalArgumentException("Stock no puede ser negativo");
        this.stock = nuevo;
    }

    public String descripcionDetallada() {
        return String.format("(%s) %s - %s | $%.0f | stock=%d",
                codigo, nombre, descripcion, precio,stock);}

}