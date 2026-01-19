package ejercicio4apartadod;

public class PrincipalArticulo {

    public static void main(String[] args) {

        Articulo articulo1 = new Articulo("Pijama", 10.0, 21, 21);
        Articulo articulo2 = new Articulo("", -20.00, 210, 0);

        mostrar(articulo1);
        mostrar(articulo2);

        // Probar vender
        System.out.println("Vendiendo 5 pijamas...");
        if (articulo1.vender(5)) {
            System.out.println("Venta realizada con éxito");
        } else {
            System.out.println("No se pudo realizar la venta");
        }

        // Probar almacenar
        System.out.println("Almacenando 10 pijamas...");
        articulo1.almacenar(10);

        // Probar descuento
        System.out.println("PVP con 20% de descuento: " + articulo1.getPVPDescuento(20) + "€");

        mostrar(articulo1);
    }

    static void mostrar(Articulo articulo) {
        System.out.println("--------------------------------------------------");
        System.out.println(articulo.toString());
        System.out.println("--------------------------------------------------");
    }
}
