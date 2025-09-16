package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventario {
    private final Map<String, Producto> productos = new HashMap<>();

    public boolean agregarProducto(model.Producto p) {
        if (p == null || p.getCodigo() == null) return false;
        if (productos.containsKey(p.getCodigo())) return false;
        productos.put(p.getCodigo(), p);
        return true;
    }

    public boolean eliminarPorCodigo(String codigo) {
        return productos.remove(codigo) != null;
    }

    public Producto buscarPorCodigo(String codigo) {
        return productos.get(codigo);
    }

    public List<Producto> buscarPorNombre(String nombre) {
        List<Producto> res = new ArrayList<>();
        if (nombre == null) return res;
        String q = nombre.toLowerCase();
        for (Producto p : productos.values()) {
            if (p.getNombre() != null && p.getNombre().toLowerCase().contains(q)) {
                res.add(p);
            }
        }
        return res;
    }

    public boolean actualizarPrecio(String codigo, double nuevoPrecio) {
        Producto p = productos.get(codigo);
        if (p == null) return false;
        p.actualizarPrecio(nuevoPrecio);
        return true;
    }

    public boolean ajustarStock(String codigo, int delta) {
        Producto p = productos.get(codigo);
        if (p == null) return false;
        p.ajustarStock(delta);
        return true;
    }

    public List<Producto> listarTodos() {
        return new ArrayList<>(productos.values());
    }

    public String generarInforme() {
        int cantidadItems = productos.size();
        int stockTotal = 0;
        double valorInventario = 0.0;
        for (Producto p : productos.values()) {
            stockTotal += p.getStock();
            valorInventario += p.getPrecio() * p.getStock();
        }
        return String.format("INFORME INVENTARIO -> items=%d | stockTotal=%d | valor=%.0f",
                cantidadItems, stockTotal, valorInventario);}
}