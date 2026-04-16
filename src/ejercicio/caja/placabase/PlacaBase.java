package ejercicio.caja.placabase;

import ejercicio.caja.Caja;
import ejercicio.caja.TipoCajas;
import ejercicio.caja.TipoDDR;
import ejercicio.caja.placabase.memorias.DDR;
import ejercicio.caja.placabase.memorias.GDDR;
import ejercicio.caja.placabase.memorias.MemoriaRam;

import java.util.ArrayList;

public class PlacaBase extends Caja {

    private boolean esGaming;
    private ArrayList<MemoriaRam> memorias = new ArrayList<>();
    private ArrayList<GPU> gpus = new ArrayList<>();

    public PlacaBase(String nombre, String fabricante, double precio, int consumo, TipoCajas tipoCaja, boolean gaming) {
        super(nombre, fabricante, precio, consumo, tipoCaja);
        this.esGaming = gaming;
    }

    public void inspeccionarRAM (){
        int d4 = 0;
        int d5 = 0;
        int gd = 0;
        for (MemoriaRam m : memorias){
            if (m instanceof GDDR){
                gd++;
            } else if (m instanceof DDR) {
                if (((DDR) m).getTipo() == TipoDDR.DDR4){
                    d4++;
                }else{
                    d5++;
                }
            }
        }

        System.out.println("---Inspección RAM---");
        System.out.println("DDR4: " + d4 + " | DDR5: " + d5 + " | GDDR: " + gd);
    }
    public boolean isGaming() {
        return esGaming;
    }

    public ArrayList<MemoriaRam> getMemorias() {
        return memorias;
    }

    public ArrayList<GPU> getGPUs() {
        return gpus;
    }
}
