package ejercicio3;
import java.util.ArrayList;

public class GestorPizzas {

    private ArrayList<Pizza> pizzas = new ArrayList<>();

    // Nuevo pedido
    public void añadir(Pizza p) {
        pizzas.add(p);
    }

    // Listado
    public void listar() {
        if (pizzas.isEmpty()) {
            System.out.println("No hay pizzas registradas.");
        } else {
            for (Pizza p : pizzas) {
                System.out.println(p);
            }
        }
    }

    // Buscar pizza NO servida por tipo
    public Pizza buscarPendiente(String tipo) {
        for (Pizza p : pizzas) {
            if (p.getTipo().equalsIgnoreCase(tipo) && !p.isServida()) {
                return p;
            }
        }
        return null;
    }
}

