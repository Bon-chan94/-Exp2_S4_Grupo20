package view;

import java.util.Scanner;

public class MenuView {
    private final Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("\n=== INVENTARIO ===");
        System.out.println("1) Agregar producto");
        System.out.println("2) Actualizar precio");
        System.out.println("3) Ajustar stock (+/-)");
        System.out.println("4) Buscar por codigo");
        System.out.println("5) Buscar por nombre");
        System.out.println("6) Listar inventario");
        System.out.println("7) Generar informe");
        System.out.println("8) Eliminar por codigo");
        System.out.println("0) Salir");
    }

    public int leerOpcion() {
        System.out.print("Opcion: ");
        while (!sc.hasNextInt()) { sc.next(); System.out.print("Opcion: "); }
        return sc.nextInt();
    }

    public String pedirTexto(String etiqueta) {
        System.out.print(etiqueta + ": ");
        String s = sc.nextLine();
        if (s.isBlank()) s = sc.nextLine();
        return s;
    }

    public int pedirEntero(String etiqueta) {
        System.out.print(etiqueta + ": ");
        while (!sc.hasNextInt()) { sc.next(); System.out.print(etiqueta + ": "); }
        return sc.nextInt();
    }

    public double pedirDouble(String etiqueta) {
        System.out.print(etiqueta + ": ");
        while (!sc.hasNextDouble()) { sc.next(); System.out.print(etiqueta + ": "); }
        return sc.nextDouble();
    }

    public void despedir() { System.out.println("Adios!"); }

    public void invalida() { System.out.println("Opcion invalida");}
}