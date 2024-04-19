package ProgramacionOrientadaAObjetos.Test;
import ProgramacionOrientadaAObjetos.EJ3Astros.Astro;
import ProgramacionOrientadaAObjetos.EJ3Astros.Planeta;
import ProgramacionOrientadaAObjetos.EJ3Astros.Satelite;

import java.util.ArrayList;
import java.util.Scanner;
public class MainAstro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Astro> astros = generarAstros();
        int opcion;
        do {
            mostrarListaAstros(astros);
            //Pedimos nº de astro a mostrar
            System.out.println("Elige un nº de astro (-1 para salir): ");
            opcion = sc.nextInt();
            //Si nº válido, mostrar info del astro
            if (opcion>=0 && opcion< astros.size()){
                Astro a = astros.get(opcion);
                a.muestra();
            }//Si -1, terminar
            else if (opcion== -1){
                System.out.println("Adiós");
            }else {
                System.out.println("Opcion incorrecta");
            }
            // Pedimos enter para continuar
            System.out.println("Enter para continuar");
            sc.nextLine();
        }while (opcion>=0);
    }

    private static ArrayList<Astro> generarAstros() {
        Planeta tierra = new Planeta("Tierra",5.976e+24, 86148, 5.97E+024, 14.55,
                9.71, 149600000, 365.2425);
        Planeta marte = new Planeta("Marte", 6.42E23, 6794.4, 24.62, 686.97,
                -46.0, 3.711, 227940000.0);
        Planeta venus = new Planeta("Venus", 4.869E24, 12103.6, 243.02, 584.0,
                463.85, 8.87, 108200000.0);
        Satelite luna = new Satelite("Luna", 1737.1, 2360622, 7.349E+022, -23,
                1.62, 384403, 2360622, tierra);
        Satelite fobos = new Satelite("Fobos", 1.072E16, 11000.0, 1.072E16, -40.15,
                0.005, 9376, 0.32, marte);
        Satelite deimos = new Satelite("Deimos", 2.244E15, 12400.0, 2.24E15, -40.15,
                0.0039, 23460, 1.26, marte);

        tierra.addSatelite(luna);
        marte.addSatelite(fobos);
        marte.addSatelite(deimos);

        ArrayList<Astro> astros = new ArrayList<>();
        astros.add(tierra);
        astros.add(marte);
        astros.add(venus);
        astros.add(luna);
        astros.add(fobos);
        astros.add(deimos);
        return astros;
    }

    public static void mostrarListaAstros(ArrayList<Astro> astros) {
        System.out.println("=== LISTA DE ASTROS ===");
        for (int i = 0; i < astros.size(); i++) {
            Astro a = astros.get(i);
            System.out.println("Astro " + i + ": " + a.getNombre());
        }
    }
}
