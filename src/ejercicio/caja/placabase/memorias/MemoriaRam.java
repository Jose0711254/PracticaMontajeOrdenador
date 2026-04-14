package ejercicio.caja.placabase.memorias;

import ejercicio.caja.TipoCajas;
import ejercicio.caja.placabase.PlacaBase;

public class MemoriaRam extends PlacaBase {
    public MemoriaRam(String nombre, String fabricante, double precio, int consumo, TipoCajas tipoCaja, boolean gaming) {
        super(nombre, fabricante, precio, consumo, tipoCaja, gaming);
    }
}
