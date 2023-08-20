public class Main {
    public static void main(String[] args) {
        PaletaAgua paletaAgua = new PaletaAgua("Fresa", 19.0, true);
        PaletaCrema paletaCrema = new PaletaCrema("Chocolate", 21.0, false);

        paletaAgua.mostrarInformacion();
        paletaAgua.mostrarBaseAgua();
        paletaAgua.cambiarPrecio(0.0);
        paletaAgua.mostrarInformacion();

        System.out.println();

        paletaCrema.mostrarInformacion();
        paletaCrema.mostrarTexturaCremosa();
        paletaCrema.cambiarPrecio(0.0);
        paletaCrema.mostrarInformacion();
    }
}