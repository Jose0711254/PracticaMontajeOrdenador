package ejercicio.caja.placabase.memorias;

import ejercicio.caja.TipoCajas;
import ejercicio.caja.TipoDDR;

public class GDDR extends MemoriaRam {

    public GDDR(String nombre, String fabricante, double precio, int consumo, TipoCajas tipoCaja, boolean gaming) {
        super(nombre, fabricante, precio, consumo, tipoCaja, gaming);
    }
}
