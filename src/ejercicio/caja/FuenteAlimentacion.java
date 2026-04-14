package ejercicio.caja;

public class FuenteAlimentacion extends Caja {
    private int potencia;
    public FuenteAlimentacion(String nombre, String fabricante, double precio, int consumo, TipoCajas tipoCaja, int potencia) {
        super(nombre, fabricante, precio, consumo, tipoCaja);
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
