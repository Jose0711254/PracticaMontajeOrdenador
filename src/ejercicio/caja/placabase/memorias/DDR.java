package ejercicio.caja.placabase.memorias;

import ejercicio.caja.TipoCajas;
import ejercicio.caja.TipoDDR;

public class DDR extends MemoriaRam {
    private TipoDDR tipo;

    public DDR(String nombre, String fabricante, double precio, int consumo, TipoCajas tipoCaja, boolean gaming, TipoDDR td) {
        super(nombre, fabricante, precio, consumo, tipoCaja, gaming);
        this.tipo = td;
    }

    public TipoDDR getTipo() {
        return tipo;
    }
}
