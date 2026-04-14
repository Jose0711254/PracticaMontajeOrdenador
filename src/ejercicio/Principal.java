package ejercicio;

import ejercicio.caja.*;
import ejercicio.caja.placabase.CPU;
import ejercicio.caja.placabase.GPU;
import ejercicio.caja.placabase.PlacaBase;
import ejercicio.caja.placabase.memorias.DDR;
import ejercicio.caja.placabase.memorias.MemoriaRam;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ordenador miPc = new Ordenador();

        System.out.println("--- TIENDA DE COMPONENTES ---");
        System.out.print("¿Cuánto dinero tienes (€)? ");
        double dineroCliente = sc.nextDouble();

        miPc.caja = new Caja("Tuf Gaming", "ASUS", 90.0, 0, TipoCajas.ATX);
        miPc.placa = new PlacaBase("B550", "Gigabyte", 150.0, 40, TipoCajas.ATX, true);
        miPc.cpu = new CPU("Ryzen 5", "AMD", 200.0, 65, TipoCajas.ATX, true);
        miPc.fuente = new FuenteAlimentacion("G650", "EVGA", 100.0, 0, TipoCajas.ATX, 650);
        miPc.refri = new Refrigeracion("H100", "Corsair", 80.0, 15, TipoCajas.ATX);

        miPc.placa.getMemorias().add(new DDR("Fury", "Kingston", 60.0, 5, TipoCajas.ATX, true, TipoDDR.DDR4));
        miPc.placa.getGPUs().add(new GPU("RTX 3060", "MSI", 350.0, 170, TipoCajas.ATX, true));

        double precioTotal = miPc.caja.getPrecio() + miPc.placa.getPrecio() +
                miPc.cpu.getPrecio() + miPc.fuente.getPrecio() +
                miPc.refri.getPrecio();

        for (MemoriaRam m : miPc.placa.getMemorias()) {
            precioTotal += m.getPrecio();
        }

        for (GPU g : miPc.placa.getGPUs()) {
            precioTotal += g.getPrecio();
        }

        System.out.println("\n----------------------------");
        if (dineroCliente >= precioTotal) {
            double cambio = dineroCliente - precioTotal;
            System.out.println("✅ Compra OK. Tu cambio es: " + cambio + "€");

            miPc.placa.inspeccionarRAM();

            if (miPc.validarMontaje()) {
                miPc.encender();
            } else {
                System.out.println("Error: Las piezas no son compatibles.");
            }

        } else {
            double falta = precioTotal - dineroCliente;
            System.out.println("Error. Te faltan: " + falta + "€");
        }
        System.out.println("----------------------------");
    }
}
