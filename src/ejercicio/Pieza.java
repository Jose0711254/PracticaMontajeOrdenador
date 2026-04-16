package ejercicio;

public abstract class Pieza {

    private String nombre;
    private String fabricante;
    private double precio;
    private int consumo;

    public Pieza(String nombre, String fabricante, double precio, int consumo) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.precio = precio;
        this.consumo = consumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "Piezas{" +
                "nombre='" + nombre + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", precio=" + precio +
                ", consumo=" + consumo +
                '}';
    }
}
