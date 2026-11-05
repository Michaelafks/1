package arreglos.tienda.modelo;

public class Juego {

    private String nombre;
    private String categoria;
    private int tamanio;
    private double precio;
    private int LicenciaDisponible;
    private int LicenciasVendidas;

    public Juego(String nombre, String categoria, int tamanio, double precio, int licenciaDisponible) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.tamanio = tamanio;
        this.precio = precio;
        LicenciaDisponible = licenciaDisponible;
        LicenciasVendidas = 0;


    }

    public String getNombre() {

        return nombre;
    }

    public String getCategoria() {

        return categoria;
    }

    public int getTamanio() {

        return tamanio;
    }

    public double getPrecio() {

        return precio;
    }

    public int getLicenciaDisponible() {

        return LicenciaDisponible;
    }

    public int getLicenciasVendidas() {

        return LicenciasVendidas;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty())
            this.nombre = nombre;

    }

    public void setTamanio(int tamanio) {
        if (tamanio > 0)
            this.tamanio = tamanio;
    }

    public void setCategoria(String categoria) {
        if (categoria != null && !categoria.trim().isEmpty())
            this.categoria = categoria;
    }

    public void setPrecio(double precio) {
        if (precio > 0)
            this.precio = precio;
    }

    public boolean comprar(int cantidad){
        if (cantidad > 0){
            LicenciaDisponible += cantidad;
            return true;
        }
        return false;
    }

    public boolean vender(int cantidad){
        if (cantidad > 0 && cantidad <= LicenciaDisponible){
            LicenciaDisponible -= cantidad;
            LicenciasVendidas += cantidad;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", tamanio=" + tamanio +
                ", precio=" + precio +
                ", LicenciaDisponible=" + LicenciaDisponible +
                ", LicenciasVendidas=" + LicenciasVendidas +
                '}';
    }
}
