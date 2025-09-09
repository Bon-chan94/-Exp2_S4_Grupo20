public class Main {
    public static void main(String[] args) {
        Inventario modelo = new Inventario();
        InventarioView inventarioView = new InventarioView();
        InventarioController invController = new InventarioController(modelo, inventarioView);

        MenuView menuView = new MenuView();
        MenuController menu = new MenuController(menuView, invController);

        menu.run(); // toda la interacción con el usuario es a través de la VISTA
 }
}