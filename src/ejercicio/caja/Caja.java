package ejercicio.caja;

import ejercicio.Pieza;

public class Caja extends Pieza {
    private TipoCajas tipoCaja;

    public Caja(String nombre, String fabricante, double precio, int consumo, TipoCajas tipoCaja) {
        super(nombre, fabricante, precio, consumo);
        this.tipoCaja = tipoCaja;
    }

    public TipoCajas getTipoCaja() {
        return tipoCaja;
    }

    public void setTipoCaja(TipoCajas tipoCaja) {
        this.tipoCaja = tipoCaja;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "tipoCaja=" + tipoCaja +
                '}';
    }
}
