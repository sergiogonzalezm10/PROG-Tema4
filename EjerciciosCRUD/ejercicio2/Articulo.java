package ejercicio2;

public class Articulo {

    private String nombre;
    private double precio;
    private int IVA = 21;
    private int unidades;

   
    public String getnombre() {
        return nombre;
    }

    public double getprecio() {
        return precio;
    }

    public int getIVA() {
        return IVA;
    }

    public int getunidades() {
        return unidades;
    }

    
    public void setnombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        }
    }

    public void setprecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }
    }

    public void setIVA(int IVA) {
        if (IVA >= 0 && IVA < 100) {
            this.IVA = IVA;
        }
    }

    public void setunidades(int unidades) {
        if (unidades >= 0) {
            this.unidades = unidades;
        }
    }

    
    public double getPVP() {
        return precio + (precio * IVA / 100.0);
    }

    
    public double getPVPDescuento(double descuento) {
        double pvp = getPVP();
        return pvp - (pvp * descuento / 100.0);
    }

    
    public boolean vender(int cantidad) {
        if (cantidad > 0 && cantidad <= unidades) {
            unidades -= cantidad;
            return true;
        }
        return false;
    }

    public void almacenar(int cantidad) {
        if (cantidad > 0) {
            unidades += cantidad;
        }
    }

   
    public String toString() {
        return "Artículo[Nombre: " + nombre +
               ", Precio: " + precio + "€" +
               ", IVA: " + IVA + "%" +
               ", Unidades: " + unidades +
               ", PVP: " + getPVP() + "€]";
    }

   
    public Articulo(String nombre, double precio, int IVA, int unidades) {
        setnombre(nombre);
        setprecio(precio);
        setIVA(IVA);
        setunidades(unidades);
    }
}