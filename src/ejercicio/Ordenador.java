package ejercicio;

import ejercicio.caja.Caja;
import ejercicio.caja.FuenteAlimentacion;
import ejercicio.caja.Refrigeracion;
import ejercicio.caja.TipoDDR;
import ejercicio.caja.placabase.CPU;
import ejercicio.caja.placabase.GPU;
import ejercicio.caja.placabase.PlacaBase;
import ejercicio.caja.placabase.memorias.DDR;
import ejercicio.caja.placabase.memorias.GDDR;
import ejercicio.caja.placabase.memorias.MemoriaRam;

public class Ordenador {

    public Caja caja;
    public PlacaBase placa;
    public CPU cpu;
    public FuenteAlimentacion fuente;
    public Refrigeracion refri;

    public void encender() {
        int consumoTotal = caja.getConsumo() + placa.getConsumo() +
                           cpu.getConsumo() + fuente.getConsumo() +
                           refri.getConsumo();

        for (GPU g : placa.getGPUs()){
            consumoTotal += g.getConsumo();
        }
        for (MemoriaRam m : placa.getMemorias()){
            consumoTotal += m.getConsumo();
        }

        if (consumoTotal < fuente.getConsumo()){
            System.out.println("¡BIP! El ordenador se ha encendido correctamente");
        }else {
            System.out.println("¡ERROR! La fuente de " + fuente.getPotencia() + "W no soporta un consumo de " + consumoTotal + "W");
        }
    }

    public boolean validarMontaje(){
        if (caja.getTipoCaja() != placa.getTipoCaja())
            return false;

        if (placa.getMemorias().size() > 4)
            return false;

        TipoDDR ddrInstalada = null;
        for (MemoriaRam m : placa.getMemorias()){
            if (m instanceof GDDR)
                return false;

            DDR actual = (DDR) m;
            if (ddrInstalada == null) {
                ddrInstalada = actual.getTipo();
            } else if (ddrInstalada != actual.getTipo()) {
                return false;
            }
        }

        int maxGpus;

        if (placa.isGaming()) {
            maxGpus = 2;
        }else{
            maxGpus = 1;
        }
        return true;
    }
}
